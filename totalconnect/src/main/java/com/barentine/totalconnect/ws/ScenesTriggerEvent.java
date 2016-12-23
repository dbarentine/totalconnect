
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScenesTriggerEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScenesTriggerEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventTypeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventItemID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventModifierID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FlashEventCardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScenesTriggerEvent", propOrder = {
    "eventTypeID",
    "eventItemID",
    "eventModifierID",
    "deviceID",
    "isEnabled",
    "flashEventCardType"
})
public class ScenesTriggerEvent {

    @XmlElement(name = "EventTypeID")
    protected long eventTypeID;
    @XmlElement(name = "EventItemID")
    protected long eventItemID;
    @XmlElement(name = "EventModifierID")
    protected long eventModifierID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "IsEnabled")
    protected boolean isEnabled;
    @XmlElement(name = "FlashEventCardType")
    protected int flashEventCardType;

    /**
     * Gets the value of the eventTypeID property.
     * 
     */
    public long getEventTypeID() {
        return eventTypeID;
    }

    /**
     * Sets the value of the eventTypeID property.
     * 
     */
    public void setEventTypeID(long value) {
        this.eventTypeID = value;
    }

    /**
     * Gets the value of the eventItemID property.
     * 
     */
    public long getEventItemID() {
        return eventItemID;
    }

    /**
     * Sets the value of the eventItemID property.
     * 
     */
    public void setEventItemID(long value) {
        this.eventItemID = value;
    }

    /**
     * Gets the value of the eventModifierID property.
     * 
     */
    public long getEventModifierID() {
        return eventModifierID;
    }

    /**
     * Sets the value of the eventModifierID property.
     * 
     */
    public void setEventModifierID(long value) {
        this.eventModifierID = value;
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
     * Gets the value of the isEnabled property.
     * 
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     * 
     */
    public void setIsEnabled(boolean value) {
        this.isEnabled = value;
    }

    /**
     * Gets the value of the flashEventCardType property.
     * 
     */
    public int getFlashEventCardType() {
        return flashEventCardType;
    }

    /**
     * Sets the value of the flashEventCardType property.
     * 
     */
    public void setFlashEventCardType(int value) {
        this.flashEventCardType = value;
    }

}
