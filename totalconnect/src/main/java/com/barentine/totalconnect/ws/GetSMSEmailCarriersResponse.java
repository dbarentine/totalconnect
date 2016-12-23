
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
 *         &lt;element name="GetSMSEmailCarriersResult" type="{https://services.alarmnet.com/TC2/}SMSEmailCarrierResults" minOccurs="0"/>
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
    "getSMSEmailCarriersResult"
})
@XmlRootElement(name = "GetSMSEmailCarriersResponse")
public class GetSMSEmailCarriersResponse {

    @XmlElement(name = "GetSMSEmailCarriersResult")
    protected SMSEmailCarrierResults getSMSEmailCarriersResult;

    /**
     * Gets the value of the getSMSEmailCarriersResult property.
     * 
     * @return
     *     possible object is
     *     {@link SMSEmailCarrierResults }
     *     
     */
    public SMSEmailCarrierResults getGetSMSEmailCarriersResult() {
        return getSMSEmailCarriersResult;
    }

    /**
     * Sets the value of the getSMSEmailCarriersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSEmailCarrierResults }
     *     
     */
    public void setGetSMSEmailCarriersResult(SMSEmailCarrierResults value) {
        this.getSMSEmailCarriersResult = value;
    }

}
