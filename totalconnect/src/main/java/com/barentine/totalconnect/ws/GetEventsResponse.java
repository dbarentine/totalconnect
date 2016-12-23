
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
 *         &lt;element name="GetEventsResult" type="{https://services.alarmnet.com/TC2/}EventsResult" minOccurs="0"/>
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
    "getEventsResult"
})
@XmlRootElement(name = "GetEventsResponse")
public class GetEventsResponse {

    @XmlElement(name = "GetEventsResult")
    protected EventsResult getEventsResult;

    /**
     * Gets the value of the getEventsResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventsResult }
     *     
     */
    public EventsResult getGetEventsResult() {
        return getEventsResult;
    }

    /**
     * Sets the value of the getEventsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsResult }
     *     
     */
    public void setGetEventsResult(EventsResult value) {
        this.getEventsResult = value;
    }

}
