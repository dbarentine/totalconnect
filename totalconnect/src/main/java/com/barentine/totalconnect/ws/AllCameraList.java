
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllCameraList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllCameraList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CameraList" type="{https://services.alarmnet.com/TC2/}CameraList" minOccurs="0"/>
 *         &lt;element name="RSICameraList" type="{https://services.alarmnet.com/TC2/}RSICameraList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllCameraList", propOrder = {
    "cameraList",
    "rsiCameraList"
})
public class AllCameraList {

    @XmlElement(name = "CameraList")
    protected CameraList cameraList;
    @XmlElement(name = "RSICameraList")
    protected RSICameraList rsiCameraList;

    /**
     * Gets the value of the cameraList property.
     * 
     * @return
     *     possible object is
     *     {@link CameraList }
     *     
     */
    public CameraList getCameraList() {
        return cameraList;
    }

    /**
     * Sets the value of the cameraList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraList }
     *     
     */
    public void setCameraList(CameraList value) {
        this.cameraList = value;
    }

    /**
     * Gets the value of the rsiCameraList property.
     * 
     * @return
     *     possible object is
     *     {@link RSICameraList }
     *     
     */
    public RSICameraList getRSICameraList() {
        return rsiCameraList;
    }

    /**
     * Sets the value of the rsiCameraList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSICameraList }
     *     
     */
    public void setRSICameraList(RSICameraList value) {
        this.rsiCameraList = value;
    }

}
