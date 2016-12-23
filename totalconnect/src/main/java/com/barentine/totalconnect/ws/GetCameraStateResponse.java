
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
 *         &lt;element name="GetCameraStateResult" type="{https://services.alarmnet.com/TC2/}CameraStateResult" minOccurs="0"/>
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
    "getCameraStateResult"
})
@XmlRootElement(name = "GetCameraStateResponse")
public class GetCameraStateResponse {

    @XmlElement(name = "GetCameraStateResult")
    protected CameraStateResult getCameraStateResult;

    /**
     * Gets the value of the getCameraStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link CameraStateResult }
     *     
     */
    public CameraStateResult getGetCameraStateResult() {
        return getCameraStateResult;
    }

    /**
     * Sets the value of the getCameraStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraStateResult }
     *     
     */
    public void setGetCameraStateResult(CameraStateResult value) {
        this.getCameraStateResult = value;
    }

}
