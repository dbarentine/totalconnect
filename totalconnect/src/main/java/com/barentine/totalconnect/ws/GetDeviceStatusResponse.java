
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
 *         &lt;element name="GetDeviceStatusResult" type="{https://services.alarmnet.com/TC2/}GetDeviceStatusResult" minOccurs="0"/>
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
    "getDeviceStatusResult"
})
@XmlRootElement(name = "GetDeviceStatusResponse")
public class GetDeviceStatusResponse {

    @XmlElement(name = "GetDeviceStatusResult")
    protected GetDeviceStatusResult getDeviceStatusResult;

    /**
     * Gets the value of the getDeviceStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetDeviceStatusResult }
     *     
     */
    public GetDeviceStatusResult getGetDeviceStatusResult() {
        return getDeviceStatusResult;
    }

    /**
     * Sets the value of the getDeviceStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDeviceStatusResult }
     *     
     */
    public void setGetDeviceStatusResult(GetDeviceStatusResult value) {
        this.getDeviceStatusResult = value;
    }

}
