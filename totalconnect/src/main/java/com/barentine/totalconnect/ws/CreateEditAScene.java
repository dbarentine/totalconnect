
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
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SceneID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SceneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SceneIconID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="IsSceneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Automation_Switch" type="{https://services.alarmnet.com/TC2/}ArrayOfSceneSwitch" minOccurs="0"/>
 *         &lt;element name="Automation_Thermostat" type="{https://services.alarmnet.com/TC2/}ArrayOfSceneThermostat" minOccurs="0"/>
 *         &lt;element name="Automation_Lock" type="{https://services.alarmnet.com/TC2/}ArrayOfSceneLock" minOccurs="0"/>
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
    "sessionID",
    "deviceID",
    "sceneID",
    "sceneName",
    "sceneIconID",
    "isSceneEnabled",
    "automationSwitch",
    "automationThermostat",
    "automationLock"
})
@XmlRootElement(name = "CreateEditAScene")
public class CreateEditAScene {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "SceneID")
    protected long sceneID;
    @XmlElement(name = "SceneName")
    protected String sceneName;
    @XmlElement(name = "SceneIconID")
    protected short sceneIconID;
    @XmlElement(name = "IsSceneEnabled")
    protected boolean isSceneEnabled;
    @XmlElement(name = "Automation_Switch")
    protected ArrayOfSceneSwitch automationSwitch;
    @XmlElement(name = "Automation_Thermostat")
    protected ArrayOfSceneThermostat automationThermostat;
    @XmlElement(name = "Automation_Lock")
    protected ArrayOfSceneLock automationLock;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
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
     * Gets the value of the sceneID property.
     * 
     */
    public long getSceneID() {
        return sceneID;
    }

    /**
     * Sets the value of the sceneID property.
     * 
     */
    public void setSceneID(long value) {
        this.sceneID = value;
    }

    /**
     * Gets the value of the sceneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceneName() {
        return sceneName;
    }

    /**
     * Sets the value of the sceneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceneName(String value) {
        this.sceneName = value;
    }

    /**
     * Gets the value of the sceneIconID property.
     * 
     */
    public short getSceneIconID() {
        return sceneIconID;
    }

    /**
     * Sets the value of the sceneIconID property.
     * 
     */
    public void setSceneIconID(short value) {
        this.sceneIconID = value;
    }

    /**
     * Gets the value of the isSceneEnabled property.
     * 
     */
    public boolean isIsSceneEnabled() {
        return isSceneEnabled;
    }

    /**
     * Sets the value of the isSceneEnabled property.
     * 
     */
    public void setIsSceneEnabled(boolean value) {
        this.isSceneEnabled = value;
    }

    /**
     * Gets the value of the automationSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSceneSwitch }
     *     
     */
    public ArrayOfSceneSwitch getAutomationSwitch() {
        return automationSwitch;
    }

    /**
     * Sets the value of the automationSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSceneSwitch }
     *     
     */
    public void setAutomationSwitch(ArrayOfSceneSwitch value) {
        this.automationSwitch = value;
    }

    /**
     * Gets the value of the automationThermostat property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSceneThermostat }
     *     
     */
    public ArrayOfSceneThermostat getAutomationThermostat() {
        return automationThermostat;
    }

    /**
     * Sets the value of the automationThermostat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSceneThermostat }
     *     
     */
    public void setAutomationThermostat(ArrayOfSceneThermostat value) {
        this.automationThermostat = value;
    }

    /**
     * Gets the value of the automationLock property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSceneLock }
     *     
     */
    public ArrayOfSceneLock getAutomationLock() {
        return automationLock;
    }

    /**
     * Sets the value of the automationLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSceneLock }
     *     
     */
    public void setAutomationLock(ArrayOfSceneLock value) {
        this.automationLock = value;
    }

}
