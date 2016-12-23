
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
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LastSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastUpdatedTimestampTicks" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PartitionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "deviceID",
    "lastSequenceNumber",
    "lastUpdatedTimestampTicks",
    "partitionID"
})
@XmlRootElement(name = "GetPanelMetaDataAndFullStatusByDeviceIDEx")
public class GetPanelMetaDataAndFullStatusByDeviceIDEx {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "LastSequenceNumber")
    protected int lastSequenceNumber;
    @XmlElement(name = "LastUpdatedTimestampTicks")
    protected long lastUpdatedTimestampTicks;
    @XmlElement(name = "PartitionID")
    protected int partitionID;

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
     * Gets the value of the deviceID property.
     * 
     */
    public long getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     */
    public void setDeviceID(long value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the lastSequenceNumber property.
     * 
     */
    public int getLastSequenceNumber() {
        return lastSequenceNumber;
    }

    /**
     * Sets the value of the lastSequenceNumber property.
     * 
     */
    public void setLastSequenceNumber(int value) {
        this.lastSequenceNumber = value;
    }

    /**
     * Gets the value of the lastUpdatedTimestampTicks property.
     * 
     */
    public long getLastUpdatedTimestampTicks() {
        return lastUpdatedTimestampTicks;
    }

    /**
     * Sets the value of the lastUpdatedTimestampTicks property.
     * 
     */
    public void setLastUpdatedTimestampTicks(long value) {
        this.lastUpdatedTimestampTicks = value;
    }

    /**
     * Gets the value of the partitionID property.
     * 
     */
    public int getPartitionID() {
        return partitionID;
    }

    /**
     * Sets the value of the partitionID property.
     * 
     */
    public void setPartitionID(int value) {
        this.partitionID = value;
    }

}
