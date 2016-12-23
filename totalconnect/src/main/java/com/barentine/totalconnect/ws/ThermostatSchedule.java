
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermostatSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThermostatSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThermostatID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SetPoints" type="{https://services.alarmnet.com/TC2/}ArrayOfScheduleInfo" minOccurs="0"/>
 *         &lt;element name="HighThresholdValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="LowThresholdValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="HighThresholdStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LowThresholdStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermostatSchedule", propOrder = {
    "thermostatID",
    "setPoints",
    "highThresholdValue",
    "lowThresholdValue",
    "highThresholdStatus",
    "lowThresholdStatus"
})
public class ThermostatSchedule {

    @XmlElement(name = "ThermostatID")
    protected long thermostatID;
    @XmlElement(name = "SetPoints")
    protected ArrayOfScheduleInfo setPoints;
    @XmlElement(name = "HighThresholdValue")
    protected short highThresholdValue;
    @XmlElement(name = "LowThresholdValue")
    protected short lowThresholdValue;
    @XmlElement(name = "HighThresholdStatus")
    protected int highThresholdStatus;
    @XmlElement(name = "LowThresholdStatus")
    protected int lowThresholdStatus;

    /**
     * Gets the value of the thermostatID property.
     * 
     */
    public long getThermostatID() {
        return thermostatID;
    }

    /**
     * Sets the value of the thermostatID property.
     * 
     */
    public void setThermostatID(long value) {
        this.thermostatID = value;
    }

    /**
     * Gets the value of the setPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScheduleInfo }
     *     
     */
    public ArrayOfScheduleInfo getSetPoints() {
        return setPoints;
    }

    /**
     * Sets the value of the setPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScheduleInfo }
     *     
     */
    public void setSetPoints(ArrayOfScheduleInfo value) {
        this.setPoints = value;
    }

    /**
     * Gets the value of the highThresholdValue property.
     * 
     */
    public short getHighThresholdValue() {
        return highThresholdValue;
    }

    /**
     * Sets the value of the highThresholdValue property.
     * 
     */
    public void setHighThresholdValue(short value) {
        this.highThresholdValue = value;
    }

    /**
     * Gets the value of the lowThresholdValue property.
     * 
     */
    public short getLowThresholdValue() {
        return lowThresholdValue;
    }

    /**
     * Sets the value of the lowThresholdValue property.
     * 
     */
    public void setLowThresholdValue(short value) {
        this.lowThresholdValue = value;
    }

    /**
     * Gets the value of the highThresholdStatus property.
     * 
     */
    public int getHighThresholdStatus() {
        return highThresholdStatus;
    }

    /**
     * Sets the value of the highThresholdStatus property.
     * 
     */
    public void setHighThresholdStatus(int value) {
        this.highThresholdStatus = value;
    }

    /**
     * Gets the value of the lowThresholdStatus property.
     * 
     */
    public int getLowThresholdStatus() {
        return lowThresholdStatus;
    }

    /**
     * Sets the value of the lowThresholdStatus property.
     * 
     */
    public void setLowThresholdStatus(int value) {
        this.lowThresholdStatus = value;
    }

}
