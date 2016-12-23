
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSIVideoURLInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSIVideoURLInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RSIEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RSIDeviceIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RSIAlarmID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VideoLoadPercentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RSIVideoResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RSIDeviceStatusEvent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSIVideoURLInfo", propOrder = {
    "videoURI",
    "rsiEventID",
    "rsiDeviceIndex",
    "rsiAlarmID",
    "videoLoadPercentage",
    "rsiVideoResult",
    "rsiDeviceStatusEvent"
})
public class RSIVideoURLInfo {

    @XmlElement(name = "VideoURI")
    protected String videoURI;
    @XmlElement(name = "RSIEventID")
    protected String rsiEventID;
    @XmlElement(name = "RSIDeviceIndex")
    protected int rsiDeviceIndex;
    @XmlElement(name = "RSIAlarmID")
    protected String rsiAlarmID;
    @XmlElement(name = "VideoLoadPercentage")
    protected int videoLoadPercentage;
    @XmlElement(name = "RSIVideoResult")
    protected int rsiVideoResult;
    @XmlElement(name = "RSIDeviceStatusEvent")
    protected int rsiDeviceStatusEvent;

    /**
     * Gets the value of the videoURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoURI() {
        return videoURI;
    }

    /**
     * Sets the value of the videoURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoURI(String value) {
        this.videoURI = value;
    }

    /**
     * Gets the value of the rsiEventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSIEventID() {
        return rsiEventID;
    }

    /**
     * Sets the value of the rsiEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSIEventID(String value) {
        this.rsiEventID = value;
    }

    /**
     * Gets the value of the rsiDeviceIndex property.
     * 
     */
    public int getRSIDeviceIndex() {
        return rsiDeviceIndex;
    }

    /**
     * Sets the value of the rsiDeviceIndex property.
     * 
     */
    public void setRSIDeviceIndex(int value) {
        this.rsiDeviceIndex = value;
    }

    /**
     * Gets the value of the rsiAlarmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSIAlarmID() {
        return rsiAlarmID;
    }

    /**
     * Sets the value of the rsiAlarmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSIAlarmID(String value) {
        this.rsiAlarmID = value;
    }

    /**
     * Gets the value of the videoLoadPercentage property.
     * 
     */
    public int getVideoLoadPercentage() {
        return videoLoadPercentage;
    }

    /**
     * Sets the value of the videoLoadPercentage property.
     * 
     */
    public void setVideoLoadPercentage(int value) {
        this.videoLoadPercentage = value;
    }

    /**
     * Gets the value of the rsiVideoResult property.
     * 
     */
    public int getRSIVideoResult() {
        return rsiVideoResult;
    }

    /**
     * Sets the value of the rsiVideoResult property.
     * 
     */
    public void setRSIVideoResult(int value) {
        this.rsiVideoResult = value;
    }

    /**
     * Gets the value of the rsiDeviceStatusEvent property.
     * 
     */
    public int getRSIDeviceStatusEvent() {
        return rsiDeviceStatusEvent;
    }

    /**
     * Sets the value of the rsiDeviceStatusEvent property.
     * 
     */
    public void setRSIDeviceStatusEvent(int value) {
        this.rsiDeviceStatusEvent = value;
    }

}
