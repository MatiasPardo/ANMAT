
package com.inssjp.webservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transaccionWSDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transaccionWSDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codDiagnostico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descDiagnostico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descMotivoDevolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="glnDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="glnOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idDetalleEvento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idEstado" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idMotivoDevolucion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idTransaccionGlobal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicoCuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicoNombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroRemito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otroMotivoDevolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteCalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteCodPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteCodigoObraSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteCodigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteDescObraSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteDescTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteFechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteLocalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteNombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteNroAfiliado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteNroCalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteNroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacientePiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteProvincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pacienteTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razonSocialDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razonSocialInformador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razonSocialOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transacProvincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaccionWSDTO", propOrder = {
    "codDiagnostico",
    "descDiagnostico",
    "descEstado",
    "descMotivoDevolucion",
    "descProducto",
    "glnDestino",
    "glnOrigen",
    "gtin",
    "idDetalleEvento",
    "idEstado",
    "idMotivoDevolucion",
    "idTransaccion",
    "idTransaccionGlobal",
    "lote",
    "medicoCuit",
    "medicoNombres",
    "nombre",
    "nroFactura",
    "nroRemito",
    "nroSerial",
    "otroMotivoDevolucion",
    "pacienteApellido",
    "pacienteCalle",
    "pacienteCodPostal",
    "pacienteCodigoObraSocial",
    "pacienteCodigoTipoDocumento",
    "pacienteDepartamento",
    "pacienteDescObraSocial",
    "pacienteDescTipoDocumento",
    "pacienteFechaNacimiento",
    "pacienteLocalidad",
    "pacienteNombres",
    "pacienteNroAfiliado",
    "pacienteNroCalle",
    "pacienteNroDocumento",
    "pacientePiso",
    "pacienteProvincia",
    "pacienteSexo",
    "pacienteTelefono",
    "razonSocialDestino",
    "razonSocialInformador",
    "razonSocialOrigen",
    "transacProvincia",
    "vencimiento",
    "dEvento",
    "fEvento",
    "fTransaccion",
    "hEvento"
})
public class TransaccionWSDTO {

    protected String codDiagnostico;
    protected String descDiagnostico;
    protected String descEstado;
    protected String descMotivoDevolucion;
    protected String descProducto;
    protected String glnDestino;
    protected String glnOrigen;
    protected String gtin;
    protected Long idDetalleEvento;
    protected Long idEstado;
    protected Long idMotivoDevolucion;
    protected String idTransaccion;
    protected String idTransaccionGlobal;
    protected String lote;
    protected String medicoCuit;
    protected String medicoNombres;
    protected String nombre;
    protected String nroFactura;
    protected String nroRemito;
    protected String nroSerial;
    protected String otroMotivoDevolucion;
    protected String pacienteApellido;
    protected String pacienteCalle;
    protected String pacienteCodPostal;
    protected String pacienteCodigoObraSocial;
    protected String pacienteCodigoTipoDocumento;
    protected String pacienteDepartamento;
    protected String pacienteDescObraSocial;
    protected String pacienteDescTipoDocumento;
    protected String pacienteFechaNacimiento;
    protected String pacienteLocalidad;
    protected String pacienteNombres;
    protected String pacienteNroAfiliado;
    protected String pacienteNroCalle;
    protected String pacienteNroDocumento;
    protected String pacientePiso;
    protected String pacienteProvincia;
    protected String pacienteSexo;
    protected String pacienteTelefono;
    protected String razonSocialDestino;
    protected String razonSocialInformador;
    protected String razonSocialOrigen;
    protected String transacProvincia;
    protected String vencimiento;
    protected String dEvento;
    protected String fEvento;
    protected String fTransaccion;
    protected String hEvento;

