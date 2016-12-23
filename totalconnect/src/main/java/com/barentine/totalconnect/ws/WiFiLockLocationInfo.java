
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiLockLocationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiLockLocationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WifiLocks" type="{https://services.alarmnet.com/TC2/}ArrayOfWiFiLockInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiLockLocationInfo", propOrder = {
    "locationID",
    "locationName",
    "wifiLocks"
})
public class WiFiLockLocationInfo {

    @XmlElement(name = "LocationID")
    protected String locationID;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "WifiLocks")
    protected ArrayOfWiFiLockInfo wifiLocks;

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationID(String value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the wifiLocks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWiFiLockInfo }
     *     
     */
    public ArrayOfWiFiLockInfo getWifiLocks() {
        return wifiLocks;
    }

    /**
     * Sets the value of the wifiLocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWiFiLockInfo }
     *     
     */
    public void setWifiLocks(ArrayOfWiFiLockInfo value) {
        this.wifiLocks = value;
    }

}
