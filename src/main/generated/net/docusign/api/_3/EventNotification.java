//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 12:12:45 PM EST 
//


package net.docusign.api._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LoggingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RequireAcknowledgment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseSoapInterface" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SoapNameSpace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeCertificateWithSoap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SignMessageWithX509Cert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeEnvelopeVoidReason" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeSenderAccountAsCustomField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnvelopeEvents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EnvelopeEvent" type="{http://www.docusign.net/API/3.0}EnvelopeEvent" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RecipientEvents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RecipientEvent" type="{http://www.docusign.net/API/3.0}RecipientEvent" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventNotification", propOrder = {

})
public class EventNotification {

    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "LoggingEnabled")
    protected Boolean loggingEnabled;
    @XmlElement(name = "RequireAcknowledgment")
    protected Boolean requireAcknowledgment;
    @XmlElement(name = "UseSoapInterface")
    protected Boolean useSoapInterface;
    @XmlElement(name = "SoapNameSpace")
    protected String soapNameSpace;
    @XmlElement(name = "IncludeCertificateWithSoap")
    protected Boolean includeCertificateWithSoap;
    @XmlElement(name = "SignMessageWithX509Cert")
    protected Boolean signMessageWithX509Cert;
    @XmlElement(name = "IncludeDocuments")
    protected Boolean includeDocuments;
    @XmlElement(name = "IncludeTimeZone")
    protected Boolean includeTimeZone;
    @XmlElement(name = "IncludeEnvelopeVoidReason")
    protected Boolean includeEnvelopeVoidReason;
    @XmlElement(name = "IncludeSenderAccountAsCustomField")
    protected Boolean includeSenderAccountAsCustomField;
    @XmlElement(name = "EnvelopeEvents")
    protected EventNotification.EnvelopeEvents envelopeEvents;
    @XmlElement(name = "RecipientEvents")
    protected EventNotification.RecipientEvents recipientEvents;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the loggingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoggingEnabled() {
        return loggingEnabled;
    }

    /**
     * Sets the value of the loggingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoggingEnabled(Boolean value) {
        this.loggingEnabled = value;
    }

    /**
     * Gets the value of the requireAcknowledgment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireAcknowledgment() {
        return requireAcknowledgment;
    }

    /**
     * Sets the value of the requireAcknowledgment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireAcknowledgment(Boolean value) {
        this.requireAcknowledgment = value;
    }

    /**
     * Gets the value of the useSoapInterface property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSoapInterface() {
        return useSoapInterface;
    }

    /**
     * Sets the value of the useSoapInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSoapInterface(Boolean value) {
        this.useSoapInterface = value;
    }

    /**
     * Gets the value of the soapNameSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoapNameSpace() {
        return soapNameSpace;
    }

    /**
     * Sets the value of the soapNameSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoapNameSpace(String value) {
        this.soapNameSpace = value;
    }

    /**
     * Gets the value of the includeCertificateWithSoap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCertificateWithSoap() {
        return includeCertificateWithSoap;
    }

    /**
     * Sets the value of the includeCertificateWithSoap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCertificateWithSoap(Boolean value) {
        this.includeCertificateWithSoap = value;
    }

    /**
     * Gets the value of the signMessageWithX509Cert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignMessageWithX509Cert() {
        return signMessageWithX509Cert;
    }

    /**
     * Sets the value of the signMessageWithX509Cert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignMessageWithX509Cert(Boolean value) {
        this.signMessageWithX509Cert = value;
    }

    /**
     * Gets the value of the includeDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDocuments() {
        return includeDocuments;
    }

    /**
     * Sets the value of the includeDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDocuments(Boolean value) {
        this.includeDocuments = value;
    }

    /**
     * Gets the value of the includeTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTimeZone() {
        return includeTimeZone;
    }

    /**
     * Sets the value of the includeTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTimeZone(Boolean value) {
        this.includeTimeZone = value;
    }

    /**
     * Gets the value of the includeEnvelopeVoidReason property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeEnvelopeVoidReason() {
        return includeEnvelopeVoidReason;
    }

    /**
     * Sets the value of the includeEnvelopeVoidReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeEnvelopeVoidReason(Boolean value) {
        this.includeEnvelopeVoidReason = value;
    }

    /**
     * Gets the value of the includeSenderAccountAsCustomField property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSenderAccountAsCustomField() {
        return includeSenderAccountAsCustomField;
    }

    /**
     * Sets the value of the includeSenderAccountAsCustomField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSenderAccountAsCustomField(Boolean value) {
        this.includeSenderAccountAsCustomField = value;
    }

    /**
     * Gets the value of the envelopeEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EventNotification.EnvelopeEvents }
     *     
     */
    public EventNotification.EnvelopeEvents getEnvelopeEvents() {
        return envelopeEvents;
    }

    /**
     * Sets the value of the envelopeEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventNotification.EnvelopeEvents }
     *     
     */
    public void setEnvelopeEvents(EventNotification.EnvelopeEvents value) {
        this.envelopeEvents = value;
    }

    /**
     * Gets the value of the recipientEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EventNotification.RecipientEvents }
     *     
     */
    public EventNotification.RecipientEvents getRecipientEvents() {
        return recipientEvents;
    }

    /**
     * Sets the value of the recipientEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventNotification.RecipientEvents }
     *     
     */
    public void setRecipientEvents(EventNotification.RecipientEvents value) {
        this.recipientEvents = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EnvelopeEvent" type="{http://www.docusign.net/API/3.0}EnvelopeEvent" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "envelopeEvent"
    })
    public static class EnvelopeEvents {

        @XmlElement(name = "EnvelopeEvent", required = true)
        protected List<EnvelopeEvent> envelopeEvent;

        /**
         * Gets the value of the envelopeEvent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the envelopeEvent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnvelopeEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EnvelopeEvent }
         * 
         * 
         */
        public List<EnvelopeEvent> getEnvelopeEvent() {
            if (envelopeEvent == null) {
                envelopeEvent = new ArrayList<EnvelopeEvent>();
            }
            return this.envelopeEvent;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RecipientEvent" type="{http://www.docusign.net/API/3.0}RecipientEvent" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recipientEvent"
    })
    public static class RecipientEvents {

        @XmlElement(name = "RecipientEvent", required = true)
        protected List<RecipientEvent> recipientEvent;

        /**
         * Gets the value of the recipientEvent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recipientEvent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecipientEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RecipientEvent }
         * 
         * 
         */
        public List<RecipientEvent> getRecipientEvent() {
            if (recipientEvent == null) {
                recipientEvent = new ArrayList<RecipientEvent>();
            }
            return this.recipientEvent;
        }

    }

}
