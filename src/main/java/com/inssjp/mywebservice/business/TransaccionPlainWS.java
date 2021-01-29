
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transaccionPlainWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transaccionPlainWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_d_evento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_d_programa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_f_evento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_f_transaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_gln_destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_gln_origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_id_detalle_evento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="_id_estado" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="_id_evento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="_id_transaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_id_transaccion_global" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_lote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_n_factura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_n_remito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_numero_serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_razon_social_destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_razon_social_origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_vencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_ver2_paciente_apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_ver2_paciente_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_ver2_paciente_id_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_ver2_paciente_id_obra_social" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_ver2_paciente_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_ver2_paciente_numero_afiliado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaccionPlainWS", propOrder = {
    "dEvento",
    "dPrograma",
    "fEvento",
    "fTransaccion",
    "glnDestino",
    "glnOrigen",
    "gtin",
    "idDetalleEvento",
    "idEstado",
    "idEvento",
    "idTransaccion",
    "idTransaccionGlobal",
    "lote",
    "nFactura",
    "nRemito",
    "nombre",
    "numeroSerial",
    "razonSocialDestino",
    "razonSocialOrigen",
    "vencimiento",
    "ver2PacienteApellido",
    "ver2PacienteDocumento",
    "ver2PacienteIdDocumento",
    "ver2PacienteIdObraSocial",
    "ver2PacienteNombre",
    "ver2PacienteNumeroAfiliado"
})
public class TransaccionPlainWS {

    @XmlElement(name = "_d_evento")
    protected String dEvento;
    @XmlElement(name = "_d_programa")
    protected String dPrograma;
    @XmlElement(name = "_f_evento")
    protected String fEvento;
    @XmlElement(name = "_f_transaccion")
    protected String fTransaccion;
    @XmlElement(name = "_gln_destino")
    protected String glnDestino;
    @XmlElement(name = "_gln_origen")
    protected String glnOrigen;
    @XmlElement(name = "_gtin")
    protected String gtin;
    @XmlElement(name = "_id_detalle_evento")
    protected Long idDetalleEvento;
    @XmlElement(name = "_id_estado")
    protected Long idEstado;
    @XmlElement(name = "_id_evento")
    protected Long idEvento;
    @XmlElement(name = "_id_transaccion")
    protected String idTransaccion;
    @XmlElement(name = "_id_transaccion_global")
    protected String idTransaccionGlobal;
    @XmlElement(name = "_lote")
    protected String lote;
    @XmlElement(name = "_n_factura")
    protected String nFactura;
    @XmlElement(name = "_n_remito")
    protected String nRemito;
    @XmlElement(name = "_nombre")
    protected String nombre;
    @XmlElement(name = "_numero_serial")
    protected String numeroSerial;
    @XmlElement(name = "_razon_social_destino")
    protected String razonSocialDestino;
    @XmlElement(name = "_razon_social_origen")
    protected String razonSocialOrigen;
    @XmlElement(name = "_vencimiento")
    protected String vencimiento;
    @XmlElement(name = "_ver2_paciente_apellido")
    protected String ver2PacienteApellido;
    @XmlElement(name = "_ver2_paciente_documento")
    protected String ver2PacienteDocumento;
    @XmlElement(name = "_ver2_paciente_id_documento")
    protected String ver2PacienteIdDocumento;
    @XmlElement(name = "_ver2_paciente_id_obra_social")
    protected String ver2PacienteIdObraSocial;
    @XmlElement(name = "_ver2_paciente_nombre")
    protected String ver2PacienteNombre;
    @XmlElement(name = "_ver2_paciente_numero_afiliado")
    protected String ver2PacienteNumeroAfiliado;

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
     * Obtiene el valor de la propiedad dPrograma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPrograma() {
        return dPrograma;
    }

    /**
     * Define el valor de la propiedad dPrograma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPrograma(String value) {
        this.dPrograma = value;
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
     * Obtiene el valor de la propiedad idEvento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEvento() {
        return idEvento;
    }

    /**
     * Define el valor de la propiedad idEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEvento(Long value) {
        this.idEvento = value;
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
     * Obtiene el valor de la propiedad nFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNFactura() {
        return nFactura;
    }

    /**
     * Define el valor de la propiedad nFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNFactura(String value) {
        this.nFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad nRemito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRemito() {
        return nRemito;
    }

    /**
     * Define el valor de la propiedad nRemito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRemito(String value) {
        this.nRemito = value;
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
     * Obtiene el valor de la propiedad numeroSerial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSerial() {
        return numeroSerial;
    }

    /**
     * Define el valor de la propiedad numeroSerial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSerial(String value) {
        this.numeroSerial = value;
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
     * Obtiene el valor de la propiedad ver2PacienteApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer2PacienteApellido() {
        return ver2PacienteApellido;
    }

    /**
     * Define el valor de la propiedad ver2PacienteApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer2PacienteApellido(String value) {
        this.ver2PacienteApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad ver2PacienteDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer2PacienteDocumento() {
        return ver2PacienteDocumento;
    }

    /**
     * Define el valor de la propiedad ver2PacienteDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer2PacienteDocumento(String value) {
        this.ver2PacienteDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad ver2PacienteIdDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer2PacienteIdDocumento() {
        return ver2PacienteIdDocumento;
    }

    /**
     * Define el valor de la propiedad ver2PacienteIdDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer2PacienteIdDocumento(String value) {
        this.ver2PacienteIdDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad ver2PacienteIdObraSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer2PacienteIdObraSocial() {
        return ver2PacienteIdObraSocial;
    }

    /**
     * Define el valor de la propiedad ver2PacienteIdObraSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer2PacienteIdObraSocial(String value) {
        this.ver2PacienteIdObraSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad ver2PacienteNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer2PacienteNombre() {
        return ver2PacienteNombre;
    }

    /**
     * Define el valor de la propiedad ver2PacienteNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer2PacienteNombre(String value) {
        this.ver2PacienteNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad ver2PacienteNumeroAfiliado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer2PacienteNumeroAfiliado() {
        return ver2PacienteNumeroAfiliado;
    }

    /**
     * Define el valor de la propiedad ver2PacienteNumeroAfiliado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer2PacienteNumeroAfiliado(String value) {
        this.ver2PacienteNumeroAfiliado = value;
    }

}
