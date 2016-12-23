
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchedulePeriodInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchedulePeriodInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScheduleDay" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="PeriodType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsScheduled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HeatSetPoint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CoolSetPoint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FanMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchedulePeriodInfo", propOrder = {
    "scheduleDay",
    "periodType",
    "startTime",
    "isScheduled",
    "heatSetPoint",
    "coolSetPoint",
    "fanMode"
})
public class SchedulePeriodInfo {

    @XmlElement(name = "ScheduleDay")
    protected short scheduleDay;
    @XmlElement(name = "PeriodType")
    protected short periodType;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "IsScheduled")
    protected boolean isScheduled;
    @XmlElement(name = "HeatSetPoint")
    protected int heatSetPoint;
    @XmlElement(name = "CoolSetPoint")
    protected int coolSetPoint;
    @XmlElement(name = "FanMode")
    protected int fanMode;

    /**
     * Gets the value of the scheduleDay property.
     * 
     */
    public short getScheduleDay() {
        return scheduleDay;
    }

    /**
     * Sets the value of the scheduleDay property.
     * 
     */
    public void setScheduleDay(short value) {
        this.scheduleDay = value;
    }

    /**
     * Gets the value of the periodType property.
     * 
     */
    public short getPeriodType() {
        return periodType;
    }

    /**
     * Sets the value of the periodType property.
     * 
     */
    public void setPeriodType(short value) {
        this.periodType = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the isScheduled property.
     * 
     */
    public boolean isIsScheduled() {
        return isScheduled;
    }

    /**
     * Sets the value of the isScheduled property.
     * 
     */
    public void setIsScheduled(boolean value) {
        this.isScheduled = value;
    }

    /**
     * Gets the value of the heatSetPoint property.
     * 
     */
    public int getHeatSetPoint() {
        return heatSetPoint;
    }

    /**
     * Sets the value of the heatSetPoint property.
     * 
     */
    public void setHeatSetPoint(int value) {
        this.heatSetPoint = value;
    }

    /**
     * Gets the value of the coolSetPoint property.
     * 
     */
    public int getCoolSetPoint() {
        return coolSetPoint;
    }

    /**
     * Sets the value of the coolSetPoint property.
     * 
     */
    public void setCoolSetPoint(int value) {
        this.coolSetPoint = value;
    }

    /**
     * Gets the value of the fanMode property.
     * 
     */
    public int getFanMode() {
        return fanMode;
    }

    /**
     * Sets the value of the fanMode property.
     * 
     */
    public void setFanMode(int value) {
        this.fanMode = value;
    }

}
