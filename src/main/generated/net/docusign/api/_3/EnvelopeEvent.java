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
 * 
 *       
 * 
 * <p>Java class for EnvelopeEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvelopeEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="EnvelopeEventStatusCode" type="{http://www.docusign.net/API/3.0}EnvelopeEventStatusCode"/>
 *         &lt;element name="IncludeDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeEvent", propOrder = {

})
public class EnvelopeEvent {

    @XmlElement(name = "EnvelopeEventStatusCode", required = true)
    protected EnvelopeEventStatusCode envelopeEventStatusCode;
    @XmlElement(name = "IncludeDocuments")
    protected boolean includeDocuments;

    /**
     * Gets the value of the envelopeEventStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeEventStatusCode }
     *     
     */
    public EnvelopeEventStatusCode getEnvelopeEventStatusCode() {
        return envelopeEventStatusCode;
    }

    /**
     * Sets the value of the envelopeEventStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeEventStatusCode }
     *     
     */
    public void setEnvelopeEventStatusCode(EnvelopeEventStatusCode value) {
        this.envelopeEventStatusCode = value;
    }

    /**
     * Gets the value of the includeDocuments property.
     * 
     */
    public boolean isIncludeDocuments() {
        return includeDocuments;
    }

    /**
     * Sets the value of the includeDocuments property.
     * 
     */
    public void setIncludeDocuments(boolean value) {
        this.includeDocuments = value;
    }

}