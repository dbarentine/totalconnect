
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationScheduleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationScheduleResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="NotificationSchedules" type="{https://services.alarmnet.com/TC2/}ArrayOfNotificationSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationScheduleResult", propOrder = {
    "notificationSchedules"
})
public class NotificationScheduleResult
    extends WebMethodResults
{

    @XmlElement(name = "NotificationSchedules")
    protected ArrayOfNotificationSchedule notificationSchedules;

    /**
     * Gets the value of the notificationSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotificationSchedule }
     *     
     */
    public ArrayOfNotificationSchedule getNotificationSchedules() {
        return notificationSchedules;
    }

    /**
     * Sets the value of the notificationSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotificationSchedule }
     *     
     */
    public void setNotificationSchedules(ArrayOfNotificationSchedule value) {
        this.notificationSchedules = value;
    }

}
