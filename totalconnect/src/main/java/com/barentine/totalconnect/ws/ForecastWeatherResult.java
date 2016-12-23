
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastWeatherResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastWeatherResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="WeatherData" type="{https://services.alarmnet.com/TC2/}ForecastWeatherInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastWeatherResult", propOrder = {
    "weatherData"
})
public class ForecastWeatherResult
    extends WebMethodResults
{

    @XmlElement(name = "WeatherData")
    protected ForecastWeatherInfo weatherData;

    /**
     * Gets the value of the weatherData property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastWeatherInfo }
     *     
     */
    public ForecastWeatherInfo getWeatherData() {
        return weatherData;
    }

    /**
     * Sets the value of the weatherData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastWeatherInfo }
     *     
     */
    public void setWeatherData(ForecastWeatherInfo value) {
        this.weatherData = value;
    }

}
