
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentWeatherInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentWeatherInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentWeather" type="{https://services.alarmnet.com/TC2/}CurrentWeatherRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentWeatherInfo", propOrder = {
    "unit",
    "time",
    "currentWeather"
})
public class CurrentWeatherInfo {

    @XmlElement(name = "Unit")
    protected int unit;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "CurrentWeather")
    protected CurrentWeatherRecord currentWeather;

    /**
     * Gets the value of the unit property.
     * 
     */
    public int getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     */
    public void setUnit(int value) {
        this.unit = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the currentWeather property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentWeatherRecord }
     *     
     */
    public CurrentWeatherRecord getCurrentWeather() {
        return currentWeather;
    }

    /**
     * Sets the value of the currentWeather property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentWeatherRecord }
     *     
     */
    public void setCurrentWeather(CurrentWeatherRecord value) {
        this.currentWeather = value;
    }

}
