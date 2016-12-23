
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
 *         &lt;element name="GetCustomArmSettingsResult" type="{https://services.alarmnet.com/TC2/}CustomArmSettingsResult" minOccurs="0"/>
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
    "getCustomArmSettingsResult"
})
@XmlRootElement(name = "GetCustomArmSettingsResponse")
public class GetCustomArmSettingsResponse {

    @XmlElement(name = "GetCustomArmSettingsResult")
    protected CustomArmSettingsResult getCustomArmSettingsResult;

    /**
     * Gets the value of the getCustomArmSettingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomArmSettingsResult }
     *     
     */
    public CustomArmSettingsResult getGetCustomArmSettingsResult() {
        return getCustomArmSettingsResult;
    }

    /**
     * Sets the value of the getCustomArmSettingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomArmSettingsResult }
     *     
     */
    public void setGetCustomArmSettingsResult(CustomArmSettingsResult value) {
        this.getCustomArmSettingsResult = value;
    }

}
