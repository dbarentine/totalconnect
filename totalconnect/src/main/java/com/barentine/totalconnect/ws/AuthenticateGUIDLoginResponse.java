
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
 *         &lt;element name="AuthenticateGUIDLoginResult" type="{https://services.alarmnet.com/TC2/}AuthenticateLoginResults" minOccurs="0"/>
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
    "authenticateGUIDLoginResult"
})
@XmlRootElement(name = "AuthenticateGUIDLoginResponse")
public class AuthenticateGUIDLoginResponse {

    @XmlElement(name = "AuthenticateGUIDLoginResult")
    protected AuthenticateLoginResults authenticateGUIDLoginResult;

    /**
     * Gets the value of the authenticateGUIDLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticateLoginResults }
     *     
     */
    public AuthenticateLoginResults getAuthenticateGUIDLoginResult() {
        return authenticateGUIDLoginResult;
    }

    /**
     * Sets the value of the authenticateGUIDLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticateLoginResults }
     *     
     */
    public void setAuthenticateGUIDLoginResult(AuthenticateLoginResults value) {
        this.authenticateGUIDLoginResult = value;
    }

}
