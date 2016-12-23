
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationMethodResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationMethodResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="NotificationMethods" type="{https://services.alarmnet.com/TC2/}ArrayOfNotificationMethod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMethodResults", propOrder = {
    "notificationMethods"
})
public class NotificationMethodResults
    extends WebMethodResults
{

    @XmlElement(name = "NotificationMethods")
    protected ArrayOfNotificationMethod notificationMethods;

    /**
     * Gets the value of the notificationMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotificationMethod }
     *     
     */
    public ArrayOfNotificationMethod getNotificationMethods() {
        return notificationMethods;
    }

    /**
     * Sets the value of the notificationMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotificationMethod }
     *     
     */
    public void setNotificationMethods(ArrayOfNotificationMethod value) {
        this.notificationMethods = value;
    }

}
