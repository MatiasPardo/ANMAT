package org.anmat.pruebas;



import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.anmat.conection.Anmat;
import org.anmat.conection.ClientPasswordCallback;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.junit.Assert;
import org.junit.Test;
import com.inssjp.webservice.business.IWebService;
import com.inssjp.webservice.business.IWebServiceService;
import com.inssjp.webservice.business.MedicoResponse;
import com.inssjp.webservice.business.WebServiceError;


public class AnmatTest {


	@Test
	public void testConexion() throws MalformedURLException {

        IWebService webService = new IWebServiceService().getIWebServicePort();

        ConfigureHTTPSSoapHeaders(webService);
        
        Client client = ClientProxy.getClient(webService);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor());
        
        MedicoResponse wsr = null;
        try	{
        	wsr = webService.getMedico("pruebasws", "Clave1234", "30711622507");
        	List<WebServiceError> lst_errores = wsr.getErrores();
			for (int i=0; !wsr.isResultado() &&  i<lst_errores.size(); i++) {
				System.out.println("[" + lst_errores.get(i).getCError() + "] " + lst_errores.get(i).getDError());
			}
        } catch (Exception e) {
        	e.printStackTrace();
        }
		
	}
	@Test
	public void testConection() throws MalformedURLException {
		
		Assert.assertNotNull(new Anmat().connect());
		
	}
	
	

	@SuppressWarnings("unchecked")
	private void ConfigureHTTPSSoapHeaders(IWebService webService) {
    	
	    @SuppressWarnings("rawtypes")
		Map outProps = new HashMap();
	    outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
	    outProps.put(WSHandlerConstants.USER, "testwservice");		    
	    outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
	    outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientPasswordCallback.class.getName());
	    WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);
	    Client client = org.apache.cxf.frontend.ClientProxy.getClient(webService);
	    Endpoint cxfEndpoint = (org.apache.cxf.jaxws.support.JaxWsEndpointImpl) client.getEndpoint();
	    cxfEndpoint.getOutInterceptors().add(wssOut);

	}

}
