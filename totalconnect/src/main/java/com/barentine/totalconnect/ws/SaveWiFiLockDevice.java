
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="wifiLockLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wifiLockDevices" type="{https://services.alarmnet.com/TC2/}ArrayOfWiFiLockInfo" minOccurs="0"/>
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
    "sessionId",
    "locationId",
    "wifiLockLocationID",
    "wifiLockDevices"
})
@XmlRootElement(name = "SaveWiFiLockDevice")
public class SaveWiFiLockDevice {

    protected String sessionId;
    protected long locationId;
    protected String wifiLockLocationID;
    protected ArrayOfWiFiLockInfo wifiLockDevices;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     */
    public long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     */
    public void setLocationId(long value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the wifiLockLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifiLockLocationID() {
        return wifiLockLocationID;
    }

    /**
     * Sets the value of the wifiLockLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifiLockLocationID(String value) {
        this.wifiLockLocationID = value;
    }

    /**
     * Gets the value of the wifiLockDevices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWiFiLockInfo }
     *     
     */
    public ArrayOfWiFiLockInfo getWifiLockDevices() {
        return wifiLockDevices;
    }

    /**
     * Sets the value of the wifiLockDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWiFiLockInfo }
     *     
     */
    public void setWifiLockDevices(ArrayOfWiFiLockInfo value) {
        this.wifiLockDevices = value;
    }

}
