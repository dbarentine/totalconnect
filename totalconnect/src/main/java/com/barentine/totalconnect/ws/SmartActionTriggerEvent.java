
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartActionTriggerEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartActionTriggerEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmartActionTriggerEventID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SecurityTriggerEvent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SecurityTriggerDeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TriggerZoneID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartActionTriggerEvent", propOrder = {
    "smartActionTriggerEventID",
    "securityTriggerEvent",
    "securityTriggerDeviceID",
    "deviceID",
    "triggerZoneID",
    "deviceState"
})
public class SmartActionTriggerEvent {

    @XmlElement(name = "SmartActionTriggerEventID")
    protected long smartActionTriggerEventID;
    @XmlElement(name = "SecurityTriggerEvent")
    protected int securityTriggerEvent;
    @XmlElement(name = "SecurityTriggerDeviceID")
    protected long securityTriggerDeviceID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "TriggerZoneID")
    protected long triggerZoneID;
    @XmlElement(name = "DeviceState")
    protected int deviceState;

    /**
     * Gets the value of the smartActionTriggerEventID property.
     * 
     */
    public long getSmartActionTriggerEventID() {
        return smartActionTriggerEventID;
    }

    /**
     * Sets the value of the smartActionTriggerEventID property.
     * 
     */
    public void setSmartActionTriggerEventID(long value) {
        this.smartActionTriggerEventID = value;
    }

    /**
     * Gets the value of the securityTriggerEvent property.
     * 
     */
    public int getSecurityTriggerEvent() {
        return securityTriggerEvent;
    }

    /**
     * Sets the value of the securityTriggerEvent property.
     * 
     */
    public void setSecurityTriggerEvent(int value) {
        this.securityTriggerEvent = value;
    }

    /**
     * Gets the value of the securityTriggerDeviceID property.
     * 
     */
    public long getSecurityTriggerDeviceID() {
        return securityTriggerDeviceID;
    }

    /**
     * Sets the value of the securityTriggerDeviceID property.
     * 
     */
    public void setSecurityTriggerDeviceID(long value) {
        this.securityTriggerDeviceID = value;
    }

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
     * Gets the value of the triggerZoneID property.
     * 
     */
    public long getTriggerZoneID() {
        return triggerZoneID;
    }

    /**
     * Sets the value of the triggerZoneID property.
     * 
     */
    public void setTriggerZoneID(long value) {
        this.triggerZoneID = value;
    }

    /**
     * Gets the value of the deviceState property.
     * 
     */
    public int getDeviceState() {
        return deviceState;
    }

    /**
     * Sets the value of the deviceState property.
     * 
     */
    public void setDeviceState(int value) {
        this.deviceState = value;
    }

}
