
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CameraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeatureFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultCamera" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraInfo", propOrder = {
    "mac",
    "cameraName",
    "featureFlags",
    "defaultCamera"
})
public class CameraInfo {

    @XmlElement(name = "MAC")
    protected String mac;
    @XmlElement(name = "CameraName")
    protected String cameraName;
    @XmlElement(name = "FeatureFlags")
    protected String featureFlags;
    @XmlElement(name = "DefaultCamera")
    @XmlSchemaType(name = "unsignedByte")
    protected short defaultCamera;

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAC() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAC(String value) {
        this.mac = value;
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
     * Gets the value of the featureFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureFlags() {
        return featureFlags;
    }

    /**
     * Sets the value of the featureFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureFlags(String value) {
        this.featureFlags = value;
    }

    /**
     * Gets the value of the defaultCamera property.
     * 
     */
    public short getDefaultCamera() {
        return defaultCamera;
    }

    /**
     * Sets the value of the defaultCamera property.
     * 
     */
    public void setDefaultCamera(short value) {
        this.defaultCamera = value;
    }

}
