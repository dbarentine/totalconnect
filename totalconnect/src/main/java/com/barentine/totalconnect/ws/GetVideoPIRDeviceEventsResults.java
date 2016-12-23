
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVideoPIRDeviceEventsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVideoPIRDeviceEventsResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="DeviceEventInfo" type="{https://services.alarmnet.com/TC2/}VideoPIRDeviceEventInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVideoPIRDeviceEventsResults", propOrder = {
    "deviceEventInfo"
})
public class GetVideoPIRDeviceEventsResults
    extends WebMethodResults
{

    @XmlElement(name = "DeviceEventInfo")
    protected VideoPIRDeviceEventInfo deviceEventInfo;

    /**
     * Gets the value of the deviceEventInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPIRDeviceEventInfo }
     *     
     */
    public VideoPIRDeviceEventInfo getDeviceEventInfo() {
        return deviceEventInfo;
    }

    /**
     * Sets the value of the deviceEventInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPIRDeviceEventInfo }
     *     
     */
    public void setDeviceEventInfo(VideoPIRDeviceEventInfo value) {
        this.deviceEventInfo = value;
    }

}
