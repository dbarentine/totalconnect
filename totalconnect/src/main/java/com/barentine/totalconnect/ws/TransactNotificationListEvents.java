
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SentToPanelEvents" type="{https://services.alarmnet.com/TC2/}ArrayOfSentToPanelEvents" minOccurs="0"/>
 *         &lt;element name="EventNotifications" type="{https://services.alarmnet.com/TC2/}ArrayOfEventNotification" minOccurs="0"/>
 *         &lt;element name="SceneTriggers" type="{https://services.alarmnet.com/TC2/}ArrayOfSceneTrigger" minOccurs="0"/>
 *         &lt;element name="VideoTriggers" type="{https://services.alarmnet.com/TC2/}ArrayOfVideoTrigger" minOccurs="0"/>
 *         &lt;element name="TimeTriggeredActions" type="{https://services.alarmnet.com/TC2/}ArrayOfTimeTriggeredAction" minOccurs="0"/>
 *         &lt;element name="AdditionalInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionID",
    "locationID",
    "sentToPanelEvents",
    "eventNotifications",
    "sceneTriggers",
    "videoTriggers",
    "timeTriggeredActions",
    "additionalInput"
})
@XmlRootElement(name = "TransactNotificationListEvents")
public class TransactNotificationListEvents {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "SentToPanelEvents")
    protected ArrayOfSentToPanelEvents sentToPanelEvents;
    @XmlElement(name = "EventNotifications")
    protected ArrayOfEventNotification eventNotifications;
    @XmlElement(name = "SceneTriggers")
    protected ArrayOfSceneTrigger sceneTriggers;
    @XmlElement(name = "VideoTriggers")
    protected ArrayOfVideoTrigger videoTriggers;
    @XmlElement(name = "TimeTriggeredActions")
    protected ArrayOfTimeTriggeredAction timeTriggeredActions;
    @XmlElement(name = "AdditionalInput")
    protected String additionalInput;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     */
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(long value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the sentToPanelEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSentToPanelEvents }
     *     
     */
    public ArrayOfSentToPanelEvents getSentToPanelEvents() {
        return sentToPanelEvents;
    }

    /**
     * Sets the value of the sentToPanelEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSentToPanelEvents }
     *     
     */
    public void setSentToPanelEvents(ArrayOfSentToPanelEvents value) {
        this.sentToPanelEvents = value;
    }

    /**
     * Gets the value of the eventNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventNotification }
     *     
     */
    public ArrayOfEventNotification getEventNotifications() {
        return eventNotifications;
    }

    /**
     * Sets the value of the eventNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventNotification }
     *     
     */
    public void setEventNotifications(ArrayOfEventNotification value) {
        this.eventNotifications = value;
    }

    /**
     * Gets the value of the sceneTriggers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSceneTrigger }
     *     
     */
    public ArrayOfSceneTrigger getSceneTriggers() {
        return sceneTriggers;
    }

    /**
     * Sets the value of the sceneTriggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSceneTrigger }
     *     
     */
    public void setSceneTriggers(ArrayOfSceneTrigger value) {
        this.sceneTriggers = value;
    }

    /**
     * Gets the value of the videoTriggers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoTrigger }
     *     
     */
    public ArrayOfVideoTrigger getVideoTriggers() {
        return videoTriggers;
    }

    /**
     * Sets the value of the videoTriggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoTrigger }
     *     
     */
    public void setVideoTriggers(ArrayOfVideoTrigger value) {
        this.videoTriggers = value;
    }

    /**
     * Gets the value of the timeTriggeredActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeTriggeredAction }
     *     
     */
    public ArrayOfTimeTriggeredAction getTimeTriggeredActions() {
        return timeTriggeredActions;
    }

    /**
     * Sets the value of the timeTriggeredActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeTriggeredAction }
     *     
     */
    public void setTimeTriggeredActions(ArrayOfTimeTriggeredAction value) {
        this.timeTriggeredActions = value;
    }

    /**
     * Gets the value of the additionalInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInput() {
        return additionalInput;
    }

    /**
     * Sets the value of the additionalInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInput(String value) {
        this.additionalInput = value;
    }

}
