
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraBatteryStatusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraBatteryStatusResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="BatteryStrength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Voltage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraBatteryStatusResult", propOrder = {
    "batteryStrength",
    "voltage"
})
public class CameraBatteryStatusResult
    extends WebMethodResults
{

    @XmlElement(name = "BatteryStrength")
    protected int batteryStrength;
    @XmlElement(name = "Voltage")
    protected String voltage;

    /**
     * Gets the value of the batteryStrength property.
     * 
     */
    public int getBatteryStrength() {
        return batteryStrength;
    }

    /**
     * Sets the value of the batteryStrength property.
     * 
     */
    public void setBatteryStrength(int value) {
        this.batteryStrength = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoltage(String value) {
        this.voltage = value;
    }

}
