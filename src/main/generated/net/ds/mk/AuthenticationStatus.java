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
import javax.xml.bind.annotation.XmlType;
import net.docusign.api._3.EventResult;


/**
 * The AuthenticationStatus includes information
 * 				regarding the IdCheck and Access Code result.
 * 			
 * 
 * <p>Java class for AuthenticationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AccessCodeResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="IDQuestionsResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="IDLookupResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="AgeVerifyResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="STANPinResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="OFACResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="PhoneAuthResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="LiveIDResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="FacebookResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="TwitterResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="LinkedinResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="SalesforceResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="GoogleResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="YahooResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="OpenIDResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *         &lt;element name="AnySocialIDResult" type="{http://www.docusign.net/API/3.0}EventResult" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationStatus", propOrder = {

})
public class AuthenticationStatus {

    @XmlElement(name = "AccessCodeResult")
    protected EventResult accessCodeResult;
    @XmlElement(name = "IDQuestionsResult")
    protected EventResult idQuestionsResult;
    @XmlElement(name = "IDLookupResult")
    protected EventResult idLookupResult;
    @XmlElement(name = "AgeVerifyResult")
    protected EventResult ageVerifyResult;
    @XmlElement(name = "STANPinResult")
    protected EventResult stanPinResult;
    @XmlElement(name = "OFACResult")
    protected EventResult ofacResult;
    @XmlElement(name = "PhoneAuthResult")
    protected EventResult phoneAuthResult;
    @XmlElement(name = "LiveIDResult")
    protected EventResult liveIDResult;
    @XmlElement(name = "FacebookResult")
    protected EventResult facebookResult;
    @XmlElement(name = "TwitterResult")
    protected EventResult twitterResult;
    @XmlElement(name = "LinkedinResult")
    protected EventResult linkedinResult;
    @XmlElement(name = "SalesforceResult")
    protected EventResult salesforceResult;
    @XmlElement(name = "GoogleResult")
    protected EventResult googleResult;
    @XmlElement(name = "YahooResult")
    protected EventResult yahooResult;
    @XmlElement(name = "OpenIDResult")
    protected EventResult openIDResult;
    @XmlElement(name = "AnySocialIDResult")
    protected EventResult anySocialIDResult;

    /**
     * Gets the value of the accessCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getAccessCodeResult() {
        return accessCodeResult;
    }

    /**
     * Sets the value of the accessCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setAccessCodeResult(EventResult value) {
        this.accessCodeResult = value;
    }

    /**
     * Gets the value of the idQuestionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getIDQuestionsResult() {
        return idQuestionsResult;
    }

    /**
     * Sets the value of the idQuestionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setIDQuestionsResult(EventResult value) {
        this.idQuestionsResult = value;
    }

    /**
     * Gets the value of the idLookupResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getIDLookupResult() {
        return idLookupResult;
    }

    /**
     * Sets the value of the idLookupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setIDLookupResult(EventResult value) {
        this.idLookupResult = value;
    }

    /**
     * Gets the value of the ageVerifyResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getAgeVerifyResult() {
        return ageVerifyResult;
    }

    /**
     * Sets the value of the ageVerifyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setAgeVerifyResult(EventResult value) {
        this.ageVerifyResult = value;
    }

    /**
     * Gets the value of the stanPinResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getSTANPinResult() {
        return stanPinResult;
    }

    /**
     * Sets the value of the stanPinResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setSTANPinResult(EventResult value) {
        this.stanPinResult = value;
    }

    /**
     * Gets the value of the ofacResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getOFACResult() {
        return ofacResult;
    }

    /**
     * Sets the value of the ofacResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setOFACResult(EventResult value) {
        this.ofacResult = value;
    }

    /**
     * Gets the value of the phoneAuthResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getPhoneAuthResult() {
        return phoneAuthResult;
    }

    /**
     * Sets the value of the phoneAuthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setPhoneAuthResult(EventResult value) {
        this.phoneAuthResult = value;
    }

    /**
     * Gets the value of the liveIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getLiveIDResult() {
        return liveIDResult;
    }

    /**
     * Sets the value of the liveIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setLiveIDResult(EventResult value) {
        this.liveIDResult = value;
    }

    /**
     * Gets the value of the facebookResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getFacebookResult() {
        return facebookResult;
    }

    /**
     * Sets the value of the facebookResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setFacebookResult(EventResult value) {
        this.facebookResult = value;
    }

    /**
     * Gets the value of the twitterResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getTwitterResult() {
        return twitterResult;
    }

    /**
     * Sets the value of the twitterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setTwitterResult(EventResult value) {
        this.twitterResult = value;
    }

    /**
     * Gets the value of the linkedinResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getLinkedinResult() {
        return linkedinResult;
    }

    /**
     * Sets the value of the linkedinResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setLinkedinResult(EventResult value) {
        this.linkedinResult = value;
    }

    /**
     * Gets the value of the salesforceResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getSalesforceResult() {
        return salesforceResult;
    }

    /**
     * Sets the value of the salesforceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setSalesforceResult(EventResult value) {
        this.salesforceResult = value;
    }

    /**
     * Gets the value of the googleResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getGoogleResult() {
        return googleResult;
    }

    /**
     * Sets the value of the googleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setGoogleResult(EventResult value) {
        this.googleResult = value;
    }

    /**
     * Gets the value of the yahooResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getYahooResult() {
        return yahooResult;
    }

    /**
     * Sets the value of the yahooResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setYahooResult(EventResult value) {
        this.yahooResult = value;
    }

    /**
     * Gets the value of the openIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getOpenIDResult() {
        return openIDResult;
    }

    /**
     * Sets the value of the openIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setOpenIDResult(EventResult value) {
        this.openIDResult = value;
    }

    /**
     * Gets the value of the anySocialIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getAnySocialIDResult() {
        return anySocialIDResult;
    }

    /**
     * Sets the value of the anySocialIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setAnySocialIDResult(EventResult value) {
        this.anySocialIDResult = value;
    }

}
