
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventTypeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventTypeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventModifierCollection" type="{https://services.alarmnet.com/TC2/}ArrayOfEventModifierInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventTypeInfo", propOrder = {
    "eventTypeID",
    "eventTypeDescription",
    "eventModifierCollection"
})
public class EventTypeInfo {

    @XmlElement(name = "EventTypeID")
    protected long eventTypeID;
    @XmlElement(name = "EventTypeDescription")
    protected String eventTypeDescription;
    @XmlElement(name = "EventModifierCollection")
    protected ArrayOfEventModifierInfo eventModifierCollection;

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

}
