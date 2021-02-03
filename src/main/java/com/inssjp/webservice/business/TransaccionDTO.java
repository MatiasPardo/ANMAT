
package com.inssjp.webservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transaccionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transaccionDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codDiagnostico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codHiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuitMedico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="glnDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="glnOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idEvento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idMotivoDevolucion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idObraSocial" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroAfiliado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroCalle" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroRemito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otroMotivoDevolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "transaccionDTO", propOrder = {
    "apellidos",
    "calle",
    "codDiagnostico",
    "codHiv",
    "codPostal",
    "cuitMedico",
    "departamento",
    "fechaNacimiento",
    "glnDestino",
    "glnOrigen",
    "gtin",
    "idEvento",
    "idMotivoDevolucion",
    "idObraSocial",
    "idTipoDocumento",
    "localidad",
    "lote",
    "nombres",
    "nroAfiliado",
    "nroCalle",
    "nroDocumento",
    "nroFactura",
    "nroRemito",
    "nroSerial",
    "otroMotivoDevolucion",
    "piso",
    "provincia",
    "sexo",
    "telefono",
    "vencimiento",
    "fEvento",
    "hEvento"
})
public class TransaccionDTO {

    protected String apellidos;
    protected String calle;
    protected String codDiagnostico;
    protected String codHiv;
    protected String codPostal;
    protected String cuitMedico;
    protected String departamento;
    protected String fechaNacimiento;
    protected String glnDestino;
    protected String glnOrigen;
    protected String gtin;
    protected Long idEvento;
    protected Long idMotivoDevolucion;
    protected Long idObraSocial;
    protected Long idTipoDocumento;
    protected String localidad;
    protected String lote;
    protected String nombres;
    protected String nroAfiliado;
    protected Long nroCalle;
    protected String nroDocumento;
    protected String nroFactura;
    protected String nroRemito;
    protected String nroSerial;
    protected String otroMotivoDevolucion;
    protected String piso;
    protected String provincia;
    protected String sexo;
    protected String telefono;
    protected String vencimiento;
    protected String fEvento;
    protected String hEvento;

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalle(String value) {
        this.calle = value;
    }

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
     * Obtiene el valor de la propiedad codHiv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodHiv() {
        return codHiv;
    }

    /**
     * Define el valor de la propiedad codHiv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodHiv(String value) {
        this.codHiv = value;
    }

    /**
     * Obtiene el valor de la propiedad codPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * Define el valor de la propiedad codPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPostal(String value) {
        this.codPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad cuitMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuitMedico() {
        return cuitMedico;
    }

    /**
     * Define el valor de la propiedad cuitMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuitMedico(String value) {
        this.cuitMedico = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
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
     * Obtiene el valor de la propiedad idObraSocial.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdObraSocial() {
        return idObraSocial;
    }

    /**
     * Define el valor de la propiedad idObraSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdObraSocial(Long value) {
        this.idObraSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Define el valor de la propiedad idTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTipoDocumento(Long value) {
        this.idTipoDocumento = value;
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
     * Obtiene el valor de la propiedad nroAfiliado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroAfiliado() {
        return nroAfiliado;
    }

    /**
     * Define el valor de la propiedad nroAfiliado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroAfiliado(String value) {
        this.nroAfiliado = value;
    }

    /**
     * Obtiene el valor de la propiedad nroCalle.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNroCalle() {
        return nroCalle;
    }

    /**
     * Define el valor de la propiedad nroCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNroCalle(Long value) {
        this.nroCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad nroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDocumento() {
        return nroDocumento;
    }

    /**
     * Define el valor de la propiedad nroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDocumento(String value) {
        this.nroDocumento = value;
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
