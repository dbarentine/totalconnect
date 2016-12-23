
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PartnerDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wiFiDoorBellSettings" type="{https://services.alarmnet.com/TC2/}WiFiDoorBellSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "locationId",
    "partnerDeviceID",
    "wiFiDoorBellSettings"
})
@XmlRootElement(name = "UpdateWiFiDoorBellSettings")
public class UpdateWiFiDoorBellSettings {

    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "LocationId")
    protected long locationId;
    @XmlElement(name = "PartnerDeviceID")
    protected String partnerDeviceID;
    protected WiFiDoorBellSettings wiFiDoorBellSettings;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

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
     * Gets the value of the partnerDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerDeviceID() {
        return partnerDeviceID;
    }

    /**
     * Sets the value of the partnerDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerDeviceID(String value) {
        this.partnerDeviceID = value;
    }

    /**
     * Gets the value of the wiFiDoorBellSettings property.
     * 
     * @return
     *     possible object is
     *     {@link WiFiDoorBellSettings }
     *     
     */
    public WiFiDoorBellSettings getWiFiDoorBellSettings() {
        return wiFiDoorBellSettings;
    }

    /**
     * Sets the value of the wiFiDoorBellSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WiFiDoorBellSettings }
     *     
     */
    public void setWiFiDoorBellSettings(WiFiDoorBellSettings value) {
        this.wiFiDoorBellSettings = value;
    }

}
