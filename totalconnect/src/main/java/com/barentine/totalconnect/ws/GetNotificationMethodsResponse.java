
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
 *         &lt;element name="GetNotificationMethodsResult" type="{https://services.alarmnet.com/TC2/}NotificationMethodResults" minOccurs="0"/>
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
    "getNotificationMethodsResult"
})
@XmlRootElement(name = "GetNotificationMethodsResponse")
public class GetNotificationMethodsResponse {

    @XmlElement(name = "GetNotificationMethodsResult")
    protected NotificationMethodResults getNotificationMethodsResult;

    /**
     * Gets the value of the getNotificationMethodsResult property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationMethodResults }
     *     
     */
    public NotificationMethodResults getGetNotificationMethodsResult() {
        return getNotificationMethodsResult;
    }

    /**
     * Sets the value of the getNotificationMethodsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationMethodResults }
     *     
     */
    public void setGetNotificationMethodsResult(NotificationMethodResults value) {
        this.getNotificationMethodsResult = value;
    }

}
