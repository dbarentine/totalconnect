
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
 *         &lt;element name="GetTimeZonesForCameraResult" type="{https://services.alarmnet.com/TC2/}TimeZonesResult" minOccurs="0"/>
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
    "getTimeZonesForCameraResult"
})
@XmlRootElement(name = "GetTimeZonesForCameraResponse")
public class GetTimeZonesForCameraResponse {

    @XmlElement(name = "GetTimeZonesForCameraResult")
    protected TimeZonesResult getTimeZonesForCameraResult;

    /**
     * Gets the value of the getTimeZonesForCameraResult property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZonesResult }
     *     
     */
    public TimeZonesResult getGetTimeZonesForCameraResult() {
        return getTimeZonesForCameraResult;
    }

    /**
     * Sets the value of the getTimeZonesForCameraResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZonesResult }
     *     
     */
    public void setGetTimeZonesForCameraResult(TimeZonesResult value) {
        this.getTimeZonesForCameraResult = value;
    }

}
