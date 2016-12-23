
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
 *         &lt;element name="GetDealerMessagesResult" type="{https://services.alarmnet.com/TC2/}DealerMessageResult" minOccurs="0"/>
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
    "getDealerMessagesResult"
})
@XmlRootElement(name = "GetDealerMessagesResponse")
public class GetDealerMessagesResponse {

    @XmlElement(name = "GetDealerMessagesResult")
    protected DealerMessageResult getDealerMessagesResult;

    /**
     * Gets the value of the getDealerMessagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link DealerMessageResult }
     *     
     */
    public DealerMessageResult getGetDealerMessagesResult() {
        return getDealerMessagesResult;
    }

    /**
     * Sets the value of the getDealerMessagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealerMessageResult }
     *     
     */
    public void setGetDealerMessagesResult(DealerMessageResult value) {
        this.getDealerMessagesResult = value;
    }

}
