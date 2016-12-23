
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WifiThermostatSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WifiThermostatSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxNumberOfPeriodsInDay" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SchedulePeriodInfo" type="{https://services.alarmnet.com/TC2/}ArrayOfSchedulePeriodInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WifiThermostatSchedule", propOrder = {
    "maxNumberOfPeriodsInDay",
    "schedulePeriodInfo"
})
public class WifiThermostatSchedule {

    @XmlElement(name = "MaxNumberOfPeriodsInDay")
    protected short maxNumberOfPeriodsInDay;
    @XmlElement(name = "SchedulePeriodInfo")
    protected ArrayOfSchedulePeriodInfo schedulePeriodInfo;

    /**
     * Gets the value of the maxNumberOfPeriodsInDay property.
     * 
     */
    public short getMaxNumberOfPeriodsInDay() {
        return maxNumberOfPeriodsInDay;
    }

    /**
     * Sets the value of the maxNumberOfPeriodsInDay property.
     * 
     */
    public void setMaxNumberOfPeriodsInDay(short value) {
        this.maxNumberOfPeriodsInDay = value;
    }

    /**
     * Gets the value of the schedulePeriodInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSchedulePeriodInfo }
     *     
     */
    public ArrayOfSchedulePeriodInfo getSchedulePeriodInfo() {
        return schedulePeriodInfo;
    }

    /**
     * Sets the value of the schedulePeriodInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSchedulePeriodInfo }
     *     
     */
    public void setSchedulePeriodInfo(ArrayOfSchedulePeriodInfo value) {
        this.schedulePeriodInfo = value;
    }

}
