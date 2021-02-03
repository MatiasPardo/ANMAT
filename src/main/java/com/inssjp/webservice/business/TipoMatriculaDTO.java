
package com.inssjp.webservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoMatriculaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoMatriculaDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descTipoMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idTipoMatricula" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoMatriculaDTO", propOrder = {
    "descTipoMatricula",
    "idTipoMatricula"
})
public class TipoMatriculaDTO {

    protected String descTipoMatricula;
    protected Long idTipoMatricula;

    /**
     * Obtiene el valor de la propiedad descTipoMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoMatricula() {
        return descTipoMatricula;
    }

    /**
     * Define el valor de la propiedad descTipoMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoMatricula(String value) {
        this.descTipoMatricula = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoMatricula.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTipoMatricula() {
        return idTipoMatricula;
    }

    /**
     * Define el valor de la propiedad idTipoMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTipoMatricula(Long value) {
        this.idTipoMatricula = value;
    }

}
