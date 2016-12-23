
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LockInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LockInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LockID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LockName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockIndex" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="LockState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BatteryState" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DeviceStatusID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockInfo", propOrder = {
    "deviceID",
    "lockID",
    "lockName",
    "lockIndex",
    "lockState",
    "batteryState",
    "deviceStatusID"
})
public class LockInfo {

    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "LockID")
    protected long lockID;
    @XmlElement(name = "LockName")
    protected String lockName;
    @XmlElement(name = "LockIndex")
    protected short lockIndex;
    @XmlElement(name = "LockState")
    protected boolean lockState;
    @XmlElement(name = "BatteryState")
    protected short batteryState;
    @XmlElement(name = "DeviceStatusID")
    @XmlSchemaType(name = "unsignedByte")
    protected short deviceStatusID;

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
     * Gets the value of the lockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockName() {
        return lockName;
    }

    /**
     * Sets the value of the lockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockName(String value) {
        this.lockName = value;
    }

    /**
     * Gets the value of the lockIndex property.
     * 
     */
    public short getLockIndex() {
        return lockIndex;
    }

    /**
     * Sets the value of the lockIndex property.
     * 
     */
    public void setLockIndex(short value) {
        this.lockIndex = value;
    }

    /**
     * Gets the value of the lockState property.
     * 
     */
    public boolean isLockState() {
        return lockState;
    }

    /**
     * Sets the value of the lockState property.
     * 
     */
    public void setLockState(boolean value) {
        this.lockState = value;
    }

    /**
     * Gets the value of the batteryState property.
     * 
     */
    public short getBatteryState() {
        return batteryState;
    }

    /**
     * Sets the value of the batteryState property.
     * 
     */
    public void setBatteryState(short value) {
        this.batteryState = value;
    }

    /**
     * Gets the value of the deviceStatusID property.
     * 
     */
    public short getDeviceStatusID() {
        return deviceStatusID;
    }

    /**
     * Sets the value of the deviceStatusID property.
     * 
     */
    public void setDeviceStatusID(short value) {
        this.deviceStatusID = value;
    }

}
