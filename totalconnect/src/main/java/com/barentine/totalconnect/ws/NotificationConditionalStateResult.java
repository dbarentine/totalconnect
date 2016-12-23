
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationConditionalStateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationConditionalStateResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="NotificationConditionalStates" type="{https://services.alarmnet.com/TC2/}ArrayOfNotificationConditionalState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationConditionalStateResult", propOrder = {
    "notificationConditionalStates"
})
public class NotificationConditionalStateResult
    extends WebMethodResults
{

    @XmlElement(name = "NotificationConditionalStates")
    protected ArrayOfNotificationConditionalState notificationConditionalStates;

    /**
     * Gets the value of the notificationConditionalStates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotificationConditionalState }
     *     
     */
    public ArrayOfNotificationConditionalState getNotificationConditionalStates() {
        return notificationConditionalStates;
    }

    /**
     * Sets the value of the notificationConditionalStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotificationConditionalState }
     *     
     */
    public void setNotificationConditionalStates(ArrayOfNotificationConditionalState value) {
        this.notificationConditionalStates = value;
    }

}
