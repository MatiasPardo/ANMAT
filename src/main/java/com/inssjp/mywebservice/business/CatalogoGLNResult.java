
package com.inssjp.mywebservice.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para catalogoGLNResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="catalogoGLNResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://business.mywebservice.inssjp.com/}resultadoPersonalizado"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantPaginas" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="errores" type="{http://business.mywebservice.inssjp.com/}webServiceError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hay_error" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="list" type="{http://business.mywebservice.inssjp.com/}agentePlain" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogoGLNResult", propOrder = {
    "cantPaginas",
    "errores",
    "hayError",
    "list"
})
public class CatalogoGLNResult
    extends ResultadoPersonalizado
{

    protected Long cantPaginas;
    @XmlElement(nillable = true)
    protected List<WebServiceError> errores;
    @XmlElement(name = "hay_error")
    protected Boolean hayError;
    @XmlElement(nillable = true)
    protected List<AgentePlain> list;

    /**
     * Obtiene el valor de la propiedad cantPaginas.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCantPaginas() {
        return cantPaginas;
    }

    /**
     * Define el valor de la propiedad cantPaginas.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCantPaginas(Long value) {
        this.cantPaginas = value;
    }

    /**
     * Gets the value of the errores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebServiceError }
     * 
     * 
     */
    public List<WebServiceError> getErrores() {
        if (errores == null) {
            errores = new ArrayList<WebServiceError>();
        }
        return this.errores;
    }

    /**
     * Obtiene el valor de la propiedad hayError.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHayError() {
        return hayError;
    }

    /**
     * Define el valor de la propiedad hayError.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHayError(Boolean value) {
        this.hayError = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentePlain }
     * 
     * 
     */
    public List<AgentePlain> getList() {
        if (list == null) {
            list = new ArrayList<AgentePlain>();
        }
        return this.list;
    }

}
