
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
 *         &lt;element name="SaveWiFiLockDeviceResult" type="{https://services.alarmnet.com/TC2/}WebMethodResults" minOccurs="0"/>
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
    "saveWiFiLockDeviceResult"
})
@XmlRootElement(name = "SaveWiFiLockDeviceResponse")
public class SaveWiFiLockDeviceResponse {

    @XmlElement(name = "SaveWiFiLockDeviceResult")
    protected WebMethodResults saveWiFiLockDeviceResult;

    /**
     * Gets the value of the saveWiFiLockDeviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebMethodResults }
     *     
     */
    public WebMethodResults getSaveWiFiLockDeviceResult() {
        return saveWiFiLockDeviceResult;
    }

    /**
     * Sets the value of the saveWiFiLockDeviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebMethodResults }
     *     
     */
    public void setSaveWiFiLockDeviceResult(WebMethodResults value) {
        this.saveWiFiLockDeviceResult = value;
    }

}
