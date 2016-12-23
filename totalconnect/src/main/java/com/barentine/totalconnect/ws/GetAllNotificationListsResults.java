
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAllNotificationListsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllNotificationListsResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="NotificationListCollection" type="{https://services.alarmnet.com/TC2/}ArrayOfNotificationListBaseInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllNotificationListsResults", propOrder = {
    "notificationListCollection"
})
public class GetAllNotificationListsResults
    extends WebMethodResults
{

    @XmlElement(name = "NotificationListCollection")
    protected ArrayOfNotificationListBaseInfo notificationListCollection;

    /**
     * Gets the value of the notificationListCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotificationListBaseInfo }
     *     
     */
    public ArrayOfNotificationListBaseInfo getNotificationListCollection() {
        return notificationListCollection;
    }

    /**
     * Sets the value of the notificationListCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotificationListBaseInfo }
     *     
     */
    public void setNotificationListCollection(ArrayOfNotificationListBaseInfo value) {
        this.notificationListCollection = value;
    }

}
