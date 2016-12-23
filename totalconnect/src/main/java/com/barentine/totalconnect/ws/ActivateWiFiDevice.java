
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
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LyricUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LyricPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lyricLocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lyricDevice" type="{https://services.alarmnet.com/TC2/}ArrayOfLyricDevice" minOccurs="0"/>
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
    "locationID",
    "lyricUsername",
    "lyricPassword",
    "lyricLocationID",
    "lyricDevice"
})
@XmlRootElement(name = "ActivateWiFiDevice")
public class ActivateWiFiDevice {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    protected int locationID;
    @XmlElement(name = "LyricUsername")
    protected String lyricUsername;
    @XmlElement(name = "LyricPassword")
    protected String lyricPassword;
    protected int lyricLocationID;
    protected ArrayOfLyricDevice lyricDevice;

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
     * Gets the value of the locationID property.
     * 
     */
    public int getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(int value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the lyricUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyricUsername() {
        return lyricUsername;
    }

    /**
     * Sets the value of the lyricUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyricUsername(String value) {
        this.lyricUsername = value;
    }

    /**
     * Gets the value of the lyricPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyricPassword() {
        return lyricPassword;
    }

    /**
     * Sets the value of the lyricPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyricPassword(String value) {
        this.lyricPassword = value;
    }

    /**
     * Gets the value of the lyricLocationID property.
     * 
     */
    public int getLyricLocationID() {
        return lyricLocationID;
    }

    /**
     * Sets the value of the lyricLocationID property.
     * 
     */
    public void setLyricLocationID(int value) {
        this.lyricLocationID = value;
    }

    /**
     * Gets the value of the lyricDevice property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLyricDevice }
     *     
     */
    public ArrayOfLyricDevice getLyricDevice() {
        return lyricDevice;
    }

    /**
     * Sets the value of the lyricDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLyricDevice }
     *     
     */
    public void setLyricDevice(ArrayOfLyricDevice value) {
        this.lyricDevice = value;
    }

}
