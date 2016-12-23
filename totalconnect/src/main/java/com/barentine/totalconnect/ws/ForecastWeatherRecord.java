
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastWeatherRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastWeatherRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DayCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeatherText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeatherIcon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HighTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LowTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastWeatherRecord", propOrder = {
    "day",
    "dayCode",
    "date",
    "weatherText",
    "weatherIcon",
    "highTemperature",
    "lowTemperature"
})
public class ForecastWeatherRecord {

    @XmlElement(name = "Day")
    protected int day;
    @XmlElement(name = "DayCode")
    protected String dayCode;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "WeatherText")
    protected String weatherText;
    @XmlElement(name = "WeatherIcon")
    protected int weatherIcon;
    @XmlElement(name = "HighTemperature")
    protected int highTemperature;
    @XmlElement(name = "LowTemperature")
    protected int lowTemperature;

    /**
     * Gets the value of the day property.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Gets the value of the dayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayCode() {
        return dayCode;
    }

    /**
     * Sets the value of the dayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayCode(String value) {
        this.dayCode = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
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

    /**
     * Gets the value of the highTemperature property.
     * 
     */
    public int getHighTemperature() {
        return highTemperature;
    }

    /**
     * Sets the value of the highTemperature property.
     * 
     */
    public void setHighTemperature(int value) {
        this.highTemperature = value;
    }

    /**
     * Gets the value of the lowTemperature property.
     * 
     */
    public int getLowTemperature() {
        return lowTemperature;
    }

    /**
     * Sets the value of the lowTemperature property.
     * 
     */
    public void setLowTemperature(int value) {
        this.lowTemperature = value;
    }

}
