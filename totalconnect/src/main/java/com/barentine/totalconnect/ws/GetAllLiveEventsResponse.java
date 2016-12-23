
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
 *         &lt;element name="GetAllLiveEventsResult" type="{https://services.alarmnet.com/TC2/}EventsResult" minOccurs="0"/>
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
    "getAllLiveEventsResult"
})
@XmlRootElement(name = "GetAllLiveEventsResponse")
public class GetAllLiveEventsResponse {

    @XmlElement(name = "GetAllLiveEventsResult")
    protected EventsResult getAllLiveEventsResult;

    /**
     * Gets the value of the getAllLiveEventsResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventsResult }
     *     
     */
    public EventsResult getGetAllLiveEventsResult() {
        return getAllLiveEventsResult;
    }

    /**
     * Sets the value of the getAllLiveEventsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsResult }
     *     
     */
    public void setGetAllLiveEventsResult(EventsResult value) {
        this.getAllLiveEventsResult = value;
    }

}
