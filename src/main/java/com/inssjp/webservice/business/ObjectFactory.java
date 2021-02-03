
package com.inssjp.webservice.business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inssjp.webservice.business package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCatalogoElectronicoByGLN_QNAME = new QName("http://business.webservice.inssjp.com/", "getCatalogoElectronicoByGLN");
    private final static QName _GetCatalogoElectronicoByGLNResponse_QNAME = new QName("http://business.webservice.inssjp.com/", "getCatalogoElectronicoByGLNResponse");
    private final static QName _GetCatalogoElectronicoByGTIN_QNAME = new QName("http://business.webservice.inssjp.com/", "getCatalogoElectronicoByGTIN");
    private final static QName _GetCatalogoElectronicoByGTINResponse_QNAME = new QName("http://business.webservice.inssjp.com/", "getCatalogoElectronicoByGTINResponse");
    private final static QName _GetMedico_QNAME = new QName("http://business.webservice.inssjp.com/", "getMedico");
    private final static QName _GetMedicoResponse_QNAME = new QName("http://business.webservice.inssjp.com/", "getMedicoResponse");
    private final static QName _GetTransaccionesWS_QNAME = new QName("http://business.webservice.inssjp.com/", "getTransaccionesWS");
    private final static QName _GetTransaccionesWSResponse_QNAME = new QName("http://business.webservice.inssjp.com/", "getTransaccionesWSResponse");
    private final static QName _InformarProducto_QNAME = new QName("http://business.webservice.inssjp.com/", "informarProducto");
    private final static QName _InformarProductoResponse_QNAME = new QName("http://business.webservice.inssjp.com/", "informarProductoResponse");
    private final static QName _SendCancelacTransacc_QNAME = new QName("http://business.webservice.inssjp.com/", "sendCancelacTransacc");
    private final static QName _SendCancelacTransaccParcial_QNAME = new QName("http://business.webservice.inssjp.com/", "sendCancelacTransaccParcial");
    private final static QName _SendCancelacTransaccParcialResponse_QNAME = new QName("http://business.webservice.inssjp.com/", "sendCancelacTransaccParcialResponse");
    private final static QName _SendCancelacTransaccResponse_QNAME = new QName("http://business.webservice.inssjp.com/", "sendCancelacTransaccResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inssjp.webservice.business
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCatalogoElectronicoByGLN }
     * 
     */
    public GetCatalogoElectronicoByGLN createGetCatalogoElectronicoByGLN() {
        return new GetCatalogoElectronicoByGLN();
    }

    /**
     * Create an instance of {@link GetCatalogoElectronicoByGLNResponse }
     * 
     */
    public GetCatalogoElectronicoByGLNResponse createGetCatalogoElectronicoByGLNResponse() {
        return new GetCatalogoElectronicoByGLNResponse();
    }

    /**
     * Create an instance of {@link GetCatalogoElectronicoByGTIN }
     * 
     */
    public GetCatalogoElectronicoByGTIN createGetCatalogoElectronicoByGTIN() {
        return new GetCatalogoElectronicoByGTIN();
    }

    /**
     * Create an instance of {@link GetCatalogoElectronicoByGTINResponse }
     * 
     */
    public GetCatalogoElectronicoByGTINResponse createGetCatalogoElectronicoByGTINResponse() {
        return new GetCatalogoElectronicoByGTINResponse();
    }

    /**
     * Create an instance of {@link GetMedico }
     * 
     */
    public GetMedico createGetMedico() {
        return new GetMedico();
    }

    /**
     * Create an instance of {@link GetMedicoResponse }
     * 
     */
    public GetMedicoResponse createGetMedicoResponse() {
        return new GetMedicoResponse();
    }

    /**
     * Create an instance of {@link GetTransaccionesWS }
     * 
     */
    public GetTransaccionesWS createGetTransaccionesWS() {
        return new GetTransaccionesWS();
    }

    /**
     * Create an instance of {@link GetTransaccionesWSResponse }
     * 
     */
    public GetTransaccionesWSResponse createGetTransaccionesWSResponse() {
        return new GetTransaccionesWSResponse();
    }

    /**
     * Create an instance of {@link InformarProducto }
     * 
     */
    public InformarProducto createInformarProducto() {
        return new InformarProducto();
    }

    /**
     * Create an instance of {@link InformarProductoResponse }
     * 
     */
    public InformarProductoResponse createInformarProductoResponse() {
        return new InformarProductoResponse();
    }

    /**
     * Create an instance of {@link SendCancelacTransacc }
     * 
     */
    public SendCancelacTransacc createSendCancelacTransacc() {
        return new SendCancelacTransacc();
    }

    /**
     * Create an instance of {@link SendCancelacTransaccParcial }
     * 
     */
    public SendCancelacTransaccParcial createSendCancelacTransaccParcial() {
        return new SendCancelacTransaccParcial();
    }

    /**
     * Create an instance of {@link SendCancelacTransaccParcialResponse }
     * 
     */
    public SendCancelacTransaccParcialResponse createSendCancelacTransaccParcialResponse() {
        return new SendCancelacTransaccParcialResponse();
    }

    /**
     * Create an instance of {@link SendCancelacTransaccResponse }
     * 
     */
    public SendCancelacTransaccResponse createSendCancelacTransaccResponse() {
        return new SendCancelacTransaccResponse();
    }

    /**
     * Create an instance of {@link TransaccionDTO }
     * 
     */
    public TransaccionDTO createTransaccionDTO() {
        return new TransaccionDTO();
    }

    /**
     * Create an instance of {@link WebServiceResponse }
     * 
     */
    public WebServiceResponse createWebServiceResponse() {
        return new WebServiceResponse();
    }

    /**
     * Create an instance of {@link WebServiceError }
     * 
     */
    public WebServiceError createWebServiceError() {
        return new WebServiceError();
    }

    /**
     * Create an instance of {@link TransaccionesResponse }
     * 
     */
    public TransaccionesResponse createTransaccionesResponse() {
        return new TransaccionesResponse();
    }

    /**
     * Create an instance of {@link TransaccionWSDTO }
     * 
     */
    public TransaccionWSDTO createTransaccionWSDTO() {
        return new TransaccionWSDTO();
    }

    /**
     * Create an instance of {@link CatalogoGLNResponse }
     * 
     */
    public CatalogoGLNResponse createCatalogoGLNResponse() {
        return new CatalogoGLNResponse();
    }

    /**
     * Create an instance of {@link AgenteDTO }
     * 
     */
    public AgenteDTO createAgenteDTO() {
        return new AgenteDTO();
    }

    /**
     * Create an instance of {@link MedicoResponse }
     * 
     */
    public MedicoResponse createMedicoResponse() {
        return new MedicoResponse();
    }

    /**
     * Create an instance of {@link MedicoDTO }
     * 
     */
    public MedicoDTO createMedicoDTO() {
        return new MedicoDTO();
    }

    /**
     * Create an instance of {@link MatriculaMedicoDTO }
     * 
     */
    public MatriculaMedicoDTO createMatriculaMedicoDTO() {
        return new MatriculaMedicoDTO();
    }

    /**
     * Create an instance of {@link TipoMatriculaDTO }
     * 
     */
    public TipoMatriculaDTO createTipoMatriculaDTO() {
        return new TipoMatriculaDTO();
    }

    /**
     * Create an instance of {@link CatalogoGTINResponse }
     * 
     */
    public CatalogoGTINResponse createCatalogoGTINResponse() {
        return new CatalogoGTINResponse();
    }

    /**
     * Create an instance of {@link ProductoDTO }
     * 
     */
    public ProductoDTO createProductoDTO() {
        return new ProductoDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGLN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGLN }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "getCatalogoElectronicoByGLN")
    public JAXBElement<GetCatalogoElectronicoByGLN> createGetCatalogoElectronicoByGLN(GetCatalogoElectronicoByGLN value) {
        return new JAXBElement<GetCatalogoElectronicoByGLN>(_GetCatalogoElectronicoByGLN_QNAME, GetCatalogoElectronicoByGLN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGLNResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGLNResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "getCatalogoElectronicoByGLNResponse")
    public JAXBElement<GetCatalogoElectronicoByGLNResponse> createGetCatalogoElectronicoByGLNResponse(GetCatalogoElectronicoByGLNResponse value) {
        return new JAXBElement<GetCatalogoElectronicoByGLNResponse>(_GetCatalogoElectronicoByGLNResponse_QNAME, GetCatalogoElectronicoByGLNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "getCatalogoElectronicoByGTIN")
    public JAXBElement<GetCatalogoElectronicoByGTIN> createGetCatalogoElectronicoByGTIN(GetCatalogoElectronicoByGTIN value) {
        return new JAXBElement<GetCatalogoElectronicoByGTIN>(_GetCatalogoElectronicoByGTIN_QNAME, GetCatalogoElectronicoByGTIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGTINResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGTINResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "getCatalogoElectronicoByGTINResponse")
    public JAXBElement<GetCatalogoElectronicoByGTINResponse> createGetCatalogoElectronicoByGTINResponse(GetCatalogoElectronicoByGTINResponse value) {
        return new JAXBElement<GetCatalogoElectronicoByGTINResponse>(_GetCatalogoElectronicoByGTINResponse_QNAME, GetCatalogoElectronicoByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMedico }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "getMedico")
    public JAXBElement<GetMedico> createGetMedico(GetMedico value) {
        return new JAXBElement<GetMedico>(_GetMedico_QNAME, GetMedico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMedicoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "getMedicoResponse")
    public JAXBElement<GetMedicoResponse> createGetMedicoResponse(GetMedicoResponse value) {
        return new JAXBElement<GetMedicoResponse>(_GetMedicoResponse_QNAME, GetMedicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransaccionesWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTransaccionesWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "getTransaccionesWS")
    public JAXBElement<GetTransaccionesWS> createGetTransaccionesWS(GetTransaccionesWS value) {
        return new JAXBElement<GetTransaccionesWS>(_GetTransaccionesWS_QNAME, GetTransaccionesWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransaccionesWSResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTransaccionesWSResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "getTransaccionesWSResponse")
    public JAXBElement<GetTransaccionesWSResponse> createGetTransaccionesWSResponse(GetTransaccionesWSResponse value) {
        return new JAXBElement<GetTransaccionesWSResponse>(_GetTransaccionesWSResponse_QNAME, GetTransaccionesWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformarProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InformarProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "informarProducto")
    public JAXBElement<InformarProducto> createInformarProducto(InformarProducto value) {
        return new JAXBElement<InformarProducto>(_InformarProducto_QNAME, InformarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformarProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InformarProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "informarProductoResponse")
    public JAXBElement<InformarProductoResponse> createInformarProductoResponse(InformarProductoResponse value) {
        return new JAXBElement<InformarProductoResponse>(_InformarProductoResponse_QNAME, InformarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCancelacTransacc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendCancelacTransacc }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "sendCancelacTransacc")
    public JAXBElement<SendCancelacTransacc> createSendCancelacTransacc(SendCancelacTransacc value) {
        return new JAXBElement<SendCancelacTransacc>(_SendCancelacTransacc_QNAME, SendCancelacTransacc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCancelacTransaccParcial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendCancelacTransaccParcial }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "sendCancelacTransaccParcial")
    public JAXBElement<SendCancelacTransaccParcial> createSendCancelacTransaccParcial(SendCancelacTransaccParcial value) {
        return new JAXBElement<SendCancelacTransaccParcial>(_SendCancelacTransaccParcial_QNAME, SendCancelacTransaccParcial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCancelacTransaccParcialResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendCancelacTransaccParcialResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "sendCancelacTransaccParcialResponse")
    public JAXBElement<SendCancelacTransaccParcialResponse> createSendCancelacTransaccParcialResponse(SendCancelacTransaccParcialResponse value) {
        return new JAXBElement<SendCancelacTransaccParcialResponse>(_SendCancelacTransaccParcialResponse_QNAME, SendCancelacTransaccParcialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCancelacTransaccResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendCancelacTransaccResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.webservice.inssjp.com/", name = "sendCancelacTransaccResponse")
    public JAXBElement<SendCancelacTransaccResponse> createSendCancelacTransaccResponse(SendCancelacTransaccResponse value) {
        return new JAXBElement<SendCancelacTransaccResponse>(_SendCancelacTransaccResponse_QNAME, SendCancelacTransaccResponse.class, null, value);
    }

}
