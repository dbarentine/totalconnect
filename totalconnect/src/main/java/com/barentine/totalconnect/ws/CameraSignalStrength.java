
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraSignalStrength complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraSignalStrength">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignalStrength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RSSI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Noise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAPMAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraSignalStrength", propOrder = {
    "signalStrength",
    "details",
    "mac",
    "rssi",
    "ssid",
    "noise",
    "wapmac",
    "channel"
})
public class CameraSignalStrength {

    @XmlElement(name = "SignalStrength")
    protected int signalStrength;
    @XmlElement(name = "Details")
    protected String details;
    @XmlElement(name = "MAC")
    protected String mac;
    @XmlElement(name = "RSSI")
    protected int rssi;
    @XmlElement(name = "SSID")
    protected String ssid;
    @XmlElement(name = "Noise")
    protected String noise;
    @XmlElement(name = "WAPMAC")
    protected String wapmac;
    @XmlElement(name = "Channel")
    protected String channel;

    /**
     * Gets the value of the signalStrength property.
     * 
     */
    public int getSignalStrength() {
        return signalStrength;
    }

    /**
     * Sets the value of the signalStrength property.
     * 
     */
    public void setSignalStrength(int value) {
        this.signalStrength = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
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
     * Gets the value of the rssi property.
     * 
     */
    public int getRSSI() {
        return rssi;
    }

    /**
     * Sets the value of the rssi property.
     * 
     */
    public void setRSSI(int value) {
        this.rssi = value;
    }

    /**
     * Gets the value of the ssid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSID() {
        return ssid;
    }

    /**
     * Sets the value of the ssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSID(String value) {
        this.ssid = value;
    }

    /**
     * Gets the value of the noise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoise() {
        return noise;
    }

    /**
     * Sets the value of the noise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoise(String value) {
        this.noise = value;
    }

    /**
     * Gets the value of the wapmac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAPMAC() {
        return wapmac;
    }

    /**
     * Sets the value of the wapmac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAPMAC(String value) {
        this.wapmac = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

}
