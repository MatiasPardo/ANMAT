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
import com.inssjp.mywebservice.business.IWebService;
import com.inssjp.mywebservice.business.IWebServicePortType;


public class Anmat {

	private final static String  USER_HEADER = "testwservice";

	public IWebServicePortType connect() throws MalformedURLException{
		
		IWebService webService = new IWebService();
        IWebServicePortType webServicePortType = webService.getIWebServicePort();

        ConfigureHTTPSSoapHeaders(webServicePortType);
        
        Client client = ClientProxy.getClient(webServicePortType);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor());
        
       return webServicePortType;
	}
	@SuppressWarnings({"unchecked" })
	private void ConfigureHTTPSSoapHeaders(IWebServicePortType webService) {
    	
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
