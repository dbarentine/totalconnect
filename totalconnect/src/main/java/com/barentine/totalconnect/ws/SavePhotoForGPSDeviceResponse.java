
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
 *         &lt;element name="SavePhotoForGPSDeviceResult" type="{https://services.alarmnet.com/TC2/}PhotoURLResult" minOccurs="0"/>
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
    "savePhotoForGPSDeviceResult"
})
@XmlRootElement(name = "SavePhotoForGPSDeviceResponse")
public class SavePhotoForGPSDeviceResponse {

    @XmlElement(name = "SavePhotoForGPSDeviceResult")
    protected PhotoURLResult savePhotoForGPSDeviceResult;

    /**
     * Gets the value of the savePhotoForGPSDeviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link PhotoURLResult }
     *     
     */
    public PhotoURLResult getSavePhotoForGPSDeviceResult() {
        return savePhotoForGPSDeviceResult;
    }

    /**
     * Sets the value of the savePhotoForGPSDeviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoURLResult }
     *     
     */
    public void setSavePhotoForGPSDeviceResult(PhotoURLResult value) {
        this.savePhotoForGPSDeviceResult = value;
    }

}
