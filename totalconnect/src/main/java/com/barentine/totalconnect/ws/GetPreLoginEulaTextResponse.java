
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
 *         &lt;element name="GetPreLoginEulaTextResult" type="{https://services.alarmnet.com/TC2/}EULATextResults" minOccurs="0"/>
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
    "getPreLoginEulaTextResult"
})
@XmlRootElement(name = "GetPreLoginEulaTextResponse")
public class GetPreLoginEulaTextResponse {

    @XmlElement(name = "GetPreLoginEulaTextResult")
    protected EULATextResults getPreLoginEulaTextResult;

    /**
     * Gets the value of the getPreLoginEulaTextResult property.
     * 
     * @return
     *     possible object is
     *     {@link EULATextResults }
     *     
     */
    public EULATextResults getGetPreLoginEulaTextResult() {
        return getPreLoginEulaTextResult;
    }

    /**
     * Sets the value of the getPreLoginEulaTextResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EULATextResults }
     *     
     */
    public void setGetPreLoginEulaTextResult(EULATextResults value) {
        this.getPreLoginEulaTextResult = value;
    }

}
