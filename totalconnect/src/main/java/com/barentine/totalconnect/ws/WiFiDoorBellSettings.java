
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiDoorBellSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiDoorBellSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RingTone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotRing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndoorChime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DigitalDoorbell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VideoProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MicrophoneVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpeakerVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChimeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotionSensitivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LowLightThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediumLightThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HighLightThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LowDACBrightness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediumDACBrightness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HighDACBrightness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RGBRedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RGBGreenValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RGBBlueValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrontLEDBrightness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotionPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerDeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiDoorBellSettings", propOrder = {
    "ringTone",
    "doNotRing",
    "indoorChime",
    "digitalDoorbell",
    "videoProfile",
    "microphoneVolume",
    "speakerVolume",
    "chimeLevel",
    "motionSensitivity",
    "lowLightThreshold",
    "mediumLightThreshold",
    "highLightThreshold",
    "lowDACBrightness",
    "mediumDACBrightness",
    "highDACBrightness",
    "rgbRedValue",
    "rgbGreenValue",
    "rgbBlueValue",
    "frontLEDBrightness",
    "motionPolicy",
    "partnerDeviceName"
})
public class WiFiDoorBellSettings {

    @XmlElement(name = "RingTone")
    protected String ringTone;
    @XmlElement(name = "DoNotRing")
    protected String doNotRing;
    @XmlElement(name = "IndoorChime")
    protected String indoorChime;
    @XmlElement(name = "DigitalDoorbell")
    protected String digitalDoorbell;
    @XmlElement(name = "VideoProfile")
    protected String videoProfile;
    @XmlElement(name = "MicrophoneVolume")
    protected String microphoneVolume;
    @XmlElement(name = "SpeakerVolume")
    protected String speakerVolume;
    @XmlElement(name = "ChimeLevel")
    protected String chimeLevel;
    @XmlElement(name = "MotionSensitivity")
    protected String motionSensitivity;
    @XmlElement(name = "LowLightThreshold")
    protected String lowLightThreshold;
    @XmlElement(name = "MediumLightThreshold")
    protected String mediumLightThreshold;
    @XmlElement(name = "HighLightThreshold")
    protected String highLightThreshold;
    @XmlElement(name = "LowDACBrightness")
    protected String lowDACBrightness;
    @XmlElement(name = "MediumDACBrightness")
    protected String mediumDACBrightness;
    @XmlElement(name = "HighDACBrightness")
    protected String highDACBrightness;
    @XmlElement(name = "RGBRedValue")
    protected String rgbRedValue;
    @XmlElement(name = "RGBGreenValue")
    protected String rgbGreenValue;
    @XmlElement(name = "RGBBlueValue")
    protected String rgbBlueValue;
    @XmlElement(name = "FrontLEDBrightness")
    protected String frontLEDBrightness;
    @XmlElement(name = "MotionPolicy")
    protected String motionPolicy;
    @XmlElement(name = "PartnerDeviceName")
    protected String partnerDeviceName;

