//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.29 at 01:40:43 PM IST 
//


package in.gov.uidai.kyc.uid_kyc_response._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="co" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="house" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="street" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vtc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subdist" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dist" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="po" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoaType")
public class PoaType {

    @XmlAttribute(name = "co")
    protected String co;
    @XmlAttribute(name = "house")
    protected String house;
    @XmlAttribute(name = "street")
    protected String street;
    @XmlAttribute(name = "lm")
    protected String lm;
    @XmlAttribute(name = "loc")
    protected String loc;
    @XmlAttribute(name = "vtc")
    protected String vtc;
    @XmlAttribute(name = "subdist")
    protected String subdist;
    @XmlAttribute(name = "dist")
    protected String dist;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "pc")
    protected String pc;
    @XmlAttribute(name = "po")
    protected String po;

    /**
     * Gets the value of the co property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCo() {
        return co;
    }

    /**
     * Sets the value of the co property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCo(String value) {
        this.co = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the lm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLm() {
        return lm;
    }

    /**
     * Sets the value of the lm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLm(String value) {
        this.lm = value;
    }

    /**
     * Gets the value of the loc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoc() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoc(String value) {
        this.loc = value;
    }

    /**
     * Gets the value of the vtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtc() {
        return vtc;
    }

    /**
     * Sets the value of the vtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtc(String value) {
        this.vtc = value;
    }

    /**
     * Gets the value of the subdist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdist() {
        return subdist;
    }

    /**
     * Sets the value of the subdist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdist(String value) {
        this.subdist = value;
    }

    /**
     * Gets the value of the dist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDist() {
        return dist;
    }

    /**
     * Sets the value of the dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDist(String value) {
        this.dist = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the pc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPc() {
        return pc;
    }

    /**
     * Sets the value of the pc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPc(String value) {
        this.pc = value;
    }

    /**
     * Gets the value of the po property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPo() {
        return po;
    }

    /**
     * Sets the value of the po property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPo(String value) {
        this.po = value;
    }

}
