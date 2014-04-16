//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 12:12:45 PM EST 
//


package net.docusign.api._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reminders and Expiration settings for an Envelope
 * 
 * <p>Java class for Notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="UseAccountDefaults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Reminders" type="{http://www.docusign.net/API/3.0}Reminders" minOccurs="0"/>
 *         &lt;element name="Expirations" type="{http://www.docusign.net/API/3.0}Expirations" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification", propOrder = {

})
public class Notification {

    @XmlElement(name = "UseAccountDefaults")
    protected Boolean useAccountDefaults;
    @XmlElement(name = "Reminders")
    protected Reminders reminders;
    @XmlElement(name = "Expirations")
    protected Expirations expirations;

    /**
     * Gets the value of the useAccountDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAccountDefaults() {
        return useAccountDefaults;
    }

    /**
     * Sets the value of the useAccountDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAccountDefaults(Boolean value) {
        this.useAccountDefaults = value;
    }

    /**
     * Gets the value of the reminders property.
     * 
     * @return
     *     possible object is
     *     {@link Reminders }
     *     
     */
    public Reminders getReminders() {
        return reminders;
    }

    /**
     * Sets the value of the reminders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reminders }
     *     
     */
    public void setReminders(Reminders value) {
        this.reminders = value;
    }

    /**
     * Gets the value of the expirations property.
     * 
     * @return
     *     possible object is
     *     {@link Expirations }
     *     
     */
    public Expirations getExpirations() {
        return expirations;
    }

    /**
     * Sets the value of the expirations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expirations }
     *     
     */
    public void setExpirations(Expirations value) {
        this.expirations = value;
    }

}
