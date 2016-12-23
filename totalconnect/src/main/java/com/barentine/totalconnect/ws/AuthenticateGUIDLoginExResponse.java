
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
 *         &lt;element name="AuthenticateGUIDLoginExResult" type="{https://services.alarmnet.com/TC2/}AuthenticateLoginResults" minOccurs="0"/>
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
    "authenticateGUIDLoginExResult"
})
@XmlRootElement(name = "AuthenticateGUIDLoginExResponse")
public class AuthenticateGUIDLoginExResponse {

    @XmlElement(name = "AuthenticateGUIDLoginExResult")
    protected AuthenticateLoginResults authenticateGUIDLoginExResult;

    /**
     * Gets the value of the authenticateGUIDLoginExResult property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticateLoginResults }
     *     
     */
    public AuthenticateLoginResults getAuthenticateGUIDLoginExResult() {
        return authenticateGUIDLoginExResult;
    }

    /**
     * Sets the value of the authenticateGUIDLoginExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticateLoginResults }
     *     
     */
    public void setAuthenticateGUIDLoginExResult(AuthenticateLoginResults value) {
        this.authenticateGUIDLoginExResult = value;
    }

}
