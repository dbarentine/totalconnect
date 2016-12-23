
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
 *         &lt;element name="GetCameraPositionResult" type="{https://services.alarmnet.com/TC2/}CameraPositionResult" minOccurs="0"/>
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
    "getCameraPositionResult"
})
@XmlRootElement(name = "GetCameraPositionResponse")
public class GetCameraPositionResponse {

    @XmlElement(name = "GetCameraPositionResult")
    protected CameraPositionResult getCameraPositionResult;

    /**
     * Gets the value of the getCameraPositionResult property.
     * 
     * @return
     *     possible object is
     *     {@link CameraPositionResult }
     *     
     */
    public CameraPositionResult getGetCameraPositionResult() {
        return getCameraPositionResult;
    }

    /**
     * Sets the value of the getCameraPositionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraPositionResult }
     *     
     */
    public void setGetCameraPositionResult(CameraPositionResult value) {
        this.getCameraPositionResult = value;
    }

}
