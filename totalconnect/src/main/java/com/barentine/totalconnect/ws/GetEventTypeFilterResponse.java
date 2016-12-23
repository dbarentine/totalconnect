
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
 *         &lt;element name="GetEventTypeFilterResult" type="{https://services.alarmnet.com/TC2/}EventTypeFilterResult" minOccurs="0"/>
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
    "getEventTypeFilterResult"
})
@XmlRootElement(name = "GetEventTypeFilterResponse")
public class GetEventTypeFilterResponse {

    @XmlElement(name = "GetEventTypeFilterResult")
    protected EventTypeFilterResult getEventTypeFilterResult;

    /**
     * Gets the value of the getEventTypeFilterResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventTypeFilterResult }
     *     
     */
    public EventTypeFilterResult getGetEventTypeFilterResult() {
        return getEventTypeFilterResult;
    }

    /**
     * Sets the value of the getEventTypeFilterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTypeFilterResult }
     *     
     */
    public void setGetEventTypeFilterResult(EventTypeFilterResult value) {
        this.getEventTypeFilterResult = value;
    }

}
