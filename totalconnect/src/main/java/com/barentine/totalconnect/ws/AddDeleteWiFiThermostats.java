
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
 *         &lt;element name="TCCLocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TCCWiFiDeviceInfo" type="{https://services.alarmnet.com/TC2/}ArrayOfTCCWiFiDeviceInfo" minOccurs="0"/>
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
    "tccLocationID",
    "tccWiFiDeviceInfo"
})
@XmlRootElement(name = "AddDeleteWiFiThermostats")
public class AddDeleteWiFiThermostats {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "TCCLocationID")
    protected int tccLocationID;
    @XmlElement(name = "TCCWiFiDeviceInfo")
    protected ArrayOfTCCWiFiDeviceInfo tccWiFiDeviceInfo;

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
     * Gets the value of the tccLocationID property.
     * 
     */
    public int getTCCLocationID() {
        return tccLocationID;
    }

    /**
     * Sets the value of the tccLocationID property.
     * 
     */
    public void setTCCLocationID(int value) {
        this.tccLocationID = value;
    }

    /**
     * Gets the value of the tccWiFiDeviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTCCWiFiDeviceInfo }
     *     
     */
    public ArrayOfTCCWiFiDeviceInfo getTCCWiFiDeviceInfo() {
        return tccWiFiDeviceInfo;
    }

    /**
     * Sets the value of the tccWiFiDeviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTCCWiFiDeviceInfo }
     *     
     */
    public void setTCCWiFiDeviceInfo(ArrayOfTCCWiFiDeviceInfo value) {
        this.tccWiFiDeviceInfo = value;
    }

}
