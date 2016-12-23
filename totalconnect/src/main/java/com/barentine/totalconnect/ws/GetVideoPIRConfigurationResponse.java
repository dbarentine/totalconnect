
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
 *         &lt;element name="GetVideoPIRConfigurationResult" type="{https://services.alarmnet.com/TC2/}VideoPIRConfigurationResults" minOccurs="0"/>
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
    "getVideoPIRConfigurationResult"
})
@XmlRootElement(name = "GetVideoPIRConfigurationResponse")
public class GetVideoPIRConfigurationResponse {

    @XmlElement(name = "GetVideoPIRConfigurationResult")
    protected VideoPIRConfigurationResults getVideoPIRConfigurationResult;

    /**
     * Gets the value of the getVideoPIRConfigurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPIRConfigurationResults }
     *     
     */
    public VideoPIRConfigurationResults getGetVideoPIRConfigurationResult() {
        return getVideoPIRConfigurationResult;
    }

    /**
     * Sets the value of the getVideoPIRConfigurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPIRConfigurationResults }
     *     
     */
    public void setGetVideoPIRConfigurationResult(VideoPIRConfigurationResults value) {
        this.getVideoPIRConfigurationResult = value;
    }

}
