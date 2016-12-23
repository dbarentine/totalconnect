
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
 *         &lt;element name="GetEulaTextResult" type="{https://services.alarmnet.com/TC2/}EULATextResults" minOccurs="0"/>
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
    "getEulaTextResult"
})
@XmlRootElement(name = "GetEulaTextResponse")
public class GetEulaTextResponse {

    @XmlElement(name = "GetEulaTextResult")
    protected EULATextResults getEulaTextResult;

    /**
     * Gets the value of the getEulaTextResult property.
     * 
     * @return
     *     possible object is
     *     {@link EULATextResults }
     *     
     */
    public EULATextResults getGetEulaTextResult() {
        return getEulaTextResult;
    }

    /**
     * Sets the value of the getEulaTextResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EULATextResults }
     *     
     */
    public void setGetEulaTextResult(EULATextResults value) {
        this.getEulaTextResult = value;
    }

}
