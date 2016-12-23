
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiDoorBellConfigInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiDoorBellConfigInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerDeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoorBellConfigState" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiDoorBellConfigInfo", propOrder = {
    "partnerDeviceID",
    "partnerDeviceName",
    "doorBellConfigState"
})
public class WiFiDoorBellConfigInfo {

    @XmlElement(name = "PartnerDeviceID")
    protected String partnerDeviceID;
    @XmlElement(name = "PartnerDeviceName")
    protected String partnerDeviceName;
    @XmlElement(name = "DoorBellConfigState")
    protected short doorBellConfigState;

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
     * Gets the value of the doorBellConfigState property.
     * 
     */
    public short getDoorBellConfigState() {
        return doorBellConfigState;
    }

    /**
     * Sets the value of the doorBellConfigState property.
     * 
     */
    public void setDoorBellConfigState(short value) {
        this.doorBellConfigState = value;
    }

}
