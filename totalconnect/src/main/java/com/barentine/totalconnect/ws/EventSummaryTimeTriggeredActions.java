
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventSummaryTimeTriggeredActions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventSummaryTimeTriggeredActions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EventGroupName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EventTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SceneName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TriggerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventSummaryTimeTriggeredActions", propOrder = {
    "notes"
})
public class EventSummaryTimeTriggeredActions {

    @XmlElement(name = "Notes")
    protected String notes;
    @XmlAttribute(name = "EventGroupName")
    protected String eventGroupName;
    @XmlAttribute(name = "EventTypeDescription")
    protected String eventTypeDescription;
    @XmlAttribute(name = "SceneName")
    protected String sceneName;
    @XmlAttribute(name = "TriggerType")
    protected String triggerType;

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
     * Gets the value of the sceneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceneName() {
        return sceneName;
    }

    /**
     * Sets the value of the sceneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceneName(String value) {
        this.sceneName = value;
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

}
