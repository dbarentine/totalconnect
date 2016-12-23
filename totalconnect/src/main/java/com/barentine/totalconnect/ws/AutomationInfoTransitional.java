
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationInfo_Transitional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomationInfo_Transitional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceSerialText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockCapacity" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SwitchCapacity" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ThermostatCapacity" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SceneCapacity" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DeviceCapacityPerScene" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SyncDeviceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CommunicationState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AutomationStatusLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AutomationSwitch" type="{https://services.alarmnet.com/TC2/}ArrayOfSwitchInfo" minOccurs="0"/>
 *         &lt;element name="AutomationThermostat" type="{https://services.alarmnet.com/TC2/}ArrayOfThermostatInfo" minOccurs="0"/>
 *         &lt;element name="AutomationLock" type="{https://services.alarmnet.com/TC2/}ArrayOfLockInfo_Transitional" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomationInfo_Transitional", propOrder = {
    "accountID",
    "deviceID",
    "deviceSerialNumber",
    "deviceSerialText",
    "lockCapacity",
    "switchCapacity",
    "thermostatCapacity",
    "sceneCapacity",
    "deviceCapacityPerScene",
    "syncDeviceFlag",
    "communicationState",
    "automationStatusLimit",
    "automationSwitch",
    "automationThermostat",
    "automationLock"
})
public class AutomationInfoTransitional {

    @XmlElement(name = "AccountID")
    protected long accountID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "DeviceSerialNumber")
    protected long deviceSerialNumber;
    @XmlElement(name = "DeviceSerialText")
    protected String deviceSerialText;
    @XmlElement(name = "LockCapacity")
    protected short lockCapacity;
    @XmlElement(name = "SwitchCapacity")
    protected short switchCapacity;
    @XmlElement(name = "ThermostatCapacity")
    protected short thermostatCapacity;
    @XmlElement(name = "SceneCapacity")
    protected short sceneCapacity;
    @XmlElement(name = "DeviceCapacityPerScene")
    protected short deviceCapacityPerScene;
    @XmlElement(name = "SyncDeviceFlag")
    protected boolean syncDeviceFlag;
    @XmlElement(name = "CommunicationState")
    protected boolean communicationState;
    @XmlElement(name = "AutomationStatusLimit")
    protected int automationStatusLimit;
    @XmlElement(name = "AutomationSwitch")
    protected ArrayOfSwitchInfo automationSwitch;
    @XmlElement(name = "AutomationThermostat")
    protected ArrayOfThermostatInfo automationThermostat;
    @XmlElement(name = "AutomationLock")
    protected ArrayOfLockInfoTransitional automationLock;

    /**
     * Gets the value of the accountID property.
     * 
     */
    public long getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     */
    public void setAccountID(long value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     */
    public long getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     */
    public void setDeviceID(long value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the deviceSerialNumber property.
     * 
     */
    public long getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    /**
     * Sets the value of the deviceSerialNumber property.
     * 
     */
    public void setDeviceSerialNumber(long value) {
        this.deviceSerialNumber = value;
    }

    /**
     * Gets the value of the deviceSerialText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialText() {
        return deviceSerialText;
    }

    /**
     * Sets the value of the deviceSerialText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialText(String value) {
        this.deviceSerialText = value;
    }

    /**
     * Gets the value of the lockCapacity property.
     * 
     */
    public short getLockCapacity() {
        return lockCapacity;
    }

    /**
     * Sets the value of the lockCapacity property.
     * 
     */
    public void setLockCapacity(short value) {
        this.lockCapacity = value;
    }

    /**
     * Gets the value of the switchCapacity property.
     * 
     */
    public short getSwitchCapacity() {
        return switchCapacity;
    }

    /**
     * Sets the value of the switchCapacity property.
     * 
     */
    public void setSwitchCapacity(short value) {
        this.switchCapacity = value;
    }

    /**
     * Gets the value of the thermostatCapacity property.
     * 
     */
    public short getThermostatCapacity() {
        return thermostatCapacity;
    }

    /**
     * Sets the value of the thermostatCapacity property.
     * 
     */
    public void setThermostatCapacity(short value) {
        this.thermostatCapacity = value;
    }

    /**
     * Gets the value of the sceneCapacity property.
     * 
     */
    public short getSceneCapacity() {
        return sceneCapacity;
    }

    /**
     * Sets the value of the sceneCapacity property.
     * 
     */
    public void setSceneCapacity(short value) {
        this.sceneCapacity = value;
    }

    /**
     * Gets the value of the deviceCapacityPerScene property.
     * 
     */
    public short getDeviceCapacityPerScene() {
        return deviceCapacityPerScene;
    }

    /**
     * Sets the value of the deviceCapacityPerScene property.
     * 
     */
    public void setDeviceCapacityPerScene(short value) {
        this.deviceCapacityPerScene = value;
    }

    /**
     * Gets the value of the syncDeviceFlag property.
     * 
     */
    public boolean isSyncDeviceFlag() {
        return syncDeviceFlag;
    }

    /**
     * Sets the value of the syncDeviceFlag property.
     * 
     */
    public void setSyncDeviceFlag(boolean value) {
        this.syncDeviceFlag = value;
    }

    /**
     * Gets the value of the communicationState property.
     * 
     */
    public boolean isCommunicationState() {
        return communicationState;
    }

    /**
     * Sets the value of the communicationState property.
     * 
     */
    public void setCommunicationState(boolean value) {
        this.communicationState = value;
    }

    /**
     * Gets the value of the automationStatusLimit property.
     * 
     */
    public int getAutomationStatusLimit() {
        return automationStatusLimit;
    }

    /**
     * Sets the value of the automationStatusLimit property.
     * 
     */
    public void setAutomationStatusLimit(int value) {
        this.automationStatusLimit = value;
    }

    /**
     * Gets the value of the automationSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwitchInfo }
     *     
     */
    public ArrayOfSwitchInfo getAutomationSwitch() {
        return automationSwitch;
    }

    /**
     * Sets the value of the automationSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwitchInfo }
     *     
     */
    public void setAutomationSwitch(ArrayOfSwitchInfo value) {
        this.automationSwitch = value;
    }

    /**
     * Gets the value of the automationThermostat property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfThermostatInfo }
     *     
     */
    public ArrayOfThermostatInfo getAutomationThermostat() {
        return automationThermostat;
    }

    /**
     * Sets the value of the automationThermostat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfThermostatInfo }
     *     
     */
    public void setAutomationThermostat(ArrayOfThermostatInfo value) {
        this.automationThermostat = value;
    }

    /**
     * Gets the value of the automationLock property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLockInfoTransitional }
     *     
     */
    public ArrayOfLockInfoTransitional getAutomationLock() {
        return automationLock;
    }

    /**
     * Sets the value of the automationLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLockInfoTransitional }
     *     
     */
    public void setAutomationLock(ArrayOfLockInfoTransitional value) {
        this.automationLock = value;
    }

}
