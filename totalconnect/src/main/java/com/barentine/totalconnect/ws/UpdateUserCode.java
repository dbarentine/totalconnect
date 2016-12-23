
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
 *         &lt;element name="oldUsercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newUsercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "oldUsercode",
    "newUsercode",
    "userId",
    "locationID"
})
@XmlRootElement(name = "UpdateUserCode")
public class UpdateUserCode {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    protected String oldUsercode;
    protected String newUsercode;
    @XmlElement(name = "UserId")
    protected int userId;
    @XmlElement(name = "LocationID")
    protected long locationID;

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
     * Gets the value of the oldUsercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldUsercode() {
        return oldUsercode;
    }

    /**
     * Sets the value of the oldUsercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldUsercode(String value) {
        this.oldUsercode = value;
    }

    /**
     * Gets the value of the newUsercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUsercode() {
        return newUsercode;
    }

    /**
     * Sets the value of the newUsercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUsercode(String value) {
        this.newUsercode = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     */
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(long value) {
        this.locationID = value;
    }

}
