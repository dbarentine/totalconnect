
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEventSummaryConfigured complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEventSummaryConfigured">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventSummaryConfigured" type="{https://services.alarmnet.com/TC2/}EventSummaryConfigured" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEventSummaryConfigured", propOrder = {
    "eventSummaryConfigured"
})
public class ArrayOfEventSummaryConfigured {

    @XmlElement(name = "EventSummaryConfigured", nillable = true)
    protected List<EventSummaryConfigured> eventSummaryConfigured;

    /**
     * Gets the value of the eventSummaryConfigured property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventSummaryConfigured property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventSummaryConfigured().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventSummaryConfigured }
     * 
     * 
     */
    public List<EventSummaryConfigured> getEventSummaryConfigured() {
        if (eventSummaryConfigured == null) {
            eventSummaryConfigured = new ArrayList<EventSummaryConfigured>();
        }
        return this.eventSummaryConfigured;
    }

}
