
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeofenceSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeofenceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeofenceStatus" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="GeofenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeofenceSettings", propOrder = {
    "geofenceStatus",
    "latitude",
    "longitude",
    "radius",
    "geofenceID"
})
public class GeofenceSettings {

    @XmlElement(name = "GeofenceStatus")
    protected short geofenceStatus;
    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "Radius")
    protected double radius;
    @XmlElement(name = "GeofenceID")
    protected String geofenceID;

    /**
     * Gets the value of the geofenceStatus property.
     * 
     */
    public short getGeofenceStatus() {
        return geofenceStatus;
    }

    /**
     * Sets the value of the geofenceStatus property.
     * 
     */
    public void setGeofenceStatus(short value) {
        this.geofenceStatus = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     */
    public void setRadius(double value) {
        this.radius = value;
    }

    /**
     * Gets the value of the geofenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeofenceID() {
        return geofenceID;
    }

    /**
     * Sets the value of the geofenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeofenceID(String value) {
        this.geofenceID = value;
    }

}
