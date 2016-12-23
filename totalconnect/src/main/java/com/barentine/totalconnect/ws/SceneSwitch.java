
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneSwitch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneSwitch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SwitchID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SceneSwitchState" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SceneSwitchLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneSwitch", propOrder = {
    "switchID",
    "sceneSwitchState",
    "sceneSwitchLevel"
})
public class SceneSwitch {

    @XmlElement(name = "SwitchID")
    protected long switchID;
    @XmlElement(name = "SceneSwitchState")
    protected short sceneSwitchState;
    @XmlElement(name = "SceneSwitchLevel")
    protected short sceneSwitchLevel;

    /**
     * Gets the value of the switchID property.
     * 
     */
    public long getSwitchID() {
        return switchID;
    }

    /**
     * Sets the value of the switchID property.
     * 
     */
    public void setSwitchID(long value) {
        this.switchID = value;
    }

    /**
     * Gets the value of the sceneSwitchState property.
     * 
     */
    public short getSceneSwitchState() {
        return sceneSwitchState;
    }

    /**
     * Sets the value of the sceneSwitchState property.
     * 
     */
    public void setSceneSwitchState(short value) {
        this.sceneSwitchState = value;
    }

    /**
     * Gets the value of the sceneSwitchLevel property.
     * 
     */
    public short getSceneSwitchLevel() {
        return sceneSwitchLevel;
    }

    /**
     * Sets the value of the sceneSwitchLevel property.
     * 
     */
    public void setSceneSwitchLevel(short value) {
        this.sceneSwitchLevel = value;
    }

}
