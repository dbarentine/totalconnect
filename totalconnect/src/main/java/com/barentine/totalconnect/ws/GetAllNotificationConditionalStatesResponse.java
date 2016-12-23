
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
 *         &lt;element name="GetAllNotificationConditionalStatesResult" type="{https://services.alarmnet.com/TC2/}NotificationConditionalStateResult" minOccurs="0"/>
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
    "getAllNotificationConditionalStatesResult"
})
@XmlRootElement(name = "GetAllNotificationConditionalStatesResponse")
public class GetAllNotificationConditionalStatesResponse {

    @XmlElement(name = "GetAllNotificationConditionalStatesResult")
    protected NotificationConditionalStateResult getAllNotificationConditionalStatesResult;

    /**
     * Gets the value of the getAllNotificationConditionalStatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationConditionalStateResult }
     *     
     */
    public NotificationConditionalStateResult getGetAllNotificationConditionalStatesResult() {
        return getAllNotificationConditionalStatesResult;
    }

    /**
     * Sets the value of the getAllNotificationConditionalStatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationConditionalStateResult }
     *     
     */
    public void setGetAllNotificationConditionalStatesResult(NotificationConditionalStateResult value) {
        this.getAllNotificationConditionalStatesResult = value;
    }

}
