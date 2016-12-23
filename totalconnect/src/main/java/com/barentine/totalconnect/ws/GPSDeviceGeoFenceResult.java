
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GPSDeviceGeoFenceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GPSDeviceGeoFenceResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="GeoFenceData" type="{https://services.alarmnet.com/TC2/}GPSDeviceGeoFenceData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPSDeviceGeoFenceResult", propOrder = {
    "geoFenceData"
})
public class GPSDeviceGeoFenceResult
    extends WebMethodResults
{

    @XmlElement(name = "GeoFenceData")
    protected GPSDeviceGeoFenceData geoFenceData;

    /**
     * Gets the value of the geoFenceData property.
     * 
     * @return
     *     possible object is
     *     {@link GPSDeviceGeoFenceData }
     *     
     */
    public GPSDeviceGeoFenceData getGeoFenceData() {
        return geoFenceData;
    }

    /**
     * Sets the value of the geoFenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPSDeviceGeoFenceData }
     *     
     */
    public void setGeoFenceData(GPSDeviceGeoFenceData value) {
        this.geoFenceData = value;
    }

}
