
package com.inssjp.webservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para medicoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="medicoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://business.webservice.inssjp.com/}webServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="medico" type="{http://business.webservice.inssjp.com/}medicoDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicoResponse", propOrder = {
    "medico"
})
public class MedicoResponse
    extends WebServiceResponse
{

    protected MedicoDTO medico;

    /**
     * Obtiene el valor de la propiedad medico.
     * 
     * @return
     *     possible object is
     *     {@link MedicoDTO }
     *     
     */
    public MedicoDTO getMedico() {
        return medico;
    }

    /**
     * Define el valor de la propiedad medico.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicoDTO }
     *     
     */
    public void setMedico(MedicoDTO value) {
        this.medico = value;
    }

}
