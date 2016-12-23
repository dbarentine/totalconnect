
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
 *         &lt;element name="RemoteAuthenticateUserLoginResult" type="{https://services.alarmnet.com/TC2/}RemoteAuthenticateLoginResults" minOccurs="0"/>
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
    "remoteAuthenticateUserLoginResult"
})
@XmlRootElement(name = "RemoteAuthenticateUserLoginResponse")
public class RemoteAuthenticateUserLoginResponse {

    @XmlElement(name = "RemoteAuthenticateUserLoginResult")
    protected RemoteAuthenticateLoginResults remoteAuthenticateUserLoginResult;

    /**
     * Gets the value of the remoteAuthenticateUserLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteAuthenticateLoginResults }
     *     
     */
    public RemoteAuthenticateLoginResults getRemoteAuthenticateUserLoginResult() {
        return remoteAuthenticateUserLoginResult;
    }

    /**
     * Sets the value of the remoteAuthenticateUserLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteAuthenticateLoginResults }
     *     
     */
    public void setRemoteAuthenticateUserLoginResult(RemoteAuthenticateLoginResults value) {
        this.remoteAuthenticateUserLoginResult = value;
    }

}
