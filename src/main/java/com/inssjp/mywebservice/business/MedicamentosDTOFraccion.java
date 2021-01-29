
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para medicamentosDTOFraccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="medicamentosDTOFraccion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuit_destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuit_origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="f_evento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_nacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gln_destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gln_origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="h_evento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_evento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_motivo_devolucion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="id_motivo_reposicion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="id_obra_social" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_programa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="n_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="n_factura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="n_postal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="n_remito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nro_asociado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero_serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otro_motivo_devolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicamentosDTOFraccion", propOrder = {
    "apellido",
    "cantidad",
    "cuitDestino",
    "cuitOrigen",
    "depto",
    "direccion",
    "fEvento",
    "fechaNacimiento",
    "glnDestino",
    "glnOrigen",
    "gtin",
    "hEvento",
    "idEvento",
    "idMotivoDevolucion",
    "idMotivoReposicion",
    "idObraSocial",
    "idPrograma",
    "localidad",
    "lote",
    "nDocumento",
    "nFactura",
    "nPostal",
    "nRemito",
    "nombres",
    "nroAsociado",
    "numero",
    "numeroSerial",
    "otroMotivoDevolucion",
    "piso",
    "provincia",
    "sexo",
    "telefono",
    "tipoDocumento",
    "vencimiento"
})
public class MedicamentosDTOFraccion {

    protected String apellido;
    protected String cantidad;
    @XmlElement(name = "cuit_destino")
    protected String cuitDestino;
    @XmlElement(name = "cuit_origen")
    protected String cuitOrigen;
    protected String depto;
    protected String direccion;
    @XmlElement(name = "f_evento")
    protected String fEvento;
    @XmlElement(name = "fecha_nacimiento")
    protected String fechaNacimiento;
    @XmlElement(name = "gln_destino")
    protected String glnDestino;
    @XmlElement(name = "gln_origen")
    protected String glnOrigen;
    protected String gtin;
    @XmlElement(name = "h_evento")
    protected String hEvento;
    @XmlElement(name = "id_evento")
    protected String idEvento;
    @XmlElement(name = "id_motivo_devolucion")
    protected Long idMotivoDevolucion;
    @XmlElement(name = "id_motivo_reposicion")
    protected Long idMotivoReposicion;
    @XmlElement(name = "id_obra_social")
    protected String idObraSocial;
    @XmlElement(name = "id_programa")
    protected Long idPrograma;
    protected String localidad;
    protected String lote;
    @XmlElement(name = "n_documento")
    protected String nDocumento;
    @XmlElement(name = "n_factura")
    protected String nFactura;
    @XmlElement(name = "n_postal")
    protected String nPostal;
    @XmlElement(name = "n_remito")
    protected String nRemito;
    protected String nombres;
    @XmlElement(name = "nro_asociado")
    protected String nroAsociado;
    protected String numero;
    @XmlElement(name = "numero_serial")
    protected String numeroSerial;
    @XmlElement(name = "otro_motivo_devolucion")
    protected String otroMotivoDevolucion;
    protected String piso;
    protected String provincia;
    protected String sexo;
    protected String telefono;
    @XmlElement(name = "tipo_documento")
    protected String tipoDocumento;
    protected String vencimiento;

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad cuitDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuitDestino() {
        return cuitDestino;
    }

    /**
     * Define el valor de la propiedad cuitDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuitDestino(String value) {
        this.cuitDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad cuitOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuitOrigen() {
        return cuitOrigen;
    }

    /**
     * Define el valor de la propiedad cuitOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuitOrigen(String value) {
        this.cuitOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad depto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepto() {
        return depto;
    }

    /**
     * Define el valor de la propiedad depto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepto(String value) {
        this.depto = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
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
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
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

    /**
     * Obtiene el valor de la propiedad idEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEvento() {
        return idEvento;
    }

    /**
     * Define el valor de la propiedad idEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEvento(String value) {
        this.idEvento = value;
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
     * Obtiene el valor de la propiedad idMotivoReposicion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMotivoReposicion() {
        return idMotivoReposicion;
    }

    /**
     * Define el valor de la propiedad idMotivoReposicion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMotivoReposicion(Long value) {
        this.idMotivoReposicion = value;
    }

    /**
     * Obtiene el valor de la propiedad idObraSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdObraSocial() {
        return idObraSocial;
    }

    /**
     * Define el valor de la propiedad idObraSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdObraSocial(String value) {
        this.idObraSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad idPrograma.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPrograma() {
        return idPrograma;
    }

    /**
     * Define el valor de la propiedad idPrograma.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPrograma(Long value) {
        this.idPrograma = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidad(String value) {
        this.localidad = value;
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
     * Obtiene el valor de la propiedad nDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDocumento() {
        return nDocumento;
    }

    /**
     * Define el valor de la propiedad nDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDocumento(String value) {
        this.nDocumento = value;
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
     * Obtiene el valor de la propiedad nPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPostal() {
        return nPostal;
    }

    /**
     * Define el valor de la propiedad nPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPostal(String value) {
        this.nPostal = value;
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
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad nroAsociado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroAsociado() {
        return nroAsociado;
    }

    /**
     * Define el valor de la propiedad nroAsociado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroAsociado(String value) {
        this.nroAsociado = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
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
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
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

}
