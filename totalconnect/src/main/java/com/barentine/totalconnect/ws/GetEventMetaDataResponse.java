
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
 *         &lt;element name="GetEventMetaDataResult" type="{https://services.alarmnet.com/TC2/}EventMetaDataResults" minOccurs="0"/>
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
    "getEventMetaDataResult"
})
@XmlRootElement(name = "GetEventMetaDataResponse")
public class GetEventMetaDataResponse {

    @XmlElement(name = "GetEventMetaDataResult")
    protected EventMetaDataResults getEventMetaDataResult;

    /**
     * Gets the value of the getEventMetaDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventMetaDataResults }
     *     
     */
    public EventMetaDataResults getGetEventMetaDataResult() {
        return getEventMetaDataResult;
    }

    /**
     * Sets the value of the getEventMetaDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventMetaDataResults }
     *     
     */
    public void setGetEventMetaDataResult(EventMetaDataResults value) {
        this.getEventMetaDataResult = value;
    }

}
