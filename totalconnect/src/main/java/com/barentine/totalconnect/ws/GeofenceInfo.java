
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeofenceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeofenceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeoFenceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeofenceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeofenceInfo", propOrder = {
    "geoFenceName",
    "geofenceID",
    "latitude",
    "longitude",
    "radius",
    "eventType",
    "eventTypeID"
})
public class GeofenceInfo {

    @XmlElement(name = "GeoFenceName")
    protected String geoFenceName;
    @XmlElement(name = "GeofenceID")
    protected int geofenceID;
    @XmlElement(name = "Latitude")
    protected float latitude;
    @XmlElement(name = "Longitude")
    protected float longitude;
    @XmlElement(name = "Radius")
    protected double radius;
    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "EventTypeID")
    protected int eventTypeID;

    /**
     * Gets the value of the geoFenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoFenceName() {
        return geoFenceName;
    }

    /**
     * Sets the value of the geoFenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoFenceName(String value) {
        this.geoFenceName = value;
    }

    /**
     * Gets the value of the geofenceID property.
     * 
     */
    public int getGeofenceID() {
        return geofenceID;
    }

    /**
     * Sets the value of the geofenceID property.
     * 
     */
    public void setGeofenceID(int value) {
        this.geofenceID = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(float value) {
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
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventTypeID property.
     * 
     */
    public int getEventTypeID() {
        return eventTypeID;
    }

    /**
     * Sets the value of the eventTypeID property.
     * 
     */
    public void setEventTypeID(int value) {
        this.eventTypeID = value;
    }

}
