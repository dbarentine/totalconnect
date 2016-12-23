
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
 *         &lt;element name="GetLocationCameraListResult" type="{https://services.alarmnet.com/TC2/}CameraListResult" minOccurs="0"/>
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
    "getLocationCameraListResult"
})
@XmlRootElement(name = "GetLocationCameraListResponse")
public class GetLocationCameraListResponse {

    @XmlElement(name = "GetLocationCameraListResult")
    protected CameraListResult getLocationCameraListResult;

    /**
     * Gets the value of the getLocationCameraListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CameraListResult }
     *     
     */
    public CameraListResult getGetLocationCameraListResult() {
        return getLocationCameraListResult;
    }

    /**
     * Sets the value of the getLocationCameraListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraListResult }
     *     
     */
    public void setGetLocationCameraListResult(CameraListResult value) {
        this.getLocationCameraListResult = value;
    }

}
