
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAssociatedSkybellDevicesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAssociatedSkybellDevicesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="doorbellDeviceList" type="{https://services.alarmnet.com/TC2/}ArrayOfWiFiDoorBellConfigInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAssociatedSkybellDevicesResult", propOrder = {
    "doorbellDeviceList"
})
public class GetAssociatedSkybellDevicesResult
    extends WebMethodResults
{

    protected ArrayOfWiFiDoorBellConfigInfo doorbellDeviceList;

    /**
     * Gets the value of the doorbellDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWiFiDoorBellConfigInfo }
     *     
     */
    public ArrayOfWiFiDoorBellConfigInfo getDoorbellDeviceList() {
        return doorbellDeviceList;
    }

    /**
     * Sets the value of the doorbellDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWiFiDoorBellConfigInfo }
     *     
     */
    public void setDoorbellDeviceList(ArrayOfWiFiDoorBellConfigInfo value) {
        this.doorbellDeviceList = value;
    }

}
