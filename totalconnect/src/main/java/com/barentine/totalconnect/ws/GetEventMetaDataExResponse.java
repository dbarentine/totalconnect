
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
 *         &lt;element name="GetEventMetaDataExResult" type="{https://services.alarmnet.com/TC2/}EventMetaDataExResult" minOccurs="0"/>
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
    "getEventMetaDataExResult"
})
@XmlRootElement(name = "GetEventMetaDataExResponse")
public class GetEventMetaDataExResponse {

    @XmlElement(name = "GetEventMetaDataExResult")
    protected EventMetaDataExResult getEventMetaDataExResult;

    /**
     * Gets the value of the getEventMetaDataExResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventMetaDataExResult }
     *     
     */
    public EventMetaDataExResult getGetEventMetaDataExResult() {
        return getEventMetaDataExResult;
    }

    /**
     * Sets the value of the getEventMetaDataExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventMetaDataExResult }
     *     
     */
    public void setGetEventMetaDataExResult(EventMetaDataExResult value) {
        this.getEventMetaDataExResult = value;
    }

}
