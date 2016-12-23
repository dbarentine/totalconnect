
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryConfiguredEventXML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryConfiguredEventXML">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="EventSummaryTitle" type="{https://services.alarmnet.com/TC2/}EventSummaryTitle" minOccurs="0"/>
 *         &lt;element name="SummaryEvents" type="{https://services.alarmnet.com/TC2/}ArrayOfEventSummaryConfigured" minOccurs="0"/>
 *         &lt;element name="SummaryTTEvents" type="{https://services.alarmnet.com/TC2/}ArrayOfEventSummaryTimeTriggeredActions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryConfiguredEventXML", propOrder = {
    "eventSummaryTitle",
    "summaryEvents",
    "summaryTTEvents"
})
public class SummaryConfiguredEventXML
    extends WebMethodResults
{

    @XmlElement(name = "EventSummaryTitle")
    protected EventSummaryTitle eventSummaryTitle;
    @XmlElement(name = "SummaryEvents")
    protected ArrayOfEventSummaryConfigured summaryEvents;
    @XmlElement(name = "SummaryTTEvents")
    protected ArrayOfEventSummaryTimeTriggeredActions summaryTTEvents;

    /**
     * Gets the value of the eventSummaryTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EventSummaryTitle }
     *     
     */
    public EventSummaryTitle getEventSummaryTitle() {
        return eventSummaryTitle;
    }

    /**
     * Sets the value of the eventSummaryTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSummaryTitle }
     *     
     */
    public void setEventSummaryTitle(EventSummaryTitle value) {
        this.eventSummaryTitle = value;
    }

    /**
     * Gets the value of the summaryEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventSummaryConfigured }
     *     
     */
    public ArrayOfEventSummaryConfigured getSummaryEvents() {
        return summaryEvents;
    }

    /**
     * Sets the value of the summaryEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventSummaryConfigured }
     *     
     */
    public void setSummaryEvents(ArrayOfEventSummaryConfigured value) {
        this.summaryEvents = value;
    }

    /**
     * Gets the value of the summaryTTEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventSummaryTimeTriggeredActions }
     *     
     */
    public ArrayOfEventSummaryTimeTriggeredActions getSummaryTTEvents() {
        return summaryTTEvents;
    }

    /**
     * Sets the value of the summaryTTEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventSummaryTimeTriggeredActions }
     *     
     */
    public void setSummaryTTEvents(ArrayOfEventSummaryTimeTriggeredActions value) {
        this.summaryTTEvents = value;
    }

}
