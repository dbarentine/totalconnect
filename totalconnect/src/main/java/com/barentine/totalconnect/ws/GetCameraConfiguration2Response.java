
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
 *         &lt;element name="GetCameraConfiguration2Result" type="{https://services.alarmnet.com/TC2/}CameraConfigurationResults2" minOccurs="0"/>
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
    "getCameraConfiguration2Result"
})
@XmlRootElement(name = "GetCameraConfiguration2Response")
public class GetCameraConfiguration2Response {

    @XmlElement(name = "GetCameraConfiguration2Result")
    protected CameraConfigurationResults2 getCameraConfiguration2Result;

    /**
     * Gets the value of the getCameraConfiguration2Result property.
     * 
     * @return
     *     possible object is
     *     {@link CameraConfigurationResults2 }
     *     
     */
    public CameraConfigurationResults2 getGetCameraConfiguration2Result() {
        return getCameraConfiguration2Result;
    }

    /**
     * Sets the value of the getCameraConfiguration2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraConfigurationResults2 }
     *     
     */
    public void setGetCameraConfiguration2Result(CameraConfigurationResults2 value) {
        this.getCameraConfiguration2Result = value;
    }

}
