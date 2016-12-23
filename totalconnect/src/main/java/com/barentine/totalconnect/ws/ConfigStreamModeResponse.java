
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
 *         &lt;element name="ConfigStreamModeResult" type="{https://services.alarmnet.com/TC2/}ConfigStreamModeResult" minOccurs="0"/>
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
    "configStreamModeResult"
})
@XmlRootElement(name = "ConfigStreamModeResponse")
public class ConfigStreamModeResponse {

    @XmlElement(name = "ConfigStreamModeResult")
    protected ConfigStreamModeResult configStreamModeResult;

    /**
     * Gets the value of the configStreamModeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigStreamModeResult }
     *     
     */
    public ConfigStreamModeResult getConfigStreamModeResult() {
        return configStreamModeResult;
    }

    /**
     * Sets the value of the configStreamModeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigStreamModeResult }
     *     
     */
    public void setConfigStreamModeResult(ConfigStreamModeResult value) {
        this.configStreamModeResult = value;
    }

}
