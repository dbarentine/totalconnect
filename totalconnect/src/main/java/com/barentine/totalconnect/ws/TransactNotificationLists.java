
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
 *         &lt;element name="NotificationListCollection" type="{https://services.alarmnet.com/TC2/}ArrayOfNotificationListBaseInfo" minOccurs="0"/>
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
    "notificationListCollection"
})
@XmlRootElement(name = "TransactNotificationLists")
public class TransactNotificationLists {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "NotificationListCollection")
    protected ArrayOfNotificationListBaseInfo notificationListCollection;

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
     * Gets the value of the notificationListCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotificationListBaseInfo }
     *     
     */
    public ArrayOfNotificationListBaseInfo getNotificationListCollection() {
        return notificationListCollection;
    }

    /**
     * Sets the value of the notificationListCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotificationListBaseInfo }
     *     
     */
    public void setNotificationListCollection(ArrayOfNotificationListBaseInfo value) {
        this.notificationListCollection = value;
    }

}
