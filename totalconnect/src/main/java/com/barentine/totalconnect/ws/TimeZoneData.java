
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZoneData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeZoneData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeZoneID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TimeZoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CameraTimeZoneID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsDSTSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZoneData", propOrder = {
    "timeZoneID",
    "timeZoneName",
    "cameraTimeZoneID",
    "isDSTSupported"
})
public class TimeZoneData {

    @XmlElement(name = "TimeZoneID")
    protected int timeZoneID;
    @XmlElement(name = "TimeZoneName")
    protected String timeZoneName;
    @XmlElement(name = "CameraTimeZoneID")
    protected int cameraTimeZoneID;
    @XmlElement(name = "IsDSTSupported")
    protected boolean isDSTSupported;

    /**
     * Gets the value of the timeZoneID property.
     * 
     */
    public int getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     */
    public void setTimeZoneID(int value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the timeZoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Sets the value of the timeZoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneName(String value) {
        this.timeZoneName = value;
    }

    /**
     * Gets the value of the cameraTimeZoneID property.
     * 
     */
    public int getCameraTimeZoneID() {
        return cameraTimeZoneID;
    }

    /**
     * Sets the value of the cameraTimeZoneID property.
     * 
     */
    public void setCameraTimeZoneID(int value) {
        this.cameraTimeZoneID = value;
    }

    /**
     * Gets the value of the isDSTSupported property.
     * 
     */
    public boolean isIsDSTSupported() {
        return isDSTSupported;
    }

    /**
     * Sets the value of the isDSTSupported property.
     * 
     */
    public void setIsDSTSupported(boolean value) {
        this.isDSTSupported = value;
    }

}
