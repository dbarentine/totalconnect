
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneSwitchSubAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneSwitchSubAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SwitchID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SwitchState" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SwitchType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SwitchLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneSwitchSubAction", propOrder = {
    "switchID",
    "switchState",
    "switchType",
    "switchLevel"
})
public class SceneSwitchSubAction {

    @XmlElement(name = "SwitchID")
    protected long switchID;
    @XmlElement(name = "SwitchState")
    protected short switchState;
    @XmlElement(name = "SwitchType")
    protected int switchType;
    @XmlElement(name = "SwitchLevel")
    protected short switchLevel;

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
     * Gets the value of the switchState property.
     * 
     */
    public short getSwitchState() {
        return switchState;
    }

    /**
     * Sets the value of the switchState property.
     * 
     */
    public void setSwitchState(short value) {
        this.switchState = value;
    }

    /**
     * Gets the value of the switchType property.
     * 
     */
    public int getSwitchType() {
        return switchType;
    }

    /**
     * Sets the value of the switchType property.
     * 
     */
    public void setSwitchType(int value) {
        this.switchType = value;
    }

    /**
     * Gets the value of the switchLevel property.
     * 
     */
    public short getSwitchLevel() {
        return switchLevel;
    }

    /**
     * Sets the value of the switchLevel property.
     * 
     */
    public void setSwitchLevel(short value) {
        this.switchLevel = value;
    }

}
