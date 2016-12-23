
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
 *         &lt;element name="AuthenticateUserLoginResult" type="{https://services.alarmnet.com/TC2/}AuthenticateLoginResults" minOccurs="0"/>
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
    "authenticateUserLoginResult"
})
@XmlRootElement(name = "AuthenticateUserLoginResponse")
public class AuthenticateUserLoginResponse {

    @XmlElement(name = "AuthenticateUserLoginResult")
    protected AuthenticateLoginResults authenticateUserLoginResult;

    /**
     * Gets the value of the authenticateUserLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticateLoginResults }
     *     
     */
    public AuthenticateLoginResults getAuthenticateUserLoginResult() {
        return authenticateUserLoginResult;
    }

    /**
     * Sets the value of the authenticateUserLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticateLoginResults }
     *     
     */
    public void setAuthenticateUserLoginResult(AuthenticateLoginResults value) {
        this.authenticateUserLoginResult = value;
    }

}
