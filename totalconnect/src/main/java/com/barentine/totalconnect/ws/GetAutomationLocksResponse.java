
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
 *         &lt;element name="GetAutomationLocksResult" type="{https://services.alarmnet.com/TC2/}AutomationLockDataResult" minOccurs="0"/>
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
    "getAutomationLocksResult"
})
@XmlRootElement(name = "GetAutomationLocksResponse")
public class GetAutomationLocksResponse {

    @XmlElement(name = "GetAutomationLocksResult")
    protected AutomationLockDataResult getAutomationLocksResult;

    /**
     * Gets the value of the getAutomationLocksResult property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationLockDataResult }
     *     
     */
    public AutomationLockDataResult getGetAutomationLocksResult() {
        return getAutomationLocksResult;
    }

    /**
     * Sets the value of the getAutomationLocksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationLockDataResult }
     *     
     */
    public void setGetAutomationLocksResult(AutomationLockDataResult value) {
        this.getAutomationLocksResult = value;
    }

}
