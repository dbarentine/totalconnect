
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceSerialText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceClassId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeviceAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceCreatedTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfo", propOrder = {
    "deviceName",
    "deviceId",
    "locationId",
    "accountId",
    "deviceSerialNumber",
    "deviceSerialText",
    "deviceClassId",
    "deviceAlias",
    "deviceCreatedTimeStamp"
})
@XmlSeeAlso({
    GPSInfo.class
})
public class DeviceInfo {

    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "DeviceId")
    protected long deviceId;
    @XmlElement(name = "LocationId")
    protected long locationId;
    @XmlElement(name = "AccountId")
    protected long accountId;
    @XmlElement(name = "DeviceSerialNumber")
    protected long deviceSerialNumber;
    @XmlElement(name = "DeviceSerialText")
    protected String deviceSerialText;
    @XmlElement(name = "DeviceClassId")
    protected int deviceClassId;
    @XmlElement(name = "DeviceAlias")
    protected String deviceAlias;
    @XmlElement(name = "DeviceCreatedTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deviceCreatedTimeStamp;

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     */
    public long getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     */
    public void setDeviceId(long value) {
        this.deviceId = value;
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
     * Gets the value of the deviceSerialNumber property.
     * 
     */
    public long getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    /**
     * Sets the value of the deviceSerialNumber property.
     * 
     */
    public void setDeviceSerialNumber(long value) {
        this.deviceSerialNumber = value;
    }

    /**
     * Gets the value of the deviceSerialText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialText() {
        return deviceSerialText;
    }

    /**
     * Sets the value of the deviceSerialText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialText(String value) {
        this.deviceSerialText = value;
    }

    /**
     * Gets the value of the deviceClassId property.
     * 
     */
    public int getDeviceClassId() {
        return deviceClassId;
    }

    /**
     * Sets the value of the deviceClassId property.
     * 
     */
    public void setDeviceClassId(int value) {
        this.deviceClassId = value;
    }

    /**
     * Gets the value of the deviceAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceAlias() {
        return deviceAlias;
    }

    /**
     * Sets the value of the deviceAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceAlias(String value) {
        this.deviceAlias = value;
    }

    /**
     * Gets the value of the deviceCreatedTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeviceCreatedTimeStamp() {
        return deviceCreatedTimeStamp;
    }

    /**
     * Sets the value of the deviceCreatedTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeviceCreatedTimeStamp(XMLGregorianCalendar value) {
        this.deviceCreatedTimeStamp = value;
    }

}
