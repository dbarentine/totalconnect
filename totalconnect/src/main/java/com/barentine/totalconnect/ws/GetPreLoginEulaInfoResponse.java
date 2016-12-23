
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
 *         &lt;element name="GetPreLoginEulaInfoResult" type="{https://services.alarmnet.com/TC2/}EULAResults" minOccurs="0"/>
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
    "getPreLoginEulaInfoResult"
})
@XmlRootElement(name = "GetPreLoginEulaInfoResponse")
public class GetPreLoginEulaInfoResponse {

    @XmlElement(name = "GetPreLoginEulaInfoResult")
    protected EULAResults getPreLoginEulaInfoResult;

    /**
     * Gets the value of the getPreLoginEulaInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link EULAResults }
     *     
     */
    public EULAResults getGetPreLoginEulaInfoResult() {
        return getPreLoginEulaInfoResult;
    }

    /**
     * Sets the value of the getPreLoginEulaInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EULAResults }
     *     
     */
    public void setGetPreLoginEulaInfoResult(EULAResults value) {
        this.getPreLoginEulaInfoResult = value;
    }

}
