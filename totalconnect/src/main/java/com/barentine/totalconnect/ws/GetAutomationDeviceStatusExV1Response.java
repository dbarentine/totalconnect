
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
 *         &lt;element name="GetAutomationDeviceStatusExV1Result" type="{https://services.alarmnet.com/TC2/}AutomationDataResults_Transitional" minOccurs="0"/>
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
    "getAutomationDeviceStatusExV1Result"
})
@XmlRootElement(name = "GetAutomationDeviceStatusExV1Response")
public class GetAutomationDeviceStatusExV1Response {

    @XmlElement(name = "GetAutomationDeviceStatusExV1Result")
    protected AutomationDataResultsTransitional getAutomationDeviceStatusExV1Result;

    /**
     * Gets the value of the getAutomationDeviceStatusExV1Result property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationDataResultsTransitional }
     *     
     */
    public AutomationDataResultsTransitional getGetAutomationDeviceStatusExV1Result() {
        return getAutomationDeviceStatusExV1Result;
    }

    /**
     * Sets the value of the getAutomationDeviceStatusExV1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationDataResultsTransitional }
     *     
     */
    public void setGetAutomationDeviceStatusExV1Result(AutomationDataResultsTransitional value) {
        this.getAutomationDeviceStatusExV1Result = value;
    }

}
