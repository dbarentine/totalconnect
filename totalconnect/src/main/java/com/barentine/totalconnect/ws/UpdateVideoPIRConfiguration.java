
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
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SYSTEM_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIDEO_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOTION_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EVENT_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionID",
    "deviceID",
    "deviceName",
    "systemData",
    "videoData",
    "motionData",
    "eventData",
    "additionalInfo"
})
@XmlRootElement(name = "UpdateVideoPIRConfiguration")
public class UpdateVideoPIRConfiguration {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "SYSTEM_Data")
    protected String systemData;
    @XmlElement(name = "VIDEO_Data")
    protected String videoData;
    @XmlElement(name = "MOTION_Data")
    protected String motionData;
    @XmlElement(name = "EVENT_Data")
    protected String eventData;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     */
    public long getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     */
    public void setDeviceID(long value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the systemData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSTEMData() {
        return systemData;
    }

    /**
     * Sets the value of the systemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSTEMData(String value) {
        this.systemData = value;
    }

    /**
     * Gets the value of the videoData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIDEOData() {
        return videoData;
    }

    /**
     * Sets the value of the videoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIDEOData(String value) {
        this.videoData = value;
    }

    /**
     * Gets the value of the motionData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIONData() {
        return motionData;
    }

    /**
     * Sets the value of the motionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIONData(String value) {
        this.motionData = value;
    }

    /**
     * Gets the value of the eventData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTData() {
        return eventData;
    }

    /**
     * Sets the value of the eventData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTData(String value) {
        this.eventData = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

}
