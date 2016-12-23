
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDeviceStatusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDeviceStatusResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="deviceInfo" type="{https://services.alarmnet.com/TC2/}DeviceStatusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDeviceStatusResult", propOrder = {
    "deviceInfo"
})
public class GetDeviceStatusResult
    extends WebMethodResults
{

    protected DeviceStatusInfo deviceInfo;

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatusInfo }
     *     
     */
    public DeviceStatusInfo getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatusInfo }
     *     
     */
    public void setDeviceInfo(DeviceStatusInfo value) {
        this.deviceInfo = value;
    }

}
