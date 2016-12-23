
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNotificationListBaseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNotificationListBaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationListBaseInfo" type="{https://services.alarmnet.com/TC2/}NotificationListBaseInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotificationListBaseInfo", propOrder = {
    "notificationListBaseInfo"
})
public class ArrayOfNotificationListBaseInfo {

    @XmlElement(name = "NotificationListBaseInfo", nillable = true)
    protected List<NotificationListBaseInfo> notificationListBaseInfo;

    /**
     * Gets the value of the notificationListBaseInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationListBaseInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationListBaseInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationListBaseInfo }
     * 
     * 
     */
    public List<NotificationListBaseInfo> getNotificationListBaseInfo() {
        if (notificationListBaseInfo == null) {
            notificationListBaseInfo = new ArrayList<NotificationListBaseInfo>();
        }
        return this.notificationListBaseInfo;
    }

}
