
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoPIRInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPIRInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceClassID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatteryStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirmwareAvailablity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirmwareDownLoad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FeatureFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WifiStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VideoPIREventInfo" type="{https://services.alarmnet.com/TC2/}VideoPIREvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPIRInfo", propOrder = {
    "deviceID",
    "deviceClassID",
    "mac",
    "deviceName",
    "batteryStatus",
    "firmwareAvailablity",
    "firmwareDownLoad",
    "featureFlags",
    "wifiStatus",
    "videoPIREventInfo"
})
public class VideoPIRInfo {

    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "DeviceClassID")
    protected int deviceClassID;
    @XmlElement(name = "MAC")
    protected String mac;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "BatteryStatus")
    protected int batteryStatus;
    @XmlElement(name = "FirmwareAvailablity")
    protected int firmwareAvailablity;
    @XmlElement(name = "FirmwareDownLoad")
    protected int firmwareDownLoad;
    @XmlElement(name = "FeatureFlags")
    protected String featureFlags;
    @XmlElement(name = "WifiStatus")
    protected int wifiStatus;
    @XmlElement(name = "VideoPIREventInfo")
    protected VideoPIREvent videoPIREventInfo;

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
     * Gets the value of the deviceClassID property.
     * 
     */
    public int getDeviceClassID() {
        return deviceClassID;
    }

    /**
     * Sets the value of the deviceClassID property.
     * 
     */
    public void setDeviceClassID(int value) {
        this.deviceClassID = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAC() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAC(String value) {
        this.mac = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the batteryStatus property.
     * 
     */
    public int getBatteryStatus() {
        return batteryStatus;
    }

    /**
     * Sets the value of the batteryStatus property.
     * 
     */
    public void setBatteryStatus(int value) {
        this.batteryStatus = value;
    }

    /**
     * Gets the value of the firmwareAvailablity property.
     * 
     */
    public int getFirmwareAvailablity() {
        return firmwareAvailablity;
    }

    /**
     * Sets the value of the firmwareAvailablity property.
     * 
     */
    public void setFirmwareAvailablity(int value) {
        this.firmwareAvailablity = value;
    }

    /**
     * Gets the value of the firmwareDownLoad property.
     * 
     */
    public int getFirmwareDownLoad() {
        return firmwareDownLoad;
    }

    /**
     * Sets the value of the firmwareDownLoad property.
     * 
     */
    public void setFirmwareDownLoad(int value) {
        this.firmwareDownLoad = value;
    }

    /**
     * Gets the value of the featureFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureFlags() {
        return featureFlags;
    }

    /**
     * Sets the value of the featureFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureFlags(String value) {
        this.featureFlags = value;
    }

    /**
     * Gets the value of the wifiStatus property.
     * 
     */
    public int getWifiStatus() {
        return wifiStatus;
    }

    /**
     * Sets the value of the wifiStatus property.
     * 
     */
    public void setWifiStatus(int value) {
        this.wifiStatus = value;
    }

    /**
     * Gets the value of the videoPIREventInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPIREvent }
     *     
     */
    public VideoPIREvent getVideoPIREventInfo() {
        return videoPIREventInfo;
    }

    /**
     * Sets the value of the videoPIREventInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPIREvent }
     *     
     */
    public void setVideoPIREventInfo(VideoPIREvent value) {
        this.videoPIREventInfo = value;
    }

}
