
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationInfoBasic_UserEnabled complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationInfoBasic_UserEnabled">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceList" type="{https://services.alarmnet.com/TC2/}ArrayOfDeviceInfoBasic_UserEnabled" minOccurs="0"/>
 *         &lt;element name="PhotoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationInfoBasic_UserEnabled", propOrder = {
    "locationID",
    "locationName",
    "deviceList",
    "photoURL"
})
public class LocationInfoBasicUserEnabled {

    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "DeviceList")
    protected ArrayOfDeviceInfoBasicUserEnabled deviceList;
    @XmlElement(name = "PhotoURL")
    protected String photoURL;

    /**
     * Gets the value of the locationID property.
     * 
     */
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(long value) {
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
     * Gets the value of the deviceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeviceInfoBasicUserEnabled }
     *     
     */
    public ArrayOfDeviceInfoBasicUserEnabled getDeviceList() {
        return deviceList;
    }

    /**
     * Sets the value of the deviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeviceInfoBasicUserEnabled }
     *     
     */
    public void setDeviceList(ArrayOfDeviceInfoBasicUserEnabled value) {
        this.deviceList = value;
    }

    /**
     * Gets the value of the photoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the value of the photoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoURL(String value) {
        this.photoURL = value;
    }

}
