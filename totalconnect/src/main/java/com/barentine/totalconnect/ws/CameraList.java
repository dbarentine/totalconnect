
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CameraCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cameras" type="{https://services.alarmnet.com/TC2/}ArrayOfCameraInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraList", propOrder = {
    "cameraCount",
    "cameras"
})
public class CameraList {

    @XmlElement(name = "CameraCount")
    protected int cameraCount;
    @XmlElement(name = "Cameras")
    protected ArrayOfCameraInfo cameras;

    /**
     * Gets the value of the cameraCount property.
     * 
     */
    public int getCameraCount() {
        return cameraCount;
    }

    /**
     * Sets the value of the cameraCount property.
     * 
     */
    public void setCameraCount(int value) {
        this.cameraCount = value;
    }

    /**
     * Gets the value of the cameras property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCameraInfo }
     *     
     */
    public ArrayOfCameraInfo getCameras() {
        return cameras;
    }

    /**
     * Sets the value of the cameras property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCameraInfo }
     *     
     */
    public void setCameras(ArrayOfCameraInfo value) {
        this.cameras = value;
    }

}
