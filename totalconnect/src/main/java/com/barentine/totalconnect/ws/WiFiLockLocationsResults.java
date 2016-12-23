
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiLockLocationsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiLockLocationsResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="WiFiLocations" type="{https://services.alarmnet.com/TC2/}ArrayOfWiFiLockLocationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiLockLocationsResults", propOrder = {
    "wiFiLocations"
})
public class WiFiLockLocationsResults
    extends WebMethodResults
{

    @XmlElement(name = "WiFiLocations")
    protected ArrayOfWiFiLockLocationInfo wiFiLocations;

    /**
     * Gets the value of the wiFiLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWiFiLockLocationInfo }
     *     
     */
    public ArrayOfWiFiLockLocationInfo getWiFiLocations() {
        return wiFiLocations;
    }

    /**
     * Sets the value of the wiFiLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWiFiLockLocationInfo }
     *     
     */
    public void setWiFiLocations(ArrayOfWiFiLockLocationInfo value) {
        this.wiFiLocations = value;
    }

}
