
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEmailValidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NotificationMethodID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountryCallingCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailInfo", propOrder = {
    "emailAddress",
    "isEmailValidated",
    "notificationMethodID",
    "countryCallingCode"
})
public class EmailInfo {

    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "IsEmailValidated")
    protected boolean isEmailValidated;
    @XmlElement(name = "NotificationMethodID")
    protected int notificationMethodID;
    @XmlElement(name = "CountryCallingCode")
    protected int countryCallingCode;

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the isEmailValidated property.
     * 
     */
    public boolean isIsEmailValidated() {
        return isEmailValidated;
    }

    /**
     * Sets the value of the isEmailValidated property.
     * 
     */
    public void setIsEmailValidated(boolean value) {
        this.isEmailValidated = value;
    }

    /**
     * Gets the value of the notificationMethodID property.
     * 
     */
    public int getNotificationMethodID() {
        return notificationMethodID;
    }

    /**
     * Sets the value of the notificationMethodID property.
     * 
     */
    public void setNotificationMethodID(int value) {
        this.notificationMethodID = value;
    }

    /**
     * Gets the value of the countryCallingCode property.
     * 
     */
    public int getCountryCallingCode() {
        return countryCallingCode;
    }

    /**
     * Sets the value of the countryCallingCode property.
     * 
     */
    public void setCountryCallingCode(int value) {
        this.countryCallingCode = value;
    }

}
