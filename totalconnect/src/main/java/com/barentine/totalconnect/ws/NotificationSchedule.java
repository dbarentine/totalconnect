
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="NotificationScheduleID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="NotificationScheduleName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DayID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsInUse" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationSchedule")
public class NotificationSchedule {

    @XmlAttribute(name = "NotificationScheduleID", required = true)
    protected long notificationScheduleID;
    @XmlAttribute(name = "NotificationScheduleName")
    protected String notificationScheduleName;
    @XmlAttribute(name = "DayID", required = true)
    protected int dayID;
    @XmlAttribute(name = "StartTime")
    protected String startTime;
    @XmlAttribute(name = "EndTime")
    protected String endTime;
    @XmlAttribute(name = "IsInUse", required = true)
    protected boolean isInUse;

    /**
     * Gets the value of the notificationScheduleID property.
     * 
     */
    public long getNotificationScheduleID() {
        return notificationScheduleID;
    }

    /**
     * Sets the value of the notificationScheduleID property.
     * 
     */
    public void setNotificationScheduleID(long value) {
        this.notificationScheduleID = value;
    }

    /**
     * Gets the value of the notificationScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationScheduleName() {
        return notificationScheduleName;
    }

    /**
     * Sets the value of the notificationScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationScheduleName(String value) {
        this.notificationScheduleName = value;
    }

    /**
     * Gets the value of the dayID property.
     * 
     */
    public int getDayID() {
        return dayID;
    }

    /**
     * Sets the value of the dayID property.
     * 
     */
    public void setDayID(int value) {
        this.dayID = value;
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
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the isInUse property.
     * 
     */
    public boolean isIsInUse() {
        return isInUse;
    }

    /**
     * Sets the value of the isInUse property.
     * 
     */
    public void setIsInUse(boolean value) {
        this.isInUse = value;
    }

}
