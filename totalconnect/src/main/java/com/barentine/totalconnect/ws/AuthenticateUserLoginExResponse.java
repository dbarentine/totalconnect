
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
 *         &lt;element name="AuthenticateUserLoginExResult" type="{https://services.alarmnet.com/TC2/}AuthenticateLoginResults" minOccurs="0"/>
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
    "authenticateUserLoginExResult"
})
@XmlRootElement(name = "AuthenticateUserLoginExResponse")
public class AuthenticateUserLoginExResponse {

    @XmlElement(name = "AuthenticateUserLoginExResult")
    protected AuthenticateLoginResults authenticateUserLoginExResult;

    /**
     * Gets the value of the authenticateUserLoginExResult property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticateLoginResults }
     *     
     */
    public AuthenticateLoginResults getAuthenticateUserLoginExResult() {
        return authenticateUserLoginExResult;
    }

    /**
     * Sets the value of the authenticateUserLoginExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticateLoginResults }
     *     
     */
    public void setAuthenticateUserLoginExResult(AuthenticateLoginResults value) {
        this.authenticateUserLoginExResult = value;
    }

}
