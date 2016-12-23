
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationsPaused" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PushNotificationStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationStatus", propOrder = {
    "notificationsPaused",
    "pushNotificationStatus"
})
public class NotificationStatus {

    @XmlElement(name = "NotificationsPaused")
    protected int notificationsPaused;
    @XmlElement(name = "PushNotificationStatus")
    protected int pushNotificationStatus;

    /**
     * Gets the value of the notificationsPaused property.
     * 
     */
    public int getNotificationsPaused() {
        return notificationsPaused;
    }

    /**
     * Sets the value of the notificationsPaused property.
     * 
     */
    public void setNotificationsPaused(int value) {
        this.notificationsPaused = value;
    }

    /**
     * Gets the value of the pushNotificationStatus property.
     * 
     */
    public int getPushNotificationStatus() {
        return pushNotificationStatus;
    }

    /**
     * Sets the value of the pushNotificationStatus property.
     * 
     */
    public void setPushNotificationStatus(int value) {
        this.pushNotificationStatus = value;
    }

}
