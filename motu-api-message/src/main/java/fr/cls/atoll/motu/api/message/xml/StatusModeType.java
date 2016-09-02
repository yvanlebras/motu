//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.02 at 11:26:08 AM CEST 
//


package fr.cls.atoll.motu.api.message.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *     &lt;enumeration value="0"/>
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusModeType")
@XmlEnum(Integer.class)
public enum StatusModeType {

    @XmlEnumValue("0")
    INPROGRESS(0),
    @XmlEnumValue("1")
    DONE(1),
    @XmlEnumValue("2")
    ERROR(2),
    @XmlEnumValue("3")
    PENDING(3);
    private final int value;

    StatusModeType(int v) {
        value = v;
    }

    public int value() {
        return value;
    }

    public static StatusModeType fromValue(int v) {
        for (StatusModeType c: StatusModeType.values()) {
            if (c.value == v) {
                return c;
            }
        }
        throw new IllegalArgumentException(String.valueOf(v));
    }

}
