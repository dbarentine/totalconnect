
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AwayEndDateFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AwayEndDateFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TimeOfDay"/>
 *     &lt;enumeration value="DurationInHours"/>
 *     &lt;enumeration value="DurationInDays"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AwayEndDateFormat")
@XmlEnum
public enum AwayEndDateFormat {

    @XmlEnumValue("TimeOfDay")
    TIME_OF_DAY("TimeOfDay"),
    @XmlEnumValue("DurationInHours")
    DURATION_IN_HOURS("DurationInHours"),
    @XmlEnumValue("DurationInDays")
    DURATION_IN_DAYS("DurationInDays");
    private final String value;

    AwayEndDateFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AwayEndDateFormat fromValue(String v) {
        for (AwayEndDateFormat c: AwayEndDateFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
