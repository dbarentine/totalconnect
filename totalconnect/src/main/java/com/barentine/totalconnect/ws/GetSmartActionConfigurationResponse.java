
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
 *         &lt;element name="GetSmartActionConfigurationResult" type="{https://services.alarmnet.com/TC2/}GetSmartActionConfigurationResults" minOccurs="0"/>
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
    "getSmartActionConfigurationResult"
})
@XmlRootElement(name = "GetSmartActionConfigurationResponse")
public class GetSmartActionConfigurationResponse {

    @XmlElement(name = "GetSmartActionConfigurationResult")
    protected GetSmartActionConfigurationResults getSmartActionConfigurationResult;

    /**
     * Gets the value of the getSmartActionConfigurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetSmartActionConfigurationResults }
     *     
     */
    public GetSmartActionConfigurationResults getGetSmartActionConfigurationResult() {
        return getSmartActionConfigurationResult;
    }

    /**
     * Sets the value of the getSmartActionConfigurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSmartActionConfigurationResults }
     *     
     */
    public void setGetSmartActionConfigurationResult(GetSmartActionConfigurationResults value) {
        this.getSmartActionConfigurationResult = value;
    }

}
