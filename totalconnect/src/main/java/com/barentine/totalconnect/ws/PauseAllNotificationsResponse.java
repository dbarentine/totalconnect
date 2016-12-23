
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
 *         &lt;element name="PauseAllNotificationsResult" type="{https://services.alarmnet.com/TC2/}NotificationStatusResult" minOccurs="0"/>
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
    "pauseAllNotificationsResult"
})
@XmlRootElement(name = "PauseAllNotificationsResponse")
public class PauseAllNotificationsResponse {

    @XmlElement(name = "PauseAllNotificationsResult")
    protected NotificationStatusResult pauseAllNotificationsResult;

    /**
     * Gets the value of the pauseAllNotificationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatusResult }
     *     
     */
    public NotificationStatusResult getPauseAllNotificationsResult() {
        return pauseAllNotificationsResult;
    }

    /**
     * Sets the value of the pauseAllNotificationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatusResult }
     *     
     */
    public void setPauseAllNotificationsResult(NotificationStatusResult value) {
        this.pauseAllNotificationsResult = value;
    }

}
