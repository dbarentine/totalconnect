
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
 *         &lt;element name="DisableEnableUserExResult" type="{https://services.alarmnet.com/TC2/}DisableEnableUserResults" minOccurs="0"/>
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
    "disableEnableUserExResult"
})
@XmlRootElement(name = "DisableEnableUserExResponse")
public class DisableEnableUserExResponse {

    @XmlElement(name = "DisableEnableUserExResult")
    protected DisableEnableUserResults disableEnableUserExResult;

    /**
     * Gets the value of the disableEnableUserExResult property.
     * 
     * @return
     *     possible object is
     *     {@link DisableEnableUserResults }
     *     
     */
    public DisableEnableUserResults getDisableEnableUserExResult() {
        return disableEnableUserExResult;
    }

    /**
     * Sets the value of the disableEnableUserExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisableEnableUserResults }
     *     
     */
    public void setDisableEnableUserExResult(DisableEnableUserResults value) {
        this.disableEnableUserExResult = value;
    }

}
