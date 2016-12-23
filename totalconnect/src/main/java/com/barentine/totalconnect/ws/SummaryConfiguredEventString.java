
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryConfiguredEventString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryConfiguredEventString">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="EventSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryConfiguredEventString", propOrder = {
    "eventSummary"
})
public class SummaryConfiguredEventString
    extends WebMethodResults
{

    @XmlElement(name = "EventSummary")
    protected String eventSummary;

    /**
     * Gets the value of the eventSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventSummary() {
        return eventSummary;
    }

    /**
     * Sets the value of the eventSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventSummary(String value) {
        this.eventSummary = value;
    }

}
