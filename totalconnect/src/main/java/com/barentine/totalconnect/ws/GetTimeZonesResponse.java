
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
 *         &lt;element name="GetTimeZonesResult" type="{https://services.alarmnet.com/TC2/}TimeZonesResult" minOccurs="0"/>
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
    "getTimeZonesResult"
})
@XmlRootElement(name = "GetTimeZonesResponse")
public class GetTimeZonesResponse {

    @XmlElement(name = "GetTimeZonesResult")
    protected TimeZonesResult getTimeZonesResult;

    /**
     * Gets the value of the getTimeZonesResult property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZonesResult }
     *     
     */
    public TimeZonesResult getGetTimeZonesResult() {
        return getTimeZonesResult;
    }

    /**
     * Sets the value of the getTimeZonesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZonesResult }
     *     
     */
    public void setGetTimeZonesResult(TimeZonesResult value) {
        this.getTimeZonesResult = value;
    }

}
