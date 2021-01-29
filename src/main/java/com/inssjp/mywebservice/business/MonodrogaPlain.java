
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para monodrogaPlain complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="monodrogaPlain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_c_monodroga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_d_monodroga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monodrogaPlain", propOrder = {
    "cMonodroga",
    "dMonodroga"
})
public class MonodrogaPlain {

    @XmlElement(name = "_c_monodroga")
    protected String cMonodroga;
    @XmlElement(name = "_d_monodroga")
    protected String dMonodroga;

    /**
     * Obtiene el valor de la propiedad cMonodroga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMonodroga() {
        return cMonodroga;
    }

    /**
     * Define el valor de la propiedad cMonodroga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMonodroga(String value) {
        this.cMonodroga = value;
    }

    /**
     * Obtiene el valor de la propiedad dMonodroga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMonodroga() {
        return dMonodroga;
    }

    /**
     * Define el valor de la propiedad dMonodroga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMonodroga(String value) {
        this.dMonodroga = value;
    }

}
