
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SentToPanelEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SentToPanelEvents">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}NotificationInfoBase">
 *       &lt;attribute name="CustomNotificationMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NotificationTypeID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SentToPanelEvents")
public class SentToPanelEvents
    extends NotificationInfoBase
{

    @XmlAttribute(name = "CustomNotificationMessage")
    protected String customNotificationMessage;
    @XmlAttribute(name = "NotificationTypeID", required = true)
    protected int notificationTypeID;

    /**
     * Gets the value of the customNotificationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomNotificationMessage() {
        return customNotificationMessage;
    }

    /**
     * Sets the value of the customNotificationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomNotificationMessage(String value) {
        this.customNotificationMessage = value;
    }

    /**
     * Gets the value of the notificationTypeID property.
     * 
     */
    public int getNotificationTypeID() {
        return notificationTypeID;
    }

    /**
     * Sets the value of the notificationTypeID property.
     * 
     */
    public void setNotificationTypeID(int value) {
        this.notificationTypeID = value;
    }

}
