
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para medicamentoPlain complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="medicamentoPlain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disposicion_trazabilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_alta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_baja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_ult_modificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monodrogas" type="{http://business.mywebservice.inssjp.com/}monodrogaPlainList" minOccurs="0"/&gt;
 *         &lt;element name="presentacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicamentoPlain", propOrder = {
    "descripcion",
    "disposicionTrazabilidad",
    "fechaAlta",
    "fechaBaja",
    "fechaUltModificacion",
    "forma",
    "gln",
    "gtin",
    "monodrogas",
    "presentacion",
    "unidades"
})
public class MedicamentoPlain {

    protected String descripcion;
    @XmlElement(name = "disposicion_trazabilidad")
    protected String disposicionTrazabilidad;
    @XmlElement(name = "fecha_alta")
    protected String fechaAlta;
    @XmlElement(name = "fecha_baja")
    protected String fechaBaja;
    @XmlElement(name = "fecha_ult_modificacion")
    protected String fechaUltModificacion;
    protected String forma;
    protected String gln;
    protected String gtin;
    protected MonodrogaPlainList monodrogas;
    protected String presentacion;
    protected String unidades;

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad disposicionTrazabilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposicionTrazabilidad() {
        return disposicionTrazabilidad;
    }

    /**
     * Define el valor de la propiedad disposicionTrazabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposicionTrazabilidad(String value) {
        this.disposicionTrazabilidad = value;
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
     * Obtiene el valor de la propiedad forma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForma() {
        return forma;
    }

    /**
     * Define el valor de la propiedad forma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForma(String value) {
        this.forma = value;
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
     * Obtiene el valor de la propiedad monodrogas.
     * 
     * @return
     *     possible object is
     *     {@link MonodrogaPlainList }
     *     
     */
    public MonodrogaPlainList getMonodrogas() {
        return monodrogas;
    }

    /**
     * Define el valor de la propiedad monodrogas.
     * 
     * @param value
     *     allowed object is
     *     {@link MonodrogaPlainList }
     *     
     */
    public void setMonodrogas(MonodrogaPlainList value) {
        this.monodrogas = value;
    }

    /**
     * Obtiene el valor de la propiedad presentacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * Define el valor de la propiedad presentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentacion(String value) {
        this.presentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad unidades.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidades() {
        return unidades;
    }

    /**
     * Define el valor de la propiedad unidades.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidades(String value) {
        this.unidades = value;
    }

}
