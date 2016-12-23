
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
 *         &lt;element name="GetAllAutomationDeviceStatusExResult" type="{https://services.alarmnet.com/TC2/}AutomationDataResults_Transitional" minOccurs="0"/>
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
    "getAllAutomationDeviceStatusExResult"
})
@XmlRootElement(name = "GetAllAutomationDeviceStatusExResponse")
public class GetAllAutomationDeviceStatusExResponse {

    @XmlElement(name = "GetAllAutomationDeviceStatusExResult")
    protected AutomationDataResultsTransitional getAllAutomationDeviceStatusExResult;

    /**
     * Gets the value of the getAllAutomationDeviceStatusExResult property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationDataResultsTransitional }
     *     
     */
    public AutomationDataResultsTransitional getGetAllAutomationDeviceStatusExResult() {
        return getAllAutomationDeviceStatusExResult;
    }

    /**
     * Sets the value of the getAllAutomationDeviceStatusExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationDataResultsTransitional }
     *     
     */
    public void setGetAllAutomationDeviceStatusExResult(AutomationDataResultsTransitional value) {
        this.getAllAutomationDeviceStatusExResult = value;
    }

}
