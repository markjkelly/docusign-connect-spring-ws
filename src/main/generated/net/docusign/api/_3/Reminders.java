//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 12:12:45 PM EST 
//


package net.docusign.api._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reminders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reminders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ReminderEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReminderDelay" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="ReminderFrequency" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reminders", propOrder = {

})
public class Reminders {

    @XmlElement(name = "ReminderEnabled")
    protected boolean reminderEnabled;
    @XmlElement(name = "ReminderDelay", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger reminderDelay;
    @XmlElement(name = "ReminderFrequency", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger reminderFrequency;

    /**
     * Gets the value of the reminderEnabled property.
     * 
     */
    public boolean isReminderEnabled() {
        return reminderEnabled;
    }

    /**
     * Sets the value of the reminderEnabled property.
     * 
     */
    public void setReminderEnabled(boolean value) {
        this.reminderEnabled = value;
    }

    /**
     * Gets the value of the reminderDelay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReminderDelay() {
        return reminderDelay;
    }

    /**
     * Sets the value of the reminderDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReminderDelay(BigInteger value) {
        this.reminderDelay = value;
    }

    /**
     * Gets the value of the reminderFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReminderFrequency() {
        return reminderFrequency;
    }

    /**
     * Sets the value of the reminderFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReminderFrequency(BigInteger value) {
        this.reminderFrequency = value;
    }

}
