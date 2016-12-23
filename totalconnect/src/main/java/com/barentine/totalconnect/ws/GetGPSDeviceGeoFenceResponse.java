
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
 *         &lt;element name="GetGPSDeviceGeoFenceResult" type="{https://services.alarmnet.com/TC2/}GPSDeviceGeoFenceResult" minOccurs="0"/>
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
    "getGPSDeviceGeoFenceResult"
})
@XmlRootElement(name = "GetGPSDeviceGeoFenceResponse")
public class GetGPSDeviceGeoFenceResponse {

    @XmlElement(name = "GetGPSDeviceGeoFenceResult")
    protected GPSDeviceGeoFenceResult getGPSDeviceGeoFenceResult;

    /**
     * Gets the value of the getGPSDeviceGeoFenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link GPSDeviceGeoFenceResult }
     *     
     */
    public GPSDeviceGeoFenceResult getGetGPSDeviceGeoFenceResult() {
        return getGPSDeviceGeoFenceResult;
    }

    /**
     * Sets the value of the getGPSDeviceGeoFenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPSDeviceGeoFenceResult }
     *     
     */
    public void setGetGPSDeviceGeoFenceResult(GPSDeviceGeoFenceResult value) {
        this.getGPSDeviceGeoFenceResult = value;
    }

}
