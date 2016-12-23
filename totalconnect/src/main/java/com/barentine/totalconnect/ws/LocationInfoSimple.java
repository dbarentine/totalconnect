
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationInfoSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationInfoSimple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PhotoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TimeZoneId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhotoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SetDefaultLocationName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SecuritySystemAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecuritySystemPanelDeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemperatureUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationInfoSimple", propOrder = {
    "locationId",
    "locationName",
    "accountId",
    "photoId",
    "timeZoneId",
    "photoURL",
    "setDefaultLocationName",
    "securitySystemAlias",
    "securitySystemPanelDeviceID",
    "countryID",
    "streetNumber",
    "streetName",
    "city",
    "stateID",
    "postalCode",
    "temperatureUnits",
    "latitude",
    "longitude"
})
@XmlSeeAlso({
    LocationInfo.class
})
public class LocationInfoSimple {

    @XmlElement(name = "LocationId")
    protected long locationId;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "AccountId")
    protected long accountId;
    @XmlElement(name = "PhotoId")
    protected long photoId;
    @XmlElement(name = "TimeZoneId")
    protected int timeZoneId;
    @XmlElement(name = "PhotoURL")
    protected String photoURL;
    @XmlElement(name = "SetDefaultLocationName")
    protected boolean setDefaultLocationName;
    @XmlElement(name = "SecuritySystemAlias")
    protected String securitySystemAlias;
    @XmlElement(name = "SecuritySystemPanelDeviceID")
    protected long securitySystemPanelDeviceID;
    @XmlElement(name = "CountryID")
    protected long countryID;
    @XmlElement(name = "StreetNumber")
    protected String streetNumber;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "StateID")
    protected long stateID;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "TemperatureUnits")
    protected String temperatureUnits;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;

    /**
     * Gets the value of the locationId property.
     * 
     */
    public long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     */
    public void setLocationId(long value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the photoId property.
     * 
     */
    public long getPhotoId() {
        return photoId;
    }

    /**
     * Sets the value of the photoId property.
     * 
     */
    public void setPhotoId(long value) {
        this.photoId = value;
    }

    /**
     * Gets the value of the timeZoneId property.
     * 
     */
    public int getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * Sets the value of the timeZoneId property.
     * 
     */
    public void setTimeZoneId(int value) {
        this.timeZoneId = value;
    }

    /**
     * Gets the value of the photoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the value of the photoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoURL(String value) {
        this.photoURL = value;
    }

    /**
     * Gets the value of the setDefaultLocationName property.
     * 
     */
    public boolean isSetDefaultLocationName() {
        return setDefaultLocationName;
    }

    /**
     * Sets the value of the setDefaultLocationName property.
     * 
     */
    public void setSetDefaultLocationName(boolean value) {
        this.setDefaultLocationName = value;
    }

    /**
     * Gets the value of the securitySystemAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuritySystemAlias() {
        return securitySystemAlias;
    }

    /**
     * Sets the value of the securitySystemAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuritySystemAlias(String value) {
        this.securitySystemAlias = value;
    }

    /**
     * Gets the value of the securitySystemPanelDeviceID property.
     * 
     */
    public long getSecuritySystemPanelDeviceID() {
        return securitySystemPanelDeviceID;
    }

    /**
     * Sets the value of the securitySystemPanelDeviceID property.
     * 
     */
    public void setSecuritySystemPanelDeviceID(long value) {
        this.securitySystemPanelDeviceID = value;
    }

    /**
     * Gets the value of the countryID property.
     * 
     */
    public long getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     */
    public void setCountryID(long value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the streetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the value of the streetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateID property.
     * 
     */
    public long getStateID() {
        return stateID;
    }

    /**
     * Sets the value of the stateID property.
     * 
     */
    public void setStateID(long value) {
        this.stateID = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the temperatureUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureUnits() {
        return temperatureUnits;
    }

    /**
     * Sets the value of the temperatureUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureUnits(String value) {
        this.temperatureUnits = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

}
