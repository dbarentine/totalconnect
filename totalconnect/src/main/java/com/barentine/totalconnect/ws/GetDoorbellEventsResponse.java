
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
 *         &lt;element name="GetDoorbellEventsResult" type="{https://services.alarmnet.com/TC2/}DoorbellEventsResult" minOccurs="0"/>
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
    "getDoorbellEventsResult"
})
@XmlRootElement(name = "GetDoorbellEventsResponse")
public class GetDoorbellEventsResponse {

    @XmlElement(name = "GetDoorbellEventsResult")
    protected DoorbellEventsResult getDoorbellEventsResult;

    /**
     * Gets the value of the getDoorbellEventsResult property.
     * 
     * @return
     *     possible object is
     *     {@link DoorbellEventsResult }
     *     
     */
    public DoorbellEventsResult getGetDoorbellEventsResult() {
        return getDoorbellEventsResult;
    }

    /**
     * Sets the value of the getDoorbellEventsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorbellEventsResult }
     *     
     */
    public void setGetDoorbellEventsResult(DoorbellEventsResult value) {
        this.getDoorbellEventsResult = value;
    }

}
