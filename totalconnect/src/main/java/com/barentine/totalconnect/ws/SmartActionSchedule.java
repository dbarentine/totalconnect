
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartActionSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartActionSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmartActionScheduleID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FrequencyType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScheduleDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DayOfWeek" type="{https://services.alarmnet.com/TC2/}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="DayOfMonth" type="{https://services.alarmnet.com/TC2/}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sunrise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Sunset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RandomMinutesBefore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RandomMinutesAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartActionSchedule", propOrder = {
    "smartActionScheduleID",
    "frequencyType",
    "scheduleDate",
    "dayOfWeek",
    "dayOfMonth",
    "startTime",
    "sunrise",
    "sunset",
    "randomMinutesBefore",
    "randomMinutesAfter"
})
public class SmartActionSchedule {

    @XmlElement(name = "SmartActionScheduleID")
    protected long smartActionScheduleID;
    @XmlElement(name = "FrequencyType")
    protected int frequencyType;
    @XmlElement(name = "ScheduleDate")
    protected String scheduleDate;
    @XmlElement(name = "DayOfWeek")
    protected ArrayOfInt dayOfWeek;
    @XmlElement(name = "DayOfMonth")
    protected ArrayOfInt dayOfMonth;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "Sunrise")
    protected int sunrise;
    @XmlElement(name = "Sunset")
    protected int sunset;
    @XmlElement(name = "RandomMinutesBefore")
    protected int randomMinutesBefore;
    @XmlElement(name = "RandomMinutesAfter")
    protected int randomMinutesAfter;

    /**
     * Gets the value of the smartActionScheduleID property.
     * 
     */
    public long getSmartActionScheduleID() {
        return smartActionScheduleID;
    }

    /**
     * Sets the value of the smartActionScheduleID property.
     * 
     */
    public void setSmartActionScheduleID(long value) {
        this.smartActionScheduleID = value;
    }

    /**
     * Gets the value of the frequencyType property.
     * 
     */
    public int getFrequencyType() {
        return frequencyType;
    }

    /**
     * Sets the value of the frequencyType property.
     * 
     */
    public void setFrequencyType(int value) {
        this.frequencyType = value;
    }

    /**
     * Gets the value of the scheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleDate(String value) {
        this.scheduleDate = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setDayOfWeek(ArrayOfInt value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the dayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setDayOfMonth(ArrayOfInt value) {
        this.dayOfMonth = value;
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
     * Gets the value of the sunrise property.
     * 
     */
    public int getSunrise() {
        return sunrise;
    }

    /**
     * Sets the value of the sunrise property.
     * 
     */
    public void setSunrise(int value) {
        this.sunrise = value;
    }

    /**
     * Gets the value of the sunset property.
     * 
     */
    public int getSunset() {
        return sunset;
    }

    /**
     * Sets the value of the sunset property.
     * 
     */
    public void setSunset(int value) {
        this.sunset = value;
    }

    /**
     * Gets the value of the randomMinutesBefore property.
     * 
     */
    public int getRandomMinutesBefore() {
        return randomMinutesBefore;
    }

    /**
     * Sets the value of the randomMinutesBefore property.
     * 
     */
    public void setRandomMinutesBefore(int value) {
        this.randomMinutesBefore = value;
    }

    /**
     * Gets the value of the randomMinutesAfter property.
     * 
     */
    public int getRandomMinutesAfter() {
        return randomMinutesAfter;
    }

    /**
     * Sets the value of the randomMinutesAfter property.
     * 
     */
    public void setRandomMinutesAfter(int value) {
        this.randomMinutesAfter = value;
    }

}
