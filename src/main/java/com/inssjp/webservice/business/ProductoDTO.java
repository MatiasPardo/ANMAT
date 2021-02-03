
package com.inssjp.webservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productoDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productoDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificadoAnmat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dioptria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ultimoLoteGtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vigenciaDdeAnmat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vigenciaDdeGtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vigenciaHtaAnmat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vigenciaHtaGtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dCondicionTrazabilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dNombreGenerico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dSoporteTrazabilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productoDTO", propOrder = {
    "certificadoAnmat",
    "dioptria",
    "gtin",
    "idProducto",
    "marca",
    "modelo",
    "observacion",
    "ultimoLoteGtin",
    "unidades",
    "vigenciaDdeAnmat",
    "vigenciaDdeGtin",
    "vigenciaHtaAnmat",
    "vigenciaHtaGtin",
    "dCondicionTrazabilidad",
    "dNombreGenerico",
    "dSoporteTrazabilidad"
})
public class ProductoDTO {

    protected String certificadoAnmat;
    protected String dioptria;
    protected String gtin;
    protected String idProducto;
    protected String marca;
    protected String modelo;
    protected String observacion;
    protected String ultimoLoteGtin;
    protected String unidades;
    protected String vigenciaDdeAnmat;
    protected String vigenciaDdeGtin;
    protected String vigenciaHtaAnmat;
    protected String vigenciaHtaGtin;
    protected String dCondicionTrazabilidad;
    protected String dNombreGenerico;
    protected String dSoporteTrazabilidad;

    /**
     * Obtiene el valor de la propiedad certificadoAnmat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificadoAnmat() {
        return certificadoAnmat;
    }

    /**
     * Define el valor de la propiedad certificadoAnmat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificadoAnmat(String value) {
        this.certificadoAnmat = value;
    }

    /**
     * Obtiene el valor de la propiedad dioptria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDioptria() {
        return dioptria;
    }

    /**
     * Define el valor de la propiedad dioptria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDioptria(String value) {
        this.dioptria = value;
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
     * Obtiene el valor de la propiedad idProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProducto(String value) {
        this.idProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimoLoteGtin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimoLoteGtin() {
        return ultimoLoteGtin;
    }

    /**
     * Define el valor de la propiedad ultimoLoteGtin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimoLoteGtin(String value) {
        this.ultimoLoteGtin = value;
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

    /**
     * Obtiene el valor de la propiedad vigenciaDdeAnmat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaDdeAnmat() {
        return vigenciaDdeAnmat;
    }

    /**
     * Define el valor de la propiedad vigenciaDdeAnmat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaDdeAnmat(String value) {
        this.vigenciaDdeAnmat = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaDdeGtin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaDdeGtin() {
        return vigenciaDdeGtin;
    }

    /**
     * Define el valor de la propiedad vigenciaDdeGtin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaDdeGtin(String value) {
        this.vigenciaDdeGtin = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaHtaAnmat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaHtaAnmat() {
        return vigenciaHtaAnmat;
    }

    /**
     * Define el valor de la propiedad vigenciaHtaAnmat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaHtaAnmat(String value) {
        this.vigenciaHtaAnmat = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaHtaGtin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaHtaGtin() {
        return vigenciaHtaGtin;
    }

    /**
     * Define el valor de la propiedad vigenciaHtaGtin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaHtaGtin(String value) {
        this.vigenciaHtaGtin = value;
    }

    /**
     * Obtiene el valor de la propiedad dCondicionTrazabilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCondicionTrazabilidad() {
        return dCondicionTrazabilidad;
    }

    /**
     * Define el valor de la propiedad dCondicionTrazabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCondicionTrazabilidad(String value) {
        this.dCondicionTrazabilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad dNombreGenerico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNombreGenerico() {
        return dNombreGenerico;
    }

    /**
     * Define el valor de la propiedad dNombreGenerico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNombreGenerico(String value) {
        this.dNombreGenerico = value;
    }

    /**
     * Obtiene el valor de la propiedad dSoporteTrazabilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSoporteTrazabilidad() {
        return dSoporteTrazabilidad;
    }

    /**
     * Define el valor de la propiedad dSoporteTrazabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSoporteTrazabilidad(String value) {
        this.dSoporteTrazabilidad = value;
    }

}
