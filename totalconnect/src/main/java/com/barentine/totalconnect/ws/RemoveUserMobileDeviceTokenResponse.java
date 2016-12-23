
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
 *         &lt;element name="RemoveUserMobileDeviceTokenResult" type="{https://services.alarmnet.com/TC2/}WebMethodResults" minOccurs="0"/>
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
    "removeUserMobileDeviceTokenResult"
})
@XmlRootElement(name = "RemoveUserMobileDeviceTokenResponse")
public class RemoveUserMobileDeviceTokenResponse {

    @XmlElement(name = "RemoveUserMobileDeviceTokenResult")
    protected WebMethodResults removeUserMobileDeviceTokenResult;

    /**
     * Gets the value of the removeUserMobileDeviceTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebMethodResults }
     *     
     */
    public WebMethodResults getRemoveUserMobileDeviceTokenResult() {
        return removeUserMobileDeviceTokenResult;
    }

    /**
     * Sets the value of the removeUserMobileDeviceTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebMethodResults }
     *     
     */
    public void setRemoveUserMobileDeviceTokenResult(WebMethodResults value) {
        this.removeUserMobileDeviceTokenResult = value;
    }

}
