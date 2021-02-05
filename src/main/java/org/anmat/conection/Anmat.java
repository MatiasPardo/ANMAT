package org.anmat.conection;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;

import com.inssjp.webservice.business.IWebService;
import com.inssjp.webservice.business.IWebServiceService;
import com.inssjp.webservice.business.WebServiceError;
import com.inssjp.webservice.business.WebServiceResponse;


public class Anmat {

	private final static String  USER_HEADER = "testwservice";

	public IWebService connect() throws MalformedURLException{
		
		IWebService webService = new IWebServiceService().getIWebServicePort();

        ConfigureHTTPSSoapHeaders(webService);
        
        Client client = ClientProxy.getClient(webService);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor());
        
       return webService;
	}
	
	public void procesarResponse(WebServiceResponse webServiceResponse) {
		WebServiceResponse wsr = null;
        try	{
        	wsr = webServiceResponse;
        	List<WebServiceError> lst_errores = wsr.getErrores();
			for (int i=0; !wsr.isResultado() &&  i<lst_errores.size(); i++) {
				System.out.println("[" + lst_errores.get(i).getCError() + "] " + lst_errores.get(i).getDError());
			}
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	
	@SuppressWarnings({"unchecked" })
	private void ConfigureHTTPSSoapHeaders(IWebService webService) {
    	
	    @SuppressWarnings("rawtypes")
		Map outProps = new HashMap();
	    outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
	    outProps.put(WSHandlerConstants.USER, USER_HEADER);		    
	    outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
	    outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientPasswordCallback.class.getName());
	    WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);
	    Client client = org.apache.cxf.frontend.ClientProxy.getClient(webService);
	    Endpoint cxfEndpoint = (org.apache.cxf.jaxws.support.JaxWsEndpointImpl) client.getEndpoint();
	    cxfEndpoint.getOutInterceptors().add(wssOut);

	}
}
