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
import net.docusign.api._3.CustomFieldType;


/**
 * Allows for end user specified name-value pairs to
 * 				be carried on an envelope
 * 			
 * 
 * <p>Java class for CustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Name" type="{http://www.docusign.net/API/3.0}LongString"/>
 *         &lt;element name="Show" type="{http://www.docusign.net/API/3.0}LongString"/>
 *         &lt;element name="Required" type="{http://www.docusign.net/API/3.0}LongString"/>
 *         &lt;element name="Value" type="{http://www.docusign.net/API/3.0}LongString"/>
 *         &lt;element name="CustomFieldType" type="{http://www.docusign.net/API/3.0}CustomFieldType" minOccurs="0"/>
 *         &lt;element name="ListItems" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2048"/>
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
@XmlType(name = "CustomField", propOrder = {

})
public class CustomField {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Show", required = true)
    protected String show;
    @XmlElement(name = "Required", required = true)
    protected String required;
    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "CustomFieldType")
    protected CustomFieldType customFieldType;
    @XmlElement(name = "ListItems")
    protected String listItems;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequired(String value) {
        this.required = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the customFieldType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldType }
     *     
     */
    public CustomFieldType getCustomFieldType() {
        return customFieldType;
    }

    /**
     * Sets the value of the customFieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldType }
     *     
     */
    public void setCustomFieldType(CustomFieldType value) {
        this.customFieldType = value;
    }

    /**
     * Gets the value of the listItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListItems() {
        return listItems;
    }

    /**
     * Sets the value of the listItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListItems(String value) {
        this.listItems = value;
    }

}