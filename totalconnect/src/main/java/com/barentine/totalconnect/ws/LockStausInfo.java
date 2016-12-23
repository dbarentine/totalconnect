
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LockStausInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LockStausInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LockID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LockName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeviceStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeviceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockStausInfo", propOrder = {
    "lockID",
    "lockName",
    "lockState",
    "deviceStatus",
    "deviceType"
})
public class LockStausInfo {

    @XmlElement(name = "LockID")
    protected long lockID;
    @XmlElement(name = "LockName")
    protected String lockName;
    @XmlElement(name = "LockState")
    protected int lockState;
    @XmlElement(name = "DeviceStatus")
    protected int deviceStatus;
    @XmlElement(name = "DeviceType")
    protected int deviceType;

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
     * Gets the value of the lockState property.
     * 
     */
    public int getLockState() {
        return lockState;
    }

    /**
     * Sets the value of the lockState property.
     * 
     */
    public void setLockState(int value) {
        this.lockState = value;
    }

    /**
     * Gets the value of the deviceStatus property.
     * 
     */
    public int getDeviceStatus() {
        return deviceStatus;
    }

    /**
     * Sets the value of the deviceStatus property.
     * 
     */
    public void setDeviceStatus(int value) {
        this.deviceStatus = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     */
    public int getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     */
    public void setDeviceType(int value) {
        this.deviceType = value;
    }

}
