
package com.inssjp.webservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para webServiceError complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="webServiceError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="c_error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="d_error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webServiceError", propOrder = {
    "cError",
    "dError"
})
public class WebServiceError {

    @XmlElement(name = "c_error")
    protected String cError;
    @XmlElement(name = "d_error")
    protected String dError;

    /**
     * Obtiene el valor de la propiedad cError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCError() {
        return cError;
    }

    /**
     * Define el valor de la propiedad cError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCError(String value) {
        this.cError = value;
    }

    /**
     * Obtiene el valor de la propiedad dError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDError() {
        return dError;
    }

    /**
     * Define el valor de la propiedad dError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDError(String value) {
        this.dError = value;
    }

}
