
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventSummaryConfigured complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventSummaryConfigured">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EventTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EventGroupName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EventClassDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CustomNotificationMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NotificationListName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NotificationScheduleName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TriggerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Trigger" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventSummaryConfigured")
public class EventSummaryConfigured {

    @XmlAttribute(name = "EventTypeDescription")
    protected String eventTypeDescription;
    @XmlAttribute(name = "EventGroupName")
    protected String eventGroupName;
    @XmlAttribute(name = "EventClassDescription")
    protected String eventClassDescription;
    @XmlAttribute(name = "CustomNotificationMessage")
    protected String customNotificationMessage;
    @XmlAttribute(name = "IsEnabled", required = true)
    protected boolean isEnabled;
    @XmlAttribute(name = "NotificationListName")
    protected String notificationListName;
    @XmlAttribute(name = "NotificationScheduleName")
    protected String notificationScheduleName;
    @XmlAttribute(name = "TriggerType")
    protected String triggerType;
    @XmlAttribute(name = "Trigger")
    protected String trigger;
    @XmlAttribute(name = "Notes")
    protected String notes;

    /**
     * Gets the value of the eventTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTypeDescription() {
        return eventTypeDescription;
    }

    /**
     * Sets the value of the eventTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTypeDescription(String value) {
        this.eventTypeDescription = value;
    }

    /**
     * Gets the value of the eventGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventGroupName() {
        return eventGroupName;
    }

    /**
     * Sets the value of the eventGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventGroupName(String value) {
        this.eventGroupName = value;
    }

    /**
     * Gets the value of the eventClassDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventClassDescription() {
        return eventClassDescription;
    }

    /**
     * Sets the value of the eventClassDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventClassDescription(String value) {
        this.eventClassDescription = value;
    }

    /**
     * Gets the value of the customNotificationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomNotificationMessage() {
        return customNotificationMessage;
    }

    /**
     * Sets the value of the customNotificationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomNotificationMessage(String value) {
        this.customNotificationMessage = value;
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
     * Gets the value of the notificationListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationListName() {
        return notificationListName;
    }

    /**
     * Sets the value of the notificationListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationListName(String value) {
        this.notificationListName = value;
    }

    /**
     * Gets the value of the notificationScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationScheduleName() {
        return notificationScheduleName;
    }

    /**
     * Sets the value of the notificationScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationScheduleName(String value) {
        this.notificationScheduleName = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerType(String value) {
        this.triggerType = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
