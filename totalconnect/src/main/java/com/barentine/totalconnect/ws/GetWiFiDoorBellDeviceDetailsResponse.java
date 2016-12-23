
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetWiFiDoorBellDeviceDetailsResult" type="{https://services.alarmnet.com/TC2/}WiFiDoorBellInfoResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getWiFiDoorBellDeviceDetailsResult"
})
@XmlRootElement(name = "GetWiFiDoorBellDeviceDetailsResponse")
public class GetWiFiDoorBellDeviceDetailsResponse {

    @XmlElement(name = "GetWiFiDoorBellDeviceDetailsResult")
    protected WiFiDoorBellInfoResult getWiFiDoorBellDeviceDetailsResult;

    /**
     * Gets the value of the getWiFiDoorBellDeviceDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link WiFiDoorBellInfoResult }
     *     
     */
    public WiFiDoorBellInfoResult getGetWiFiDoorBellDeviceDetailsResult() {
        return getWiFiDoorBellDeviceDetailsResult;
    }

    /**
     * Sets the value of the getWiFiDoorBellDeviceDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WiFiDoorBellInfoResult }
     *     
     */
    public void setGetWiFiDoorBellDeviceDetailsResult(WiFiDoorBellInfoResult value) {
        this.getWiFiDoorBellDeviceDetailsResult = value;
    }

}
