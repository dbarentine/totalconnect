
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraSimple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CameraDeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CameraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraSimple", propOrder = {
    "cameraDeviceID",
    "cameraName"
})
public class CameraSimple {

    @XmlElement(name = "CameraDeviceID")
    protected long cameraDeviceID;
    @XmlElement(name = "CameraName")
    protected String cameraName;

    /**
     * Gets the value of the cameraDeviceID property.
     * 
     */
    public long getCameraDeviceID() {
        return cameraDeviceID;
    }

    /**
     * Sets the value of the cameraDeviceID property.
     * 
     */
    public void setCameraDeviceID(long value) {
        this.cameraDeviceID = value;
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

}
