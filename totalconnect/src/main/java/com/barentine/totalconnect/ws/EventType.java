
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventModifierCollection" type="{https://services.alarmnet.com/TC2/}ArrayOfEventModifierInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EventTypeID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="EventGroupID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="EventTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EventTypeCapabilities" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", propOrder = {
    "eventModifierCollection"
})
public class EventType {

    @XmlElement(name = "EventModifierCollection")
    protected ArrayOfEventModifierInfo eventModifierCollection;
    @XmlAttribute(name = "EventTypeID", required = true)
    protected long eventTypeID;
    @XmlAttribute(name = "EventGroupID", required = true)
    protected long eventGroupID;
    @XmlAttribute(name = "EventTypeDescription")
    protected String eventTypeDescription;
    @XmlAttribute(name = "EventTypeCapabilities", required = true)
    protected long eventTypeCapabilities;

    /**
     * Gets the value of the eventModifierCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventModifierInfo }
     *     
     */
    public ArrayOfEventModifierInfo getEventModifierCollection() {
        return eventModifierCollection;
    }

    /**
     * Sets the value of the eventModifierCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventModifierInfo }
     *     
     */
    public void setEventModifierCollection(ArrayOfEventModifierInfo value) {
        this.eventModifierCollection = value;
    }

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
     * Gets the value of the eventGroupID property.
     * 
     */
    public long getEventGroupID() {
        return eventGroupID;
    }

    /**
     * Sets the value of the eventGroupID property.
     * 
     */
    public void setEventGroupID(long value) {
        this.eventGroupID = value;
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
     * Gets the value of the eventTypeCapabilities property.
     * 
     */
    public long getEventTypeCapabilities() {
        return eventTypeCapabilities;
    }

    /**
     * Sets the value of the eventTypeCapabilities property.
     * 
     */
    public void setEventTypeCapabilities(long value) {
        this.eventTypeCapabilities = value;
    }

}
