
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
 *         &lt;element name="GetWiFiDoorBellSettingsResult" type="{https://services.alarmnet.com/TC2/}GetDoorBellSettingsResult" minOccurs="0"/>
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
    "getWiFiDoorBellSettingsResult"
})
@XmlRootElement(name = "GetWiFiDoorBellSettingsResponse")
public class GetWiFiDoorBellSettingsResponse {

    @XmlElement(name = "GetWiFiDoorBellSettingsResult")
    protected GetDoorBellSettingsResult getWiFiDoorBellSettingsResult;

    /**
     * Gets the value of the getWiFiDoorBellSettingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetDoorBellSettingsResult }
     *     
     */
    public GetDoorBellSettingsResult getGetWiFiDoorBellSettingsResult() {
        return getWiFiDoorBellSettingsResult;
    }

    /**
     * Sets the value of the getWiFiDoorBellSettingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDoorBellSettingsResult }
     *     
     */
    public void setGetWiFiDoorBellSettingsResult(GetDoorBellSettingsResult value) {
        this.getWiFiDoorBellSettingsResult = value;
    }

}
