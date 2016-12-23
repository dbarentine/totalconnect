
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventTypeFilterId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventTypeFilterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventClass" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterEventType", propOrder = {
    "eventTypeFilterId",
    "eventTypeFilterName",
    "eventClass"
})
public class FilterEventType {

    @XmlElement(name = "EventTypeFilterId")
    protected long eventTypeFilterId;
    @XmlElement(name = "EventTypeFilterName")
    protected String eventTypeFilterName;
    @XmlElement(name = "EventClass")
    protected long eventClass;

    /**
     * Gets the value of the eventTypeFilterId property.
     * 
     */
    public long getEventTypeFilterId() {
        return eventTypeFilterId;
    }

    /**
     * Sets the value of the eventTypeFilterId property.
     * 
     */
    public void setEventTypeFilterId(long value) {
        this.eventTypeFilterId = value;
    }

    /**
     * Gets the value of the eventTypeFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTypeFilterName() {
        return eventTypeFilterName;
    }

    /**
     * Sets the value of the eventTypeFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTypeFilterName(String value) {
        this.eventTypeFilterName = value;
    }

    /**
     * Gets the value of the eventClass property.
     * 
     */
    public long getEventClass() {
        return eventClass;
    }

    /**
     * Sets the value of the eventClass property.
     * 
     */
    public void setEventClass(long value) {
        this.eventClass = value;
    }

}
