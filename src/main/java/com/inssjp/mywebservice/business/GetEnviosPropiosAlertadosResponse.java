
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getEnviosPropiosAlertadosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getEnviosPropiosAlertadosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://business.mywebservice.inssjp.com/}transaccionesNoConfirmadasWSResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEnviosPropiosAlertadosResponse", propOrder = {
    "_return"
})
public class GetEnviosPropiosAlertadosResponse {

    @XmlElement(name = "return")
    protected TransaccionesNoConfirmadasWSResult _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link TransaccionesNoConfirmadasWSResult }
     *     
     */
    public TransaccionesNoConfirmadasWSResult getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link TransaccionesNoConfirmadasWSResult }
     *     
     */
    public void setReturn(TransaccionesNoConfirmadasWSResult value) {
        this._return = value;
    }

}
