
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationPauseResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationPauseResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="NotificationPaused" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationPauseResult", propOrder = {
    "notificationPaused"
})
public class NotificationPauseResult
    extends WebMethodResults
{

    @XmlElement(name = "NotificationPaused")
    protected int notificationPaused;

    /**
     * Gets the value of the notificationPaused property.
     * 
     */
    public int getNotificationPaused() {
        return notificationPaused;
    }

    /**
     * Sets the value of the notificationPaused property.
     * 
     */
    public void setNotificationPaused(int value) {
        this.notificationPaused = value;
    }

}
