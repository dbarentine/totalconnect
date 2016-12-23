
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
 *         &lt;element name="UpdateThermostatScheduleResult" type="{https://services.alarmnet.com/TC2/}UpdateThermostatScheduleResults" minOccurs="0"/>
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
    "updateThermostatScheduleResult"
})
@XmlRootElement(name = "UpdateThermostatScheduleResponse")
public class UpdateThermostatScheduleResponse {

    @XmlElement(name = "UpdateThermostatScheduleResult")
    protected UpdateThermostatScheduleResults updateThermostatScheduleResult;

    /**
     * Gets the value of the updateThermostatScheduleResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateThermostatScheduleResults }
     *     
     */
    public UpdateThermostatScheduleResults getUpdateThermostatScheduleResult() {
        return updateThermostatScheduleResult;
    }

    /**
     * Sets the value of the updateThermostatScheduleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateThermostatScheduleResults }
     *     
     */
    public void setUpdateThermostatScheduleResult(UpdateThermostatScheduleResults value) {
        this.updateThermostatScheduleResult = value;
    }

}
