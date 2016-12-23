
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScheduleID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ScheduleDay" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="TimePeriods" type="{https://services.alarmnet.com/TC2/}ArrayOfTimePeriodInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleInfo", propOrder = {
    "scheduleID",
    "scheduleDay",
    "timePeriods"
})
public class ScheduleInfo {

    @XmlElement(name = "ScheduleID")
    protected long scheduleID;
    @XmlElement(name = "ScheduleDay")
    protected short scheduleDay;
    @XmlElement(name = "TimePeriods")
    protected ArrayOfTimePeriodInfo timePeriods;

    /**
     * Gets the value of the scheduleID property.
     * 
     */
    public long getScheduleID() {
        return scheduleID;
    }

    /**
     * Sets the value of the scheduleID property.
     * 
     */
    public void setScheduleID(long value) {
        this.scheduleID = value;
    }

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
     * Gets the value of the timePeriods property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimePeriodInfo }
     *     
     */
    public ArrayOfTimePeriodInfo getTimePeriods() {
        return timePeriods;
    }

    /**
     * Sets the value of the timePeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimePeriodInfo }
     *     
     */
    public void setTimePeriods(ArrayOfTimePeriodInfo value) {
        this.timePeriods = value;
    }

}
