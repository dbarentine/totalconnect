
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeofenceListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeofenceListResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="GeoFences" type="{https://services.alarmnet.com/TC2/}ArrayOfGeofenceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeofenceListResult", propOrder = {
    "geoFences"
})
public class GeofenceListResult
    extends WebMethodResults
{

    @XmlElement(name = "GeoFences")
    protected ArrayOfGeofenceInfo geoFences;

    /**
     * Gets the value of the geoFences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGeofenceInfo }
     *     
     */
    public ArrayOfGeofenceInfo getGeoFences() {
        return geoFences;
    }

    /**
     * Sets the value of the geoFences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGeofenceInfo }
     *     
     */
    public void setGeoFences(ArrayOfGeofenceInfo value) {
        this.geoFences = value;
    }

}