    /**
     * Obtiene el valor de la propiedad codDiagnostico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDiagnostico() {
        return codDiagnostico;
    }

    /**
     * Define el valor de la propiedad codDiagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDiagnostico(String value) {
        this.codDiagnostico = value;
    }

    /**
     * Obtiene el valor de la propiedad descDiagnostico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDiagnostico() {
        return descDiagnostico;
    }

    /**
     * Define el valor de la propiedad descDiagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDiagnostico(String value) {
        this.descDiagnostico = value;
    }

    /**
     * Obtiene el valor de la propiedad descEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEstado() {
        return descEstado;
    }

    /**
     * Define el valor de la propiedad descEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEstado(String value) {
        this.descEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad descMotivoDevolucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMotivoDevolucion() {
        return descMotivoDevolucion;
    }

    /**
     * Define el valor de la propiedad descMotivoDevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMotivoDevolucion(String value) {
        this.descMotivoDevolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad descProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescProducto() {
        return descProducto;
    }

    /**
     * Define el valor de la propiedad descProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescProducto(String value) {
        this.descProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad glnDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlnDestino() {
        return glnDestino;
    }

    /**
     * Define el valor de la propiedad glnDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlnDestino(String value) {
        this.glnDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad glnOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlnOrigen() {
        return glnOrigen;
    }

    /**
     * Define el valor de la propiedad glnOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlnOrigen(String value) {
        this.glnOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad gtin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtin() {
        return gtin;
    }

    /**
     * Define el valor de la propiedad gtin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtin(String value) {
        this.gtin = value;
    }

    /**
     * Obtiene el valor de la propiedad idDetalleEvento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDetalleEvento() {
        return idDetalleEvento;
    }

    /**
     * Define el valor de la propiedad idDetalleEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDetalleEvento(Long value) {
        this.idDetalleEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad idEstado.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEstado() {
        return idEstado;
    }

    /**
     * Define el valor de la propiedad idEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEstado(Long value) {
        this.idEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad idMotivoDevolucion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMotivoDevolucion() {
        return idMotivoDevolucion;
    }

    /**
     * Define el valor de la propiedad idMotivoDevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMotivoDevolucion(Long value) {
        this.idMotivoDevolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Define el valor de la propiedad idTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransaccion(String value) {
        this.idTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransaccionGlobal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransaccionGlobal() {
        return idTransaccionGlobal;
    }

    /**
     * Define el valor de la propiedad idTransaccionGlobal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransaccionGlobal(String value) {
        this.idTransaccionGlobal = value;
    }

    /**
     * Obtiene el valor de la propiedad lote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLote() {
        return lote;
    }

    /**
     * Define el valor de la propiedad lote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLote(String value) {
        this.lote = value;
    }

    /**
     * Obtiene el valor de la propiedad medicoCuit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicoCuit() {
        return medicoCuit;
    }

    /**
     * Define el valor de la propiedad medicoCuit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicoCuit(String value) {
        this.medicoCuit = value;
    }

    /**
     * Obtiene el valor de la propiedad medicoNombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicoNombres() {
        return medicoNombres;
    }

    /**
     * Define el valor de la propiedad medicoNombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicoNombres(String value) {
        this.medicoNombres = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nroFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroFactura() {
        return nroFactura;
    }

    /**
     * Define el valor de la propiedad nroFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroFactura(String value) {
        this.nroFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad nroRemito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroRemito() {
        return nroRemito;
    }

    /**
     * Define el valor de la propiedad nroRemito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroRemito(String value) {
        this.nroRemito = value;
    }

    /**
     * Obtiene el valor de la propiedad nroSerial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroSerial() {
        return nroSerial;
    }

    /**
     * Define el valor de la propiedad nroSerial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroSerial(String value) {
        this.nroSerial = value;
    }

    /**
     * Obtiene el valor de la propiedad otroMotivoDevolucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtroMotivoDevolucion() {
        return otroMotivoDevolucion;
    }

    /**
     * Define el valor de la propiedad otroMotivoDevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtroMotivoDevolucion(String value) {
        this.otroMotivoDevolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteApellido() {
        return pacienteApellido;
    }

    /**
     * Define el valor de la propiedad pacienteApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteApellido(String value) {
        this.pacienteApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteCalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteCalle() {
        return pacienteCalle;
    }

    /**
     * Define el valor de la propiedad pacienteCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteCalle(String value) {
        this.pacienteCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteCodPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteCodPostal() {
        return pacienteCodPostal;
    }

    /**
     * Define el valor de la propiedad pacienteCodPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteCodPostal(String value) {
        this.pacienteCodPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteCodigoObraSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteCodigoObraSocial() {
        return pacienteCodigoObraSocial;
    }

    /**
     * Define el valor de la propiedad pacienteCodigoObraSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteCodigoObraSocial(String value) {
        this.pacienteCodigoObraSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteCodigoTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteCodigoTipoDocumento() {
        return pacienteCodigoTipoDocumento;
    }

    /**
     * Define el valor de la propiedad pacienteCodigoTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteCodigoTipoDocumento(String value) {
        this.pacienteCodigoTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteDepartamento() {
        return pacienteDepartamento;
    }

    /**
     * Define el valor de la propiedad pacienteDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteDepartamento(String value) {
        this.pacienteDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteDescObraSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteDescObraSocial() {
        return pacienteDescObraSocial;
    }

    /**
     * Define el valor de la propiedad pacienteDescObraSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteDescObraSocial(String value) {
        this.pacienteDescObraSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteDescTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteDescTipoDocumento() {
        return pacienteDescTipoDocumento;
    }

    /**
     * Define el valor de la propiedad pacienteDescTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteDescTipoDocumento(String value) {
        this.pacienteDescTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteFechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteFechaNacimiento() {
        return pacienteFechaNacimiento;
    }

    /**
     * Define el valor de la propiedad pacienteFechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteFechaNacimiento(String value) {
        this.pacienteFechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteLocalidad() {
        return pacienteLocalidad;
    }

    /**
     * Define el valor de la propiedad pacienteLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteLocalidad(String value) {
        this.pacienteLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteNombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteNombres() {
        return pacienteNombres;
    }

    /**
     * Define el valor de la propiedad pacienteNombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteNombres(String value) {
        this.pacienteNombres = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteNroAfiliado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteNroAfiliado() {
        return pacienteNroAfiliado;
    }

    /**
     * Define el valor de la propiedad pacienteNroAfiliado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteNroAfiliado(String value) {
        this.pacienteNroAfiliado = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteNroCalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteNroCalle() {
        return pacienteNroCalle;
    }

    /**
     * Define el valor de la propiedad pacienteNroCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteNroCalle(String value) {
        this.pacienteNroCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteNroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteNroDocumento() {
        return pacienteNroDocumento;
    }

    /**
     * Define el valor de la propiedad pacienteNroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteNroDocumento(String value) {
        this.pacienteNroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad pacientePiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacientePiso() {
        return pacientePiso;
    }

    /**
     * Define el valor de la propiedad pacientePiso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacientePiso(String value) {
        this.pacientePiso = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteProvincia() {
        return pacienteProvincia;
    }

    /**
     * Define el valor de la propiedad pacienteProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteProvincia(String value) {
        this.pacienteProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteSexo() {
        return pacienteSexo;
    }

    /**
     * Define el valor de la propiedad pacienteSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteSexo(String value) {
        this.pacienteSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad pacienteTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteTelefono() {
        return pacienteTelefono;
    }

    /**
     * Define el valor de la propiedad pacienteTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteTelefono(String value) {
        this.pacienteTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocialDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialDestino() {
        return razonSocialDestino;
    }

    /**
     * Define el valor de la propiedad razonSocialDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialDestino(String value) {
        this.razonSocialDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocialInformador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialInformador() {
        return razonSocialInformador;
    }

    /**
     * Define el valor de la propiedad razonSocialInformador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialInformador(String value) {
        this.razonSocialInformador = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocialOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialOrigen() {
        return razonSocialOrigen;
    }

    /**
     * Define el valor de la propiedad razonSocialOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialOrigen(String value) {
        this.razonSocialOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad transacProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransacProvincia() {
        return transacProvincia;
    }

    /**
     * Define el valor de la propiedad transacProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransacProvincia(String value) {
        this.transacProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad vencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     * Define el valor de la propiedad vencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVencimiento(String value) {
        this.vencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad dEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEvento() {
        return dEvento;
    }

    /**
     * Define el valor de la propiedad dEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEvento(String value) {
        this.dEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad fEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEvento() {
        return fEvento;
    }

    /**
     * Define el valor de la propiedad fEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEvento(String value) {
        this.fEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad fTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTransaccion() {
        return fTransaccion;
    }

    /**
     * Define el valor de la propiedad fTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTransaccion(String value) {
        this.fTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad hEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHEvento() {
        return hEvento;
    }

    /**
     * Define el valor de la propiedad hEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHEvento(String value) {
        this.hEvento = value;
    }

}
