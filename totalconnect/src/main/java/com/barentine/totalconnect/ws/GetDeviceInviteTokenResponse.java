
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
 *         &lt;element name="GetDeviceInviteTokenResult" type="{https://services.alarmnet.com/TC2/}DeviceInviteTokenResults" minOccurs="0"/>
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
    "getDeviceInviteTokenResult"
})
@XmlRootElement(name = "GetDeviceInviteTokenResponse")
public class GetDeviceInviteTokenResponse {

    @XmlElement(name = "GetDeviceInviteTokenResult")
    protected DeviceInviteTokenResults getDeviceInviteTokenResult;

    /**
     * Gets the value of the getDeviceInviteTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInviteTokenResults }
     *     
     */
    public DeviceInviteTokenResults getGetDeviceInviteTokenResult() {
        return getDeviceInviteTokenResult;
    }

    /**
     * Sets the value of the getDeviceInviteTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInviteTokenResults }
     *     
     */
    public void setGetDeviceInviteTokenResult(DeviceInviteTokenResults value) {
        this.getDeviceInviteTokenResult = value;
    }

}
