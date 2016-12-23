
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwitchInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SwitchID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SwitchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SwitchIndex" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SwitchType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SwitchState" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SwitchLevel" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SwitchIconID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DeviceStatusID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchInfo", propOrder = {
    "deviceID",
    "switchID",
    "switchName",
    "switchIndex",
    "switchType",
    "switchState",
    "switchLevel",
    "switchIconID",
    "deviceStatusID"
})
public class SwitchInfo {

    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "SwitchID")
    protected long switchID;
    @XmlElement(name = "SwitchName")
    protected String switchName;
    @XmlElement(name = "SwitchIndex")
    protected short switchIndex;
    @XmlElement(name = "SwitchType")
    protected int switchType;
    @XmlElement(name = "SwitchState")
    protected short switchState;
    @XmlElement(name = "SwitchLevel")
    protected short switchLevel;
    @XmlElement(name = "SwitchIconID")
    protected short switchIconID;
    @XmlElement(name = "DeviceStatusID")
    @XmlSchemaType(name = "unsignedByte")
    protected short deviceStatusID;

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
     * Gets the value of the switchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchName() {
        return switchName;
    }

    /**
     * Sets the value of the switchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchName(String value) {
        this.switchName = value;
    }

    /**
     * Gets the value of the switchIndex property.
     * 
     */
    public short getSwitchIndex() {
        return switchIndex;
    }

    /**
     * Sets the value of the switchIndex property.
     * 
     */
    public void setSwitchIndex(short value) {
        this.switchIndex = value;
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

    /**
     * Gets the value of the switchIconID property.
     * 
     */
    public short getSwitchIconID() {
        return switchIconID;
    }

    /**
     * Sets the value of the switchIconID property.
     * 
     */
    public void setSwitchIconID(short value) {
        this.switchIconID = value;
    }

    /**
     * Gets the value of the deviceStatusID property.
     * 
     */
    public short getDeviceStatusID() {
        return deviceStatusID;
    }

    /**
     * Sets the value of the deviceStatusID property.
     * 
     */
    public void setDeviceStatusID(short value) {
        this.deviceStatusID = value;
    }

}
