
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
 *         &lt;element name="LastEventIdReceived" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MaxRecords" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
    "lastEventIdReceived",
    "maxRecords",
    "dateFormat",
    "timeFormat"
})
@XmlRootElement(name = "GetDoorbellLiveEvents")
public class GetDoorbellLiveEvents {

    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "LocationId")
    protected long locationId;
    @XmlElement(name = "LastEventIdReceived")
    protected long lastEventIdReceived;
    @XmlElement(name = "MaxRecords")
    protected short maxRecords;
    @XmlElement(name = "DateFormat")
    protected short dateFormat;
    @XmlElement(name = "TimeFormat")
    protected short timeFormat;

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
     * Gets the value of the lastEventIdReceived property.
     * 
     */
    public long getLastEventIdReceived() {
        return lastEventIdReceived;
    }

    /**
     * Sets the value of the lastEventIdReceived property.
     * 
     */
    public void setLastEventIdReceived(long value) {
        this.lastEventIdReceived = value;
    }

    /**
     * Gets the value of the maxRecords property.
     * 
     */
    public short getMaxRecords() {
        return maxRecords;
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     */
    public void setMaxRecords(short value) {
        this.maxRecords = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     */
    public short getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     */
    public void setDateFormat(short value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     */
    public short getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     */
    public void setTimeFormat(short value) {
        this.timeFormat = value;
    }

}
