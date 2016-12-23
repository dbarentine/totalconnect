
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventNotification">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}NotificationInfoBase">
 *       &lt;attribute name="CustomNotificationMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NotificationListID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ScheduleID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="SecurityPanelStateCondition" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="NotificationTypeID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="NotificationDelay" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="NotificationDeadLine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventNotification")
public class EventNotification
    extends NotificationInfoBase
{

    @XmlAttribute(name = "CustomNotificationMessage")
    protected String customNotificationMessage;
    @XmlAttribute(name = "NotificationListID", required = true)
    protected long notificationListID;
    @XmlAttribute(name = "ScheduleID", required = true)
    protected long scheduleID;
    @XmlAttribute(name = "SecurityPanelStateCondition", required = true)
    protected int securityPanelStateCondition;
    @XmlAttribute(name = "NotificationTypeID", required = true)
    protected int notificationTypeID;
    @XmlAttribute(name = "NotificationDelay", required = true)
    protected int notificationDelay;
    @XmlAttribute(name = "NotificationDeadLine")
    protected String notificationDeadLine;

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
     * Gets the value of the scheduleID property.
     * 
     */
    public long getScheduleID() {
        return scheduleID;
    }

    /**
     * Sets the value of the scheduleID property.
     * 
     */
    public void setScheduleID(long value) {
        this.scheduleID = value;
    }

    /**
     * Gets the value of the securityPanelStateCondition property.
     * 
     */
    public int getSecurityPanelStateCondition() {
        return securityPanelStateCondition;
    }

    /**
     * Sets the value of the securityPanelStateCondition property.
     * 
     */
    public void setSecurityPanelStateCondition(int value) {
        this.securityPanelStateCondition = value;
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

    /**
     * Gets the value of the notificationDelay property.
     * 
     */
    public int getNotificationDelay() {
        return notificationDelay;
    }

    /**
     * Sets the value of the notificationDelay property.
     * 
     */
    public void setNotificationDelay(int value) {
        this.notificationDelay = value;
    }

    /**
     * Gets the value of the notificationDeadLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationDeadLine() {
        return notificationDeadLine;
    }

    /**
     * Sets the value of the notificationDeadLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationDeadLine(String value) {
        this.notificationDeadLine = value;
    }

}
