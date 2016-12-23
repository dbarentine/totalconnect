
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
 *         &lt;element name="GetVideoPIRLocationDeviceListResult" type="{https://services.alarmnet.com/TC2/}VideoPIRListResults" minOccurs="0"/>
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
    "getVideoPIRLocationDeviceListResult"
})
@XmlRootElement(name = "GetVideoPIRLocationDeviceListResponse")
public class GetVideoPIRLocationDeviceListResponse {

    @XmlElement(name = "GetVideoPIRLocationDeviceListResult")
    protected VideoPIRListResults getVideoPIRLocationDeviceListResult;

    /**
     * Gets the value of the getVideoPIRLocationDeviceListResult property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPIRListResults }
     *     
     */
    public VideoPIRListResults getGetVideoPIRLocationDeviceListResult() {
        return getVideoPIRLocationDeviceListResult;
    }

    /**
     * Sets the value of the getVideoPIRLocationDeviceListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPIRListResults }
     *     
     */
    public void setGetVideoPIRLocationDeviceListResult(VideoPIRListResults value) {
        this.getVideoPIRLocationDeviceListResult = value;
    }

}
