//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 12:12:45 PM EST 
//


package net.ds.mk;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="AccountId" type="{http://www.docusign.net/API/3.0}DSXId"/>
 *         &lt;element name="RecipientEsign">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RecipientEsign" type="{http://www.docusign.net/API/3.0}RecipientEsign" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "RecipientEsignList")
public class RecipientEsignList {

    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "RecipientEsign", required = true)
    protected RecipientEsignList.RecipientEsign recipientEsign;

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
     * Gets the value of the recipientEsign property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientEsignList.RecipientEsign }
     *     
     */
    public RecipientEsignList.RecipientEsign getRecipientEsign() {
        return recipientEsign;
    }

    /**
     * Sets the value of the recipientEsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientEsignList.RecipientEsign }
     *     
     */
    public void setRecipientEsign(RecipientEsignList.RecipientEsign value) {
        this.recipientEsign = value;
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
     *         &lt;element name="RecipientEsign" type="{http://www.docusign.net/API/3.0}RecipientEsign" maxOccurs="unbounded" minOccurs="0"/>
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
        "recipientEsign"
    })
    public static class RecipientEsign {

        @XmlElement(name = "RecipientEsign")
        protected List<net.docusign.api._3.RecipientEsign> recipientEsign;

        /**
         * Gets the value of the recipientEsign property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recipientEsign property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecipientEsign().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link net.docusign.api._3.RecipientEsign }
         * 
         * 
         */
        public List<net.docusign.api._3.RecipientEsign> getRecipientEsign() {
            if (recipientEsign == null) {
                recipientEsign = new ArrayList<net.docusign.api._3.RecipientEsign>();
            }
            return this.recipientEsign;
        }

    }

}
