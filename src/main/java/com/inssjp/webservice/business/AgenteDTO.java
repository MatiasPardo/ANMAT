
package com.inssjp.webservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agenteDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agenteDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo_postal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entre_calle_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entre_calle_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_alta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_baja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_ult_modificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gln_principal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_tipo_agente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre_localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre_provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre_tipo_agente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razon_social" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razon_social_principal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agenteDTO", propOrder = {
    "codigoPostal",
    "cuit",
    "departamento",
    "direccion",
    "email",
    "entreCalle1",
    "entreCalle2",
    "fechaAlta",
    "fechaBaja",
    "fechaUltModificacion",
    "gln",
    "glnPrincipal",
    "idLocalidad",
    "idProvincia",
    "idTipoAgente",
    "nombreLocalidad",
    "nombreProvincia",
    "nombreTipoAgente",
    "numero",
    "piso",
    "razonSocial",
    "razonSocialPrincipal",
    "telefono"
})
public class AgenteDTO {

    @XmlElement(name = "codigo_postal")
    protected String codigoPostal;
    protected String cuit;
    protected String departamento;
    protected String direccion;
    protected String email;
    @XmlElement(name = "entre_calle_1")
    protected String entreCalle1;
    @XmlElement(name = "entre_calle_2")
    protected String entreCalle2;
    @XmlElement(name = "fecha_alta")
    protected String fechaAlta;
    @XmlElement(name = "fecha_baja")
    protected String fechaBaja;
    @XmlElement(name = "fecha_ult_modificacion")
    protected String fechaUltModificacion;
    protected String gln;
    @XmlElement(name = "gln_principal")
    protected String glnPrincipal;
    @XmlElement(name = "id_localidad")
    protected String idLocalidad;
    @XmlElement(name = "id_provincia")
    protected String idProvincia;
    @XmlElement(name = "id_tipo_agente")
    protected String idTipoAgente;
    @XmlElement(name = "nombre_localidad")
    protected String nombreLocalidad;
    @XmlElement(name = "nombre_provincia")
    protected String nombreProvincia;
    @XmlElement(name = "nombre_tipo_agente")
    protected String nombreTipoAgente;
    protected String numero;
    protected String piso;
    @XmlElement(name = "razon_social")
    protected String razonSocial;
    @XmlElement(name = "razon_social_principal")
    protected String razonSocialPrincipal;
    protected String telefono;

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad cuit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuit() {
        return cuit;
    }

    /**
     * Define el valor de la propiedad cuit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuit(String value) {
        this.cuit = value;
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
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad entreCalle1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntreCalle1() {
        return entreCalle1;
    }

    /**
     * Define el valor de la propiedad entreCalle1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntreCalle1(String value) {
        this.entreCalle1 = value;
    }

    /**
     * Obtiene el valor de la propiedad entreCalle2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntreCalle2() {
        return entreCalle2;
    }

    /**
     * Define el valor de la propiedad entreCalle2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntreCalle2(String value) {
        this.entreCalle2 = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAlta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAlta() {
        return fechaAlta;
    }

    /**
     * Define el valor de la propiedad fechaAlta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAlta(String value) {
        this.fechaAlta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaBaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaBaja() {
        return fechaBaja;
    }

    /**
     * Define el valor de la propiedad fechaBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaBaja(String value) {
        this.fechaBaja = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltModificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUltModificacion() {
        return fechaUltModificacion;
    }

    /**
     * Define el valor de la propiedad fechaUltModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUltModificacion(String value) {
        this.fechaUltModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad gln.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGln() {
        return gln;
    }

    /**
     * Define el valor de la propiedad gln.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGln(String value) {
        this.gln = value;
    }

    /**
     * Obtiene el valor de la propiedad glnPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlnPrincipal() {
        return glnPrincipal;
    }

    /**
     * Define el valor de la propiedad glnPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlnPrincipal(String value) {
        this.glnPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad idLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLocalidad() {
        return idLocalidad;
    }

    /**
     * Define el valor de la propiedad idLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLocalidad(String value) {
        this.idLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProvincia() {
        return idProvincia;
    }

    /**
     * Define el valor de la propiedad idProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProvincia(String value) {
        this.idProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoAgente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTipoAgente() {
        return idTipoAgente;
    }

    /**
     * Define el valor de la propiedad idTipoAgente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTipoAgente(String value) {
        this.idTipoAgente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    /**
     * Define el valor de la propiedad nombreLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreLocalidad(String value) {
        this.nombreLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProvincia() {
        return nombreProvincia;
    }

    /**
     * Define el valor de la propiedad nombreProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProvincia(String value) {
        this.nombreProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTipoAgente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTipoAgente() {
        return nombreTipoAgente;
    }

    /**
     * Define el valor de la propiedad nombreTipoAgente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTipoAgente(String value) {
        this.nombreTipoAgente = value;
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
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocialPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialPrincipal() {
        return razonSocialPrincipal;
    }

    /**
     * Define el valor de la propiedad razonSocialPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialPrincipal(String value) {
        this.razonSocialPrincipal = value;
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

}
