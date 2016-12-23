
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
 *         &lt;element name="GetAutomationDeviceStatusResult" type="{https://services.alarmnet.com/TC2/}AutomationDataResults" minOccurs="0"/>
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
    "getAutomationDeviceStatusResult"
})
@XmlRootElement(name = "GetAutomationDeviceStatusResponse")
public class GetAutomationDeviceStatusResponse {

    @XmlElement(name = "GetAutomationDeviceStatusResult")
    protected AutomationDataResults getAutomationDeviceStatusResult;

    /**
     * Gets the value of the getAutomationDeviceStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationDataResults }
     *     
     */
    public AutomationDataResults getGetAutomationDeviceStatusResult() {
        return getAutomationDeviceStatusResult;
    }

    /**
     * Sets the value of the getAutomationDeviceStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationDataResults }
     *     
     */
    public void setGetAutomationDeviceStatusResult(AutomationDataResults value) {
        this.getAutomationDeviceStatusResult = value;
    }

}
