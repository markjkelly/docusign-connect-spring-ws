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
 *         &lt;element name="UserName" type="{http://www.docusign.net/API/3.0}UserName"/>
 *         &lt;element name="SenderEmail" type="{http://www.docusign.net/API/3.0}Email"/>
 *         &lt;element name="SenderAccountId" type="{http://www.docusign.net/API/3.0}DSXId"/>
 *         &lt;element name="RecipientEmail" type="{http://www.docusign.net/API/3.0}Email"/>
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
@XmlRootElement(name = "GetRecipientEsignList")
public class GetRecipientEsignList {

    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "SenderEmail", required = true)
    protected String senderEmail;
    @XmlElement(name = "SenderAccountId", required = true)
    protected String senderAccountId;
    @XmlElement(name = "RecipientEmail", required = true)
    protected String recipientEmail;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the senderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEmail() {
        return senderEmail;
    }

    /**
     * Sets the value of the senderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEmail(String value) {
        this.senderEmail = value;
    }

    /**
     * Gets the value of the senderAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAccountId() {
        return senderAccountId;
    }

    /**
     * Sets the value of the senderAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAccountId(String value) {
        this.senderAccountId = value;
    }

    /**
     * Gets the value of the recipientEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientEmail() {
        return recipientEmail;
    }

    /**
     * Sets the value of the recipientEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientEmail(String value) {
        this.recipientEmail = value;
    }

}
