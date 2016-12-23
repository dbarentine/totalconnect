
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
 *         &lt;element name="GetRSIDeviceStatusResult" type="{https://services.alarmnet.com/TC2/}RSIDeviceStatusResults" minOccurs="0"/>
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
    "getRSIDeviceStatusResult"
})
@XmlRootElement(name = "GetRSIDeviceStatusResponse")
public class GetRSIDeviceStatusResponse {

    @XmlElement(name = "GetRSIDeviceStatusResult")
    protected RSIDeviceStatusResults getRSIDeviceStatusResult;

    /**
     * Gets the value of the getRSIDeviceStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link RSIDeviceStatusResults }
     *     
     */
    public RSIDeviceStatusResults getGetRSIDeviceStatusResult() {
        return getRSIDeviceStatusResult;
    }

    /**
     * Sets the value of the getRSIDeviceStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSIDeviceStatusResults }
     *     
     */
    public void setGetRSIDeviceStatusResult(RSIDeviceStatusResults value) {
        this.getRSIDeviceStatusResult = value;
    }

}
