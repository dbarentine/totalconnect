
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventClassInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventClassInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventClassID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventClassDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventTypeCollection" type="{https://services.alarmnet.com/TC2/}ArrayOfEventTypeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventClassInfo", propOrder = {
    "eventClassID",
    "eventClassDescription",
    "eventTypeCollection"
})
public class EventClassInfo {

    @XmlElement(name = "EventClassID")
    protected long eventClassID;
    @XmlElement(name = "EventClassDescription")
    protected String eventClassDescription;
    @XmlElement(name = "EventTypeCollection")
    protected ArrayOfEventTypeInfo eventTypeCollection;

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

    /**
     * Gets the value of the eventTypeCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventTypeInfo }
     *     
     */
    public ArrayOfEventTypeInfo getEventTypeCollection() {
        return eventTypeCollection;
    }

    /**
     * Sets the value of the eventTypeCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventTypeInfo }
     *     
     */
    public void setEventTypeCollection(ArrayOfEventTypeInfo value) {
        this.eventTypeCollection = value;
    }

}
