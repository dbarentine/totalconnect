
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
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ClientSoftwareTypeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MobileDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionID",
    "userID",
    "clientSoftwareTypeID",
    "mobileDeviceID"
})
@XmlRootElement(name = "InsertUserMobileDeviceToken")
public class InsertUserMobileDeviceToken {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "UserID")
    protected long userID;
    @XmlElement(name = "ClientSoftwareTypeID")
    protected long clientSoftwareTypeID;
    @XmlElement(name = "MobileDeviceID")
    protected String mobileDeviceID;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     */
    public long getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(long value) {
        this.userID = value;
    }

    /**
     * Gets the value of the clientSoftwareTypeID property.
     * 
     */
    public long getClientSoftwareTypeID() {
        return clientSoftwareTypeID;
    }

    /**
     * Sets the value of the clientSoftwareTypeID property.
     * 
     */
    public void setClientSoftwareTypeID(long value) {
        this.clientSoftwareTypeID = value;
    }

    /**
     * Gets the value of the mobileDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileDeviceID() {
        return mobileDeviceID;
    }

    /**
     * Sets the value of the mobileDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileDeviceID(String value) {
        this.mobileDeviceID = value;
    }

}
