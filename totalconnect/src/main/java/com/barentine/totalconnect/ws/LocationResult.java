
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="LocationInfo" type="{https://services.alarmnet.com/TC2/}LocationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationResult", propOrder = {
    "locationInfo"
})
public class LocationResult
    extends WebMethodResults
{

    @XmlElement(name = "LocationInfo")
    protected LocationInfo locationInfo;

    /**
     * Gets the value of the locationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfo }
     *     
     */
    public LocationInfo getLocationInfo() {
        return locationInfo;
    }

    /**
     * Sets the value of the locationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfo }
     *     
     */
    public void setLocationInfo(LocationInfo value) {
        this.locationInfo = value;
    }

}
