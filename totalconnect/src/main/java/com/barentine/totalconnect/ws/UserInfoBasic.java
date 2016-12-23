
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserInfoBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfoBasic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LocaleID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UserFeatureList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientPreferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEulaAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsSMSEulaAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DateFormatID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TimeFormatID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PushNotificationStatus" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="HasResetPassword" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfoBasic", propOrder = {
    "userID",
    "username",
    "fullname",
    "language",
    "localeID",
    "userFeatureList",
    "clientPreferences",
    "isEulaAccepted",
    "isSMSEulaAccepted",
    "dateFormatID",
    "timeFormatID",
    "pushNotificationStatus",
    "hasResetPassword"
})
public class UserInfoBasic {

    @XmlElement(name = "UserID")
    protected long userID;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Fullname")
    protected String fullname;
    @XmlElement(name = "Language")
    protected long language;
    @XmlElement(name = "LocaleID")
    protected long localeID;
    @XmlElement(name = "UserFeatureList")
    protected String userFeatureList;
    @XmlElement(name = "ClientPreferences")
    protected String clientPreferences;
    @XmlElement(name = "IsEulaAccepted")
    protected boolean isEulaAccepted;
    @XmlElement(name = "IsSMSEulaAccepted")
    protected boolean isSMSEulaAccepted;
    @XmlElement(name = "DateFormatID")
    protected int dateFormatID;
    @XmlElement(name = "TimeFormatID")
    protected int timeFormatID;
    @XmlElement(name = "PushNotificationStatus")
    protected short pushNotificationStatus;
    @XmlElement(name = "HasResetPassword")
    protected boolean hasResetPassword;

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
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullname(String value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the language property.
     * 
     */
    public long getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     */
    public void setLanguage(long value) {
        this.language = value;
    }

    /**
     * Gets the value of the localeID property.
     * 
     */
    public long getLocaleID() {
        return localeID;
    }

    /**
     * Sets the value of the localeID property.
     * 
     */
    public void setLocaleID(long value) {
        this.localeID = value;
    }

    /**
     * Gets the value of the userFeatureList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFeatureList() {
        return userFeatureList;
    }

    /**
     * Sets the value of the userFeatureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFeatureList(String value) {
        this.userFeatureList = value;
    }

    /**
     * Gets the value of the clientPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientPreferences() {
        return clientPreferences;
    }

    /**
     * Sets the value of the clientPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientPreferences(String value) {
        this.clientPreferences = value;
    }

    /**
     * Gets the value of the isEulaAccepted property.
     * 
     */
    public boolean isIsEulaAccepted() {
        return isEulaAccepted;
    }

    /**
     * Sets the value of the isEulaAccepted property.
     * 
     */
    public void setIsEulaAccepted(boolean value) {
        this.isEulaAccepted = value;
    }

    /**
     * Gets the value of the isSMSEulaAccepted property.
     * 
     */
    public boolean isIsSMSEulaAccepted() {
        return isSMSEulaAccepted;
    }

    /**
     * Sets the value of the isSMSEulaAccepted property.
     * 
     */
    public void setIsSMSEulaAccepted(boolean value) {
        this.isSMSEulaAccepted = value;
    }

    /**
     * Gets the value of the dateFormatID property.
     * 
     */
    public int getDateFormatID() {
        return dateFormatID;
    }

    /**
     * Sets the value of the dateFormatID property.
     * 
     */
    public void setDateFormatID(int value) {
        this.dateFormatID = value;
    }

    /**
     * Gets the value of the timeFormatID property.
     * 
     */
    public int getTimeFormatID() {
        return timeFormatID;
    }

    /**
     * Sets the value of the timeFormatID property.
     * 
     */
    public void setTimeFormatID(int value) {
        this.timeFormatID = value;
    }

    /**
     * Gets the value of the pushNotificationStatus property.
     * 
     */
    public short getPushNotificationStatus() {
        return pushNotificationStatus;
    }

    /**
     * Sets the value of the pushNotificationStatus property.
     * 
     */
    public void setPushNotificationStatus(short value) {
        this.pushNotificationStatus = value;
    }

    /**
     * Gets the value of the hasResetPassword property.
     * 
     */
    public boolean isHasResetPassword() {
        return hasResetPassword;
    }

    /**
     * Sets the value of the hasResetPassword property.
     * 
     */
    public void setHasResetPassword(boolean value) {
        this.hasResetPassword = value;
    }

}
