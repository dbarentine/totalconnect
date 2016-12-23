
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartSceneSubAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartSceneSubAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneSwitchSubActions" type="{https://services.alarmnet.com/TC2/}ArrayOfSceneSwitchSubAction" minOccurs="0"/>
 *         &lt;element name="SceneLockSubActions" type="{https://services.alarmnet.com/TC2/}ArrayOfSceneLockSubAction" minOccurs="0"/>
 *         &lt;element name="SceneThermostatSubActions" type="{https://services.alarmnet.com/TC2/}ArrayOfSceneThermostatSubAction" minOccurs="0"/>
 *         &lt;element name="TimeTriggeredAction" type="{https://services.alarmnet.com/TC2/}ScenesTimeTriggeredAction" minOccurs="0"/>
 *         &lt;element name="TriggerEvent" type="{https://services.alarmnet.com/TC2/}ScenesTriggerEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartSceneSubAction", propOrder = {
    "sceneSwitchSubActions",
    "sceneLockSubActions",
    "sceneThermostatSubActions",
    "timeTriggeredAction",
    "triggerEvent"
})
@XmlSeeAlso({
    SmartScene.class
})
public class SmartSceneSubAction {

    @XmlElement(name = "SceneSwitchSubActions")
    protected ArrayOfSceneSwitchSubAction sceneSwitchSubActions;
    @XmlElement(name = "SceneLockSubActions")
    protected ArrayOfSceneLockSubAction sceneLockSubActions;
    @XmlElement(name = "SceneThermostatSubActions")
    protected ArrayOfSceneThermostatSubAction sceneThermostatSubActions;
    @XmlElement(name = "TimeTriggeredAction")
    protected ScenesTimeTriggeredAction timeTriggeredAction;
    @XmlElement(name = "TriggerEvent")
    protected ScenesTriggerEvent triggerEvent;

    /**
     * Gets the value of the sceneSwitchSubActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSceneSwitchSubAction }
     *     
     */
    public ArrayOfSceneSwitchSubAction getSceneSwitchSubActions() {
        return sceneSwitchSubActions;
    }

    /**
     * Sets the value of the sceneSwitchSubActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSceneSwitchSubAction }
     *     
     */
    public void setSceneSwitchSubActions(ArrayOfSceneSwitchSubAction value) {
        this.sceneSwitchSubActions = value;
    }

    /**
     * Gets the value of the sceneLockSubActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSceneLockSubAction }
     *     
     */
    public ArrayOfSceneLockSubAction getSceneLockSubActions() {
        return sceneLockSubActions;
    }

    /**
     * Sets the value of the sceneLockSubActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSceneLockSubAction }
     *     
     */
    public void setSceneLockSubActions(ArrayOfSceneLockSubAction value) {
        this.sceneLockSubActions = value;
    }

    /**
     * Gets the value of the sceneThermostatSubActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSceneThermostatSubAction }
     *     
     */
    public ArrayOfSceneThermostatSubAction getSceneThermostatSubActions() {
        return sceneThermostatSubActions;
    }

    /**
     * Sets the value of the sceneThermostatSubActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSceneThermostatSubAction }
     *     
     */
    public void setSceneThermostatSubActions(ArrayOfSceneThermostatSubAction value) {
        this.sceneThermostatSubActions = value;
    }

    /**
     * Gets the value of the timeTriggeredAction property.
     * 
     * @return
     *     possible object is
     *     {@link ScenesTimeTriggeredAction }
     *     
     */
    public ScenesTimeTriggeredAction getTimeTriggeredAction() {
        return timeTriggeredAction;
    }

    /**
     * Sets the value of the timeTriggeredAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScenesTimeTriggeredAction }
     *     
     */
    public void setTimeTriggeredAction(ScenesTimeTriggeredAction value) {
        this.timeTriggeredAction = value;
    }

    /**
     * Gets the value of the triggerEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ScenesTriggerEvent }
     *     
     */
    public ScenesTriggerEvent getTriggerEvent() {
        return triggerEvent;
    }

    /**
     * Sets the value of the triggerEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScenesTriggerEvent }
     *     
     */
    public void setTriggerEvent(ScenesTriggerEvent value) {
        this.triggerEvent = value;
    }

}
