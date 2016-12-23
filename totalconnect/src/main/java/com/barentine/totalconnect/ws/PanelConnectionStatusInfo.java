
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelConnectionStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelConnectionStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhotoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SyncStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SingnalStrength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelConnectionStatusInfo", propOrder = {
    "locationID",
    "locationName",
    "photoURL",
    "connectionStatus",
    "syncStatus",
    "syncStatusMessage",
    "connectionType",
    "singnalStrength"
})
public class PanelConnectionStatusInfo {

    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "PhotoURL")
    protected String photoURL;
    @XmlElement(name = "ConnectionStatus")
    protected int connectionStatus;
    @XmlElement(name = "SyncStatus")
    protected int syncStatus;
    @XmlElement(name = "SyncStatusMessage")
    protected String syncStatusMessage;
    @XmlElement(name = "ConnectionType")
    protected int connectionType;
    @XmlElement(name = "SingnalStrength", required = true, type = Integer.class, nillable = true)
    protected Integer singnalStrength;

    /**
     * Gets the value of the locationID property.
     * 
     */
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(long value) {
        this.locationID = value;
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
     * Gets the value of the connectionStatus property.
     * 
     */
    public int getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * Sets the value of the connectionStatus property.
     * 
     */
    public void setConnectionStatus(int value) {
        this.connectionStatus = value;
    }

    /**
     * Gets the value of the syncStatus property.
     * 
     */
    public int getSyncStatus() {
        return syncStatus;
    }

    /**
     * Sets the value of the syncStatus property.
     * 
     */
    public void setSyncStatus(int value) {
        this.syncStatus = value;
    }

    /**
     * Gets the value of the syncStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncStatusMessage() {
        return syncStatusMessage;
    }

    /**
     * Sets the value of the syncStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncStatusMessage(String value) {
        this.syncStatusMessage = value;
    }

    /**
     * Gets the value of the connectionType property.
     * 
     */
    public int getConnectionType() {
        return connectionType;
    }

    /**
     * Sets the value of the connectionType property.
     * 
     */
    public void setConnectionType(int value) {
        this.connectionType = value;
    }

    /**
     * Gets the value of the singnalStrength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSingnalStrength() {
        return singnalStrength;
    }

    /**
     * Sets the value of the singnalStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSingnalStrength(Integer value) {
        this.singnalStrength = value;
    }

}
