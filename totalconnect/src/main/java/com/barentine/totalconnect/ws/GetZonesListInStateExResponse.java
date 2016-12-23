
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
 *         &lt;element name="GetZonesListInStateExResult" type="{https://services.alarmnet.com/TC2/}GetZonesListInStateExResult" minOccurs="0"/>
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
    "getZonesListInStateExResult"
})
@XmlRootElement(name = "GetZonesListInStateExResponse")
public class GetZonesListInStateExResponse {

    @XmlElement(name = "GetZonesListInStateExResult")
    protected GetZonesListInStateExResult getZonesListInStateExResult;

    /**
     * Gets the value of the getZonesListInStateExResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetZonesListInStateExResult }
     *     
     */
    public GetZonesListInStateExResult getGetZonesListInStateExResult() {
        return getZonesListInStateExResult;
    }

    /**
     * Sets the value of the getZonesListInStateExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetZonesListInStateExResult }
     *     
     */
    public void setGetZonesListInStateExResult(GetZonesListInStateExResult value) {
        this.getZonesListInStateExResult = value;
    }

}
