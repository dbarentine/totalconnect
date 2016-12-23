
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfForecastWeatherRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfForecastWeatherRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForecastWeatherRecord" type="{https://services.alarmnet.com/TC2/}ForecastWeatherRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfForecastWeatherRecord", propOrder = {
    "forecastWeatherRecord"
})
public class ArrayOfForecastWeatherRecord {

    @XmlElement(name = "ForecastWeatherRecord", nillable = true)
    protected List<ForecastWeatherRecord> forecastWeatherRecord;

    /**
     * Gets the value of the forecastWeatherRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastWeatherRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastWeatherRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastWeatherRecord }
     * 
     * 
     */
    public List<ForecastWeatherRecord> getForecastWeatherRecord() {
        if (forecastWeatherRecord == null) {
            forecastWeatherRecord = new ArrayList<ForecastWeatherRecord>();
        }
        return this.forecastWeatherRecord;
    }

}
