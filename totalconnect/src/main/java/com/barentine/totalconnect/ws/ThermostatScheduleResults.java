
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermostatScheduleResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThermostatScheduleResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="ThermostatSchedule" type="{https://services.alarmnet.com/TC2/}ThermostatSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermostatScheduleResults", propOrder = {
    "thermostatSchedule"
})
public class ThermostatScheduleResults
    extends WebMethodResults
{

    @XmlElement(name = "ThermostatSchedule")
    protected ThermostatSchedule thermostatSchedule;

    /**
     * Gets the value of the thermostatSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatSchedule }
     *     
     */
    public ThermostatSchedule getThermostatSchedule() {
        return thermostatSchedule;
    }

    /**
     * Sets the value of the thermostatSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatSchedule }
     *     
     */
    public void setThermostatSchedule(ThermostatSchedule value) {
        this.thermostatSchedule = value;
    }

}
