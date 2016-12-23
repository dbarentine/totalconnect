
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
 *         &lt;element name="ControlAThermostatExResult" type="{https://services.alarmnet.com/TC2/}ThermostatControlDataResults" minOccurs="0"/>
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
    "controlAThermostatExResult"
})
@XmlRootElement(name = "ControlAThermostatExResponse")
public class ControlAThermostatExResponse {

    @XmlElement(name = "ControlAThermostatExResult")
    protected ThermostatControlDataResults controlAThermostatExResult;

    /**
     * Gets the value of the controlAThermostatExResult property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatControlDataResults }
     *     
     */
    public ThermostatControlDataResults getControlAThermostatExResult() {
        return controlAThermostatExResult;
    }

    /**
     * Sets the value of the controlAThermostatExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatControlDataResults }
     *     
     */
    public void setControlAThermostatExResult(ThermostatControlDataResults value) {
        this.controlAThermostatExResult = value;
    }

}
