//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 12:12:45 PM EST 
//


package net.ds.mk;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Expirations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Expirations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ExpireEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExpireAfter" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="ExpireWarn" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Expirations", propOrder = {

})
public class Expirations {

    @XmlElement(name = "ExpireEnabled")
    protected boolean expireEnabled;
    @XmlElement(name = "ExpireAfter", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger expireAfter;
    @XmlElement(name = "ExpireWarn", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger expireWarn;

    /**
     * Gets the value of the expireEnabled property.
     * 
     */
    public boolean isExpireEnabled() {
        return expireEnabled;
    }

    /**
     * Sets the value of the expireEnabled property.
     * 
     */
    public void setExpireEnabled(boolean value) {
        this.expireEnabled = value;
    }

    /**
     * Gets the value of the expireAfter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpireAfter() {
        return expireAfter;
    }

    /**
     * Sets the value of the expireAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpireAfter(BigInteger value) {
        this.expireAfter = value;
    }

    /**
     * Gets the value of the expireWarn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpireWarn() {
        return expireWarn;
    }

    /**
     * Sets the value of the expireWarn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpireWarn(BigInteger value) {
        this.expireWarn = value;
    }

}
