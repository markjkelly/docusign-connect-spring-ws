//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 12:12:45 PM EST 
//


package net.ds.mk;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.docusign.api._3.Attachment;
import net.docusign.api._3.Document;
import net.docusign.api._3.Tab;
import net.docusign.api._3.TemplateLocationCode;


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
 *         &lt;element name="TemplateLocation" type="{http://www.docusign.net/API/3.0}TemplateLocationCode" minOccurs="0"/>
 *         &lt;element name="Template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.docusign.net/API/3.0}Document" minOccurs="0"/>
 *         &lt;element name="RoleAssignments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoleAssignment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RoleName" type="{http://www.docusign.net/API/3.0}LongString"/>
 *                             &lt;element name="RecipientID" type="{http://www.docusign.net/API/3.0}LocalId"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FieldData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="DataValues" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DataValue" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="TabLabel">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="512"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Value">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="2000"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalTabs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.docusign.net/API/3.0}Tab" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="TemplateAttachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.docusign.net/API/3.0}Attachment" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "TemplateReference")
public class TemplateReference {

    @XmlElement(name = "TemplateLocation", defaultValue = "SOAP")
    protected TemplateLocationCode templateLocation;
    @XmlElement(name = "Template")
    protected String template;
    @XmlElement(name = "Document", namespace = "http://www.docusign.net/API/3.0")
    protected Document document;
    @XmlElement(name = "RoleAssignments")
    protected TemplateReference.RoleAssignments roleAssignments;
    @XmlElement(name = "FieldData")
    protected TemplateReference.FieldData fieldData;
    @XmlElement(name = "AdditionalTabs")
    protected TemplateReference.AdditionalTabs additionalTabs;
    @XmlElement(name = "Sequence")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequence;
    @XmlElement(name = "TemplateAttachments")
    protected TemplateReference.TemplateAttachments templateAttachments;

    /**
     * Gets the value of the templateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateLocationCode }
     *     
     */
    public TemplateLocationCode getTemplateLocation() {
        return templateLocation;
    }

    /**
     * Sets the value of the templateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateLocationCode }
     *     
     */
    public void setTemplateLocation(TemplateLocationCode value) {
        this.templateLocation = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

    /**
     * This Document will replace the Document in the
     * 							Template, if exists
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the roleAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateReference.RoleAssignments }
     *     
     */
    public TemplateReference.RoleAssignments getRoleAssignments() {
        return roleAssignments;
    }

    /**
     * Sets the value of the roleAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateReference.RoleAssignments }
     *     
     */
    public void setRoleAssignments(TemplateReference.RoleAssignments value) {
        this.roleAssignments = value;
    }

    /**
     * Gets the value of the fieldData property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateReference.FieldData }
     *     
     */
    public TemplateReference.FieldData getFieldData() {
        return fieldData;
    }

    /**
     * Sets the value of the fieldData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateReference.FieldData }
     *     
     */
    public void setFieldData(TemplateReference.FieldData value) {
        this.fieldData = value;
    }

    /**
     * Gets the value of the additionalTabs property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateReference.AdditionalTabs }
     *     
     */
    public TemplateReference.AdditionalTabs getAdditionalTabs() {
        return additionalTabs;
    }

    /**
     * Sets the value of the additionalTabs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateReference.AdditionalTabs }
     *     
     */
    public void setAdditionalTabs(TemplateReference.AdditionalTabs value) {
        this.additionalTabs = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the templateAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateReference.TemplateAttachments }
     *     
     */
    public TemplateReference.TemplateAttachments getTemplateAttachments() {
        return templateAttachments;
    }

    /**
     * Sets the value of the templateAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateReference.TemplateAttachments }
     *     
     */
    public void setTemplateAttachments(TemplateReference.TemplateAttachments value) {
        this.templateAttachments = value;
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
     *         &lt;element ref="{http://www.docusign.net/API/3.0}Tab" maxOccurs="unbounded"/>
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
        "tab"
    })
    public static class AdditionalTabs {

        @XmlElement(name = "Tab", namespace = "http://www.docusign.net/API/3.0", required = true)
        protected List<Tab> tab;

