
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneStatusListEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneStatusListEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Zones" type="{https://services.alarmnet.com/TC2/}ArrayOfZoneStatusInfoEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneStatusListEx", propOrder = {
    "zones"
})
public class ZoneStatusListEx {

    @XmlElement(name = "Zones")
    protected ArrayOfZoneStatusInfoEx zones;

    /**
     * Gets the value of the zones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfZoneStatusInfoEx }
     *     
     */
    public ArrayOfZoneStatusInfoEx getZones() {
        return zones;
    }

    /**
     * Sets the value of the zones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfZoneStatusInfoEx }
     *     
     */
    public void setZones(ArrayOfZoneStatusInfoEx value) {
        this.zones = value;
    }

}
