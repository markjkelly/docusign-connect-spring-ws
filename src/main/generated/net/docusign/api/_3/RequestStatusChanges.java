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
 *         &lt;element ref="{http://www.docusign.net/API/3.0}EnvelopeStatusChangeFilter"/>
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
@XmlRootElement(name = "RequestStatusChanges")
public class RequestStatusChanges {

    @XmlElement(name = "EnvelopeStatusChangeFilter", required = true)
    protected EnvelopeStatusChangeFilter envelopeStatusChangeFilter;

    /**
     * Gets the value of the envelopeStatusChangeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeStatusChangeFilter }
     *     
     */
    public EnvelopeStatusChangeFilter getEnvelopeStatusChangeFilter() {
        return envelopeStatusChangeFilter;
    }

    /**
     * Sets the value of the envelopeStatusChangeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeStatusChangeFilter }
     *     
     */
    public void setEnvelopeStatusChangeFilter(EnvelopeStatusChangeFilter value) {
        this.envelopeStatusChangeFilter = value;
    }

}
