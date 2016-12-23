
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
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArmType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomArmSettings" type="{https://services.alarmnet.com/TC2/}CustomArmInfo" minOccurs="0"/>
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
    "deviceID",
    "armType",
    "userCode",
    "customArmSettings"
})
@XmlRootElement(name = "CustomArmSecuritySystem")
public class CustomArmSecuritySystem {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "ArmType")
    protected int armType;
    @XmlElement(name = "UserCode")
    protected int userCode;
    @XmlElement(name = "CustomArmSettings")
    protected CustomArmInfo customArmSettings;

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
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(long value) {
        this.locationID = value;
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
     * Gets the value of the armType property.
     * 
     */
    public int getArmType() {
        return armType;
    }

    /**
     * Sets the value of the armType property.
     * 
     */
    public void setArmType(int value) {
        this.armType = value;
    }

    /**
     * Gets the value of the userCode property.
     * 
     */
    public int getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     */
    public void setUserCode(int value) {
        this.userCode = value;
    }

    /**
     * Gets the value of the customArmSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CustomArmInfo }
     *     
     */
    public CustomArmInfo getCustomArmSettings() {
        return customArmSettings;
    }

    /**
     * Sets the value of the customArmSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomArmInfo }
     *     
     */
    public void setCustomArmSettings(CustomArmInfo value) {
        this.customArmSettings = value;
    }

}
