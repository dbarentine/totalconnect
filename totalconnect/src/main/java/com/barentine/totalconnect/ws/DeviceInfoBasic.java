
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceInfoBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInfoBasic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceClassID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeviceSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfoBasic", propOrder = {
    "deviceID",
    "deviceName",
    "deviceClassID",
    "deviceSerialNumber",
    "deviceFlags"
})
public class DeviceInfoBasic {

    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "DeviceClassID")
    protected int deviceClassID;
    @XmlElement(name = "DeviceSerialNumber")
    protected String deviceSerialNumber;
    @XmlElement(name = "DeviceFlags")
    protected String deviceFlags;

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
     * Gets the value of the deviceClassID property.
     * 
     */
    public int getDeviceClassID() {
        return deviceClassID;
    }

    /**
     * Sets the value of the deviceClassID property.
     * 
     */
    public void setDeviceClassID(int value) {
        this.deviceClassID = value;
    }

    /**
     * Gets the value of the deviceSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    /**
     * Sets the value of the deviceSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialNumber(String value) {
        this.deviceSerialNumber = value;
    }

    /**
     * Gets the value of the deviceFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFlags() {
        return deviceFlags;
    }

    /**
     * Sets the value of the deviceFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFlags(String value) {
        this.deviceFlags = value;
    }

}
