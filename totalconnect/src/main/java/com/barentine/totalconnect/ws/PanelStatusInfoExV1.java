
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelStatusInfoEx_V1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelStatusInfoEx_V1">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}PanelBaseInfoEx">
 *       &lt;sequence>
 *         &lt;element name="Zones" type="{https://services.alarmnet.com/TC2/}ArrayOfZoneStatusInfoEx_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelStatusInfoEx_V1", propOrder = {
    "zones"
})
public class PanelStatusInfoExV1
    extends PanelBaseInfoEx
{

    @XmlElement(name = "Zones")
    protected ArrayOfZoneStatusInfoExV1 zones;

    /**
     * Gets the value of the zones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfZoneStatusInfoExV1 }
     *     
     */
    public ArrayOfZoneStatusInfoExV1 getZones() {
        return zones;
    }

    /**
     * Sets the value of the zones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfZoneStatusInfoExV1 }
     *     
     */
    public void setZones(ArrayOfZoneStatusInfoExV1 value) {
        this.zones = value;
    }

}
