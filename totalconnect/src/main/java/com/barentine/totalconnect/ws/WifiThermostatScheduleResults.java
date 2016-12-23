
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WifiThermostatScheduleResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WifiThermostatScheduleResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="ThermostatSchedule" type="{https://services.alarmnet.com/TC2/}WifiThermostatSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WifiThermostatScheduleResults", propOrder = {
    "thermostatSchedule"
})
public class WifiThermostatScheduleResults
    extends WebMethodResults
{

    @XmlElement(name = "ThermostatSchedule")
    protected WifiThermostatSchedule thermostatSchedule;

    /**
     * Gets the value of the thermostatSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link WifiThermostatSchedule }
     *     
     */
    public WifiThermostatSchedule getThermostatSchedule() {
        return thermostatSchedule;
    }

    /**
     * Sets the value of the thermostatSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link WifiThermostatSchedule }
     *     
     */
    public void setThermostatSchedule(WifiThermostatSchedule value) {
        this.thermostatSchedule = value;
    }

}
