
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDoorBellSettingsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDoorBellSettingsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="wiFiDoorBellSettings" type="{https://services.alarmnet.com/TC2/}WiFiDoorBellSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDoorBellSettingsResult", propOrder = {
    "wiFiDoorBellSettings"
})
public class GetDoorBellSettingsResult
    extends WebMethodResults
{

    protected WiFiDoorBellSettings wiFiDoorBellSettings;

    /**
     * Gets the value of the wiFiDoorBellSettings property.
     * 
     * @return
     *     possible object is
     *     {@link WiFiDoorBellSettings }
     *     
     */
    public WiFiDoorBellSettings getWiFiDoorBellSettings() {
        return wiFiDoorBellSettings;
    }

    /**
     * Sets the value of the wiFiDoorBellSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WiFiDoorBellSettings }
     *     
     */
    public void setWiFiDoorBellSettings(WiFiDoorBellSettings value) {
        this.wiFiDoorBellSettings = value;
    }

}
