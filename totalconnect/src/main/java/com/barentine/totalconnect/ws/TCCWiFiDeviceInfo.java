
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCCWiFiDeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCCWiFiDeviceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TCCDeviceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThermostatConfiguration" type="{https://services.alarmnet.com/TC2/}WiFiThermostatConfigInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCCWiFiDeviceInfo", propOrder = {
    "tccDeviceID",
    "deviceName",
    "thermostatConfiguration"
})
public class TCCWiFiDeviceInfo {

    @XmlElement(name = "TCCDeviceID")
    protected int tccDeviceID;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "ThermostatConfiguration")
    protected WiFiThermostatConfigInfo thermostatConfiguration;

    /**
     * Gets the value of the tccDeviceID property.
     * 
     */
    public int getTCCDeviceID() {
        return tccDeviceID;
    }

    /**
     * Sets the value of the tccDeviceID property.
     * 
     */
    public void setTCCDeviceID(int value) {
        this.tccDeviceID = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the thermostatConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link WiFiThermostatConfigInfo }
     *     
     */
    public WiFiThermostatConfigInfo getThermostatConfiguration() {
        return thermostatConfiguration;
    }

    /**
     * Sets the value of the thermostatConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link WiFiThermostatConfigInfo }
     *     
     */
    public void setThermostatConfiguration(WiFiThermostatConfigInfo value) {
        this.thermostatConfiguration = value;
    }

}
