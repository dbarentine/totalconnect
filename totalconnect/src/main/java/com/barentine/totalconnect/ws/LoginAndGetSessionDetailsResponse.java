
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
 *         &lt;element name="LoginAndGetSessionDetailsResult" type="{https://services.alarmnet.com/TC2/}SessionDetailResults" minOccurs="0"/>
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
    "loginAndGetSessionDetailsResult"
})
@XmlRootElement(name = "LoginAndGetSessionDetailsResponse")
public class LoginAndGetSessionDetailsResponse {

    @XmlElement(name = "LoginAndGetSessionDetailsResult")
    protected SessionDetailResults loginAndGetSessionDetailsResult;

    /**
     * Gets the value of the loginAndGetSessionDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SessionDetailResults }
     *     
     */
    public SessionDetailResults getLoginAndGetSessionDetailsResult() {
        return loginAndGetSessionDetailsResult;
    }

    /**
     * Sets the value of the loginAndGetSessionDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionDetailResults }
     *     
     */
    public void setLoginAndGetSessionDetailsResult(SessionDetailResults value) {
        this.loginAndGetSessionDetailsResult = value;
    }

}
