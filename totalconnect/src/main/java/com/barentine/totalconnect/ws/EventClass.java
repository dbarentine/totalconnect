
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventGroupList" type="{https://services.alarmnet.com/TC2/}ArrayOfEventGroup" minOccurs="0"/>
 *         &lt;element name="EventTypeCollection" type="{https://services.alarmnet.com/TC2/}ArrayOfEventType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EventClassID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="EventClassDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventClass", propOrder = {
    "eventGroupList",
    "eventTypeCollection"
})
public class EventClass {

    @XmlElement(name = "EventGroupList")
    protected ArrayOfEventGroup eventGroupList;
    @XmlElement(name = "EventTypeCollection")
    protected ArrayOfEventType eventTypeCollection;
    @XmlAttribute(name = "EventClassID", required = true)
    protected long eventClassID;
    @XmlAttribute(name = "EventClassDescription")
    protected String eventClassDescription;

    /**
     * Gets the value of the eventGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventGroup }
     *     
     */
    public ArrayOfEventGroup getEventGroupList() {
        return eventGroupList;
    }

    /**
     * Sets the value of the eventGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventGroup }
     *     
     */
    public void setEventGroupList(ArrayOfEventGroup value) {
        this.eventGroupList = value;
    }

    /**
     * Gets the value of the eventTypeCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventType }
     *     
     */
    public ArrayOfEventType getEventTypeCollection() {
        return eventTypeCollection;
    }

    /**
     * Sets the value of the eventTypeCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventType }
     *     
     */
    public void setEventTypeCollection(ArrayOfEventType value) {
        this.eventTypeCollection = value;
    }

    /**
     * Gets the value of the eventClassID property.
     * 
     */
    public long getEventClassID() {
        return eventClassID;
    }

    /**
     * Sets the value of the eventClassID property.
     * 
     */
    public void setEventClassID(long value) {
        this.eventClassID = value;
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

}
