
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneAutomationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneAutomationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneInfoHeader" type="{https://services.alarmnet.com/TC2/}SceneInfo" minOccurs="0"/>
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceSerialText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutomationSwitch" type="{https://services.alarmnet.com/TC2/}ArrayOfSceneStatusSwitch" minOccurs="0"/>
 *         &lt;element name="AutomationThermostat" type="{https://services.alarmnet.com/TC2/}ArrayOfSceneStatusThermostat" minOccurs="0"/>
 *         &lt;element name="AutomationLock" type="{https://services.alarmnet.com/TC2/}ArrayOfSceneStatusLock" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneAutomationInfo", propOrder = {
    "sceneInfoHeader",
    "accountID",
    "deviceID",
    "deviceSerialNumber",
    "deviceSerialText",
    "automationSwitch",
    "automationThermostat",
    "automationLock"
})
public class SceneAutomationInfo {

    @XmlElement(name = "SceneInfoHeader")
    protected SceneInfo sceneInfoHeader;
    @XmlElement(name = "AccountID")
    protected long accountID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "DeviceSerialNumber")
    protected long deviceSerialNumber;
    @XmlElement(name = "DeviceSerialText")
    protected String deviceSerialText;
    @XmlElement(name = "AutomationSwitch")
    protected ArrayOfSceneStatusSwitch automationSwitch;
    @XmlElement(name = "AutomationThermostat")
    protected ArrayOfSceneStatusThermostat automationThermostat;
    @XmlElement(name = "AutomationLock")
    protected ArrayOfSceneStatusLock automationLock;

    /**
     * Gets the value of the sceneInfoHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SceneInfo }
     *     
     */
    public SceneInfo getSceneInfoHeader() {
        return sceneInfoHeader;
    }

    /**
     * Sets the value of the sceneInfoHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SceneInfo }
     *     
     */
    public void setSceneInfoHeader(SceneInfo value) {
        this.sceneInfoHeader = value;
    }

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
     * Gets the value of the automationSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSceneStatusSwitch }
     *     
     */
    public ArrayOfSceneStatusSwitch getAutomationSwitch() {
        return automationSwitch;
    }

    /**
     * Sets the value of the automationSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSceneStatusSwitch }
     *     
     */
    public void setAutomationSwitch(ArrayOfSceneStatusSwitch value) {
        this.automationSwitch = value;
    }

    /**
     * Gets the value of the automationThermostat property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSceneStatusThermostat }
     *     
     */
    public ArrayOfSceneStatusThermostat getAutomationThermostat() {
        return automationThermostat;
    }

    /**
     * Sets the value of the automationThermostat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSceneStatusThermostat }
     *     
     */
    public void setAutomationThermostat(ArrayOfSceneStatusThermostat value) {
        this.automationThermostat = value;
    }

    /**
     * Gets the value of the automationLock property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSceneStatusLock }
     *     
     */
    public ArrayOfSceneStatusLock getAutomationLock() {
        return automationLock;
    }

    /**
     * Sets the value of the automationLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSceneStatusLock }
     *     
     */
    public void setAutomationLock(ArrayOfSceneStatusLock value) {
        this.automationLock = value;
    }

}
