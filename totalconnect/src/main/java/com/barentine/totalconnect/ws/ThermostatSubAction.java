
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermostatSubAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThermostatSubAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubActionID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ThermostatID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FanMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HeatSetPoint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CoolSetPoint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermostatSubAction", propOrder = {
    "subActionID",
    "thermostatID",
    "mode",
    "fanMode",
    "heatSetPoint",
    "coolSetPoint"
})
public class ThermostatSubAction {

    @XmlElement(name = "SubActionID")
    protected long subActionID;
    @XmlElement(name = "ThermostatID")
    protected long thermostatID;
    @XmlElement(name = "Mode")
    protected int mode;
    @XmlElement(name = "FanMode")
    protected int fanMode;
    @XmlElement(name = "HeatSetPoint")
    protected int heatSetPoint;
    @XmlElement(name = "CoolSetPoint")
    protected int coolSetPoint;

    /**
     * Gets the value of the subActionID property.
     * 
     */
    public long getSubActionID() {
        return subActionID;
    }

    /**
     * Sets the value of the subActionID property.
     * 
     */
    public void setSubActionID(long value) {
        this.subActionID = value;
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
     * Gets the value of the mode property.
     * 
     */
    public int getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     */
    public void setMode(int value) {
        this.mode = value;
    }

    /**
     * Gets the value of the fanMode property.
     * 
     */
    public int getFanMode() {
        return fanMode;
    }

    /**
     * Sets the value of the fanMode property.
     * 
     */
    public void setFanMode(int value) {
        this.fanMode = value;
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

}
