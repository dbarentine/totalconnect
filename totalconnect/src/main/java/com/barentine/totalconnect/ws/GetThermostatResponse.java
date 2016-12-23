
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
 *         &lt;element name="GetThermostatResult" type="{https://services.alarmnet.com/TC2/}ThermostatResponse" minOccurs="0"/>
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
    "getThermostatResult"
})
@XmlRootElement(name = "GetThermostatResponse")
public class GetThermostatResponse {

    @XmlElement(name = "GetThermostatResult")
    protected ThermostatResponse getThermostatResult;

    /**
     * Gets the value of the getThermostatResult property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatResponse }
     *     
     */
    public ThermostatResponse getGetThermostatResult() {
        return getThermostatResult;
    }

    /**
     * Sets the value of the getThermostatResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatResponse }
     *     
     */
    public void setGetThermostatResult(ThermostatResponse value) {
        this.getThermostatResult = value;
    }

}
