
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScenesTimeTriggeredAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScenesTimeTriggeredAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventItemID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TriggerTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedDayID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ScenesTimeTriggeredAction", propOrder = {
    "deviceID",
    "eventItemID",
    "triggerTime",
    "selectedDayID",
    "isEnabled",
    "flashEventCardType"
})
public class ScenesTimeTriggeredAction {

    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "EventItemID")
    protected long eventItemID;
    @XmlElement(name = "TriggerTime")
    protected String triggerTime;
    @XmlElement(name = "SelectedDayID")
    protected int selectedDayID;
    @XmlElement(name = "IsEnabled")
    protected boolean isEnabled;
    @XmlElement(name = "FlashEventCardType")
    protected int flashEventCardType;

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
     * Gets the value of the triggerTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerTime() {
        return triggerTime;
    }

    /**
     * Sets the value of the triggerTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerTime(String value) {
        this.triggerTime = value;
    }

    /**
     * Gets the value of the selectedDayID property.
     * 
     */
    public int getSelectedDayID() {
        return selectedDayID;
    }

    /**
     * Sets the value of the selectedDayID property.
     * 
     */
    public void setSelectedDayID(int value) {
        this.selectedDayID = value;
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
