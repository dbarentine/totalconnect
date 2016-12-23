
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
 *         &lt;element name="GetCameraConfigurationResult" type="{https://services.alarmnet.com/TC2/}CameraConfigurationResults" minOccurs="0"/>
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
    "getCameraConfigurationResult"
})
@XmlRootElement(name = "GetCameraConfigurationResponse")
public class GetCameraConfigurationResponse {

    @XmlElement(name = "GetCameraConfigurationResult")
    protected CameraConfigurationResults getCameraConfigurationResult;

    /**
     * Gets the value of the getCameraConfigurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link CameraConfigurationResults }
     *     
     */
    public CameraConfigurationResults getGetCameraConfigurationResult() {
        return getCameraConfigurationResult;
    }

    /**
     * Sets the value of the getCameraConfigurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraConfigurationResults }
     *     
     */
    public void setGetCameraConfigurationResult(CameraConfigurationResults value) {
        this.getCameraConfigurationResult = value;
    }

}
