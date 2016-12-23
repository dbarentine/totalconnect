
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
 *         &lt;element name="ThermostatID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CurrentOpModeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HeatThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CoolThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ThermostatModeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HeatSetPoint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CoolSetPoint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ThermostatFanModeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TempHoldTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "thermostatID",
    "currentOpModeID",
    "heatThreshold",
    "coolThreshold",
    "thermostatModeID",
    "heatSetPoint",
    "coolSetPoint",
    "thermostatFanModeID",
    "tempHoldTime"
})
@XmlRootElement(name = "ControlAThermostatEx")
public class ControlAThermostatEx {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "ThermostatID")
    protected long thermostatID;
    @XmlElement(name = "CurrentOpModeID")
    protected int currentOpModeID;
    @XmlElement(name = "HeatThreshold")
    protected int heatThreshold;
    @XmlElement(name = "CoolThreshold")
    protected int coolThreshold;
    @XmlElement(name = "ThermostatModeID")
    protected int thermostatModeID;
    @XmlElement(name = "HeatSetPoint")
    protected int heatSetPoint;
    @XmlElement(name = "CoolSetPoint")
    protected int coolSetPoint;
    @XmlElement(name = "ThermostatFanModeID")
    protected int thermostatFanModeID;
    @XmlElement(name = "TempHoldTime")
    protected String tempHoldTime;

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
     * Gets the value of the thermostatID property.
     * 
     */
    public long getThermostatID() {
        return thermostatID;
    }

    /**
     * Sets the value of the thermostatID property.
     * 
     */
    public void setThermostatID(long value) {
        this.thermostatID = value;
    }

    /**
     * Gets the value of the currentOpModeID property.
     * 
     */
    public int getCurrentOpModeID() {
        return currentOpModeID;
    }

    /**
     * Sets the value of the currentOpModeID property.
     * 
     */
    public void setCurrentOpModeID(int value) {
        this.currentOpModeID = value;
    }

    /**
     * Gets the value of the heatThreshold property.
     * 
     */
    public int getHeatThreshold() {
        return heatThreshold;
    }

    /**
     * Sets the value of the heatThreshold property.
     * 
     */
    public void setHeatThreshold(int value) {
        this.heatThreshold = value;
    }

    /**
     * Gets the value of the coolThreshold property.
     * 
     */
    public int getCoolThreshold() {
        return coolThreshold;
    }

    /**
     * Sets the value of the coolThreshold property.
     * 
     */
    public void setCoolThreshold(int value) {
        this.coolThreshold = value;
    }

    /**
     * Gets the value of the thermostatModeID property.
     * 
     */
    public int getThermostatModeID() {
        return thermostatModeID;
    }

    /**
     * Sets the value of the thermostatModeID property.
     * 
     */
    public void setThermostatModeID(int value) {
        this.thermostatModeID = value;
    }

    /**
     * Gets the value of the heatSetPoint property.
     * 
     */
    public int getHeatSetPoint() {
        return heatSetPoint;
    }

    /**
     * Sets the value of the heatSetPoint property.
     * 
     */
    public void setHeatSetPoint(int value) {
        this.heatSetPoint = value;
    }

    /**
     * Gets the value of the coolSetPoint property.
     * 
     */
    public int getCoolSetPoint() {
        return coolSetPoint;
    }

    /**
     * Sets the value of the coolSetPoint property.
     * 
     */
    public void setCoolSetPoint(int value) {
        this.coolSetPoint = value;
    }

    /**
     * Gets the value of the thermostatFanModeID property.
     * 
     */
    public int getThermostatFanModeID() {
        return thermostatFanModeID;
    }

    /**
     * Sets the value of the thermostatFanModeID property.
     * 
     */
    public void setThermostatFanModeID(int value) {
        this.thermostatFanModeID = value;
    }

    /**
     * Gets the value of the tempHoldTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempHoldTime() {
        return tempHoldTime;
    }

    /**
     * Sets the value of the tempHoldTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempHoldTime(String value) {
        this.tempHoldTime = value;
    }

}
