
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceUserAuthorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceUserAuthorization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceClassID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeviceSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAccessGranted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Sync" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceAuthorizationAttributes" type="{https://services.alarmnet.com/TC2/}ArrayOfDeviceAttribute" minOccurs="0"/>
 *         &lt;element name="PrerequisiteDeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PrerequisiteDeviceClassID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeviceTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceUserAuthorization", propOrder = {
    "deviceID",
    "deviceName",
    "deviceClassID",
    "deviceSerialNumber",
    "isAccessGranted",
    "sync",
    "deviceAuthorizationAttributes",
    "prerequisiteDeviceID",
    "prerequisiteDeviceClassID",
    "deviceTypeID"
})
public class DeviceUserAuthorization {

    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "DeviceClassID")
    protected int deviceClassID;
    @XmlElement(name = "DeviceSerialNumber")
    protected String deviceSerialNumber;
    @XmlElement(name = "IsAccessGranted")
    protected boolean isAccessGranted;
    @XmlElement(name = "Sync")
    protected String sync;
    @XmlElement(name = "DeviceAuthorizationAttributes")
    protected ArrayOfDeviceAttribute deviceAuthorizationAttributes;
    @XmlElement(name = "PrerequisiteDeviceID")
    protected long prerequisiteDeviceID;
    @XmlElement(name = "PrerequisiteDeviceClassID")
    protected int prerequisiteDeviceClassID;
    @XmlElement(name = "DeviceTypeID")
    protected int deviceTypeID;

    /**
     * Gets the value of the deviceID property.
     * 
     */
    public long getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     */
    public void setDeviceID(long value) {
        this.deviceID = value;
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
     * Gets the value of the deviceClassID property.
     * 
     */
    public int getDeviceClassID() {
        return deviceClassID;
    }

    /**
     * Sets the value of the deviceClassID property.
     * 
     */
    public void setDeviceClassID(int value) {
        this.deviceClassID = value;
    }

    /**
     * Gets the value of the deviceSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    /**
     * Sets the value of the deviceSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialNumber(String value) {
        this.deviceSerialNumber = value;
    }

    /**
     * Gets the value of the isAccessGranted property.
     * 
     */
    public boolean isIsAccessGranted() {
        return isAccessGranted;
    }

    /**
     * Sets the value of the isAccessGranted property.
     * 
     */
    public void setIsAccessGranted(boolean value) {
        this.isAccessGranted = value;
    }

    /**
     * Gets the value of the sync property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSync() {
        return sync;
    }

    /**
     * Sets the value of the sync property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSync(String value) {
        this.sync = value;
    }

    /**
     * Gets the value of the deviceAuthorizationAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeviceAttribute }
     *     
     */
    public ArrayOfDeviceAttribute getDeviceAuthorizationAttributes() {
        return deviceAuthorizationAttributes;
    }

    /**
     * Sets the value of the deviceAuthorizationAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeviceAttribute }
     *     
     */
    public void setDeviceAuthorizationAttributes(ArrayOfDeviceAttribute value) {
        this.deviceAuthorizationAttributes = value;
    }

    /**
     * Gets the value of the prerequisiteDeviceID property.
     * 
     */
    public long getPrerequisiteDeviceID() {
        return prerequisiteDeviceID;
    }

    /**
     * Sets the value of the prerequisiteDeviceID property.
     * 
     */
    public void setPrerequisiteDeviceID(long value) {
        this.prerequisiteDeviceID = value;
    }

    /**
     * Gets the value of the prerequisiteDeviceClassID property.
     * 
     */
    public int getPrerequisiteDeviceClassID() {
        return prerequisiteDeviceClassID;
    }

    /**
     * Sets the value of the prerequisiteDeviceClassID property.
     * 
     */
    public void setPrerequisiteDeviceClassID(int value) {
        this.prerequisiteDeviceClassID = value;
    }

    /**
     * Gets the value of the deviceTypeID property.
     * 
     */
    public int getDeviceTypeID() {
        return deviceTypeID;
    }

    /**
     * Sets the value of the deviceTypeID property.
     * 
     */
    public void setDeviceTypeID(int value) {
        this.deviceTypeID = value;
    }

}
