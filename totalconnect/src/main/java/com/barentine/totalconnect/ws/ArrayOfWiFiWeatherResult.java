
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWiFiWeatherResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWiFiWeatherResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WiFiWeatherResult" type="{https://services.alarmnet.com/TC2/}WiFiWeatherResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWiFiWeatherResult", propOrder = {
    "wiFiWeatherResult"
})
public class ArrayOfWiFiWeatherResult {

    @XmlElement(name = "WiFiWeatherResult", nillable = true)
    protected List<WiFiWeatherResult> wiFiWeatherResult;

    /**
     * Gets the value of the wiFiWeatherResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wiFiWeatherResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWiFiWeatherResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WiFiWeatherResult }
     * 
     * 
     */
    public List<WiFiWeatherResult> getWiFiWeatherResult() {
        if (wiFiWeatherResult == null) {
            wiFiWeatherResult = new ArrayList<WiFiWeatherResult>();
        }
        return this.wiFiWeatherResult;
    }

}
