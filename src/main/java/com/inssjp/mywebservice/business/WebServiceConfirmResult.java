
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para webServiceConfirmResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="webServiceConfirmResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://business.mywebservice.inssjp.com/}webServiceResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_transac_asociada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webServiceConfirmResult", propOrder = {
    "idTransacAsociada"
})
public class WebServiceConfirmResult
    extends WebServiceResult
{

    @XmlElement(name = "id_transac_asociada")
    protected String idTransacAsociada;

    /**
     * Obtiene el valor de la propiedad idTransacAsociada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransacAsociada() {
        return idTransacAsociada;
    }

    /**
     * Define el valor de la propiedad idTransacAsociada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransacAsociada(String value) {
        this.idTransacAsociada = value;
    }

}
