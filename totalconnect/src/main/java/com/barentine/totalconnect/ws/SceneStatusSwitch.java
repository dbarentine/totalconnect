
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneStatusSwitch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneStatusSwitch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneSwitchInfo" type="{https://services.alarmnet.com/TC2/}SwitchInfo" minOccurs="0"/>
 *         &lt;element name="SceneSwitch" type="{https://services.alarmnet.com/TC2/}SceneSwitch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneStatusSwitch", propOrder = {
    "sceneSwitchInfo",
    "sceneSwitch"
})
public class SceneStatusSwitch {

    @XmlElement(name = "SceneSwitchInfo")
    protected SwitchInfo sceneSwitchInfo;
    @XmlElement(name = "SceneSwitch")
    protected SceneSwitch sceneSwitch;

    /**
     * Gets the value of the sceneSwitchInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchInfo }
     *     
     */
    public SwitchInfo getSceneSwitchInfo() {
        return sceneSwitchInfo;
    }

    /**
     * Sets the value of the sceneSwitchInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchInfo }
     *     
     */
    public void setSceneSwitchInfo(SwitchInfo value) {
        this.sceneSwitchInfo = value;
    }

    /**
     * Gets the value of the sceneSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link SceneSwitch }
     *     
     */
    public SceneSwitch getSceneSwitch() {
        return sceneSwitch;
    }

    /**
     * Sets the value of the sceneSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SceneSwitch }
     *     
     */
    public void setSceneSwitch(SceneSwitch value) {
        this.sceneSwitch = value;
    }

}
