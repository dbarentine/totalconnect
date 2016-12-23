
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetWiFiDoorBellResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWiFiDoorBellResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WiFiDoorBellInfo">
 *       &lt;sequence>
 *         &lt;element name="WiFiStrength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PushNotificationFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsOffline" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UpdatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PartnerDeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avatar" type="{https://services.alarmnet.com/TC2/}Avatar" minOccurs="0"/>
 *         &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSRTPEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWiFiDoorBellResult", propOrder = {
    "wiFiStrength",
    "pushNotificationFlag",
    "isOffline",
    "createdAt",
    "updatedAt",
    "partnerDeviceName",
    "avatar",
    "firmwareVersion",
    "deviceSerialNumber",
    "isSRTPEnabled"
})
public class GetWiFiDoorBellResult
    extends WiFiDoorBellInfo
{

    @XmlElement(name = "WiFiStrength")
    protected int wiFiStrength;
    @XmlElement(name = "PushNotificationFlag")
    protected int pushNotificationFlag;
    @XmlElement(name = "IsOffline")
    protected short isOffline;
    @XmlElement(name = "CreatedAt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "UpdatedAt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlElement(name = "PartnerDeviceName")
    protected String partnerDeviceName;
    @XmlElement(name = "Avatar")
    protected Avatar avatar;
    @XmlElement(name = "FirmwareVersion")
    protected String firmwareVersion;
    @XmlElement(name = "DeviceSerialNumber")
    protected String deviceSerialNumber;
    @XmlElement(name = "IsSRTPEnabled")
    protected boolean isSRTPEnabled;

    /**
     * Gets the value of the wiFiStrength property.
     * 
     */
    public int getWiFiStrength() {
        return wiFiStrength;
    }

    /**
     * Sets the value of the wiFiStrength property.
     * 
     */
    public void setWiFiStrength(int value) {
        this.wiFiStrength = value;
    }

    /**
     * Gets the value of the pushNotificationFlag property.
     * 
     */
    public int getPushNotificationFlag() {
        return pushNotificationFlag;
    }

    /**
     * Sets the value of the pushNotificationFlag property.
     * 
     */
    public void setPushNotificationFlag(int value) {
        this.pushNotificationFlag = value;
    }

    /**
     * Gets the value of the isOffline property.
     * 
     */
    public short getIsOffline() {
        return isOffline;
    }

    /**
     * Sets the value of the isOffline property.
     * 
     */
    public void setIsOffline(short value) {
        this.isOffline = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the partnerDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerDeviceName() {
        return partnerDeviceName;
    }

    /**
     * Sets the value of the partnerDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerDeviceName(String value) {
        this.partnerDeviceName = value;
    }

    /**
     * Gets the value of the avatar property.
     * 
     * @return
     *     possible object is
     *     {@link Avatar }
     *     
     */
    public Avatar getAvatar() {
        return avatar;
    }

    /**
     * Sets the value of the avatar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Avatar }
     *     
     */
    public void setAvatar(Avatar value) {
        this.avatar = value;
    }

    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
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
     * Gets the value of the isSRTPEnabled property.
     * 
     */
    public boolean isIsSRTPEnabled() {
        return isSRTPEnabled;
    }

    /**
     * Sets the value of the isSRTPEnabled property.
     * 
     */
    public void setIsSRTPEnabled(boolean value) {
        this.isSRTPEnabled = value;
    }

}
