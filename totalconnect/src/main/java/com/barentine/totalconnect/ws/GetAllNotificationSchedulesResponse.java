
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
 *         &lt;element name="GetAllNotificationSchedulesResult" type="{https://services.alarmnet.com/TC2/}NotificationScheduleResult" minOccurs="0"/>
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
    "getAllNotificationSchedulesResult"
})
@XmlRootElement(name = "GetAllNotificationSchedulesResponse")
public class GetAllNotificationSchedulesResponse {

    @XmlElement(name = "GetAllNotificationSchedulesResult")
    protected NotificationScheduleResult getAllNotificationSchedulesResult;

    /**
     * Gets the value of the getAllNotificationSchedulesResult property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationScheduleResult }
     *     
     */
    public NotificationScheduleResult getGetAllNotificationSchedulesResult() {
        return getAllNotificationSchedulesResult;
    }

    /**
     * Sets the value of the getAllNotificationSchedulesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationScheduleResult }
     *     
     */
    public void setGetAllNotificationSchedulesResult(NotificationScheduleResult value) {
        this.getAllNotificationSchedulesResult = value;
    }

}
