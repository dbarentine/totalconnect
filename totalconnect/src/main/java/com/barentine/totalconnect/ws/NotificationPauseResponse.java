
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
 *         &lt;element name="NotificationPauseResult" type="{https://services.alarmnet.com/TC2/}NotificationPauseResult" minOccurs="0"/>
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
    "notificationPauseResult"
})
@XmlRootElement(name = "NotificationPauseResponse")
public class NotificationPauseResponse {

    @XmlElement(name = "NotificationPauseResult")
    protected NotificationPauseResult notificationPauseResult;

    /**
     * Gets the value of the notificationPauseResult property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationPauseResult }
     *     
     */
    public NotificationPauseResult getNotificationPauseResult() {
        return notificationPauseResult;
    }

    /**
     * Sets the value of the notificationPauseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationPauseResult }
     *     
     */
    public void setNotificationPauseResult(NotificationPauseResult value) {
        this.notificationPauseResult = value;
    }

}
