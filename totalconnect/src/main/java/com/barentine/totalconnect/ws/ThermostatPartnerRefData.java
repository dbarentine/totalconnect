
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermostatPartnerRefData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThermostatPartnerRefData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LyricLocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LyricDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemperatureScale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermostatPartnerRefData", propOrder = {
    "lyricLocationID",
    "lyricDeviceID",
    "temperatureScale"
})
public class ThermostatPartnerRefData {

    @XmlElement(name = "LyricLocationID")
    protected int lyricLocationID;
    @XmlElement(name = "LyricDeviceID")
    protected String lyricDeviceID;
    @XmlElement(name = "TemperatureScale")
    protected String temperatureScale;

    /**
     * Gets the value of the lyricLocationID property.
     * 
     */
    public int getLyricLocationID() {
        return lyricLocationID;
    }

    /**
     * Sets the value of the lyricLocationID property.
     * 
     */
    public void setLyricLocationID(int value) {
        this.lyricLocationID = value;
    }

    /**
     * Gets the value of the lyricDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyricDeviceID() {
        return lyricDeviceID;
    }

    /**
     * Sets the value of the lyricDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyricDeviceID(String value) {
        this.lyricDeviceID = value;
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

}
