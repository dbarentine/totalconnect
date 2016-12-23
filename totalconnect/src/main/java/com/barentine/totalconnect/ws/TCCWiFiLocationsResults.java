
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCCWiFiLocationsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCCWiFiLocationsResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="WiFiLocations" type="{https://services.alarmnet.com/TC2/}ArrayOfTCCWiFiLocationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCCWiFiLocationsResults", propOrder = {
    "wiFiLocations"
})
public class TCCWiFiLocationsResults
    extends WebMethodResults
{

    @XmlElement(name = "WiFiLocations")
    protected ArrayOfTCCWiFiLocationInfo wiFiLocations;

    /**
     * Gets the value of the wiFiLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTCCWiFiLocationInfo }
     *     
     */
    public ArrayOfTCCWiFiLocationInfo getWiFiLocations() {
        return wiFiLocations;
    }

    /**
     * Sets the value of the wiFiLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTCCWiFiLocationInfo }
     *     
     */
    public void setWiFiLocations(ArrayOfTCCWiFiLocationInfo value) {
        this.wiFiLocations = value;
    }

}
