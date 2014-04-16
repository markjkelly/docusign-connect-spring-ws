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
import net.docusign.api._3.FolderTypeInfo;
import net.docusign.api._3.UserInfo;


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
 *         &lt;element name="FolderOwner" type="{http://www.docusign.net/API/3.0}UserInfo"/>
 *         &lt;element name="FolderTypeInfo" type="{http://www.docusign.net/API/3.0}FolderTypeInfo"/>
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
@XmlRootElement(name = "Folder")
public class Folder {

    @XmlElement(name = "FolderOwner", required = true)
    protected UserInfo folderOwner;
    @XmlElement(name = "FolderTypeInfo", required = true)
    protected FolderTypeInfo folderTypeInfo;

    /**
     * Gets the value of the folderOwner property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfo }
     *     
     */
    public UserInfo getFolderOwner() {
        return folderOwner;
    }

    /**
     * Sets the value of the folderOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfo }
     *     
     */
    public void setFolderOwner(UserInfo value) {
        this.folderOwner = value;
    }

    /**
     * Gets the value of the folderTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FolderTypeInfo }
     *     
     */
    public FolderTypeInfo getFolderTypeInfo() {
        return folderTypeInfo;
    }

    /**
     * Sets the value of the folderTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderTypeInfo }
     *     
     */
    public void setFolderTypeInfo(FolderTypeInfo value) {
        this.folderTypeInfo = value;
    }

}
