
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartActionSubAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartActionSubAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SwitchSubActions" type="{https://services.alarmnet.com/TC2/}ArrayOfSwitchSubAction" minOccurs="0"/>
 *         &lt;element name="LockSubActions" type="{https://services.alarmnet.com/TC2/}ArrayOfLockSubAction" minOccurs="0"/>
 *         &lt;element name="ThermostatSubActions" type="{https://services.alarmnet.com/TC2/}ArrayOfThermostatSubAction" minOccurs="0"/>
 *         &lt;element name="WifiThermostatSubActions" type="{https://services.alarmnet.com/TC2/}ArrayOfWifiThermostatSubAction" minOccurs="0"/>
 *         &lt;element name="CameraSubActions" type="{https://services.alarmnet.com/TC2/}ArrayOfCameraSubAction" minOccurs="0"/>
 *         &lt;element name="SecuritySubActions" type="{https://services.alarmnet.com/TC2/}ArrayOfSecuritySubAction" minOccurs="0"/>
 *         &lt;element name="TriggerEvent" type="{https://services.alarmnet.com/TC2/}SmartActionTriggerEvent" minOccurs="0"/>
 *         &lt;element name="Schedule" type="{https://services.alarmnet.com/TC2/}SmartActionSchedule" minOccurs="0"/>
 *         &lt;element name="GeoFenceTriggerType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartActionSubAction", propOrder = {
    "switchSubActions",
    "lockSubActions",
    "thermostatSubActions",
    "wifiThermostatSubActions",
    "cameraSubActions",
    "securitySubActions",
    "triggerEvent",
    "schedule",
    "geoFenceTriggerType"
})
@XmlSeeAlso({
    SmartAction.class
})
public class SmartActionSubAction {

    @XmlElement(name = "SwitchSubActions")
    protected ArrayOfSwitchSubAction switchSubActions;
    @XmlElement(name = "LockSubActions")
    protected ArrayOfLockSubAction lockSubActions;
    @XmlElement(name = "ThermostatSubActions")
    protected ArrayOfThermostatSubAction thermostatSubActions;
    @XmlElement(name = "WifiThermostatSubActions")
    protected ArrayOfWifiThermostatSubAction wifiThermostatSubActions;
    @XmlElement(name = "CameraSubActions")
    protected ArrayOfCameraSubAction cameraSubActions;
    @XmlElement(name = "SecuritySubActions")
    protected ArrayOfSecuritySubAction securitySubActions;
    @XmlElement(name = "TriggerEvent")
    protected SmartActionTriggerEvent triggerEvent;
    @XmlElement(name = "Schedule")
    protected SmartActionSchedule schedule;
    @XmlElement(name = "GeoFenceTriggerType")
    protected int geoFenceTriggerType;

    /**
     * Gets the value of the switchSubActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwitchSubAction }
     *     
     */
    public ArrayOfSwitchSubAction getSwitchSubActions() {
        return switchSubActions;
    }

    /**
     * Sets the value of the switchSubActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwitchSubAction }
     *     
     */
    public void setSwitchSubActions(ArrayOfSwitchSubAction value) {
        this.switchSubActions = value;
    }

    /**
     * Gets the value of the lockSubActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLockSubAction }
     *     
     */
    public ArrayOfLockSubAction getLockSubActions() {
        return lockSubActions;
    }

    /**
     * Sets the value of the lockSubActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLockSubAction }
     *     
     */
    public void setLockSubActions(ArrayOfLockSubAction value) {
        this.lockSubActions = value;
    }

    /**
     * Gets the value of the thermostatSubActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfThermostatSubAction }
     *     
     */
    public ArrayOfThermostatSubAction getThermostatSubActions() {
        return thermostatSubActions;
    }

    /**
     * Sets the value of the thermostatSubActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfThermostatSubAction }
     *     
     */
    public void setThermostatSubActions(ArrayOfThermostatSubAction value) {
        this.thermostatSubActions = value;
    }

    /**
     * Gets the value of the wifiThermostatSubActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWifiThermostatSubAction }
     *     
     */
    public ArrayOfWifiThermostatSubAction getWifiThermostatSubActions() {
        return wifiThermostatSubActions;
    }

    /**
     * Sets the value of the wifiThermostatSubActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWifiThermostatSubAction }
     *     
     */
    public void setWifiThermostatSubActions(ArrayOfWifiThermostatSubAction value) {
        this.wifiThermostatSubActions = value;
    }

    /**
     * Gets the value of the cameraSubActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCameraSubAction }
     *     
     */
    public ArrayOfCameraSubAction getCameraSubActions() {
        return cameraSubActions;
    }

    /**
     * Sets the value of the cameraSubActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCameraSubAction }
     *     
     */
    public void setCameraSubActions(ArrayOfCameraSubAction value) {
        this.cameraSubActions = value;
    }

    /**
     * Gets the value of the securitySubActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecuritySubAction }
     *     
     */
    public ArrayOfSecuritySubAction getSecuritySubActions() {
        return securitySubActions;
    }

    /**
     * Sets the value of the securitySubActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecuritySubAction }
     *     
     */
    public void setSecuritySubActions(ArrayOfSecuritySubAction value) {
        this.securitySubActions = value;
    }

    /**
     * Gets the value of the triggerEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SmartActionTriggerEvent }
     *     
     */
    public SmartActionTriggerEvent getTriggerEvent() {
        return triggerEvent;
    }

    /**
     * Sets the value of the triggerEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartActionTriggerEvent }
     *     
     */
    public void setTriggerEvent(SmartActionTriggerEvent value) {
        this.triggerEvent = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link SmartActionSchedule }
     *     
     */
    public SmartActionSchedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartActionSchedule }
     *     
     */
    public void setSchedule(SmartActionSchedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the geoFenceTriggerType property.
     * 
     */
    public int getGeoFenceTriggerType() {
        return geoFenceTriggerType;
    }

    /**
     * Sets the value of the geoFenceTriggerType property.
     * 
     */
    public void setGeoFenceTriggerType(int value) {
        this.geoFenceTriggerType = value;
    }

}
