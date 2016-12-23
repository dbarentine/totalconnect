
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneStatusThermostat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneStatusThermostat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneThermostatInfo" type="{https://services.alarmnet.com/TC2/}ThermostatInfo" minOccurs="0"/>
 *         &lt;element name="SceneThermostat" type="{https://services.alarmnet.com/TC2/}SceneThermostat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneStatusThermostat", propOrder = {
    "sceneThermostatInfo",
    "sceneThermostat"
})
public class SceneStatusThermostat {

    @XmlElement(name = "SceneThermostatInfo")
    protected ThermostatInfo sceneThermostatInfo;
    @XmlElement(name = "SceneThermostat")
    protected SceneThermostat sceneThermostat;

    /**
     * Gets the value of the sceneThermostatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatInfo }
     *     
     */
    public ThermostatInfo getSceneThermostatInfo() {
        return sceneThermostatInfo;
    }

    /**
     * Sets the value of the sceneThermostatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatInfo }
     *     
     */
    public void setSceneThermostatInfo(ThermostatInfo value) {
        this.sceneThermostatInfo = value;
    }

    /**
     * Gets the value of the sceneThermostat property.
     * 
     * @return
     *     possible object is
     *     {@link SceneThermostat }
     *     
     */
    public SceneThermostat getSceneThermostat() {
        return sceneThermostat;
    }

    /**
     * Sets the value of the sceneThermostat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SceneThermostat }
     *     
     */
    public void setSceneThermostat(SceneThermostat value) {
        this.sceneThermostat = value;
    }

}
