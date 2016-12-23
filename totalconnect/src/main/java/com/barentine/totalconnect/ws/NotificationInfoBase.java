
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationInfoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationInfoBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EventTypeID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="EventItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="EventModifierID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="DeviceID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="IsEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FlashEventCardType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationInfoBase")
@XmlSeeAlso({
    EventNotification.class,
    SentToPanelEvents.class,
    VideoTrigger.class,
    SceneTrigger.class
})
public class NotificationInfoBase {

    @XmlAttribute(name = "EventTypeID", required = true)
    protected long eventTypeID;
    @XmlAttribute(name = "EventItemID", required = true)
    protected long eventItemID;
    @XmlAttribute(name = "EventModifierID", required = true)
    protected long eventModifierID;
    @XmlAttribute(name = "DeviceID", required = true)
    protected long deviceID;
    @XmlAttribute(name = "IsEnabled", required = true)
    protected boolean isEnabled;
    @XmlAttribute(name = "FlashEventCardType", required = true)
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
