
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraFirmwareList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraFirmwareList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirmwareCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CameraFirmwares" type="{https://services.alarmnet.com/TC2/}ArrayOfCameraFirmwareInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraFirmwareList", propOrder = {
    "firmwareCount",
    "cameraFirmwares"
})
public class CameraFirmwareList {

    @XmlElement(name = "FirmwareCount")
    protected int firmwareCount;
    @XmlElement(name = "CameraFirmwares")
    protected ArrayOfCameraFirmwareInfo cameraFirmwares;

    /**
     * Gets the value of the firmwareCount property.
     * 
     */
    public int getFirmwareCount() {
        return firmwareCount;
    }

    /**
     * Sets the value of the firmwareCount property.
     * 
     */
    public void setFirmwareCount(int value) {
        this.firmwareCount = value;
    }

    /**
     * Gets the value of the cameraFirmwares property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCameraFirmwareInfo }
     *     
     */
    public ArrayOfCameraFirmwareInfo getCameraFirmwares() {
        return cameraFirmwares;
    }

    /**
     * Sets the value of the cameraFirmwares property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCameraFirmwareInfo }
     *     
     */
    public void setCameraFirmwares(ArrayOfCameraFirmwareInfo value) {
        this.cameraFirmwares = value;
    }

}
