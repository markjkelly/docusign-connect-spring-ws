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
 *       &lt;sequence>
 *         &lt;element name="EnvelopeId" type="{http://www.docusign.net/API/3.0}DSXId"/>
 *         &lt;element name="TransactionId" type="{http://www.docusign.net/API/3.0}DSXId"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://www.docusign.net/API/3.0}DocumentPDF" maxOccurs="unbounded" minOccurs="0"/>
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
    "envelopeId",
    "transactionId",
    "count",
    "documentPDF"
})
@XmlRootElement(name = "AuthoritativeCopyExportDocuments")
public class AuthoritativeCopyExportDocuments {

    @XmlElement(name = "EnvelopeId", required = true)
    protected String envelopeId;
    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "DocumentPDF")
    protected List<DocumentPDF> documentPDF;

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
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the documentPDF property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentPDF property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentPDF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentPDF }
     * 
     * 
     */
    public List<DocumentPDF> getDocumentPDF() {
        if (documentPDF == null) {
            documentPDF = new ArrayList<DocumentPDF>();
        }
        return this.documentPDF;
    }

}
