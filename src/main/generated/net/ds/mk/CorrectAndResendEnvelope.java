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
import net.docusign.api._3.Correction;


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
 *         &lt;element ref="{http://www.docusign.net/API/3.0}Correction"/>
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
@XmlRootElement(name = "CorrectAndResendEnvelope")
public class CorrectAndResendEnvelope {

    @XmlElement(name = "Correction", namespace = "http://www.docusign.net/API/3.0", required = true)
    protected Correction correction;

    /**
     * Gets the value of the correction property.
     * 
     * @return
     *     possible object is
     *     {@link Correction }
     *     
     */
    public Correction getCorrection() {
        return correction;
    }

    /**
     * Sets the value of the correction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Correction }
     *     
     */
    public void setCorrection(Correction value) {
        this.correction = value;
    }

}
