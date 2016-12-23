
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetZonesListInStateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetZonesListInStateResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="ZoneStatus" type="{https://services.alarmnet.com/TC2/}ZoneStatusList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetZonesListInStateResult", propOrder = {
    "zoneStatus"
})
public class GetZonesListInStateResult
    extends WebMethodResults
{

    @XmlElement(name = "ZoneStatus")
    protected ZoneStatusList zoneStatus;

    /**
     * Gets the value of the zoneStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneStatusList }
     *     
     */
    public ZoneStatusList getZoneStatus() {
        return zoneStatus;
    }

    /**
     * Sets the value of the zoneStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneStatusList }
     *     
     */
    public void setZoneStatus(ZoneStatusList value) {
        this.zoneStatus = value;
    }

}
