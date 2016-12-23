
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiWeatherResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiWeatherResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="WeatherResult" type="{https://services.alarmnet.com/TC2/}ArrayOfWiFiWeatherResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiWeatherResponse", propOrder = {
    "weatherResult"
})
public class WiFiWeatherResponse
    extends WebMethodResults
{

    @XmlElement(name = "WeatherResult")
    protected ArrayOfWiFiWeatherResult weatherResult;

    /**
     * Gets the value of the weatherResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWiFiWeatherResult }
     *     
     */
    public ArrayOfWiFiWeatherResult getWeatherResult() {
        return weatherResult;
    }

    /**
     * Sets the value of the weatherResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWiFiWeatherResult }
     *     
     */
    public void setWeatherResult(ArrayOfWiFiWeatherResult value) {
        this.weatherResult = value;
    }

}
