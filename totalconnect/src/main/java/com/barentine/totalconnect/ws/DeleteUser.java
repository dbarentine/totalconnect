
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
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UserTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "userId",
    "userTypeID",
    "additionalInput"
})
@XmlRootElement(name = "DeleteUser")
public class DeleteUser {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "UserId")
    protected long userId;
    @XmlElement(name = "UserTypeID")
    protected int userTypeID;
    @XmlElement(name = "AdditionalInput")
    protected String additionalInput;

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
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userTypeID property.
     * 
     */
    public int getUserTypeID() {
        return userTypeID;
    }

    /**
     * Sets the value of the userTypeID property.
     * 
     */
    public void setUserTypeID(int value) {
        this.userTypeID = value;
    }

    /**
     * Gets the value of the additionalInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInput() {
        return additionalInput;
    }

    /**
     * Sets the value of the additionalInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInput(String value) {
        this.additionalInput = value;
    }

}
