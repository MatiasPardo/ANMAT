
package com.inssjp.webservice.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para medicoDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="medicoDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellidoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idMedico" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="listaMatriculas" type="{http://business.webservice.inssjp.com/}matriculaMedicoDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicoDTO", propOrder = {
    "apellidoNombre",
    "cuit",
    "idMedico",
    "listaMatriculas"
})
public class MedicoDTO {

    protected String apellidoNombre;
    protected String cuit;
    protected Long idMedico;
    @XmlElement(nillable = true)
    protected List<MatriculaMedicoDTO> listaMatriculas;

    /**
     * Obtiene el valor de la propiedad apellidoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoNombre() {
        return apellidoNombre;
    }

    /**
     * Define el valor de la propiedad apellidoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoNombre(String value) {
        this.apellidoNombre = value;
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
     * Obtiene el valor de la propiedad idMedico.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMedico() {
        return idMedico;
    }

    /**
     * Define el valor de la propiedad idMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMedico(Long value) {
        this.idMedico = value;
    }

    /**
     * Gets the value of the listaMatriculas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaMatriculas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaMatriculas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatriculaMedicoDTO }
     * 
     * 
     */
    public List<MatriculaMedicoDTO> getListaMatriculas() {
        if (listaMatriculas == null) {
            listaMatriculas = new ArrayList<MatriculaMedicoDTO>();
        }
        return this.listaMatriculas;
    }

}
