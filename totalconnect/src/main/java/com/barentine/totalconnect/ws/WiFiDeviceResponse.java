
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiDeviceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiDeviceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LyricDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAlive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsUpgrading" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DeviceSerialText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiDeviceResponse", propOrder = {
    "lyricDeviceID",
    "deviceName",
    "deviceAlias",
    "isAlive",
    "isUpgrading",
    "deviceSerialText",
    "deviceVersion"
})
public class WiFiDeviceResponse {

    @XmlElement(name = "LyricDeviceID")
    protected String lyricDeviceID;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "DeviceAlias")
    protected String deviceAlias;
    @XmlElement(name = "IsAlive")
    protected boolean isAlive;
    @XmlElement(name = "IsUpgrading")
    protected boolean isUpgrading;
    @XmlElement(name = "DeviceSerialText")
    protected String deviceSerialText;
    @XmlElement(name = "DeviceVersion")
    protected String deviceVersion;

    /**
     * Gets the value of the lyricDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyricDeviceID() {
        return lyricDeviceID;
    }

    /**
     * Sets the value of the lyricDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyricDeviceID(String value) {
        this.lyricDeviceID = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceAlias() {
        return deviceAlias;
    }

    /**
     * Sets the value of the deviceAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceAlias(String value) {
        this.deviceAlias = value;
    }

    /**
     * Gets the value of the isAlive property.
     * 
     */
    public boolean isIsAlive() {
        return isAlive;
    }

    /**
     * Sets the value of the isAlive property.
     * 
     */
    public void setIsAlive(boolean value) {
        this.isAlive = value;
    }

    /**
     * Gets the value of the isUpgrading property.
     * 
     */
    public boolean isIsUpgrading() {
        return isUpgrading;
    }

    /**
     * Sets the value of the isUpgrading property.
     * 
     */
    public void setIsUpgrading(boolean value) {
        this.isUpgrading = value;
    }

    /**
     * Gets the value of the deviceSerialText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialText() {
        return deviceSerialText;
    }

    /**
     * Sets the value of the deviceSerialText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialText(String value) {
        this.deviceSerialText = value;
    }

    /**
     * Gets the value of the deviceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceVersion() {
        return deviceVersion;
    }

    /**
     * Sets the value of the deviceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceVersion(String value) {
        this.deviceVersion = value;
    }

}
