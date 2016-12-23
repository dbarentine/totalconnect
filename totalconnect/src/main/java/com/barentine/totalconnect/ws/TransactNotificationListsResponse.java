
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
 *         &lt;element name="TransactNotificationListsResult" type="{https://services.alarmnet.com/TC2/}TransactNotificationListResults" minOccurs="0"/>
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
    "transactNotificationListsResult"
})
@XmlRootElement(name = "TransactNotificationListsResponse")
public class TransactNotificationListsResponse {

    @XmlElement(name = "TransactNotificationListsResult")
    protected TransactNotificationListResults transactNotificationListsResult;

    /**
     * Gets the value of the transactNotificationListsResult property.
     * 
     * @return
     *     possible object is
     *     {@link TransactNotificationListResults }
     *     
     */
    public TransactNotificationListResults getTransactNotificationListsResult() {
        return transactNotificationListsResult;
    }

    /**
     * Sets the value of the transactNotificationListsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactNotificationListResults }
     *     
     */
    public void setTransactNotificationListsResult(TransactNotificationListResults value) {
        this.transactNotificationListsResult = value;
    }

}
