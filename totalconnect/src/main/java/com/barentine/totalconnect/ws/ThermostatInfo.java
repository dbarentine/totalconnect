
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermostatInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThermostatInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ThermostatID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ThermostatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThermostatIndex" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CurrentOpMode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ThermostatMode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ThermostatFanMode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="HeatSetPoint" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CoolSetPoint" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="EnergySaveHeatSetPoint" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="EnergySaveCoolSetPoint" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="TemperatureScale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentTemperture" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="BatteryState" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="FanModeList" type="{https://services.alarmnet.com/TC2/}ArrayOfModeInfo" minOccurs="0"/>
 *         &lt;element name="ThermostatModeList" type="{https://services.alarmnet.com/TC2/}ArrayOfModeInfo" minOccurs="0"/>
 *         &lt;element name="ThermostatSupportedOpModeList" type="{https://services.alarmnet.com/TC2/}ArrayOfModeInfo" minOccurs="0"/>
 *         &lt;element name="DeviceStatusID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="LyricUserID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PartnerReferenceData" type="{https://services.alarmnet.com/TC2/}ThermostatPartnerRefData" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AutoChangeOverEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SmartAway" type="{https://services.alarmnet.com/TC2/}SmartAwayValues" minOccurs="0"/>
 *         &lt;element name="TCCthermostatdata" type="{https://services.alarmnet.com/TC2/}TCCThermostatdata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermostatInfo", propOrder = {
    "deviceID",
    "thermostatID",
    "thermostatName",
    "thermostatIndex",
    "currentOpMode",
    "thermostatMode",
    "thermostatFanMode",
    "heatSetPoint",
    "coolSetPoint",
    "energySaveHeatSetPoint",
    "energySaveCoolSetPoint",
    "temperatureScale",
    "currentTemperture",
    "batteryState",
    "fanModeList",
    "thermostatModeList",
    "thermostatSupportedOpModeList",
    "deviceStatusID",
    "lyricUserID",
    "partnerReferenceData",
    "deviceType",
    "autoChangeOverEnabled",
    "smartAway",
    "tcCthermostatdata"
})
public class ThermostatInfo {

    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "ThermostatID")
    protected long thermostatID;
    @XmlElement(name = "ThermostatName")
    protected String thermostatName;
    @XmlElement(name = "ThermostatIndex")
    protected short thermostatIndex;
    @XmlElement(name = "CurrentOpMode")
    protected short currentOpMode;
    @XmlElement(name = "ThermostatMode")
    protected short thermostatMode;
    @XmlElement(name = "ThermostatFanMode")
    protected short thermostatFanMode;
    @XmlElement(name = "HeatSetPoint")
    protected short heatSetPoint;
    @XmlElement(name = "CoolSetPoint")
    protected short coolSetPoint;
    @XmlElement(name = "EnergySaveHeatSetPoint")
    protected short energySaveHeatSetPoint;
    @XmlElement(name = "EnergySaveCoolSetPoint")
    protected short energySaveCoolSetPoint;
    @XmlElement(name = "TemperatureScale")
    protected String temperatureScale;
    @XmlElement(name = "CurrentTemperture")
    protected short currentTemperture;
    @XmlElement(name = "BatteryState")
    protected short batteryState;
    @XmlElement(name = "FanModeList")
    protected ArrayOfModeInfo fanModeList;
    @XmlElement(name = "ThermostatModeList")
    protected ArrayOfModeInfo thermostatModeList;
    @XmlElement(name = "ThermostatSupportedOpModeList")
    protected ArrayOfModeInfo thermostatSupportedOpModeList;
    @XmlElement(name = "DeviceStatusID")
    @XmlSchemaType(name = "unsignedByte")
    protected short deviceStatusID;
    @XmlElement(name = "LyricUserID")
    protected int lyricUserID;
    @XmlElement(name = "PartnerReferenceData")
    protected ThermostatPartnerRefData partnerReferenceData;
    @XmlElement(name = "DeviceType")
    protected int deviceType;
    @XmlElement(name = "AutoChangeOverEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean autoChangeOverEnabled;
    @XmlElement(name = "SmartAway")
    protected SmartAwayValues smartAway;
    @XmlElement(name = "TCCthermostatdata")
    protected TCCThermostatdata tcCthermostatdata;

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
     * Gets the value of the thermostatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThermostatName() {
        return thermostatName;
    }

    /**
     * Sets the value of the thermostatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThermostatName(String value) {
        this.thermostatName = value;
    }

    /**
     * Gets the value of the thermostatIndex property.
     * 
     */
    public short getThermostatIndex() {
        return thermostatIndex;
    }

    /**
     * Sets the value of the thermostatIndex property.
     * 
     */
    public void setThermostatIndex(short value) {
        this.thermostatIndex = value;
    }

    /**
     * Gets the value of the currentOpMode property.
     * 
     */
    public short getCurrentOpMode() {
        return currentOpMode;
    }

    /**
     * Sets the value of the currentOpMode property.
     * 
     */
    public void setCurrentOpMode(short value) {
        this.currentOpMode = value;
    }

    /**
     * Gets the value of the thermostatMode property.
     * 
     */
    public short getThermostatMode() {
        return thermostatMode;
    }

    /**
     * Sets the value of the thermostatMode property.
     * 
     */
    public void setThermostatMode(short value) {
        this.thermostatMode = value;
    }

    /**
     * Gets the value of the thermostatFanMode property.
     * 
     */
    public short getThermostatFanMode() {
        return thermostatFanMode;
    }

    /**
     * Sets the value of the thermostatFanMode property.
     * 
     */
    public void setThermostatFanMode(short value) {
        this.thermostatFanMode = value;
    }

    /**
     * Gets the value of the heatSetPoint property.
     * 
     */
    public short getHeatSetPoint() {
        return heatSetPoint;
    }

    /**
     * Sets the value of the heatSetPoint property.
     * 
     */
    public void setHeatSetPoint(short value) {
        this.heatSetPoint = value;
    }

    /**
     * Gets the value of the coolSetPoint property.
     * 
     */
    public short getCoolSetPoint() {
        return coolSetPoint;
    }

    /**
     * Sets the value of the coolSetPoint property.
     * 
     */
    public void setCoolSetPoint(short value) {
        this.coolSetPoint = value;
    }

    /**
     * Gets the value of the energySaveHeatSetPoint property.
     * 
     */
    public short getEnergySaveHeatSetPoint() {
        return energySaveHeatSetPoint;
    }

    /**
     * Sets the value of the energySaveHeatSetPoint property.
     * 
     */
    public void setEnergySaveHeatSetPoint(short value) {
        this.energySaveHeatSetPoint = value;
    }

    /**
     * Gets the value of the energySaveCoolSetPoint property.
     * 
     */
    public short getEnergySaveCoolSetPoint() {
        return energySaveCoolSetPoint;
    }

    /**
     * Sets the value of the energySaveCoolSetPoint property.
     * 
     */
    public void setEnergySaveCoolSetPoint(short value) {
        this.energySaveCoolSetPoint = value;
    }

    /**
     * Gets the value of the temperatureScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureScale() {
        return temperatureScale;
    }

    /**
     * Sets the value of the temperatureScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureScale(String value) {
        this.temperatureScale = value;
    }

    /**
     * Gets the value of the currentTemperture property.
     * 
     */
    public short getCurrentTemperture() {
        return currentTemperture;
    }

    /**
     * Sets the value of the currentTemperture property.
     * 
     */
    public void setCurrentTemperture(short value) {
        this.currentTemperture = value;
    }

    /**
     * Gets the value of the batteryState property.
     * 
     */
    public short getBatteryState() {
        return batteryState;
    }

    /**
     * Sets the value of the batteryState property.
     * 
     */
    public void setBatteryState(short value) {
        this.batteryState = value;
    }

    /**
     * Gets the value of the fanModeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModeInfo }
     *     
     */
    public ArrayOfModeInfo getFanModeList() {
        return fanModeList;
    }

    /**
     * Sets the value of the fanModeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModeInfo }
     *     
     */
    public void setFanModeList(ArrayOfModeInfo value) {
        this.fanModeList = value;
    }

    /**
     * Gets the value of the thermostatModeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModeInfo }
     *     
     */
    public ArrayOfModeInfo getThermostatModeList() {
        return thermostatModeList;
    }

    /**
     * Sets the value of the thermostatModeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModeInfo }
     *     
     */
    public void setThermostatModeList(ArrayOfModeInfo value) {
        this.thermostatModeList = value;
    }

    /**
     * Gets the value of the thermostatSupportedOpModeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModeInfo }
     *     
     */
    public ArrayOfModeInfo getThermostatSupportedOpModeList() {
        return thermostatSupportedOpModeList;
    }

    /**
     * Sets the value of the thermostatSupportedOpModeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModeInfo }
     *     
     */
    public void setThermostatSupportedOpModeList(ArrayOfModeInfo value) {
        this.thermostatSupportedOpModeList = value;
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

    /**
     * Gets the value of the lyricUserID property.
     * 
     */
    public int getLyricUserID() {
        return lyricUserID;
    }

    /**
     * Sets the value of the lyricUserID property.
     * 
     */
    public void setLyricUserID(int value) {
        this.lyricUserID = value;
    }

    /**
     * Gets the value of the partnerReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatPartnerRefData }
     *     
     */
    public ThermostatPartnerRefData getPartnerReferenceData() {
        return partnerReferenceData;
    }

    /**
     * Sets the value of the partnerReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatPartnerRefData }
     *     
     */
    public void setPartnerReferenceData(ThermostatPartnerRefData value) {
        this.partnerReferenceData = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     */
    public int getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     */
    public void setDeviceType(int value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the autoChangeOverEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoChangeOverEnabled() {
        return autoChangeOverEnabled;
    }

    /**
     * Sets the value of the autoChangeOverEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoChangeOverEnabled(Boolean value) {
        this.autoChangeOverEnabled = value;
    }

    /**
     * Gets the value of the smartAway property.
     * 
     * @return
     *     possible object is
     *     {@link SmartAwayValues }
     *     
     */
    public SmartAwayValues getSmartAway() {
        return smartAway;
    }

    /**
     * Sets the value of the smartAway property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartAwayValues }
     *     
     */
    public void setSmartAway(SmartAwayValues value) {
        this.smartAway = value;
    }

    /**
     * Gets the value of the tcCthermostatdata property.
     * 
     * @return
     *     possible object is
     *     {@link TCCThermostatdata }
     *     
     */
    public TCCThermostatdata getTCCthermostatdata() {
        return tcCthermostatdata;
    }

    /**
     * Sets the value of the tcCthermostatdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCCThermostatdata }
     *     
     */
    public void setTCCthermostatdata(TCCThermostatdata value) {
        this.tcCthermostatdata = value;
    }

}
