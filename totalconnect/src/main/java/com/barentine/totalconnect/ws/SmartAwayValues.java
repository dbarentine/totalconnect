
package com.barentine.totalconnect.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartAwayValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartAwayValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TimeOfDay" type="{https://services.alarmnet.com/TC2/}TimeSpan"/>
 *         &lt;element name="DurationInHours" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DurationInDays" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="LastUsedFormat" type="{https://services.alarmnet.com/TC2/}AwayEndDateFormat"/>
 *         &lt;element name="EndsIn" type="{https://services.alarmnet.com/TC2/}DateTimeOffset"/>
 *         &lt;element name="EndCoolSetPoint" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="EndHeatSetPoint" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartAwayValues", propOrder = {
    "active",
    "timeOfDay",
    "durationInHours",
    "durationInDays",
    "lastUsedFormat",
    "endsIn",
    "endCoolSetPoint",
    "endHeatSetPoint"
})
public class SmartAwayValues {

    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "TimeOfDay", required = true)
    protected TimeSpan timeOfDay;
    @XmlElement(name = "DurationInHours")
    protected double durationInHours;
    @XmlElement(name = "DurationInDays")
    @XmlSchemaType(name = "unsignedByte")
    protected short durationInDays;
    @XmlElement(name = "LastUsedFormat", required = true)
    @XmlSchemaType(name = "string")
    protected AwayEndDateFormat lastUsedFormat;
    @XmlElement(name = "EndsIn", required = true)
    protected DateTimeOffset endsIn;
    @XmlElement(name = "EndCoolSetPoint", required = true, nillable = true)
    protected BigDecimal endCoolSetPoint;
    @XmlElement(name = "EndHeatSetPoint", required = true, nillable = true)
    protected BigDecimal endHeatSetPoint;

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the timeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * Sets the value of the timeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setTimeOfDay(TimeSpan value) {
        this.timeOfDay = value;
    }

    /**
     * Gets the value of the durationInHours property.
     * 
     */
    public double getDurationInHours() {
        return durationInHours;
    }

    /**
     * Sets the value of the durationInHours property.
     * 
     */
    public void setDurationInHours(double value) {
        this.durationInHours = value;
    }

    /**
     * Gets the value of the durationInDays property.
     * 
     */
    public short getDurationInDays() {
        return durationInDays;
    }

    /**
     * Sets the value of the durationInDays property.
     * 
     */
    public void setDurationInDays(short value) {
        this.durationInDays = value;
    }

    /**
     * Gets the value of the lastUsedFormat property.
     * 
     * @return
     *     possible object is
     *     {@link AwayEndDateFormat }
     *     
     */
    public AwayEndDateFormat getLastUsedFormat() {
        return lastUsedFormat;
    }

    /**
     * Sets the value of the lastUsedFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwayEndDateFormat }
     *     
     */
    public void setLastUsedFormat(AwayEndDateFormat value) {
        this.lastUsedFormat = value;
    }

    /**
     * Gets the value of the endsIn property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeOffset }
     *     
     */
    public DateTimeOffset getEndsIn() {
        return endsIn;
    }

    /**
     * Sets the value of the endsIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeOffset }
     *     
     */
    public void setEndsIn(DateTimeOffset value) {
        this.endsIn = value;
    }

    /**
     * Gets the value of the endCoolSetPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndCoolSetPoint() {
        return endCoolSetPoint;
    }

    /**
     * Sets the value of the endCoolSetPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndCoolSetPoint(BigDecimal value) {
        this.endCoolSetPoint = value;
    }

    /**
     * Gets the value of the endHeatSetPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndHeatSetPoint() {
        return endHeatSetPoint;
    }

    /**
     * Sets the value of the endHeatSetPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndHeatSetPoint(BigDecimal value) {
        this.endHeatSetPoint = value;
    }

}
