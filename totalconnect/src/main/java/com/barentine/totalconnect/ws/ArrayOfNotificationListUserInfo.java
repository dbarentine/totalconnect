
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNotificationListUserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNotificationListUserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationListUserInfo" type="{https://services.alarmnet.com/TC2/}NotificationListUserInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotificationListUserInfo", propOrder = {
    "notificationListUserInfo"
})
public class ArrayOfNotificationListUserInfo {

    @XmlElement(name = "NotificationListUserInfo", nillable = true)
    protected List<NotificationListUserInfo> notificationListUserInfo;

    /**
     * Gets the value of the notificationListUserInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationListUserInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationListUserInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationListUserInfo }
     * 
     * 
     */
    public List<NotificationListUserInfo> getNotificationListUserInfo() {
        if (notificationListUserInfo == null) {
            notificationListUserInfo = new ArrayList<NotificationListUserInfo>();
        }
        return this.notificationListUserInfo;
    }

}
