//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.29 at 01:40:43 PM IST 
//


package in.gov.uidai.authentication.otp._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Opts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Opts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ch" type="{http://www.uidai.gov.in/authentication/otp/1.0}Channel" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opts")
public class Opts {

    @XmlAttribute(name = "ch")
    protected String ch;

    /**
     * Gets the value of the ch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCh() {
        return ch;
    }

    /**
     * Sets the value of the ch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCh(String value) {
        this.ch = value;
    }

}
