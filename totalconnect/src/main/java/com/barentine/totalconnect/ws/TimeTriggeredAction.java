
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeTriggeredAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTriggeredAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DeviceID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="SceneID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="EventItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="TriggerTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SelectedDayID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "TimeTriggeredAction")
public class TimeTriggeredAction {

    @XmlAttribute(name = "DeviceID", required = true)
    protected long deviceID;
    @XmlAttribute(name = "SceneID", required = true)
    protected long sceneID;
    @XmlAttribute(name = "EventItemID", required = true)
    protected long eventItemID;
    @XmlAttribute(name = "TriggerTime")
    protected String triggerTime;
    @XmlAttribute(name = "SelectedDayID", required = true)
    protected int selectedDayID;
    @XmlAttribute(name = "IsEnabled", required = true)
    protected boolean isEnabled;
    @XmlAttribute(name = "FlashEventCardType", required = true)
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
     * Gets the value of the sceneID property.
     * 
     */
    public long getSceneID() {
        return sceneID;
    }

    /**
     * Sets the value of the sceneID property.
     * 
     */
    public void setSceneID(long value) {
        this.sceneID = value;
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
