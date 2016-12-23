
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="Events" type="{https://services.alarmnet.com/TC2/}ArrayOfEventRecord" minOccurs="0"/>
 *         &lt;element name="HasMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsResult", propOrder = {
    "events",
    "hasMore"
})
public class EventsResult
    extends WebMethodResults
{

    @XmlElement(name = "Events")
    protected ArrayOfEventRecord events;
    @XmlElement(name = "HasMore")
    protected boolean hasMore;

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventRecord }
     *     
     */
    public ArrayOfEventRecord getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventRecord }
     *     
     */
    public void setEvents(ArrayOfEventRecord value) {
        this.events = value;
    }

    /**
     * Gets the value of the hasMore property.
     * 
     */
    public boolean isHasMore() {
        return hasMore;
    }

    /**
     * Sets the value of the hasMore property.
     * 
     */
    public void setHasMore(boolean value) {
        this.hasMore = value;
    }

}
