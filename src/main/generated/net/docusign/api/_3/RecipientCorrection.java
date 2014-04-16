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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="PreviousUserName" type="{http://www.docusign.net/API/3.0}UserName"/>
 *         &lt;element name="PreviousEmail" type="{http://www.docusign.net/API/3.0}Email"/>
 *         &lt;element name="PreviousRoutingOrder" type="{http://www.docusign.net/API/3.0}PositiveShort"/>
 *         &lt;element name="PreviousSignerName" type="{http://www.docusign.net/API/3.0}UserName" minOccurs="0"/>
 *         &lt;element name="CorrectedUserName" type="{http://www.docusign.net/API/3.0}UserName" minOccurs="0"/>
 *         &lt;element name="CorrectedSignerName" type="{http://www.docusign.net/API/3.0}UserName" minOccurs="0"/>
 *         &lt;element name="CorrectedEmail" type="{http://www.docusign.net/API/3.0}Email" minOccurs="0"/>
 *         &lt;element name="CorrectedCaptiveInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ClientUserId" type="{http://www.docusign.net/API/3.0}LongString"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CorrectedAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrectedAccessCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CorrectedRequireIDLookup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CorrectedIDCheckConfigurationName" type="{http://www.docusign.net/API/3.0}LongString" minOccurs="0"/>
 *         &lt;element name="CorrectedRoutingOrder" type="{http://www.docusign.net/API/3.0}PositiveShort" minOccurs="0"/>
 *         &lt;element name="CorrectedAutoNavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CorrectedIDCheckInformationInput" type="{http://www.docusign.net/API/3.0}IDCheckInformationInput" minOccurs="0"/>
 *         &lt;element name="Resend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CorrectedDeliveryMethod" type="{http://www.docusign.net/API/3.0}DeliveryMethod" minOccurs="0"/>
 *         &lt;element name="CorrectedFaxNumber" type="{http://www.docusign.net/API/3.0}PhoneNumber" minOccurs="0"/>
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
@XmlRootElement(name = "RecipientCorrection")
public class RecipientCorrection {

    @XmlElement(name = "PreviousUserName", required = true)
    protected String previousUserName;
    @XmlElement(name = "PreviousEmail", required = true)
    protected String previousEmail;
    @XmlElement(name = "PreviousRoutingOrder")
    protected int previousRoutingOrder;
    @XmlElement(name = "PreviousSignerName")
    protected String previousSignerName;
    @XmlElement(name = "CorrectedUserName")
    protected String correctedUserName;
    @XmlElement(name = "CorrectedSignerName")
    protected String correctedSignerName;
    @XmlElement(name = "CorrectedEmail")
    protected String correctedEmail;
    @XmlElement(name = "CorrectedCaptiveInfo")
    protected RecipientCorrection.CorrectedCaptiveInfo correctedCaptiveInfo;
    @XmlElement(name = "CorrectedAccessCode")
    protected String correctedAccessCode;
    @XmlElement(name = "CorrectedAccessCodeRequired")
    protected Boolean correctedAccessCodeRequired;
    @XmlElement(name = "CorrectedRequireIDLookup")
    protected Boolean correctedRequireIDLookup;
    @XmlElement(name = "CorrectedIDCheckConfigurationName")
    protected String correctedIDCheckConfigurationName;
    @XmlElement(name = "CorrectedRoutingOrder")
    protected Integer correctedRoutingOrder;
    @XmlElement(name = "CorrectedAutoNavigation")
    protected Boolean correctedAutoNavigation;
    @XmlElement(name = "CorrectedIDCheckInformationInput")
    protected IDCheckInformationInput correctedIDCheckInformationInput;
    @XmlElement(name = "Resend")
    protected Boolean resend;
    @XmlElement(name = "CorrectedDeliveryMethod")
    protected DeliveryMethod correctedDeliveryMethod;
    @XmlElement(name = "CorrectedFaxNumber")
    protected String correctedFaxNumber;

    /**
     * Gets the value of the previousUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousUserName() {
        return previousUserName;
    }

    /**
     * Sets the value of the previousUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousUserName(String value) {
        this.previousUserName = value;
    }

    /**
     * Gets the value of the previousEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousEmail() {
        return previousEmail;
    }

    /**
     * Sets the value of the previousEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousEmail(String value) {
        this.previousEmail = value;
    }

    /**
     * Gets the value of the previousRoutingOrder property.
     * 
     */
    public int getPreviousRoutingOrder() {
        return previousRoutingOrder;
    }

    /**
     * Sets the value of the previousRoutingOrder property.
     * 
     */
    public void setPreviousRoutingOrder(int value) {
        this.previousRoutingOrder = value;
    }

    /**
     * Gets the value of the previousSignerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSignerName() {
        return previousSignerName;
    }

    /**
     * Sets the value of the previousSignerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSignerName(String value) {
        this.previousSignerName = value;
    }

    /**
     * Gets the value of the correctedUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectedUserName() {
        return correctedUserName;
    }

    /**
     * Sets the value of the correctedUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectedUserName(String value) {
        this.correctedUserName = value;
    }

    /**
     * Gets the value of the correctedSignerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectedSignerName() {
        return correctedSignerName;
    }

    /**
     * Sets the value of the correctedSignerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectedSignerName(String value) {
        this.correctedSignerName = value;
    }

    /**
     * Gets the value of the correctedEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectedEmail() {
        return correctedEmail;
    }

    /**
     * Sets the value of the correctedEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectedEmail(String value) {
        this.correctedEmail = value;
    }

    /**
     * Gets the value of the correctedCaptiveInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientCorrection.CorrectedCaptiveInfo }
     *     
     */
    public RecipientCorrection.CorrectedCaptiveInfo getCorrectedCaptiveInfo() {
        return correctedCaptiveInfo;
    }

    /**
     * Sets the value of the correctedCaptiveInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientCorrection.CorrectedCaptiveInfo }
     *     
     */
    public void setCorrectedCaptiveInfo(RecipientCorrection.CorrectedCaptiveInfo value) {
        this.correctedCaptiveInfo = value;
    }

    /**
     * Gets the value of the correctedAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectedAccessCode() {
        return correctedAccessCode;
    }

    /**
     * Sets the value of the correctedAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectedAccessCode(String value) {
        this.correctedAccessCode = value;
    }

    /**
     * Gets the value of the correctedAccessCodeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorrectedAccessCodeRequired() {
        return correctedAccessCodeRequired;
    }

    /**
     * Sets the value of the correctedAccessCodeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorrectedAccessCodeRequired(Boolean value) {
        this.correctedAccessCodeRequired = value;
    }

    /**
     * Gets the value of the correctedRequireIDLookup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorrectedRequireIDLookup() {
        return correctedRequireIDLookup;
    }

    /**
     * Sets the value of the correctedRequireIDLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorrectedRequireIDLookup(Boolean value) {
        this.correctedRequireIDLookup = value;
    }

    /**
     * Gets the value of the correctedIDCheckConfigurationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectedIDCheckConfigurationName() {
        return correctedIDCheckConfigurationName;
    }

    /**
     * Sets the value of the correctedIDCheckConfigurationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectedIDCheckConfigurationName(String value) {
        this.correctedIDCheckConfigurationName = value;
    }

    /**
     * Gets the value of the correctedRoutingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrectedRoutingOrder() {
        return correctedRoutingOrder;
    }

    /**
     * Sets the value of the correctedRoutingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrectedRoutingOrder(Integer value) {
        this.correctedRoutingOrder = value;
    }

    /**
     * Gets the value of the correctedAutoNavigation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorrectedAutoNavigation() {
        return correctedAutoNavigation;
    }

    /**
     * Sets the value of the correctedAutoNavigation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorrectedAutoNavigation(Boolean value) {
        this.correctedAutoNavigation = value;
    }

    /**
     * Gets the value of the correctedIDCheckInformationInput property.
     * 
     * @return
     *     possible object is
     *     {@link IDCheckInformationInput }
     *     
     */
    public IDCheckInformationInput getCorrectedIDCheckInformationInput() {
        return correctedIDCheckInformationInput;
    }

    /**
     * Sets the value of the correctedIDCheckInformationInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDCheckInformationInput }
     *     
     */
    public void setCorrectedIDCheckInformationInput(IDCheckInformationInput value) {
        this.correctedIDCheckInformationInput = value;
    }

    /**
     * Gets the value of the resend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResend() {
        return resend;
    }

    /**
     * Sets the value of the resend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResend(Boolean value) {
        this.resend = value;
    }

    /**
     * Gets the value of the correctedDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethod }
     *     
     */
    public DeliveryMethod getCorrectedDeliveryMethod() {
        return correctedDeliveryMethod;
    }

    /**
     * Sets the value of the correctedDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethod }
     *     
     */
    public void setCorrectedDeliveryMethod(DeliveryMethod value) {
        this.correctedDeliveryMethod = value;
    }

    /**
     * Gets the value of the correctedFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectedFaxNumber() {
        return correctedFaxNumber;
    }

    /**
     * Sets the value of the correctedFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectedFaxNumber(String value) {
        this.correctedFaxNumber = value;
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
     *       &lt;all>
     *         &lt;element name="ClientUserId" type="{http://www.docusign.net/API/3.0}LongString"/>
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
    public static class CorrectedCaptiveInfo {

        @XmlElement(name = "ClientUserId", required = true)
        protected String clientUserId;

        /**
         * Gets the value of the clientUserId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientUserId() {
            return clientUserId;
        }

        /**
         * Sets the value of the clientUserId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientUserId(String value) {
            this.clientUserId = value;
        }

    }

}