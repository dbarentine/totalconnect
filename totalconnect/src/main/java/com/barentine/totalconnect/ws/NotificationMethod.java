
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationMethodID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NotificationMethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMethod", propOrder = {
    "notificationMethodID",
    "notificationMethodName"
})
public class NotificationMethod {

    @XmlElement(name = "NotificationMethodID")
    protected int notificationMethodID;
    @XmlElement(name = "NotificationMethodName")
    protected String notificationMethodName;

    /**
     * Gets the value of the notificationMethodID property.
     * 
     */
    public int getNotificationMethodID() {
        return notificationMethodID;
    }

    /**
     * Sets the value of the notificationMethodID property.
     * 
     */
    public void setNotificationMethodID(int value) {
        this.notificationMethodID = value;
    }

    /**
     * Gets the value of the notificationMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationMethodName() {
        return notificationMethodName;
    }

    /**
     * Sets the value of the notificationMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationMethodName(String value) {
        this.notificationMethodName = value;
    }

}
