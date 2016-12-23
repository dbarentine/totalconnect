
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelStatusInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}PanelBaseInfo">
 *       &lt;sequence>
 *         &lt;element name="Zones" type="{https://services.alarmnet.com/TC2/}ArrayOfZoneStatusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelStatusInfo", propOrder = {
    "zones"
})
public class PanelStatusInfo
    extends PanelBaseInfo
{

    @XmlElement(name = "Zones")
    protected ArrayOfZoneStatusInfo zones;

    /**
     * Gets the value of the zones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfZoneStatusInfo }
     *     
     */
    public ArrayOfZoneStatusInfo getZones() {
        return zones;
    }

    /**
     * Sets the value of the zones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfZoneStatusInfo }
     *     
     */
    public void setZones(ArrayOfZoneStatusInfo value) {
        this.zones = value;
    }

}
