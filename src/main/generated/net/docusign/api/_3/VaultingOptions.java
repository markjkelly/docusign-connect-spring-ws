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
 * Allows end user to specify the vaulting options for an envelope
 * 
 * <p>Java class for VaultingOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VaultingOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="VaultingMode" type="{http://www.docusign.net/API/3.0}VaultingModeCode"/>
 *         &lt;element name="EODTransactionName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EODDocumentName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EODDocumentDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "VaultingOptions", propOrder = {

})
public class VaultingOptions {

    @XmlElement(name = "VaultingMode", required = true)
    protected VaultingModeCode vaultingMode;
    @XmlElement(name = "EODTransactionName")
    protected String eodTransactionName;
    @XmlElement(name = "EODDocumentName")
    protected String eodDocumentName;
    @XmlElement(name = "EODDocumentDescription")
    protected String eodDocumentDescription;

    /**
     * Gets the value of the vaultingMode property.
     * 
     * @return
     *     possible object is
     *     {@link VaultingModeCode }
     *     
     */
    public VaultingModeCode getVaultingMode() {
        return vaultingMode;
    }

    /**
     * Sets the value of the vaultingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VaultingModeCode }
     *     
     */
    public void setVaultingMode(VaultingModeCode value) {
        this.vaultingMode = value;
    }

    /**
     * Gets the value of the eodTransactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEODTransactionName() {
        return eodTransactionName;
    }

    /**
     * Sets the value of the eodTransactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEODTransactionName(String value) {
        this.eodTransactionName = value;
    }

    /**
     * Gets the value of the eodDocumentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEODDocumentName() {
        return eodDocumentName;
    }

    /**
     * Sets the value of the eodDocumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEODDocumentName(String value) {
        this.eodDocumentName = value;
    }

    /**
     * Gets the value of the eodDocumentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEODDocumentDescription() {
        return eodDocumentDescription;
    }

    /**
     * Sets the value of the eodDocumentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEODDocumentDescription(String value) {
        this.eodDocumentDescription = value;
    }

}
