
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LockSubAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LockSubAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubActionID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LockID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockSubAction", propOrder = {
    "subActionID",
    "lockID",
    "state",
    "authorizationCode"
})
public class LockSubAction {

    @XmlElement(name = "SubActionID")
    protected long subActionID;
    @XmlElement(name = "LockID")
    protected long lockID;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "AuthorizationCode")
    protected int authorizationCode;

    /**
     * Gets the value of the subActionID property.
     * 
     */
    public long getSubActionID() {
        return subActionID;
    }

    /**
     * Sets the value of the subActionID property.
     * 
     */
    public void setSubActionID(long value) {
        this.subActionID = value;
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
     * Gets the value of the state property.
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     */
    public void setState(int value) {
        this.state = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     */
    public int getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     */
    public void setAuthorizationCode(int value) {
        this.authorizationCode = value;
    }

}
