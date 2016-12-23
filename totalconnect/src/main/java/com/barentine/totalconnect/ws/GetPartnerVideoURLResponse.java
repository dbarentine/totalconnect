
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
 *         &lt;element name="GetPartnerVideoURLResult" type="{https://services.alarmnet.com/TC2/}GetPartnerVideoURLResult" minOccurs="0"/>
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
    "getPartnerVideoURLResult"
})
@XmlRootElement(name = "GetPartnerVideoURLResponse")
public class GetPartnerVideoURLResponse {

    @XmlElement(name = "GetPartnerVideoURLResult")
    protected GetPartnerVideoURLResult getPartnerVideoURLResult;

    /**
     * Gets the value of the getPartnerVideoURLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPartnerVideoURLResult }
     *     
     */
    public GetPartnerVideoURLResult getGetPartnerVideoURLResult() {
        return getPartnerVideoURLResult;
    }

    /**
     * Sets the value of the getPartnerVideoURLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPartnerVideoURLResult }
     *     
     */
    public void setGetPartnerVideoURLResult(GetPartnerVideoURLResult value) {
        this.getPartnerVideoURLResult = value;
    }

}
