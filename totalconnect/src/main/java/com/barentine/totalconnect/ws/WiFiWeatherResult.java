
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiWeatherResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiWeatherResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="epochDateTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iconPhrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weatherIcon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="temperature" type="{https://services.alarmnet.com/TC2/}ValueUnitType" minOccurs="0"/>
 *         &lt;element name="realFeelTemperature" type="{https://services.alarmnet.com/TC2/}ValueUnitType" minOccurs="0"/>
 *         &lt;element name="relativeHumidity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiWeatherResult", propOrder = {
    "dateTime",
    "epochDateTime",
    "iconPhrase",
    "weatherIcon",
    "temperature",
    "realFeelTemperature",
    "relativeHumidity"
})
public class WiFiWeatherResult {

    protected String dateTime;
    protected int epochDateTime;
    protected String iconPhrase;
    protected int weatherIcon;
    protected ValueUnitType temperature;
    protected ValueUnitType realFeelTemperature;
    protected int relativeHumidity;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the epochDateTime property.
     * 
     */
    public int getEpochDateTime() {
        return epochDateTime;
    }

    /**
     * Sets the value of the epochDateTime property.
     * 
     */
    public void setEpochDateTime(int value) {
        this.epochDateTime = value;
    }

    /**
     * Gets the value of the iconPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconPhrase() {
        return iconPhrase;
    }

    /**
     * Sets the value of the iconPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconPhrase(String value) {
        this.iconPhrase = value;
    }

    /**
     * Gets the value of the weatherIcon property.
     * 
     */
    public int getWeatherIcon() {
        return weatherIcon;
    }

    /**
     * Sets the value of the weatherIcon property.
     * 
     */
    public void setWeatherIcon(int value) {
        this.weatherIcon = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link ValueUnitType }
     *     
     */
    public ValueUnitType getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueUnitType }
     *     
     */
    public void setTemperature(ValueUnitType value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the realFeelTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link ValueUnitType }
     *     
     */
    public ValueUnitType getRealFeelTemperature() {
        return realFeelTemperature;
    }

    /**
     * Sets the value of the realFeelTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueUnitType }
     *     
     */
    public void setRealFeelTemperature(ValueUnitType value) {
        this.realFeelTemperature = value;
    }

    /**
     * Gets the value of the relativeHumidity property.
     * 
     */
    public int getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * Sets the value of the relativeHumidity property.
     * 
     */
    public void setRelativeHumidity(int value) {
        this.relativeHumidity = value;
    }

}
