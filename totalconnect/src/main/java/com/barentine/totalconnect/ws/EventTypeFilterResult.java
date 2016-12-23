
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventTypeFilterResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventTypeFilterResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="EventTypeFilters" type="{https://services.alarmnet.com/TC2/}ArrayOfFilterEventType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventTypeFilterResult", propOrder = {
    "eventTypeFilters"
})
public class EventTypeFilterResult
    extends WebMethodResults
{

    @XmlElement(name = "EventTypeFilters")
    protected ArrayOfFilterEventType eventTypeFilters;

    /**
     * Gets the value of the eventTypeFilters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFilterEventType }
     *     
     */
    public ArrayOfFilterEventType getEventTypeFilters() {
        return eventTypeFilters;
    }

    /**
     * Sets the value of the eventTypeFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFilterEventType }
     *     
     */
    public void setEventTypeFilters(ArrayOfFilterEventType value) {
        this.eventTypeFilters = value;
    }

}
