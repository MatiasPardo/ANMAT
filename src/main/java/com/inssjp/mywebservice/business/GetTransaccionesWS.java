
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getTransaccionesWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getTransaccionesWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg6" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="arg7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arg15" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="arg16" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="arg17" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransaccionesWS", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5",
    "arg6",
    "arg7",
    "arg8",
    "arg9",
    "arg10",
    "arg11",
    "arg12",
    "arg13",
    "arg14",
    "arg15",
    "arg16",
    "arg17"
})
public class GetTransaccionesWS {

    protected String arg0;
    protected String arg1;
    protected Long arg2;
    protected String arg3;
    protected String arg4;
    protected String arg5;
    protected Long arg6;
    protected String arg7;
    protected String arg8;
    protected String arg9;
    protected String arg10;
    protected String arg11;
    protected String arg12;
    protected String arg13;
    protected String arg14;
    protected Long arg15;
    protected Long arg16;
    protected Long arg17;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg0(String value) {
        this.arg0 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * Define el valor de la propiedad arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg2.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArg2() {
        return arg2;
    }

    /**
     * Define el valor de la propiedad arg2.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArg2(Long value) {
        this.arg2 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg3() {
        return arg3;
    }

    /**
     * Define el valor de la propiedad arg3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg3(String value) {
        this.arg3 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg4() {
        return arg4;
    }

    /**
     * Define el valor de la propiedad arg4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg4(String value) {
        this.arg4 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg5() {
        return arg5;
    }

    /**
     * Define el valor de la propiedad arg5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg5(String value) {
        this.arg5 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg6.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArg6() {
        return arg6;
    }

    /**
     * Define el valor de la propiedad arg6.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArg6(Long value) {
        this.arg6 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg7() {
        return arg7;
    }

    /**
     * Define el valor de la propiedad arg7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg7(String value) {
        this.arg7 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg8() {
        return arg8;
    }

    /**
     * Define el valor de la propiedad arg8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg8(String value) {
        this.arg8 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg9() {
        return arg9;
    }

    /**
     * Define el valor de la propiedad arg9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg9(String value) {
        this.arg9 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg10() {
        return arg10;
    }

    /**
     * Define el valor de la propiedad arg10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg10(String value) {
        this.arg10 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg11.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg11() {
        return arg11;
    }

    /**
     * Define el valor de la propiedad arg11.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg11(String value) {
        this.arg11 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg12() {
        return arg12;
    }

    /**
     * Define el valor de la propiedad arg12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg12(String value) {
        this.arg12 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg13() {
        return arg13;
    }

    /**
     * Define el valor de la propiedad arg13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg13(String value) {
        this.arg13 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg14.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg14() {
        return arg14;
    }

    /**
     * Define el valor de la propiedad arg14.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg14(String value) {
        this.arg14 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg15.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArg15() {
        return arg15;
    }

    /**
     * Define el valor de la propiedad arg15.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArg15(Long value) {
        this.arg15 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg16.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArg16() {
        return arg16;
    }

    /**
     * Define el valor de la propiedad arg16.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArg16(Long value) {
        this.arg16 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg17.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArg17() {
        return arg17;
    }

    /**
     * Define el valor de la propiedad arg17.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArg17(Long value) {
        this.arg17 = value;
    }

}
