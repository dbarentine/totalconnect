
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
 *         &lt;element name="UpdateWifiThermostatScheduleResult" type="{https://services.alarmnet.com/TC2/}WebMethodResults" minOccurs="0"/>
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
    "updateWifiThermostatScheduleResult"
})
@XmlRootElement(name = "UpdateWifiThermostatScheduleResponse")
public class UpdateWifiThermostatScheduleResponse {

    @XmlElement(name = "UpdateWifiThermostatScheduleResult")
    protected WebMethodResults updateWifiThermostatScheduleResult;

    /**
     * Gets the value of the updateWifiThermostatScheduleResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebMethodResults }
     *     
     */
    public WebMethodResults getUpdateWifiThermostatScheduleResult() {
        return updateWifiThermostatScheduleResult;
    }

    /**
     * Sets the value of the updateWifiThermostatScheduleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebMethodResults }
     *     
     */
    public void setUpdateWifiThermostatScheduleResult(WebMethodResults value) {
        this.updateWifiThermostatScheduleResult = value;
    }

}
