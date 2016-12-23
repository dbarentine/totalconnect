
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
 *         &lt;element name="GetWifiThermostatScheduleResult" type="{https://services.alarmnet.com/TC2/}WifiThermostatScheduleResults" minOccurs="0"/>
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
    "getWifiThermostatScheduleResult"
})
@XmlRootElement(name = "GetWifiThermostatScheduleResponse")
public class GetWifiThermostatScheduleResponse {

    @XmlElement(name = "GetWifiThermostatScheduleResult")
    protected WifiThermostatScheduleResults getWifiThermostatScheduleResult;

    /**
     * Gets the value of the getWifiThermostatScheduleResult property.
     * 
     * @return
     *     possible object is
     *     {@link WifiThermostatScheduleResults }
     *     
     */
    public WifiThermostatScheduleResults getGetWifiThermostatScheduleResult() {
        return getWifiThermostatScheduleResult;
    }

    /**
     * Sets the value of the getWifiThermostatScheduleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WifiThermostatScheduleResults }
     *     
     */
    public void setGetWifiThermostatScheduleResult(WifiThermostatScheduleResults value) {
        this.getWifiThermostatScheduleResult = value;
    }

}
