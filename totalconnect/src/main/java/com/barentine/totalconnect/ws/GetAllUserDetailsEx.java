
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
 *         &lt;element name="ManageUserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UserTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "manageUserId",
    "userTypeId",
    "additionalInput"
})
@XmlRootElement(name = "GetAllUserDetailsEx")
public class GetAllUserDetailsEx {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "ManageUserId")
    protected long manageUserId;
    @XmlElement(name = "UserTypeId")
    protected int userTypeId;
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
     * Gets the value of the manageUserId property.
     * 
     */
    public long getManageUserId() {
        return manageUserId;
    }

    /**
     * Sets the value of the manageUserId property.
     * 
     */
    public void setManageUserId(long value) {
        this.manageUserId = value;
    }

    /**
     * Gets the value of the userTypeId property.
     * 
     */
    public int getUserTypeId() {
        return userTypeId;
    }

    /**
     * Sets the value of the userTypeId property.
     * 
     */
    public void setUserTypeId(int value) {
        this.userTypeId = value;
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
