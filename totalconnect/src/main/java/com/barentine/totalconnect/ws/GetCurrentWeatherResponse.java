
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
 *         &lt;element name="GetCurrentWeatherResult" type="{https://services.alarmnet.com/TC2/}CurrentWeatherResult" minOccurs="0"/>
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
    "getCurrentWeatherResult"
})
@XmlRootElement(name = "GetCurrentWeatherResponse")
public class GetCurrentWeatherResponse {

    @XmlElement(name = "GetCurrentWeatherResult")
    protected CurrentWeatherResult getCurrentWeatherResult;

    /**
     * Gets the value of the getCurrentWeatherResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentWeatherResult }
     *     
     */
    public CurrentWeatherResult getGetCurrentWeatherResult() {
        return getCurrentWeatherResult;
    }

    /**
     * Sets the value of the getCurrentWeatherResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentWeatherResult }
     *     
     */
    public void setGetCurrentWeatherResult(CurrentWeatherResult value) {
        this.getCurrentWeatherResult = value;
    }

}