        /**
         * Gets the value of the tab property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tab property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTab().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tab }
         * 
         * 
         */
        public List<Tab> getTab() {
            if (tab == null) {
                tab = new ArrayList<Tab>();
            }
            return this.tab;
        }

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
     *       &lt;all>
     *         &lt;element name="DataValues" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DataValue" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="TabLabel">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="512"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Value">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="2000"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    public static class FieldData {

        @XmlElement(name = "DataValues")
        protected TemplateReference.FieldData.DataValues dataValues;

        /**
         * Gets the value of the dataValues property.
         * 
         * @return
         *     possible object is
         *     {@link TemplateReference.FieldData.DataValues }
         *     
         */
        public TemplateReference.FieldData.DataValues getDataValues() {
            return dataValues;
        }

        /**
         * Sets the value of the dataValues property.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateReference.FieldData.DataValues }
         *     
         */
        public void setDataValues(TemplateReference.FieldData.DataValues value) {
            this.dataValues = value;
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
         *         &lt;element name="DataValue" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="TabLabel">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="512"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Value">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="2000"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "dataValue"
        })
        public static class DataValues {

            @XmlElement(name = "DataValue", required = true)
            protected List<TemplateReference.FieldData.DataValues.DataValue> dataValue;

            /**
             * Gets the value of the dataValue property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dataValue property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDataValue().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TemplateReference.FieldData.DataValues.DataValue }
             * 
             * 
             */
            public List<TemplateReference.FieldData.DataValues.DataValue> getDataValue() {
                if (dataValue == null) {
                    dataValue = new ArrayList<TemplateReference.FieldData.DataValues.DataValue>();
                }
                return this.dataValue;
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
             *       &lt;all>
             *         &lt;element name="TabLabel">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="512"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Value">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="2000"/>
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
            @XmlType(name = "", propOrder = {

            })
            public static class DataValue {

                @XmlElement(name = "TabLabel", required = true)
                protected String tabLabel;
                @XmlElement(name = "Value", required = true)
                protected String value;

                /**
                 * Gets the value of the tabLabel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTabLabel() {
                    return tabLabel;
                }

                /**
                 * Sets the value of the tabLabel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTabLabel(String value) {
                    this.tabLabel = value;
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

            }

        }

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
     *         &lt;element name="RoleAssignment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RoleName" type="{http://www.docusign.net/API/3.0}LongString"/>
     *                   &lt;element name="RecipientID" type="{http://www.docusign.net/API/3.0}LocalId"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "roleAssignment"
    })
    public static class RoleAssignments {

        @XmlElement(name = "RoleAssignment", required = true)
        protected List<TemplateReference.RoleAssignments.RoleAssignment> roleAssignment;

        /**
         * Gets the value of the roleAssignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roleAssignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoleAssignment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TemplateReference.RoleAssignments.RoleAssignment }
         * 
         * 
         */
        public List<TemplateReference.RoleAssignments.RoleAssignment> getRoleAssignment() {
            if (roleAssignment == null) {
                roleAssignment = new ArrayList<TemplateReference.RoleAssignments.RoleAssignment>();
            }
            return this.roleAssignment;
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
         *         &lt;element name="RoleName" type="{http://www.docusign.net/API/3.0}LongString"/>
         *         &lt;element name="RecipientID" type="{http://www.docusign.net/API/3.0}LocalId"/>
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
            "roleName",
            "recipientID"
        })
        public static class RoleAssignment {

            @XmlElement(name = "RoleName", required = true)
            protected String roleName;
            @XmlElement(name = "RecipientID", required = true)
            protected BigInteger recipientID;

            /**
             * Gets the value of the roleName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoleName() {
                return roleName;
            }

            /**
             * Sets the value of the roleName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoleName(String value) {
                this.roleName = value;
            }

            /**
             * Gets the value of the recipientID property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRecipientID() {
                return recipientID;
            }

            /**
             * Sets the value of the recipientID property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRecipientID(BigInteger value) {
                this.recipientID = value;
            }

        }

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
     *         &lt;element ref="{http://www.docusign.net/API/3.0}Attachment" maxOccurs="unbounded" minOccurs="0"/>
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
        "attachment"
    })
    public static class TemplateAttachments {

        @XmlElement(name = "Attachment", namespace = "http://www.docusign.net/API/3.0")
        protected List<Attachment> attachment;

        /**
         * Gets the value of the attachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Attachment }
         * 
         * 
         */
        public List<Attachment> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<Attachment>();
            }
            return this.attachment;
        }

    }

}
