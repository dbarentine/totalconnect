
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSIDeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSIDeviceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CameraIndex" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CameraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CameraType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSIDeviceInfo", propOrder = {
    "cameraIndex",
    "cameraName",
    "cameraType"
})
public class RSIDeviceInfo {

    @XmlElement(name = "CameraIndex")
    protected short cameraIndex;
    @XmlElement(name = "CameraName")
    protected String cameraName;
    @XmlElement(name = "CameraType")
    protected short cameraType;

    /**
     * Gets the value of the cameraIndex property.
     * 
     */
    public short getCameraIndex() {
        return cameraIndex;
    }

    /**
     * Sets the value of the cameraIndex property.
     * 
     */
    public void setCameraIndex(short value) {
        this.cameraIndex = value;
    }

    /**
     * Gets the value of the cameraName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraName() {
        return cameraName;
    }

    /**
     * Sets the value of the cameraName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraName(String value) {
        this.cameraName = value;
    }

    /**
     * Gets the value of the cameraType property.
     * 
     */
    public short getCameraType() {
        return cameraType;
    }

    /**
     * Sets the value of the cameraType property.
     * 
     */
    public void setCameraType(short value) {
        this.cameraType = value;
    }

}
