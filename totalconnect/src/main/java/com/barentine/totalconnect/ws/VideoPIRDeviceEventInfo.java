
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoPIRDeviceEventInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPIRDeviceEventInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventInfo" type="{https://services.alarmnet.com/TC2/}ArrayOfVideoPIREvent" minOccurs="0"/>
 *         &lt;element name="RemainingImageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPIRDeviceEventInfo", propOrder = {
    "deviceName",
    "eventInfo",
    "remainingImageCount"
})
public class VideoPIRDeviceEventInfo {

    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "EventInfo")
    protected ArrayOfVideoPIREvent eventInfo;
    @XmlElement(name = "RemainingImageCount")
    protected int remainingImageCount;

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
     * Gets the value of the eventInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoPIREvent }
     *     
     */
    public ArrayOfVideoPIREvent getEventInfo() {
        return eventInfo;
    }

    /**
     * Sets the value of the eventInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoPIREvent }
     *     
     */
    public void setEventInfo(ArrayOfVideoPIREvent value) {
        this.eventInfo = value;
    }

    /**
     * Gets the value of the remainingImageCount property.
     * 
     */
    public int getRemainingImageCount() {
        return remainingImageCount;
    }

    /**
     * Sets the value of the remainingImageCount property.
     * 
     */
    public void setRemainingImageCount(int value) {
        this.remainingImageCount = value;
    }

}
