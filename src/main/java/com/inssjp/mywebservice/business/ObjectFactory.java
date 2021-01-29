
package com.inssjp.mywebservice.business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inssjp.mywebservice.business package. 
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

    private final static QName _SendMedicamentosFraccion_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendMedicamentosFraccion");
    private final static QName _SendMedicamentosFraccionResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendMedicamentosFraccionResponse");
    private final static QName _SendConfirmaTransacc_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendConfirmaTransacc");
    private final static QName _SendConfirmaTransaccResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendConfirmaTransaccResponse");
    private final static QName _SendCancelacTransacc_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendCancelacTransacc");
    private final static QName _SendCancelacTransaccResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendCancelacTransaccResponse");
    private final static QName _GetTransaccionesNoConfirmadas_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getTransaccionesNoConfirmadas");
    private final static QName _GetTransaccionesNoConfirmadasResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getTransaccionesNoConfirmadasResponse");
    private final static QName _SendAlertaTransacc_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendAlertaTransacc");
    private final static QName _SendAlertaTransaccResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendAlertaTransaccResponse");
    private final static QName _SendMedicamentos_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendMedicamentos");
    private final static QName _SendMedicamentosResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendMedicamentosResponse");
    private final static QName _GetConsultaStock_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getConsultaStock");
    private final static QName _GetConsultaStockResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getConsultaStockResponse");
    private final static QName _GetEnviosPropiosAlertados_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getEnviosPropiosAlertados");
    private final static QName _GetEnviosPropiosAlertadosResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getEnviosPropiosAlertadosResponse");
    private final static QName _SendCancelacTransaccParcial_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendCancelacTransaccParcial");
    private final static QName _SendCancelacTransaccParcialResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendCancelacTransaccParcialResponse");
    private final static QName _GetTransaccionesWS_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getTransaccionesWS");
    private final static QName _GetTransaccionesWSResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getTransaccionesWSResponse");
    private final static QName _GetCatalogoElectronicoByGTIN_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getCatalogoElectronicoByGTIN");
    private final static QName _GetCatalogoElectronicoByGTINResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getCatalogoElectronicoByGTINResponse");
    private final static QName _GetCatalogoElectronicoByGLN_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getCatalogoElectronicoByGLN");
    private final static QName _GetCatalogoElectronicoByGLNResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getCatalogoElectronicoByGLNResponse");
    private final static QName _SendAsignarNroAutorizacion_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendAsignarNroAutorizacion");
    private final static QName _SendAsignarNroAutorizacionResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendAsignarNroAutorizacionResponse");
    private final static QName _GetConsultaNumeroAutorizacion_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getConsultaNumeroAutorizacion");
    private final static QName _GetConsultaNumeroAutorizacionResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "getConsultaNumeroAutorizacionResponse");
    private final static QName _SendMedicamentosDHSerie_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendMedicamentosDHSerie");
    private final static QName _SendMedicamentosDHSerieResponse_QNAME = new QName("http://business.mywebservice.inssjp.com/", "sendMedicamentosDHSerieResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inssjp.mywebservice.business
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMedicamentosFraccion }
     * 
     */
    public SendMedicamentosFraccion createSendMedicamentosFraccion() {
        return new SendMedicamentosFraccion();
    }

    /**
     * Create an instance of {@link SendMedicamentosFraccionResponse }
     * 
     */
    public SendMedicamentosFraccionResponse createSendMedicamentosFraccionResponse() {
        return new SendMedicamentosFraccionResponse();
    }

    /**
     * Create an instance of {@link SendConfirmaTransacc }
     * 
     */
    public SendConfirmaTransacc createSendConfirmaTransacc() {
        return new SendConfirmaTransacc();
    }

    /**
     * Create an instance of {@link SendConfirmaTransaccResponse }
     * 
     */
    public SendConfirmaTransaccResponse createSendConfirmaTransaccResponse() {
        return new SendConfirmaTransaccResponse();
    }

    /**
     * Create an instance of {@link SendCancelacTransacc }
     * 
     */
    public SendCancelacTransacc createSendCancelacTransacc() {
        return new SendCancelacTransacc();
    }

    /**
     * Create an instance of {@link SendCancelacTransaccResponse }
     * 
     */
    public SendCancelacTransaccResponse createSendCancelacTransaccResponse() {
        return new SendCancelacTransaccResponse();
    }

    /**
     * Create an instance of {@link GetTransaccionesNoConfirmadas }
     * 
     */
    public GetTransaccionesNoConfirmadas createGetTransaccionesNoConfirmadas() {
        return new GetTransaccionesNoConfirmadas();
    }

    /**
     * Create an instance of {@link GetTransaccionesNoConfirmadasResponse }
     * 
     */
    public GetTransaccionesNoConfirmadasResponse createGetTransaccionesNoConfirmadasResponse() {
        return new GetTransaccionesNoConfirmadasResponse();
    }

    /**
     * Create an instance of {@link SendAlertaTransacc }
     * 
     */
    public SendAlertaTransacc createSendAlertaTransacc() {
        return new SendAlertaTransacc();
    }

    /**
     * Create an instance of {@link SendAlertaTransaccResponse }
     * 
     */
    public SendAlertaTransaccResponse createSendAlertaTransaccResponse() {
        return new SendAlertaTransaccResponse();
    }

    /**
     * Create an instance of {@link SendMedicamentos }
     * 
     */
    public SendMedicamentos createSendMedicamentos() {
        return new SendMedicamentos();
    }

    /**
     * Create an instance of {@link SendMedicamentosResponse }
     * 
     */
    public SendMedicamentosResponse createSendMedicamentosResponse() {
        return new SendMedicamentosResponse();
    }

    /**
     * Create an instance of {@link GetConsultaStock }
     * 
     */
    public GetConsultaStock createGetConsultaStock() {
        return new GetConsultaStock();
    }

    /**
     * Create an instance of {@link GetConsultaStockResponse }
     * 
     */
    public GetConsultaStockResponse createGetConsultaStockResponse() {
        return new GetConsultaStockResponse();
    }

    /**
     * Create an instance of {@link GetEnviosPropiosAlertados }
     * 
     */
    public GetEnviosPropiosAlertados createGetEnviosPropiosAlertados() {
        return new GetEnviosPropiosAlertados();
    }

    /**
     * Create an instance of {@link GetEnviosPropiosAlertadosResponse }
     * 
     */
    public GetEnviosPropiosAlertadosResponse createGetEnviosPropiosAlertadosResponse() {
        return new GetEnviosPropiosAlertadosResponse();
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
     * Create an instance of {@link SendAsignarNroAutorizacion }
     * 
     */
    public SendAsignarNroAutorizacion createSendAsignarNroAutorizacion() {
        return new SendAsignarNroAutorizacion();
    }

    /**
     * Create an instance of {@link SendAsignarNroAutorizacionResponse }
     * 
     */
    public SendAsignarNroAutorizacionResponse createSendAsignarNroAutorizacionResponse() {
        return new SendAsignarNroAutorizacionResponse();
    }

    /**
     * Create an instance of {@link GetConsultaNumeroAutorizacion }
     * 
     */
    public GetConsultaNumeroAutorizacion createGetConsultaNumeroAutorizacion() {
        return new GetConsultaNumeroAutorizacion();
    }

    /**
     * Create an instance of {@link GetConsultaNumeroAutorizacionResponse }
     * 
     */
    public GetConsultaNumeroAutorizacionResponse createGetConsultaNumeroAutorizacionResponse() {
        return new GetConsultaNumeroAutorizacionResponse();
    }

    /**
     * Create an instance of {@link SendMedicamentosDHSerie }
     * 
     */
    public SendMedicamentosDHSerie createSendMedicamentosDHSerie() {
        return new SendMedicamentosDHSerie();
    }

    /**
     * Create an instance of {@link SendMedicamentosDHSerieResponse }
     * 
     */
    public SendMedicamentosDHSerieResponse createSendMedicamentosDHSerieResponse() {
        return new SendMedicamentosDHSerieResponse();
    }

    /**
     * Create an instance of {@link MedicamentosDTOFraccion }
     * 
     */
    public MedicamentosDTOFraccion createMedicamentosDTOFraccion() {
        return new MedicamentosDTOFraccion();
    }

    /**
     * Create an instance of {@link WebServiceResult }
     * 
     */
    public WebServiceResult createWebServiceResult() {
        return new WebServiceResult();
    }

    /**
     * Create an instance of {@link WebServiceError }
     * 
     */
    public WebServiceError createWebServiceError() {
        return new WebServiceError();
    }

    /**
     * Create an instance of {@link ConfirmacionTransaccionDTO }
     * 
     */
    public ConfirmacionTransaccionDTO createConfirmacionTransaccionDTO() {
        return new ConfirmacionTransaccionDTO();
    }

    /**
     * Create an instance of {@link WebServiceConfirmResult }
     * 
     */
    public WebServiceConfirmResult createWebServiceConfirmResult() {
        return new WebServiceConfirmResult();
    }

    /**
     * Create an instance of {@link TransaccionesNoConfirmadasWSResult }
     * 
     */
    public TransaccionesNoConfirmadasWSResult createTransaccionesNoConfirmadasWSResult() {
        return new TransaccionesNoConfirmadasWSResult();
    }

    /**
     * Create an instance of {@link TransaccionPlainWS }
     * 
     */
    public TransaccionPlainWS createTransaccionPlainWS() {
        return new TransaccionPlainWS();
    }

    /**
     * Create an instance of {@link MedicamentosDTO }
     * 
     */
    public MedicamentosDTO createMedicamentosDTO() {
        return new MedicamentosDTO();
    }

    /**
     * Create an instance of {@link ConsultaStockWSResult }
     * 
     */
    public ConsultaStockWSResult createConsultaStockWSResult() {
        return new ConsultaStockWSResult();
    }

    /**
     * Create an instance of {@link ConsultaStockMedicamentoWS }
     * 
     */
    public ConsultaStockMedicamentoWS createConsultaStockMedicamentoWS() {
        return new ConsultaStockMedicamentoWS();
    }

    /**
     * Create an instance of {@link TransaccionesWSResult }
     * 
     */
    public TransaccionesWSResult createTransaccionesWSResult() {
        return new TransaccionesWSResult();
    }

    /**
     * Create an instance of {@link ResultadoPersonalizado }
     * 
     */
    public ResultadoPersonalizado createResultadoPersonalizado() {
        return new ResultadoPersonalizado();
    }

    /**
     * Create an instance of {@link CatalogoGTINResult }
     * 
     */
    public CatalogoGTINResult createCatalogoGTINResult() {
        return new CatalogoGTINResult();
    }

    /**
     * Create an instance of {@link MedicamentoPlain }
     * 
     */
    public MedicamentoPlain createMedicamentoPlain() {
        return new MedicamentoPlain();
    }

    /**
     * Create an instance of {@link MonodrogaPlainList }
     * 
     */
    public MonodrogaPlainList createMonodrogaPlainList() {
        return new MonodrogaPlainList();
    }

    /**
     * Create an instance of {@link MonodrogaPlain }
     * 
     */
    public MonodrogaPlain createMonodrogaPlain() {
        return new MonodrogaPlain();
    }

    /**
     * Create an instance of {@link CatalogoGLNResult }
     * 
     */
    public CatalogoGLNResult createCatalogoGLNResult() {
        return new CatalogoGLNResult();
    }

    /**
     * Create an instance of {@link AgentePlain }
     * 
     */
    public AgentePlain createAgentePlain() {
        return new AgentePlain();
    }

    /**
     * Create an instance of {@link ConsultaNumeroAutorizacionDTO }
     * 
     */
    public ConsultaNumeroAutorizacionDTO createConsultaNumeroAutorizacionDTO() {
        return new ConsultaNumeroAutorizacionDTO();
    }

    /**
     * Create an instance of {@link MedicamentosDTODHSerie }
     * 
     */
    public MedicamentosDTODHSerie createMedicamentosDTODHSerie() {
        return new MedicamentosDTODHSerie();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMedicamentosFraccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendMedicamentosFraccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendMedicamentosFraccion")
    public JAXBElement<SendMedicamentosFraccion> createSendMedicamentosFraccion(SendMedicamentosFraccion value) {
        return new JAXBElement<SendMedicamentosFraccion>(_SendMedicamentosFraccion_QNAME, SendMedicamentosFraccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMedicamentosFraccionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendMedicamentosFraccionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendMedicamentosFraccionResponse")
    public JAXBElement<SendMedicamentosFraccionResponse> createSendMedicamentosFraccionResponse(SendMedicamentosFraccionResponse value) {
        return new JAXBElement<SendMedicamentosFraccionResponse>(_SendMedicamentosFraccionResponse_QNAME, SendMedicamentosFraccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendConfirmaTransacc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendConfirmaTransacc }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendConfirmaTransacc")
    public JAXBElement<SendConfirmaTransacc> createSendConfirmaTransacc(SendConfirmaTransacc value) {
        return new JAXBElement<SendConfirmaTransacc>(_SendConfirmaTransacc_QNAME, SendConfirmaTransacc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendConfirmaTransaccResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendConfirmaTransaccResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendConfirmaTransaccResponse")
    public JAXBElement<SendConfirmaTransaccResponse> createSendConfirmaTransaccResponse(SendConfirmaTransaccResponse value) {
        return new JAXBElement<SendConfirmaTransaccResponse>(_SendConfirmaTransaccResponse_QNAME, SendConfirmaTransaccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCancelacTransacc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendCancelacTransacc }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendCancelacTransacc")
    public JAXBElement<SendCancelacTransacc> createSendCancelacTransacc(SendCancelacTransacc value) {
        return new JAXBElement<SendCancelacTransacc>(_SendCancelacTransacc_QNAME, SendCancelacTransacc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCancelacTransaccResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendCancelacTransaccResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendCancelacTransaccResponse")
    public JAXBElement<SendCancelacTransaccResponse> createSendCancelacTransaccResponse(SendCancelacTransaccResponse value) {
        return new JAXBElement<SendCancelacTransaccResponse>(_SendCancelacTransaccResponse_QNAME, SendCancelacTransaccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransaccionesNoConfirmadas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTransaccionesNoConfirmadas }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getTransaccionesNoConfirmadas")
    public JAXBElement<GetTransaccionesNoConfirmadas> createGetTransaccionesNoConfirmadas(GetTransaccionesNoConfirmadas value) {
        return new JAXBElement<GetTransaccionesNoConfirmadas>(_GetTransaccionesNoConfirmadas_QNAME, GetTransaccionesNoConfirmadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransaccionesNoConfirmadasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTransaccionesNoConfirmadasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getTransaccionesNoConfirmadasResponse")
    public JAXBElement<GetTransaccionesNoConfirmadasResponse> createGetTransaccionesNoConfirmadasResponse(GetTransaccionesNoConfirmadasResponse value) {
        return new JAXBElement<GetTransaccionesNoConfirmadasResponse>(_GetTransaccionesNoConfirmadasResponse_QNAME, GetTransaccionesNoConfirmadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAlertaTransacc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendAlertaTransacc }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendAlertaTransacc")
    public JAXBElement<SendAlertaTransacc> createSendAlertaTransacc(SendAlertaTransacc value) {
        return new JAXBElement<SendAlertaTransacc>(_SendAlertaTransacc_QNAME, SendAlertaTransacc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAlertaTransaccResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendAlertaTransaccResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendAlertaTransaccResponse")
    public JAXBElement<SendAlertaTransaccResponse> createSendAlertaTransaccResponse(SendAlertaTransaccResponse value) {
        return new JAXBElement<SendAlertaTransaccResponse>(_SendAlertaTransaccResponse_QNAME, SendAlertaTransaccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMedicamentos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendMedicamentos }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendMedicamentos")
    public JAXBElement<SendMedicamentos> createSendMedicamentos(SendMedicamentos value) {
        return new JAXBElement<SendMedicamentos>(_SendMedicamentos_QNAME, SendMedicamentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMedicamentosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendMedicamentosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendMedicamentosResponse")
    public JAXBElement<SendMedicamentosResponse> createSendMedicamentosResponse(SendMedicamentosResponse value) {
        return new JAXBElement<SendMedicamentosResponse>(_SendMedicamentosResponse_QNAME, SendMedicamentosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsultaStock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConsultaStock }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getConsultaStock")
    public JAXBElement<GetConsultaStock> createGetConsultaStock(GetConsultaStock value) {
        return new JAXBElement<GetConsultaStock>(_GetConsultaStock_QNAME, GetConsultaStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsultaStockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConsultaStockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getConsultaStockResponse")
    public JAXBElement<GetConsultaStockResponse> createGetConsultaStockResponse(GetConsultaStockResponse value) {
        return new JAXBElement<GetConsultaStockResponse>(_GetConsultaStockResponse_QNAME, GetConsultaStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnviosPropiosAlertados }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEnviosPropiosAlertados }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getEnviosPropiosAlertados")
    public JAXBElement<GetEnviosPropiosAlertados> createGetEnviosPropiosAlertados(GetEnviosPropiosAlertados value) {
        return new JAXBElement<GetEnviosPropiosAlertados>(_GetEnviosPropiosAlertados_QNAME, GetEnviosPropiosAlertados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnviosPropiosAlertadosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEnviosPropiosAlertadosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getEnviosPropiosAlertadosResponse")
    public JAXBElement<GetEnviosPropiosAlertadosResponse> createGetEnviosPropiosAlertadosResponse(GetEnviosPropiosAlertadosResponse value) {
        return new JAXBElement<GetEnviosPropiosAlertadosResponse>(_GetEnviosPropiosAlertadosResponse_QNAME, GetEnviosPropiosAlertadosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCancelacTransaccParcial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendCancelacTransaccParcial }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendCancelacTransaccParcial")
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
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendCancelacTransaccParcialResponse")
    public JAXBElement<SendCancelacTransaccParcialResponse> createSendCancelacTransaccParcialResponse(SendCancelacTransaccParcialResponse value) {
        return new JAXBElement<SendCancelacTransaccParcialResponse>(_SendCancelacTransaccParcialResponse_QNAME, SendCancelacTransaccParcialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransaccionesWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTransaccionesWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getTransaccionesWS")
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
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getTransaccionesWSResponse")
    public JAXBElement<GetTransaccionesWSResponse> createGetTransaccionesWSResponse(GetTransaccionesWSResponse value) {
        return new JAXBElement<GetTransaccionesWSResponse>(_GetTransaccionesWSResponse_QNAME, GetTransaccionesWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getCatalogoElectronicoByGTIN")
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
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getCatalogoElectronicoByGTINResponse")
    public JAXBElement<GetCatalogoElectronicoByGTINResponse> createGetCatalogoElectronicoByGTINResponse(GetCatalogoElectronicoByGTINResponse value) {
        return new JAXBElement<GetCatalogoElectronicoByGTINResponse>(_GetCatalogoElectronicoByGTINResponse_QNAME, GetCatalogoElectronicoByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGLN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCatalogoElectronicoByGLN }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getCatalogoElectronicoByGLN")
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
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getCatalogoElectronicoByGLNResponse")
    public JAXBElement<GetCatalogoElectronicoByGLNResponse> createGetCatalogoElectronicoByGLNResponse(GetCatalogoElectronicoByGLNResponse value) {
        return new JAXBElement<GetCatalogoElectronicoByGLNResponse>(_GetCatalogoElectronicoByGLNResponse_QNAME, GetCatalogoElectronicoByGLNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAsignarNroAutorizacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendAsignarNroAutorizacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendAsignarNroAutorizacion")
    public JAXBElement<SendAsignarNroAutorizacion> createSendAsignarNroAutorizacion(SendAsignarNroAutorizacion value) {
        return new JAXBElement<SendAsignarNroAutorizacion>(_SendAsignarNroAutorizacion_QNAME, SendAsignarNroAutorizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAsignarNroAutorizacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendAsignarNroAutorizacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendAsignarNroAutorizacionResponse")
    public JAXBElement<SendAsignarNroAutorizacionResponse> createSendAsignarNroAutorizacionResponse(SendAsignarNroAutorizacionResponse value) {
        return new JAXBElement<SendAsignarNroAutorizacionResponse>(_SendAsignarNroAutorizacionResponse_QNAME, SendAsignarNroAutorizacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsultaNumeroAutorizacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConsultaNumeroAutorizacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getConsultaNumeroAutorizacion")
    public JAXBElement<GetConsultaNumeroAutorizacion> createGetConsultaNumeroAutorizacion(GetConsultaNumeroAutorizacion value) {
        return new JAXBElement<GetConsultaNumeroAutorizacion>(_GetConsultaNumeroAutorizacion_QNAME, GetConsultaNumeroAutorizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsultaNumeroAutorizacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConsultaNumeroAutorizacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "getConsultaNumeroAutorizacionResponse")
    public JAXBElement<GetConsultaNumeroAutorizacionResponse> createGetConsultaNumeroAutorizacionResponse(GetConsultaNumeroAutorizacionResponse value) {
        return new JAXBElement<GetConsultaNumeroAutorizacionResponse>(_GetConsultaNumeroAutorizacionResponse_QNAME, GetConsultaNumeroAutorizacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMedicamentosDHSerie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendMedicamentosDHSerie }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendMedicamentosDHSerie")
    public JAXBElement<SendMedicamentosDHSerie> createSendMedicamentosDHSerie(SendMedicamentosDHSerie value) {
        return new JAXBElement<SendMedicamentosDHSerie>(_SendMedicamentosDHSerie_QNAME, SendMedicamentosDHSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMedicamentosDHSerieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendMedicamentosDHSerieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://business.mywebservice.inssjp.com/", name = "sendMedicamentosDHSerieResponse")
    public JAXBElement<SendMedicamentosDHSerieResponse> createSendMedicamentosDHSerieResponse(SendMedicamentosDHSerieResponse value) {
        return new JAXBElement<SendMedicamentosDHSerieResponse>(_SendMedicamentosDHSerieResponse_QNAME, SendMedicamentosDHSerieResponse.class, null, value);
    }

}
