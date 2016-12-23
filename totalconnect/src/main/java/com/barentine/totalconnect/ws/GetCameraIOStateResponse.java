
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
 *         &lt;element name="GetCameraIOStateResult" type="{https://services.alarmnet.com/TC2/}CameraIOStateResult" minOccurs="0"/>
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
    "getCameraIOStateResult"
})
@XmlRootElement(name = "GetCameraIOStateResponse")
public class GetCameraIOStateResponse {

    @XmlElement(name = "GetCameraIOStateResult")
    protected CameraIOStateResult getCameraIOStateResult;

    /**
     * Gets the value of the getCameraIOStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link CameraIOStateResult }
     *     
     */
    public CameraIOStateResult getGetCameraIOStateResult() {
        return getCameraIOStateResult;
    }

    /**
     * Sets the value of the getCameraIOStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraIOStateResult }
     *     
     */
    public void setGetCameraIOStateResult(CameraIOStateResult value) {
        this.getCameraIOStateResult = value;
    }

}
