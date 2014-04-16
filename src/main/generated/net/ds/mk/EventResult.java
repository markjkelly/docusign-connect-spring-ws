//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 12:12:45 PM EST 
//


package net.ds.mk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.docusign.api._3.EventStatusCode;


/**
 * 
 * 			
 * 
 * <p>Java class for EventResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Status" type="{http://www.docusign.net/API/3.0}EventStatusCode"/>
 *         &lt;element name="EventTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FailureDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorFailureStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventResult", propOrder = {

})
public class EventResult {

    @XmlElement(name = "Status", required = true)
    protected EventStatusCode status;
    @XmlElement(name = "EventTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTimestamp;
    @XmlElement(name = "FailureDescription")
    protected String failureDescription;
    @XmlElement(name = "VendorFailureStatusCode")
    protected String vendorFailureStatusCode;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatusCode }
     *     
     */
    public EventStatusCode getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatusCode }
     *     
     */
    public void setStatus(EventStatusCode value) {
        this.status = value;
    }

    /**
     * Gets the value of the eventTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTimestamp() {
        return eventTimestamp;
    }

    /**
     * Sets the value of the eventTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTimestamp(XMLGregorianCalendar value) {
        this.eventTimestamp = value;
    }

    /**
     * Gets the value of the failureDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureDescription() {
        return failureDescription;
    }

    /**
     * Sets the value of the failureDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureDescription(String value) {
        this.failureDescription = value;
    }

    /**
     * Gets the value of the vendorFailureStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorFailureStatusCode() {
        return vendorFailureStatusCode;
    }

    /**
     * Sets the value of the vendorFailureStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorFailureStatusCode(String value) {
        this.vendorFailureStatusCode = value;
    }

}
