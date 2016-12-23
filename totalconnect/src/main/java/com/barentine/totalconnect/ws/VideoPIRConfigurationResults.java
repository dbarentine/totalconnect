
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoPIRConfigurationResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPIRConfigurationResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeatureFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SYSTEM_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIDEO_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOTION_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EVENT_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPIRConfigurationResults", propOrder = {
    "deviceName",
    "featureFlags",
    "systemData",
    "videoData",
    "motionData",
    "eventData"
})
public class VideoPIRConfigurationResults
    extends WebMethodResults
{

    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "FeatureFlags")
    protected String featureFlags;
    @XmlElement(name = "SYSTEM_Data")
    protected String systemData;
    @XmlElement(name = "VIDEO_Data")
    protected String videoData;
    @XmlElement(name = "MOTION_Data")
    protected String motionData;
    @XmlElement(name = "EVENT_Data")
    protected String eventData;

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
     * Gets the value of the systemData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSTEMData() {
        return systemData;
    }

    /**
     * Sets the value of the systemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSTEMData(String value) {
        this.systemData = value;
    }

    /**
     * Gets the value of the videoData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIDEOData() {
        return videoData;
    }

    /**
     * Sets the value of the videoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIDEOData(String value) {
        this.videoData = value;
    }

    /**
     * Gets the value of the motionData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIONData() {
        return motionData;
    }

    /**
     * Sets the value of the motionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIONData(String value) {
        this.motionData = value;
    }

    /**
     * Gets the value of the eventData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTData() {
        return eventData;
    }

    /**
     * Sets the value of the eventData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTData(String value) {
        this.eventData = value;
    }

}
