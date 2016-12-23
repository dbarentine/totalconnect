
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiThermostatConfigInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiThermostatConfigInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThermostatID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ThermostatConfigState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiThermostatConfigInfo", propOrder = {
    "thermostatID",
    "thermostatConfigState"
})
public class WiFiThermostatConfigInfo {

    @XmlElement(name = "ThermostatID")
    protected long thermostatID;
    @XmlElement(name = "ThermostatConfigState")
    protected int thermostatConfigState;

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
     * Gets the value of the thermostatConfigState property.
     * 
     */
    public int getThermostatConfigState() {
        return thermostatConfigState;
    }

    /**
     * Sets the value of the thermostatConfigState property.
     * 
     */
    public void setThermostatConfigState(int value) {
        this.thermostatConfigState = value;
    }

}
