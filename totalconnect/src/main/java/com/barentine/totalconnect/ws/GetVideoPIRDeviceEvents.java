
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
 *         &lt;element name="EventID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DateStamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CaptureFilterTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShowHidden" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "eventID",
    "dateStamp",
    "captureFilterTypeID",
    "showHidden",
    "additionalInfo"
})
@XmlRootElement(name = "GetVideoPIRDeviceEvents")
public class GetVideoPIRDeviceEvents {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "EventID")
    protected long eventID;
    @XmlElement(name = "DateStamp")
    protected long dateStamp;
    @XmlElement(name = "CaptureFilterTypeID")
    protected int captureFilterTypeID;
    @XmlElement(name = "ShowHidden")
    protected int showHidden;
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
     * Gets the value of the eventID property.
     * 
     */
    public long getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     */
    public void setEventID(long value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the dateStamp property.
     * 
     */
    public long getDateStamp() {
        return dateStamp;
    }

    /**
     * Sets the value of the dateStamp property.
     * 
     */
    public void setDateStamp(long value) {
        this.dateStamp = value;
    }

    /**
     * Gets the value of the captureFilterTypeID property.
     * 
     */
    public int getCaptureFilterTypeID() {
        return captureFilterTypeID;
    }

    /**
     * Sets the value of the captureFilterTypeID property.
     * 
     */
    public void setCaptureFilterTypeID(int value) {
        this.captureFilterTypeID = value;
    }

    /**
     * Gets the value of the showHidden property.
     * 
     */
    public int getShowHidden() {
        return showHidden;
    }

    /**
     * Sets the value of the showHidden property.
     * 
     */
    public void setShowHidden(int value) {
        this.showHidden = value;
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
