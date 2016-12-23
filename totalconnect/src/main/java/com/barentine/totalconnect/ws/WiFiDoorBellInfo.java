
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiDoorBellInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiDoorBellInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceModel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TimeZoneID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SetupStateID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WiFiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LEDColorInDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistingDoorBellUser" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LockID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsMotionEnabled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SetupErrorID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PartnerDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiDoorBellInfo", propOrder = {
    "deviceModel",
    "timeZoneID",
    "state",
    "setupStateID",
    "wiFiName",
    "ledColorInDevice",
    "isExistingDoorBellUser",
    "lockID",
    "isMotionEnabled",
    "setupErrorID",
    "partnerDeviceID"
})
@XmlSeeAlso({
    GetWiFiDoorBellResult.class
})
public class WiFiDoorBellInfo {

    @XmlElement(name = "DeviceModel")
    protected int deviceModel;
    @XmlElement(name = "TimeZoneID")
    protected int timeZoneID;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "SetupStateID")
    protected int setupStateID;
    @XmlElement(name = "WiFiName")
    protected String wiFiName;
    @XmlElement(name = "LEDColorInDevice")
    protected String ledColorInDevice;
    @XmlElement(name = "IsExistingDoorBellUser")
    protected int isExistingDoorBellUser;
    @XmlElement(name = "LockID")
    protected long lockID;
    @XmlElement(name = "IsMotionEnabled")
    protected int isMotionEnabled;
    @XmlElement(name = "SetupErrorID")
    protected int setupErrorID;
    @XmlElement(name = "PartnerDeviceID")
    protected String partnerDeviceID;

    /**
     * Gets the value of the deviceModel property.
     * 
     */
    public int getDeviceModel() {
        return deviceModel;
    }

    /**
     * Sets the value of the deviceModel property.
     * 
     */
    public void setDeviceModel(int value) {
        this.deviceModel = value;
    }

    /**
     * Gets the value of the timeZoneID property.
     * 
     */
    public int getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     */
    public void setTimeZoneID(int value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the setupStateID property.
     * 
     */
    public int getSetupStateID() {
        return setupStateID;
    }

    /**
     * Sets the value of the setupStateID property.
     * 
     */
    public void setSetupStateID(int value) {
        this.setupStateID = value;
    }

    /**
     * Gets the value of the wiFiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiFiName() {
        return wiFiName;
    }

    /**
     * Sets the value of the wiFiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiFiName(String value) {
        this.wiFiName = value;
    }

    /**
     * Gets the value of the ledColorInDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEDColorInDevice() {
        return ledColorInDevice;
    }

    /**
     * Sets the value of the ledColorInDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEDColorInDevice(String value) {
        this.ledColorInDevice = value;
    }

    /**
     * Gets the value of the isExistingDoorBellUser property.
     * 
     */
    public int getIsExistingDoorBellUser() {
        return isExistingDoorBellUser;
    }

    /**
     * Sets the value of the isExistingDoorBellUser property.
     * 
     */
    public void setIsExistingDoorBellUser(int value) {
        this.isExistingDoorBellUser = value;
    }

    /**
     * Gets the value of the lockID property.
     * 
     */
    public long getLockID() {
        return lockID;
    }

    /**
     * Sets the value of the lockID property.
     * 
     */
    public void setLockID(long value) {
        this.lockID = value;
    }

    /**
     * Gets the value of the isMotionEnabled property.
     * 
     */
    public int getIsMotionEnabled() {
        return isMotionEnabled;
    }

    /**
     * Sets the value of the isMotionEnabled property.
     * 
     */
    public void setIsMotionEnabled(int value) {
        this.isMotionEnabled = value;
    }

    /**
     * Gets the value of the setupErrorID property.
     * 
     */
    public int getSetupErrorID() {
        return setupErrorID;
    }

    /**
     * Sets the value of the setupErrorID property.
     * 
     */
    public void setSetupErrorID(int value) {
        this.setupErrorID = value;
    }

    /**
     * Gets the value of the partnerDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerDeviceID() {
        return partnerDeviceID;
    }

    /**
     * Sets the value of the partnerDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerDeviceID(String value) {
        this.partnerDeviceID = value;
    }

}
