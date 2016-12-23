
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCCThermostatdata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCCThermostatdata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndoorHumidity" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutdoorHumidity" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutdoorTemperature" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="TempHoldTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsScheduleCapable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MinHeatSetPoint" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="MaxHeatSetPoint" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="MinCoolSetPoint" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="MaxCoolSetPoint" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DeadbandforF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeadbandforC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCCThermostatdata", propOrder = {
    "indoorHumidity",
    "outdoorHumidity",
    "outdoorTemperature",
    "tempHoldTime",
    "isScheduleCapable",
    "minHeatSetPoint",
    "maxHeatSetPoint",
    "minCoolSetPoint",
    "maxCoolSetPoint",
    "deadbandforF",
    "deadbandforC"
})
public class TCCThermostatdata {

    @XmlElement(name = "IndoorHumidity")
    protected short indoorHumidity;
    @XmlElement(name = "OutdoorHumidity")
    protected short outdoorHumidity;
    @XmlElement(name = "OutdoorTemperature")
    protected short outdoorTemperature;
    @XmlElement(name = "TempHoldTime")
    protected String tempHoldTime;
    @XmlElement(name = "IsScheduleCapable")
    protected boolean isScheduleCapable;
    @XmlElement(name = "MinHeatSetPoint")
    protected short minHeatSetPoint;
    @XmlElement(name = "MaxHeatSetPoint")
    protected short maxHeatSetPoint;
    @XmlElement(name = "MinCoolSetPoint")
    protected short minCoolSetPoint;
    @XmlElement(name = "MaxCoolSetPoint")
    protected short maxCoolSetPoint;
    @XmlElement(name = "DeadbandforF")
    protected String deadbandforF;
    @XmlElement(name = "DeadbandforC")
    protected String deadbandforC;

    /**
     * Gets the value of the indoorHumidity property.
     * 
     */
    public short getIndoorHumidity() {
        return indoorHumidity;
    }

    /**
     * Sets the value of the indoorHumidity property.
     * 
     */
    public void setIndoorHumidity(short value) {
        this.indoorHumidity = value;
    }

    /**
     * Gets the value of the outdoorHumidity property.
     * 
     */
    public short getOutdoorHumidity() {
        return outdoorHumidity;
    }

    /**
     * Sets the value of the outdoorHumidity property.
     * 
     */
    public void setOutdoorHumidity(short value) {
        this.outdoorHumidity = value;
    }

    /**
     * Gets the value of the outdoorTemperature property.
     * 
     */
    public short getOutdoorTemperature() {
        return outdoorTemperature;
    }

    /**
     * Sets the value of the outdoorTemperature property.
     * 
     */
    public void setOutdoorTemperature(short value) {
        this.outdoorTemperature = value;
    }

    /**
     * Gets the value of the tempHoldTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempHoldTime() {
        return tempHoldTime;
    }

    /**
     * Sets the value of the tempHoldTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempHoldTime(String value) {
        this.tempHoldTime = value;
    }

    /**
     * Gets the value of the isScheduleCapable property.
     * 
     */
    public boolean isIsScheduleCapable() {
        return isScheduleCapable;
    }

    /**
     * Sets the value of the isScheduleCapable property.
     * 
     */
    public void setIsScheduleCapable(boolean value) {
        this.isScheduleCapable = value;
    }

    /**
     * Gets the value of the minHeatSetPoint property.
     * 
     */
    public short getMinHeatSetPoint() {
        return minHeatSetPoint;
    }

    /**
     * Sets the value of the minHeatSetPoint property.
     * 
     */
    public void setMinHeatSetPoint(short value) {
        this.minHeatSetPoint = value;
    }

    /**
     * Gets the value of the maxHeatSetPoint property.
     * 
     */
    public short getMaxHeatSetPoint() {
        return maxHeatSetPoint;
    }

    /**
     * Sets the value of the maxHeatSetPoint property.
     * 
     */
    public void setMaxHeatSetPoint(short value) {
        this.maxHeatSetPoint = value;
    }

    /**
     * Gets the value of the minCoolSetPoint property.
     * 
     */
    public short getMinCoolSetPoint() {
        return minCoolSetPoint;
    }

    /**
     * Sets the value of the minCoolSetPoint property.
     * 
     */
    public void setMinCoolSetPoint(short value) {
        this.minCoolSetPoint = value;
    }

    /**
     * Gets the value of the maxCoolSetPoint property.
     * 
     */
    public short getMaxCoolSetPoint() {
        return maxCoolSetPoint;
    }

    /**
     * Sets the value of the maxCoolSetPoint property.
     * 
     */
    public void setMaxCoolSetPoint(short value) {
        this.maxCoolSetPoint = value;
    }

    /**
     * Gets the value of the deadbandforF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadbandforF() {
        return deadbandforF;
    }

    /**
     * Sets the value of the deadbandforF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadbandforF(String value) {
        this.deadbandforF = value;
    }

    /**
     * Gets the value of the deadbandforC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadbandforC() {
        return deadbandforC;
    }

    /**
     * Sets the value of the deadbandforC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadbandforC(String value) {
        this.deadbandforC = value;
    }

}
