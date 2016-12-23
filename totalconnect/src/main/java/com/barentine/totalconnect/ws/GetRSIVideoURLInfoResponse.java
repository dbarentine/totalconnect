
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
 *         &lt;element name="GetRSIVideoURLInfoResult" type="{https://services.alarmnet.com/TC2/}GetRSIVideoURLInfoResult" minOccurs="0"/>
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
    "getRSIVideoURLInfoResult"
})
@XmlRootElement(name = "GetRSIVideoURLInfoResponse")
public class GetRSIVideoURLInfoResponse {

    @XmlElement(name = "GetRSIVideoURLInfoResult")
    protected GetRSIVideoURLInfoResult getRSIVideoURLInfoResult;

    /**
     * Gets the value of the getRSIVideoURLInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetRSIVideoURLInfoResult }
     *     
     */
    public GetRSIVideoURLInfoResult getGetRSIVideoURLInfoResult() {
        return getRSIVideoURLInfoResult;
    }

    /**
     * Sets the value of the getRSIVideoURLInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRSIVideoURLInfoResult }
     *     
     */
    public void setGetRSIVideoURLInfoResult(GetRSIVideoURLInfoResult value) {
        this.getRSIVideoURLInfoResult = value;
    }

}
