
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
 *         &lt;element name="GetWiFiLocationsResult" type="{https://services.alarmnet.com/TC2/}WiFiLocationsResults" minOccurs="0"/>
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
    "getWiFiLocationsResult"
})
@XmlRootElement(name = "GetWiFiLocationsResponse")
public class GetWiFiLocationsResponse {

    @XmlElement(name = "GetWiFiLocationsResult")
    protected WiFiLocationsResults getWiFiLocationsResult;

    /**
     * Gets the value of the getWiFiLocationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link WiFiLocationsResults }
     *     
     */
    public WiFiLocationsResults getGetWiFiLocationsResult() {
        return getWiFiLocationsResult;
    }

    /**
     * Sets the value of the getWiFiLocationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WiFiLocationsResults }
     *     
     */
    public void setGetWiFiLocationsResult(WiFiLocationsResults value) {
        this.getWiFiLocationsResult = value;
    }

}
