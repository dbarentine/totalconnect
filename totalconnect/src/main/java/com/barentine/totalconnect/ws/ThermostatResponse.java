
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermostatResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThermostatResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="ThermostatInfo" type="{https://services.alarmnet.com/TC2/}ThermostatInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermostatResponse", propOrder = {
    "thermostatInfo"
})
public class ThermostatResponse
    extends WebMethodResults
{

    @XmlElement(name = "ThermostatInfo")
    protected ThermostatInfo thermostatInfo;

    /**
     * Gets the value of the thermostatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatInfo }
     *     
     */
    public ThermostatInfo getThermostatInfo() {
        return thermostatInfo;
    }

    /**
     * Sets the value of the thermostatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatInfo }
     *     
     */
    public void setThermostatInfo(ThermostatInfo value) {
        this.thermostatInfo = value;
    }

}
