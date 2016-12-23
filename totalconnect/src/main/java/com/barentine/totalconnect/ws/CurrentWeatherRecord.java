
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentWeatherRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentWeatherRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Temperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ApparentTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Humidity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeatherText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeatherIcon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentWeatherRecord", propOrder = {
    "temperature",
    "apparentTemperature",
    "humidity",
    "weatherText",
    "weatherIcon"
})
public class CurrentWeatherRecord {

    @XmlElement(name = "Temperature")
    protected int temperature;
    @XmlElement(name = "ApparentTemperature")
    protected int apparentTemperature;
    @XmlElement(name = "Humidity")
    protected String humidity;
    @XmlElement(name = "WeatherText")
    protected String weatherText;
    @XmlElement(name = "WeatherIcon")
    protected int weatherIcon;

    /**
     * Gets the value of the temperature property.
     * 
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     */
    public void setTemperature(int value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the apparentTemperature property.
     * 
     */
    public int getApparentTemperature() {
        return apparentTemperature;
    }

    /**
     * Sets the value of the apparentTemperature property.
     * 
     */
    public void setApparentTemperature(int value) {
        this.apparentTemperature = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHumidity(String value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the weatherText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherText() {
        return weatherText;
    }

    /**
     * Sets the value of the weatherText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherText(String value) {
        this.weatherText = value;
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

}
