
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para confirmacionTransaccionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="confirmacionTransaccionDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="f_operacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="p_ids_transac" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmacionTransaccionDTO", propOrder = {
    "fOperacion",
    "pIdsTransac"
})
public class ConfirmacionTransaccionDTO {

    @XmlElement(name = "f_operacion")
    protected String fOperacion;
    @XmlElement(name = "p_ids_transac")
    protected Long pIdsTransac;

    /**
     * Obtiene el valor de la propiedad fOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOperacion() {
        return fOperacion;
    }

    /**
     * Define el valor de la propiedad fOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOperacion(String value) {
        this.fOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad pIdsTransac.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPIdsTransac() {
        return pIdsTransac;
    }

    /**
     * Define el valor de la propiedad pIdsTransac.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPIdsTransac(Long value) {
        this.pIdsTransac = value;
    }

}
