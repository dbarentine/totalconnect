
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneThermostat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneThermostat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThermostatID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SceneThermostatModeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SceneThermostatFanMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SceneThermostatHeatSetPoint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SceneThermostatCoolSetPoint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneThermostat", propOrder = {
    "thermostatID",
    "sceneThermostatModeID",
    "sceneThermostatFanMode",
    "sceneThermostatHeatSetPoint",
    "sceneThermostatCoolSetPoint"
})
public class SceneThermostat {

    @XmlElement(name = "ThermostatID")
    protected long thermostatID;
    @XmlElement(name = "SceneThermostatModeID")
    protected int sceneThermostatModeID;
    @XmlElement(name = "SceneThermostatFanMode")
    protected int sceneThermostatFanMode;
    @XmlElement(name = "SceneThermostatHeatSetPoint")
    protected int sceneThermostatHeatSetPoint;
    @XmlElement(name = "SceneThermostatCoolSetPoint")
    protected int sceneThermostatCoolSetPoint;

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
     * Gets the value of the sceneThermostatModeID property.
     * 
     */
    public int getSceneThermostatModeID() {
        return sceneThermostatModeID;
    }

    /**
     * Sets the value of the sceneThermostatModeID property.
     * 
     */
    public void setSceneThermostatModeID(int value) {
        this.sceneThermostatModeID = value;
    }

    /**
     * Gets the value of the sceneThermostatFanMode property.
     * 
     */
    public int getSceneThermostatFanMode() {
        return sceneThermostatFanMode;
    }

    /**
     * Sets the value of the sceneThermostatFanMode property.
     * 
     */
    public void setSceneThermostatFanMode(int value) {
        this.sceneThermostatFanMode = value;
    }

    /**
     * Gets the value of the sceneThermostatHeatSetPoint property.
     * 
     */
    public int getSceneThermostatHeatSetPoint() {
        return sceneThermostatHeatSetPoint;
    }

    /**
     * Sets the value of the sceneThermostatHeatSetPoint property.
     * 
     */
    public void setSceneThermostatHeatSetPoint(int value) {
        this.sceneThermostatHeatSetPoint = value;
    }

    /**
     * Gets the value of the sceneThermostatCoolSetPoint property.
     * 
     */
    public int getSceneThermostatCoolSetPoint() {
        return sceneThermostatCoolSetPoint;
    }

    /**
     * Sets the value of the sceneThermostatCoolSetPoint property.
     * 
     */
    public void setSceneThermostatCoolSetPoint(int value) {
        this.sceneThermostatCoolSetPoint = value;
    }

}
