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
 *         &lt;element name="EnvelopeId" type="{http://www.docusign.net/API/3.0}DSXId"/>
 *         &lt;element name="TransactionId" type="{http://www.docusign.net/API/3.0}DSXId"/>
 *         &lt;element name="checkSumHash" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
@XmlRootElement(name = "AcknowledgeAuthoritativeCopyExport")
public class AcknowledgeAuthoritativeCopyExport {

    @XmlElement(name = "EnvelopeId", required = true)
    protected String envelopeId;
    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(required = true)
    protected byte[] checkSumHash;

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
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the checkSumHash property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCheckSumHash() {
        return checkSumHash;
    }

    /**
     * Sets the value of the checkSumHash property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCheckSumHash(byte[] value) {
        this.checkSumHash = ((byte[]) value);
    }

}
