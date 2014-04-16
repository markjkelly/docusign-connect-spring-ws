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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.docusign.api._3.EnvelopeStatusCode;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="EnvelopeId" type="{http://www.docusign.net/API/3.0}DSXId"/>
 *         &lt;element name="AccountId" type="{http://www.docusign.net/API/3.0}DSXId"/>
 *         &lt;element name="Failed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Retried" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RetryCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EnvelopeStatus" type="{http://www.docusign.net/API/3.0}EnvelopeStatusCode"/>
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfigId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfigUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ConnectFailure")
public class ConnectFailure {

    @XmlElement(name = "EnvelopeId", required = true)
    protected String envelopeId;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "Failed", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar failed;
    @XmlElement(name = "Retried")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retried;
    @XmlElement(name = "RetryCount")
    protected int retryCount;
    @XmlElement(name = "EnvelopeStatus", required = true)
    protected EnvelopeStatusCode envelopeStatus;
    @XmlElement(name = "Sender", required = true)
    protected String sender;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Subject", required = true)
    protected String subject;
    @XmlElement(name = "Error", required = true)
    protected String error;
    @XmlElement(name = "ConfigId", required = true)
    protected String configId;
    @XmlElement(name = "ConfigUrl", required = true)
    protected String configUrl;

    /**
     * Gets the value of the envelopeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvelopeId() {
        return envelopeId;
    }

    /**
     * Sets the value of the envelopeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvelopeId(String value) {
        this.envelopeId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the failed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFailed() {
        return failed;
    }

    /**
     * Sets the value of the failed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFailed(XMLGregorianCalendar value) {
        this.failed = value;
    }

    /**
     * Gets the value of the retried property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetried() {
        return retried;
    }

    /**
     * Sets the value of the retried property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetried(XMLGregorianCalendar value) {
        this.retried = value;
    }

    /**
     * Gets the value of the retryCount property.
     * 
     */
    public int getRetryCount() {
        return retryCount;
    }

    /**
     * Sets the value of the retryCount property.
     * 
     */
    public void setRetryCount(int value) {
        this.retryCount = value;
    }

    /**
     * Gets the value of the envelopeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeStatusCode }
     *     
     */
    public EnvelopeStatusCode getEnvelopeStatus() {
        return envelopeStatus;
    }

    /**
     * Sets the value of the envelopeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeStatusCode }
     *     
     */
    public void setEnvelopeStatus(EnvelopeStatusCode value) {
        this.envelopeStatus = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the configId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * Sets the value of the configId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigId(String value) {
        this.configId = value;
    }

    /**
     * Gets the value of the configUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigUrl() {
        return configUrl;
    }

    /**
     * Sets the value of the configUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigUrl(String value) {
        this.configUrl = value;
    }

}
