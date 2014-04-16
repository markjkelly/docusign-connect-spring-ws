//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 12:12:45 PM EST 
//


package net.ds.mk;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvelopeACStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvelopeACStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="Transferred"/>
 *     &lt;enumeration value="AuthoritativeCopy"/>
 *     &lt;enumeration value="AuthoritativeCopyExportPending"/>
 *     &lt;enumeration value="AuthoritativeCopyExported"/>
 *     &lt;enumeration value="DepositPending"/>
 *     &lt;enumeration value="Deposited"/>
 *     &lt;enumeration value="DepositedEO"/>
 *     &lt;enumeration value="DepositFailed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvelopeACStatusCode")
@XmlEnum
public enum EnvelopeACStatusCode {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Original")
    ORIGINAL("Original"),
    @XmlEnumValue("Transferred")
    TRANSFERRED("Transferred"),
    @XmlEnumValue("AuthoritativeCopy")
    AUTHORITATIVE_COPY("AuthoritativeCopy"),
    @XmlEnumValue("AuthoritativeCopyExportPending")
    AUTHORITATIVE_COPY_EXPORT_PENDING("AuthoritativeCopyExportPending"),
    @XmlEnumValue("AuthoritativeCopyExported")
    AUTHORITATIVE_COPY_EXPORTED("AuthoritativeCopyExported"),
    @XmlEnumValue("DepositPending")
    DEPOSIT_PENDING("DepositPending"),
    @XmlEnumValue("Deposited")
    DEPOSITED("Deposited"),
    @XmlEnumValue("DepositedEO")
    DEPOSITED_EO("DepositedEO"),
    @XmlEnumValue("DepositFailed")
    DEPOSIT_FAILED("DepositFailed");
    private final String value;

    EnvelopeACStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvelopeACStatusCode fromValue(String v) {
        for (EnvelopeACStatusCode c: EnvelopeACStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}