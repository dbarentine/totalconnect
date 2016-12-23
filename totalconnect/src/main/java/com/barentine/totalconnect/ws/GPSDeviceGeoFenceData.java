
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GPSDeviceGeoFenceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GPSDeviceGeoFenceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeoFenceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeoFenceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPSDeviceGeoFenceData", propOrder = {
    "geoFenceName",
    "geoFenceId",
    "direction",
    "timestamp",
    "address",
    "latitude",
    "longitude"
})
public class GPSDeviceGeoFenceData {

    @XmlElement(name = "GeoFenceName")
    protected String geoFenceName;
    @XmlElement(name = "GeoFenceId")
    protected long geoFenceId;
    @XmlElement(name = "Direction")
    protected int direction;
    @XmlElement(name = "Timestamp")
    protected String timestamp;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Latitude")
    protected float latitude;
    @XmlElement(name = "Longitude")
    protected float longitude;

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
     * Gets the value of the geoFenceId property.
     * 
     */
    public long getGeoFenceId() {
        return geoFenceId;
    }

    /**
     * Sets the value of the geoFenceId property.
     * 
     */
    public void setGeoFenceId(long value) {
        this.geoFenceId = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     */
    public int getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     */
    public void setDirection(int value) {
        this.direction = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
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

}
