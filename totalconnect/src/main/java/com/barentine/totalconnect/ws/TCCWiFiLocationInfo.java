
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCCWiFiLocationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCCWiFiLocationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TCCLocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Devices" type="{https://services.alarmnet.com/TC2/}ArrayOfTCCWiFiDeviceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCCWiFiLocationInfo", propOrder = {
    "tccLocationID",
    "locationName",
    "devices"
})
public class TCCWiFiLocationInfo {

    @XmlElement(name = "TCCLocationID")
    protected int tccLocationID;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "Devices")
    protected ArrayOfTCCWiFiDeviceInfo devices;

    /**
     * Gets the value of the tccLocationID property.
     * 
     */
    public int getTCCLocationID() {
        return tccLocationID;
    }

    /**
     * Sets the value of the tccLocationID property.
     * 
     */
    public void setTCCLocationID(int value) {
        this.tccLocationID = value;
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
     * Gets the value of the devices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTCCWiFiDeviceInfo }
     *     
     */
    public ArrayOfTCCWiFiDeviceInfo getDevices() {
        return devices;
    }

    /**
     * Sets the value of the devices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTCCWiFiDeviceInfo }
     *     
     */
    public void setDevices(ArrayOfTCCWiFiDeviceInfo value) {
        this.devices = value;
    }

}
