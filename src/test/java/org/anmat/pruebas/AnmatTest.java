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
import com.inssjp.mywebservice.business.*;


public class AnmatTest {


	@Test
	public void testConexion() throws MalformedURLException {

        IWebService webService = new IWebService();
        IWebServicePortType webServicePortType = webService.getIWebServicePort();

        ConfigureHTTPSSoapHeaders(webServicePortType);
        
        Client client = ClientProxy.getClient(webServicePortType);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor());
        
        WebServiceResult wsr = null;
        try	{
        	wsr = webServicePortType.sendMedicamentos(this.crearMedicamento(), "pruebasws", "Clave1234");
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
	
	public List<MedicamentosDTO> crearMedicamento(){
		
		List<MedicamentosDTO> medicamentos = new LinkedList<MedicamentosDTO>();
		MedicamentosDTO medicamento1 = new MedicamentosDTO();
		medicamento1.setFEvento("25/11/2011");
		medicamento1.setHEvento("04:24");
		medicamento1.setGlnOrigen("glnws");
		medicamento1.setCuitOrigen("20267565393");
		medicamento1.setGlnDestino("glnws");
		medicamento1.setCuitDestino("20267565393");
		medicamento1.setNRemito("1234");
		medicamento1.setNFactura("1234");
		medicamento1.setVencimiento("30/11/2011");
		medicamento1.setGtin("GTIN1");
		medicamento1.setLote("1111");
		medicamento1.setIdEvento("127");
		medicamento1.setApellido("Reingart");
		medicamento1.setNombres("Mariano");
		medicamento1.setTipoDocumento("96");
		medicamento1.setNDocumento("26756539");
		medicamento1.setSexo("M");
		medicamento1.setDireccion("Saraza");
		medicamento1.setLocalidad("Hurlingham");
		medicamento1.setNumero("1234");
		medicamento1.setPiso("");
		medicamento1.setDepto("");
		medicamento1.setNPostal("B1688FDD");
		medicamento1.setProvincia("Buenos Aires");
		medicamento1.setFechaNacimiento("01/01/2000");
		medicamento1.setTelefono("5555-5555");
		medicamentos.add(medicamento1);

		return medicamentos;
		
	}

	@SuppressWarnings("unchecked")
	private void ConfigureHTTPSSoapHeaders(IWebServicePortType webService) {
    	
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
