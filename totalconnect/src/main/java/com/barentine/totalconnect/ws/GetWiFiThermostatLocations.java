
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
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TCCUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TCCPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionID",
    "locationID",
    "tccUsername",
    "tccPassword"
})
@XmlRootElement(name = "GetWiFiThermostatLocations")
public class GetWiFiThermostatLocations {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "TCCUsername")
    protected String tccUsername;
    @XmlElement(name = "TCCPassword")
    protected String tccPassword;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

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
     * Gets the value of the tccUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCCUsername() {
        return tccUsername;
    }

    /**
     * Sets the value of the tccUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCCUsername(String value) {
        this.tccUsername = value;
    }

    /**
     * Gets the value of the tccPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCCPassword() {
        return tccPassword;
    }

    /**
     * Sets the value of the tccPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCCPassword(String value) {
        this.tccPassword = value;
    }

}
