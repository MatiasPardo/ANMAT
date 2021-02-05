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
import com.inssjp.webservice.business.TransaccionDTO;
import com.inssjp.webservice.business.WebServiceError;
import com.inssjp.webservice.business.WebServiceResponse;


public class AnmatTest {


	@Test
	public void testConexion() throws MalformedURLException {

        IWebService webService = new IWebServiceService().getIWebServicePort();

        ConfigureHTTPSSoapHeaders(webService);
        
        Client client = ClientProxy.getClient(webService);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor());
        
        procesarResponse(webService.getMedico("pruebasws", "pruebasws", "20134739445"));
        //procesarResponse(webService.getMedico("7798232400004", "Trazaisko1", "20134739445"));
        //procesarResponse(webService.informarProducto(this.getTransacciones(), "7798232400004", "Trazaisko1"));
		
	}
	private List<String> procesarResponse(WebServiceResponse webServiceResponse) {
		WebServiceResponse wsr = null;
		List<String> errores = new LinkedList<String>();
        try	{
        	wsr = webServiceResponse;
        	List<WebServiceError> lst_errores = wsr.getErrores();
			for (int i=0; i < lst_errores.size(); i++) {
				errores.add(lst_errores.get(i).getCError());
				errores.add(lst_errores.get(i).getDError());
			}
			return errores;
        } catch (Exception e) {
        	e.printStackTrace();
        	return null;
        }
	}
	
	private List<TransaccionDTO> getTransacciones() {
		List<TransaccionDTO> transacciones = new LinkedList<TransaccionDTO>();
		TransaccionDTO transaccion = new TransaccionDTO();
		transaccion.setFEvento("17-nov-20");
		transaccion.setHEvento("11:17");
		transaccion.setIdEvento(50L);
		transaccion.setGlnOrigen("7798232400004");
		transaccion.setGtin("05029867691614");
		transaccion.setNroSerial("10914424659");
		transaccion.setNroRemito("R0004-00046594");
		transaccion.setNroFactura("");
		transaccion.setGlnDestino("9960110390006");
		transaccion.setLote("724");
		transaccion.setVencimiento("07/10/2024");
		
		transacciones.add(transaccion);
		
		return transacciones;
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
