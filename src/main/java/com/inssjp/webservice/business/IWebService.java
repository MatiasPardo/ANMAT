
package com.inssjp.webservice.business;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IWebService", targetNamespace = "http://business.webservice.inssjp.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IWebService {


    /**
     * 
     * @param password
     * @param transacciones
     * @param usuario
     * @return
     *     returns com.inssjp.webservice.business.WebServiceResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "informarProducto", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.InformarProducto")
    @ResponseWrapper(localName = "informarProductoResponse", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.InformarProductoResponse")
    public WebServiceResponse informarProducto(
        @WebParam(name = "transacciones", targetNamespace = "")
        List<TransaccionDTO> transacciones,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param descripcion
     * @param pagina
     * @param password
     * @param idProvincia
     * @param cuit
     * @param offset
     * @param idTipoAgente
     * @param gln
     * @param usuario
     * @return
     *     returns com.inssjp.webservice.business.CatalogoGLNResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatalogoElectronicoByGLN", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.GetCatalogoElectronicoByGLN")
    @ResponseWrapper(localName = "getCatalogoElectronicoByGLNResponse", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.GetCatalogoElectronicoByGLNResponse")
    public CatalogoGLNResponse getCatalogoElectronicoByGLN(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "gln", targetNamespace = "")
        String gln,
        @WebParam(name = "cuit", targetNamespace = "")
        String cuit,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion,
        @WebParam(name = "idProvincia", targetNamespace = "")
        Long idProvincia,
        @WebParam(name = "idTipoAgente", targetNamespace = "")
        Long idTipoAgente,
        @WebParam(name = "pagina", targetNamespace = "")
        Long pagina,
        @WebParam(name = "offset", targetNamespace = "")
        Long offset);

    /**
     * 
     * @param fechaOperacionHasta
     * @param remito
     * @param pagina
     * @param gtin
     * @param idProvincia
     * @param offset
     * @param glnAgenteDestino
     * @param lote
     * @param fechaTransaccionHasta
     * @param idEvento
     * @param fechaVencimientoHasta
     * @param orderBy
     * @param fechaVencimientoDesde
     * @param fechaOperacionDesde
     * @param glnAgenteInformador
     * @param idTransaccion
     * @param password
     * @param factura
     * @param idEstadoTransaccion
     * @param serie
     * @param glnAgenteOrigen
     * @param usuario
     * @param fechaTransaccionDesde
     * @return
     *     returns com.inssjp.webservice.business.TransaccionesResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTransaccionesWS", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.GetTransaccionesWS")
    @ResponseWrapper(localName = "getTransaccionesWSResponse", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.GetTransaccionesWSResponse")
    public TransaccionesResponse getTransaccionesWS(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "idTransaccion", targetNamespace = "")
        Long idTransaccion,
        @WebParam(name = "glnAgenteOrigen", targetNamespace = "")
        String glnAgenteOrigen,
        @WebParam(name = "glnAgenteDestino", targetNamespace = "")
        String glnAgenteDestino,
        @WebParam(name = "glnAgenteInformador", targetNamespace = "")
        String glnAgenteInformador,
        @WebParam(name = "gtin", targetNamespace = "")
        String gtin,
        @WebParam(name = "lote", targetNamespace = "")
        String lote,
        @WebParam(name = "serie", targetNamespace = "")
        String serie,
        @WebParam(name = "idEvento", targetNamespace = "")
        Long idEvento,
        @WebParam(name = "fechaOperacionDesde", targetNamespace = "")
        String fechaOperacionDesde,
        @WebParam(name = "fechaOperacionHasta", targetNamespace = "")
        String fechaOperacionHasta,
        @WebParam(name = "fechaTransaccionDesde", targetNamespace = "")
        String fechaTransaccionDesde,
        @WebParam(name = "fechaTransaccionHasta", targetNamespace = "")
        String fechaTransaccionHasta,
        @WebParam(name = "fechaVencimientoDesde", targetNamespace = "")
        String fechaVencimientoDesde,
        @WebParam(name = "fechaVencimientoHasta", targetNamespace = "")
        String fechaVencimientoHasta,
        @WebParam(name = "remito", targetNamespace = "")
        String remito,
        @WebParam(name = "factura", targetNamespace = "")
        String factura,
        @WebParam(name = "idProvincia", targetNamespace = "")
        Long idProvincia,
        @WebParam(name = "idEstadoTransaccion", targetNamespace = "")
        Long idEstadoTransaccion,
        @WebParam(name = "pagina", targetNamespace = "")
        Long pagina,
        @WebParam(name = "offset", targetNamespace = "")
        Long offset,
        @WebParam(name = "orderBy", targetNamespace = "")
        String orderBy);

    /**
     * 
     * @param password
     * @param transaccion
     * @param usuario
     * @return
     *     returns com.inssjp.webservice.business.WebServiceResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendCancelacTransacc", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.SendCancelacTransacc")
    @ResponseWrapper(localName = "sendCancelacTransaccResponse", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.SendCancelacTransaccResponse")
    public WebServiceResponse sendCancelacTransacc(
        @WebParam(name = "transaccion", targetNamespace = "")
        Long transaccion,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param password
     * @param cuit
     * @param usuario
     * @return
     *     returns com.inssjp.webservice.business.MedicoResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMedico", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.GetMedico")
    @ResponseWrapper(localName = "getMedicoResponse", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.GetMedicoResponse")
    public MedicoResponse getMedico(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "cuit", targetNamespace = "")
        String cuit);

    /**
     * 
     * @param password
     * @param gtin
     * @param transaccion
     * @param serie
     * @param usuario
     * @return
     *     returns com.inssjp.webservice.business.WebServiceResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendCancelacTransaccParcial", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.SendCancelacTransaccParcial")
    @ResponseWrapper(localName = "sendCancelacTransaccParcialResponse", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.SendCancelacTransaccParcialResponse")
    public WebServiceResponse sendCancelacTransaccParcial(
        @WebParam(name = "transaccion", targetNamespace = "")
        Long transaccion,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "gtin", targetNamespace = "")
        String gtin,
        @WebParam(name = "serie", targetNamespace = "")
        String serie);

    /**
     * 
     * @param pagina
     * @param marca
     * @param password
     * @param gtin
     * @param cuit
     * @param offset
     * @param gln
     * @param usuario
     * @param modelo
     * @param idNombreGenerico
     * @return
     *     returns com.inssjp.webservice.business.CatalogoGTINResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatalogoElectronicoByGTIN", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.GetCatalogoElectronicoByGTIN")
    @ResponseWrapper(localName = "getCatalogoElectronicoByGTINResponse", targetNamespace = "http://business.webservice.inssjp.com/", className = "com.inssjp.webservice.business.GetCatalogoElectronicoByGTINResponse")
    public CatalogoGTINResponse getCatalogoElectronicoByGTIN(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "gtin", targetNamespace = "")
        String gtin,
        @WebParam(name = "gln", targetNamespace = "")
        String gln,
        @WebParam(name = "marca", targetNamespace = "")
        String marca,
        @WebParam(name = "modelo", targetNamespace = "")
        String modelo,
        @WebParam(name = "idNombreGenerico", targetNamespace = "")
        Long idNombreGenerico,
        @WebParam(name = "cuit", targetNamespace = "")
        String cuit,
        @WebParam(name = "pagina", targetNamespace = "")
        Long pagina,
        @WebParam(name = "offset", targetNamespace = "")
        Long offset);

}
