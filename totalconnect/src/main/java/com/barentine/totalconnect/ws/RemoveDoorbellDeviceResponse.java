
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
 *         &lt;element name="RemoveDoorbellDeviceResult" type="{https://services.alarmnet.com/TC2/}WebMethodResults" minOccurs="0"/>
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
    "removeDoorbellDeviceResult"
})
@XmlRootElement(name = "RemoveDoorbellDeviceResponse")
public class RemoveDoorbellDeviceResponse {

    @XmlElement(name = "RemoveDoorbellDeviceResult")
    protected WebMethodResults removeDoorbellDeviceResult;

    /**
     * Gets the value of the removeDoorbellDeviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebMethodResults }
     *     
     */
    public WebMethodResults getRemoveDoorbellDeviceResult() {
        return removeDoorbellDeviceResult;
    }

    /**
     * Sets the value of the removeDoorbellDeviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebMethodResults }
     *     
     */
    public void setRemoveDoorbellDeviceResult(WebMethodResults value) {
        this.removeDoorbellDeviceResult = value;
    }

}
