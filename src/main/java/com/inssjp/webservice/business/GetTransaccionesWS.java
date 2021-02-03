
package com.inssjp.webservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getTransaccionesWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getTransaccionesWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idTransaccion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="glnAgenteOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="glnAgenteDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="glnAgenteInformador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idEvento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fechaOperacionDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaOperacionHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaTransaccionDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaTransaccionHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaVencimientoDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaVencimientoHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idProvincia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idEstadoTransaccion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="pagina" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransaccionesWS", propOrder = {
    "usuario",
    "password",
    "idTransaccion",
    "glnAgenteOrigen",
    "glnAgenteDestino",
    "glnAgenteInformador",
    "gtin",
    "lote",
    "serie",
    "idEvento",
    "fechaOperacionDesde",
    "fechaOperacionHasta",
    "fechaTransaccionDesde",
    "fechaTransaccionHasta",
    "fechaVencimientoDesde",
    "fechaVencimientoHasta",
    "remito",
    "factura",
    "idProvincia",
    "idEstadoTransaccion",
    "pagina",
    "offset",
    "orderBy"
})
public class GetTransaccionesWS {

    protected String usuario;
    protected String password;
    protected Long idTransaccion;
    protected String glnAgenteOrigen;
    protected String glnAgenteDestino;
    protected String glnAgenteInformador;
    protected String gtin;
    protected String lote;
    protected String serie;
    protected Long idEvento;
    protected String fechaOperacionDesde;
    protected String fechaOperacionHasta;
    protected String fechaTransaccionDesde;
    protected String fechaTransaccionHasta;
    protected String fechaVencimientoDesde;
    protected String fechaVencimientoHasta;
    protected String remito;
    protected String factura;
    protected Long idProvincia;
    protected Long idEstadoTransaccion;
    protected Long pagina;
    protected Long offset;
    protected String orderBy;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Define el valor de la propiedad idTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTransaccion(Long value) {
        this.idTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad glnAgenteOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlnAgenteOrigen() {
        return glnAgenteOrigen;
    }

    /**
     * Define el valor de la propiedad glnAgenteOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlnAgenteOrigen(String value) {
        this.glnAgenteOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad glnAgenteDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlnAgenteDestino() {
        return glnAgenteDestino;
    }

    /**
     * Define el valor de la propiedad glnAgenteDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlnAgenteDestino(String value) {
        this.glnAgenteDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad glnAgenteInformador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlnAgenteInformador() {
        return glnAgenteInformador;
    }

    /**
     * Define el valor de la propiedad glnAgenteInformador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlnAgenteInformador(String value) {
        this.glnAgenteInformador = value;
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
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
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
     * Obtiene el valor de la propiedad fechaOperacionDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOperacionDesde() {
        return fechaOperacionDesde;
    }

    /**
     * Define el valor de la propiedad fechaOperacionDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOperacionDesde(String value) {
        this.fechaOperacionDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOperacionHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOperacionHasta() {
        return fechaOperacionHasta;
    }

    /**
     * Define el valor de la propiedad fechaOperacionHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOperacionHasta(String value) {
        this.fechaOperacionHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTransaccionDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaTransaccionDesde() {
        return fechaTransaccionDesde;
    }

    /**
     * Define el valor de la propiedad fechaTransaccionDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaTransaccionDesde(String value) {
        this.fechaTransaccionDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTransaccionHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaTransaccionHasta() {
        return fechaTransaccionHasta;
    }

    /**
     * Define el valor de la propiedad fechaTransaccionHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaTransaccionHasta(String value) {
        this.fechaTransaccionHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimientoDesde() {
        return fechaVencimientoDesde;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimientoDesde(String value) {
        this.fechaVencimientoDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimientoHasta() {
        return fechaVencimientoHasta;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimientoHasta(String value) {
        this.fechaVencimientoHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad remito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemito() {
        return remito;
    }

    /**
     * Define el valor de la propiedad remito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemito(String value) {
        this.remito = value;
    }

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactura(String value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad idProvincia.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProvincia() {
        return idProvincia;
    }

    /**
     * Define el valor de la propiedad idProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProvincia(Long value) {
        this.idProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad idEstadoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEstadoTransaccion() {
        return idEstadoTransaccion;
    }

    /**
     * Define el valor de la propiedad idEstadoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEstadoTransaccion(Long value) {
        this.idEstadoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad pagina.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPagina() {
        return pagina;
    }

    /**
     * Define el valor de la propiedad pagina.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPagina(Long value) {
        this.pagina = value;
    }

    /**
     * Obtiene el valor de la propiedad offset.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Define el valor de la propiedad offset.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOffset(Long value) {
        this.offset = value;
    }

    /**
     * Obtiene el valor de la propiedad orderBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Define el valor de la propiedad orderBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

}
