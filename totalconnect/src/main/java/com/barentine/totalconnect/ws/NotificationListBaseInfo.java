
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationListBaseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationListBaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationListID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NotificationListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsNotificationListEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsInUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AssociatedUsers" type="{https://services.alarmnet.com/TC2/}ArrayOfNotificationListUserInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationListBaseInfo", propOrder = {
    "notificationListID",
    "notificationListName",
    "isNotificationListEnabled",
    "isInUse",
    "associatedUsers"
})
public class NotificationListBaseInfo {

    @XmlElement(name = "NotificationListID")
    protected long notificationListID;
    @XmlElement(name = "NotificationListName")
    protected String notificationListName;
    @XmlElement(name = "IsNotificationListEnabled")
    protected boolean isNotificationListEnabled;
    @XmlElement(name = "IsInUse")
    protected boolean isInUse;
    @XmlElement(name = "AssociatedUsers")
    protected ArrayOfNotificationListUserInfo associatedUsers;

    /**
     * Gets the value of the notificationListID property.
     * 
     */
    public long getNotificationListID() {
        return notificationListID;
    }

    /**
     * Sets the value of the notificationListID property.
     * 
     */
    public void setNotificationListID(long value) {
        this.notificationListID = value;
    }

    /**
     * Gets the value of the notificationListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationListName() {
        return notificationListName;
    }

    /**
     * Sets the value of the notificationListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationListName(String value) {
        this.notificationListName = value;
    }

    /**
     * Gets the value of the isNotificationListEnabled property.
     * 
     */
    public boolean isIsNotificationListEnabled() {
        return isNotificationListEnabled;
    }

    /**
     * Sets the value of the isNotificationListEnabled property.
     * 
     */
    public void setIsNotificationListEnabled(boolean value) {
        this.isNotificationListEnabled = value;
    }

    /**
     * Gets the value of the isInUse property.
     * 
     */
    public boolean isIsInUse() {
        return isInUse;
    }

    /**
     * Sets the value of the isInUse property.
     * 
     */
    public void setIsInUse(boolean value) {
        this.isInUse = value;
    }

    /**
     * Gets the value of the associatedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotificationListUserInfo }
     *     
     */
    public ArrayOfNotificationListUserInfo getAssociatedUsers() {
        return associatedUsers;
    }

    /**
     * Sets the value of the associatedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotificationListUserInfo }
     *     
     */
    public void setAssociatedUsers(ArrayOfNotificationListUserInfo value) {
        this.associatedUsers = value;
    }

}
