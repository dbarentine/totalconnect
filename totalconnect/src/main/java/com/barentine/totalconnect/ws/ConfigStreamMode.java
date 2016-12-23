
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModeSelector" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FramesPerSecond" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Quality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BitRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mac",
    "sessionID",
    "modeSelector",
    "size",
    "framesPerSecond",
    "qualityType",
    "quality",
    "bitRate"
})
@XmlRootElement(name = "ConfigStreamMode")
public class ConfigStreamMode {

    @XmlElement(name = "MAC")
    protected String mac;
    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "ModeSelector")
    protected int modeSelector;
    @XmlElement(name = "Size")
    protected int size;
    @XmlElement(name = "FramesPerSecond")
    protected int framesPerSecond;
    @XmlElement(name = "QualityType")
    protected int qualityType;
    @XmlElement(name = "Quality")
    protected int quality;
    @XmlElement(name = "BitRate")
    protected int bitRate;

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
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the modeSelector property.
     * 
     */
    public int getModeSelector() {
        return modeSelector;
    }

    /**
     * Sets the value of the modeSelector property.
     * 
     */
    public void setModeSelector(int value) {
        this.modeSelector = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

    /**
     * Gets the value of the framesPerSecond property.
     * 
     */
    public int getFramesPerSecond() {
        return framesPerSecond;
    }

    /**
     * Sets the value of the framesPerSecond property.
     * 
     */
    public void setFramesPerSecond(int value) {
        this.framesPerSecond = value;
    }

    /**
     * Gets the value of the qualityType property.
     * 
     */
    public int getQualityType() {
        return qualityType;
    }

    /**
     * Sets the value of the qualityType property.
     * 
     */
    public void setQualityType(int value) {
        this.qualityType = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     */
    public int getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     */
    public void setQuality(int value) {
        this.quality = value;
    }

    /**
     * Gets the value of the bitRate property.
     * 
     */
    public int getBitRate() {
        return bitRate;
    }

    /**
     * Sets the value of the bitRate property.
     * 
     */
    public void setBitRate(int value) {
        this.bitRate = value;
    }

}
