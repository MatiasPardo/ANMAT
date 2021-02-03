
package com.inssjp.webservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para matriculaMedicoDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="matriculaMedicoDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idMatriculaMedico" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nroMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoMatricula" type="{http://business.webservice.inssjp.com/}tipoMatriculaDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matriculaMedicoDTO", propOrder = {
    "idMatriculaMedico",
    "nroMatricula",
    "tipoMatricula"
})
public class MatriculaMedicoDTO {

    protected Long idMatriculaMedico;
    protected String nroMatricula;
    protected TipoMatriculaDTO tipoMatricula;

    /**
     * Obtiene el valor de la propiedad idMatriculaMedico.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMatriculaMedico() {
        return idMatriculaMedico;
    }

    /**
     * Define el valor de la propiedad idMatriculaMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMatriculaMedico(Long value) {
        this.idMatriculaMedico = value;
    }

    /**
     * Obtiene el valor de la propiedad nroMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroMatricula() {
        return nroMatricula;
    }

    /**
     * Define el valor de la propiedad nroMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroMatricula(String value) {
        this.nroMatricula = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMatricula.
     * 
     * @return
     *     possible object is
     *     {@link TipoMatriculaDTO }
     *     
     */
    public TipoMatriculaDTO getTipoMatricula() {
        return tipoMatricula;
    }

    /**
     * Define el valor de la propiedad tipoMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMatriculaDTO }
     *     
     */
    public void setTipoMatricula(TipoMatriculaDTO value) {
        this.tipoMatricula = value;
    }

}
