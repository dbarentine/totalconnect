
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
 *         &lt;element name="GetWiFiLockLocationsResult" type="{https://services.alarmnet.com/TC2/}WiFiLockLocationsResults" minOccurs="0"/>
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
    "getWiFiLockLocationsResult"
})
@XmlRootElement(name = "GetWiFiLockLocationsResponse")
public class GetWiFiLockLocationsResponse {

    @XmlElement(name = "GetWiFiLockLocationsResult")
    protected WiFiLockLocationsResults getWiFiLockLocationsResult;

    /**
     * Gets the value of the getWiFiLockLocationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link WiFiLockLocationsResults }
     *     
     */
    public WiFiLockLocationsResults getGetWiFiLockLocationsResult() {
        return getWiFiLockLocationsResult;
    }

    /**
     * Sets the value of the getWiFiLockLocationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WiFiLockLocationsResults }
     *     
     */
    public void setGetWiFiLockLocationsResult(WiFiLockLocationsResults value) {
        this.getWiFiLockLocationsResult = value;
    }

}
