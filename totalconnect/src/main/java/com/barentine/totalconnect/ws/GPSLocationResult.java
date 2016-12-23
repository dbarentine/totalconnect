
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GPSLocationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GPSLocationResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="GPSLocationData" type="{https://services.alarmnet.com/TC2/}GPSLocationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPSLocationResult", propOrder = {
    "gpsLocationData"
})
public class GPSLocationResult
    extends WebMethodResults
{

    @XmlElement(name = "GPSLocationData")
    protected GPSLocationInfo gpsLocationData;

    /**
     * Gets the value of the gpsLocationData property.
     * 
     * @return
     *     possible object is
     *     {@link GPSLocationInfo }
     *     
     */
    public GPSLocationInfo getGPSLocationData() {
        return gpsLocationData;
    }

    /**
     * Sets the value of the gpsLocationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPSLocationInfo }
     *     
     */
    public void setGPSLocationData(GPSLocationInfo value) {
        this.gpsLocationData = value;
    }

}
