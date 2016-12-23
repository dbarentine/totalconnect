
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchSubAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwitchSubAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubActionID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SwitchType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SwitchID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchSubAction", propOrder = {
    "subActionID",
    "switchType",
    "switchID",
    "state",
    "level"
})
public class SwitchSubAction {

    @XmlElement(name = "SubActionID")
    protected long subActionID;
    @XmlElement(name = "SwitchType")
    protected int switchType;
    @XmlElement(name = "SwitchID")
    protected long switchID;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "Level")
    protected int level;

    /**
     * Gets the value of the subActionID property.
     * 
     */
    public long getSubActionID() {
        return subActionID;
    }

    /**
     * Sets the value of the subActionID property.
     * 
     */
    public void setSubActionID(long value) {
        this.subActionID = value;
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
     * Gets the value of the state property.
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     */
    public void setState(int value) {
        this.state = value;
    }

    /**
     * Gets the value of the level property.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

}
