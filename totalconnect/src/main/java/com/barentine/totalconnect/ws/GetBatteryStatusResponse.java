
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
 *         &lt;element name="GetBatteryStatusResult" type="{https://services.alarmnet.com/TC2/}CameraBatteryStatusResult" minOccurs="0"/>
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
    "getBatteryStatusResult"
})
@XmlRootElement(name = "GetBatteryStatusResponse")
public class GetBatteryStatusResponse {

    @XmlElement(name = "GetBatteryStatusResult")
    protected CameraBatteryStatusResult getBatteryStatusResult;

    /**
     * Gets the value of the getBatteryStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link CameraBatteryStatusResult }
     *     
     */
    public CameraBatteryStatusResult getGetBatteryStatusResult() {
        return getBatteryStatusResult;
    }

    /**
     * Sets the value of the getBatteryStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraBatteryStatusResult }
     *     
     */
    public void setGetBatteryStatusResult(CameraBatteryStatusResult value) {
        this.getBatteryStatusResult = value;
    }

}
