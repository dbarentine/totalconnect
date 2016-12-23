
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
 *         &lt;element name="GetEventsExResult" type="{https://services.alarmnet.com/TC2/}EventsResult" minOccurs="0"/>
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
    "getEventsExResult"
})
@XmlRootElement(name = "GetEventsExResponse")
public class GetEventsExResponse {

    @XmlElement(name = "GetEventsExResult")
    protected EventsResult getEventsExResult;

    /**
     * Gets the value of the getEventsExResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventsResult }
     *     
     */
    public EventsResult getGetEventsExResult() {
        return getEventsExResult;
    }

    /**
     * Sets the value of the getEventsExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsResult }
     *     
     */
    public void setGetEventsExResult(EventsResult value) {
        this.getEventsExResult = value;
    }

}