    /**
     * Gets the value of the ringTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingTone() {
        return ringTone;
    }

    /**
     * Sets the value of the ringTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingTone(String value) {
        this.ringTone = value;
    }

    /**
     * Gets the value of the doNotRing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoNotRing() {
        return doNotRing;
    }

    /**
     * Sets the value of the doNotRing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoNotRing(String value) {
        this.doNotRing = value;
    }

    /**
     * Gets the value of the indoorChime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndoorChime() {
        return indoorChime;
    }

    /**
     * Sets the value of the indoorChime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndoorChime(String value) {
        this.indoorChime = value;
    }

    /**
     * Gets the value of the digitalDoorbell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalDoorbell() {
        return digitalDoorbell;
    }

    /**
     * Sets the value of the digitalDoorbell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalDoorbell(String value) {
        this.digitalDoorbell = value;
    }

    /**
     * Gets the value of the videoProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoProfile() {
        return videoProfile;
    }

    /**
     * Sets the value of the videoProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoProfile(String value) {
        this.videoProfile = value;
    }

    /**
     * Gets the value of the microphoneVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicrophoneVolume() {
        return microphoneVolume;
    }

    /**
     * Sets the value of the microphoneVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicrophoneVolume(String value) {
        this.microphoneVolume = value;
    }

    /**
     * Gets the value of the speakerVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerVolume() {
        return speakerVolume;
    }

    /**
     * Sets the value of the speakerVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerVolume(String value) {
        this.speakerVolume = value;
    }

    /**
     * Gets the value of the chimeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChimeLevel() {
        return chimeLevel;
    }

    /**
     * Sets the value of the chimeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChimeLevel(String value) {
        this.chimeLevel = value;
    }

    /**
     * Gets the value of the motionSensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotionSensitivity() {
        return motionSensitivity;
    }

    /**
     * Sets the value of the motionSensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotionSensitivity(String value) {
        this.motionSensitivity = value;
    }

    /**
     * Gets the value of the lowLightThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowLightThreshold() {
        return lowLightThreshold;
    }

    /**
     * Sets the value of the lowLightThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowLightThreshold(String value) {
        this.lowLightThreshold = value;
    }

    /**
     * Gets the value of the mediumLightThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumLightThreshold() {
        return mediumLightThreshold;
    }

    /**
     * Sets the value of the mediumLightThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumLightThreshold(String value) {
        this.mediumLightThreshold = value;
    }

    /**
     * Gets the value of the highLightThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighLightThreshold() {
        return highLightThreshold;
    }

    /**
     * Sets the value of the highLightThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighLightThreshold(String value) {
        this.highLightThreshold = value;
    }

    /**
     * Gets the value of the lowDACBrightness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowDACBrightness() {
        return lowDACBrightness;
    }

    /**
     * Sets the value of the lowDACBrightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowDACBrightness(String value) {
        this.lowDACBrightness = value;
    }

    /**
     * Gets the value of the mediumDACBrightness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumDACBrightness() {
        return mediumDACBrightness;
    }

    /**
     * Sets the value of the mediumDACBrightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumDACBrightness(String value) {
        this.mediumDACBrightness = value;
    }

    /**
     * Gets the value of the highDACBrightness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighDACBrightness() {
        return highDACBrightness;
    }

    /**
     * Sets the value of the highDACBrightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighDACBrightness(String value) {
        this.highDACBrightness = value;
    }

    /**
     * Gets the value of the rgbRedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGBRedValue() {
        return rgbRedValue;
    }

    /**
     * Sets the value of the rgbRedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGBRedValue(String value) {
        this.rgbRedValue = value;
    }

    /**
     * Gets the value of the rgbGreenValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGBGreenValue() {
        return rgbGreenValue;
    }

    /**
     * Sets the value of the rgbGreenValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGBGreenValue(String value) {
        this.rgbGreenValue = value;
    }

    /**
     * Gets the value of the rgbBlueValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGBBlueValue() {
        return rgbBlueValue;
    }

    /**
     * Sets the value of the rgbBlueValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGBBlueValue(String value) {
        this.rgbBlueValue = value;
    }

    /**
     * Gets the value of the frontLEDBrightness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontLEDBrightness() {
        return frontLEDBrightness;
    }

    /**
     * Sets the value of the frontLEDBrightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontLEDBrightness(String value) {
        this.frontLEDBrightness = value;
    }

    /**
     * Gets the value of the motionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotionPolicy() {
        return motionPolicy;
    }

    /**
     * Sets the value of the motionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotionPolicy(String value) {
        this.motionPolicy = value;
    }

    /**
     * Gets the value of the partnerDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerDeviceName() {
        return partnerDeviceName;
    }

    /**
     * Sets the value of the partnerDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerDeviceName(String value) {
        this.partnerDeviceName = value;
    }

}
