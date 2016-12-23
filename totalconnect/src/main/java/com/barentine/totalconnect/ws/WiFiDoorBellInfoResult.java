
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiDoorBellInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiDoorBellInfoResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="getWiFiDoorBellResult" type="{https://services.alarmnet.com/TC2/}GetWiFiDoorBellResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiDoorBellInfoResult", propOrder = {
    "getWiFiDoorBellResult"
})
public class WiFiDoorBellInfoResult
    extends WebMethodResults
{

    protected GetWiFiDoorBellResult getWiFiDoorBellResult;

    /**
     * Gets the value of the getWiFiDoorBellResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetWiFiDoorBellResult }
     *     
     */
    public GetWiFiDoorBellResult getGetWiFiDoorBellResult() {
        return getWiFiDoorBellResult;
    }

    /**
     * Sets the value of the getWiFiDoorBellResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetWiFiDoorBellResult }
     *     
     */
    public void setGetWiFiDoorBellResult(GetWiFiDoorBellResult value) {
        this.getWiFiDoorBellResult = value;
    }

}
