
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
 *         &lt;element name="GetWAPClientsInfoResult" type="{https://services.alarmnet.com/TC2/}WAPClientsListResults" minOccurs="0"/>
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
    "getWAPClientsInfoResult"
})
@XmlRootElement(name = "GetWAPClientsInfoResponse")
public class GetWAPClientsInfoResponse {

    @XmlElement(name = "GetWAPClientsInfoResult")
    protected WAPClientsListResults getWAPClientsInfoResult;

    /**
     * Gets the value of the getWAPClientsInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link WAPClientsListResults }
     *     
     */
    public WAPClientsListResults getGetWAPClientsInfoResult() {
        return getWAPClientsInfoResult;
    }

    /**
     * Sets the value of the getWAPClientsInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WAPClientsListResults }
     *     
     */
    public void setGetWAPClientsInfoResult(WAPClientsListResults value) {
        this.getWAPClientsInfoResult = value;
    }

}
