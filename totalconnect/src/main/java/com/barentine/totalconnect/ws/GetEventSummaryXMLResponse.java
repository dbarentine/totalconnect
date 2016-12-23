
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
 *         &lt;element name="GetEventSummaryXMLResult" type="{https://services.alarmnet.com/TC2/}SummaryConfiguredEventXML" minOccurs="0"/>
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
    "getEventSummaryXMLResult"
})
@XmlRootElement(name = "GetEventSummaryXMLResponse")
public class GetEventSummaryXMLResponse {

    @XmlElement(name = "GetEventSummaryXMLResult")
    protected SummaryConfiguredEventXML getEventSummaryXMLResult;

    /**
     * Gets the value of the getEventSummaryXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryConfiguredEventXML }
     *     
     */
    public SummaryConfiguredEventXML getGetEventSummaryXMLResult() {
        return getEventSummaryXMLResult;
    }

    /**
     * Sets the value of the getEventSummaryXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryConfiguredEventXML }
     *     
     */
    public void setGetEventSummaryXMLResult(SummaryConfiguredEventXML value) {
        this.getEventSummaryXMLResult = value;
    }

}
