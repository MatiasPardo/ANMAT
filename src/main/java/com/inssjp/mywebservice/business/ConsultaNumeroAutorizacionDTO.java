
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaNumeroAutorizacionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaNumeroAutorizacionDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://business.mywebservice.inssjp.com/}webServiceResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nro_utorizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaNumeroAutorizacionDTO", propOrder = {
    "nroUtorizacion"
})
public class ConsultaNumeroAutorizacionDTO
    extends WebServiceResult
{

    @XmlElement(name = "nro_utorizacion")
    protected String nroUtorizacion;

    /**
     * Obtiene el valor de la propiedad nroUtorizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroUtorizacion() {
        return nroUtorizacion;
    }

    /**
     * Define el valor de la propiedad nroUtorizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroUtorizacion(String value) {
        this.nroUtorizacion = value;
    }

}
