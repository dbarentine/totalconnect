
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
 *         &lt;element name="WiFiWeatherFromDeviceResult" type="{https://services.alarmnet.com/TC2/}WiFiWeatherResponse" minOccurs="0"/>
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
    "wiFiWeatherFromDeviceResult"
})
@XmlRootElement(name = "WiFiWeatherFromDeviceResponse")
public class WiFiWeatherFromDeviceResponse {

    @XmlElement(name = "WiFiWeatherFromDeviceResult")
    protected WiFiWeatherResponse wiFiWeatherFromDeviceResult;

    /**
     * Gets the value of the wiFiWeatherFromDeviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link WiFiWeatherResponse }
     *     
     */
    public WiFiWeatherResponse getWiFiWeatherFromDeviceResult() {
        return wiFiWeatherFromDeviceResult;
    }

    /**
     * Sets the value of the wiFiWeatherFromDeviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WiFiWeatherResponse }
     *     
     */
    public void setWiFiWeatherFromDeviceResult(WiFiWeatherResponse value) {
        this.wiFiWeatherFromDeviceResult = value;
    }

}
