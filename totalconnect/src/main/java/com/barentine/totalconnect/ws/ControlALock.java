
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
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LockID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LockDesiredState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AuthorizingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "deviceID",
    "lockID",
    "lockDesiredState",
    "authorizingCode"
})
@XmlRootElement(name = "ControlALock")
public class ControlALock {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "LockID")
    protected long lockID;
    @XmlElement(name = "LockDesiredState")
    protected int lockDesiredState;
    @XmlElement(name = "AuthorizingCode")
    protected String authorizingCode;

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
     * Gets the value of the deviceID property.
     * 
     */
    public long getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     */
    public void setDeviceID(long value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the lockID property.
     * 
     */
    public long getLockID() {
        return lockID;
    }

    /**
     * Sets the value of the lockID property.
     * 
     */
    public void setLockID(long value) {
        this.lockID = value;
    }

    /**
     * Gets the value of the lockDesiredState property.
     * 
     */
    public int getLockDesiredState() {
        return lockDesiredState;
    }

    /**
     * Sets the value of the lockDesiredState property.
     * 
     */
    public void setLockDesiredState(int value) {
        this.lockDesiredState = value;
    }

    /**
     * Gets the value of the authorizingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizingCode() {
        return authorizingCode;
    }

    /**
     * Sets the value of the authorizingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizingCode(String value) {
        this.authorizingCode = value;
    }

}
