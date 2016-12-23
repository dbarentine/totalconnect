
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
 *         &lt;element name="GetLiveEventsResult" type="{https://services.alarmnet.com/TC2/}EventsResult" minOccurs="0"/>
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
    "getLiveEventsResult"
})
@XmlRootElement(name = "GetLiveEventsResponse")
public class GetLiveEventsResponse {

    @XmlElement(name = "GetLiveEventsResult")
    protected EventsResult getLiveEventsResult;

    /**
     * Gets the value of the getLiveEventsResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventsResult }
     *     
     */
    public EventsResult getGetLiveEventsResult() {
        return getLiveEventsResult;
    }

    /**
     * Sets the value of the getLiveEventsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsResult }
     *     
     */
    public void setGetLiveEventsResult(EventsResult value) {
        this.getLiveEventsResult = value;
    }

}
