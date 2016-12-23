
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiLocationsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiLocationsResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="WiFiLocations" type="{https://services.alarmnet.com/TC2/}ArrayOfWiFiLocationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiLocationsResults", propOrder = {
    "wiFiLocations"
})
public class WiFiLocationsResults
    extends WebMethodResults
{

    @XmlElement(name = "WiFiLocations")
    protected ArrayOfWiFiLocationInfo wiFiLocations;

    /**
     * Gets the value of the wiFiLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWiFiLocationInfo }
     *     
     */
    public ArrayOfWiFiLocationInfo getWiFiLocations() {
        return wiFiLocations;
    }

    /**
     * Sets the value of the wiFiLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWiFiLocationInfo }
     *     
     */
    public void setWiFiLocations(ArrayOfWiFiLocationInfo value) {
        this.wiFiLocations = value;
    }

}
