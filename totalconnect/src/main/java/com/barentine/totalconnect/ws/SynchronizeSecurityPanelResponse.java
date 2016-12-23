
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
 *         &lt;element name="SynchronizeSecurityPanelResult" type="{https://services.alarmnet.com/TC2/}AutomationSyncResults" minOccurs="0"/>
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
    "synchronizeSecurityPanelResult"
})
@XmlRootElement(name = "SynchronizeSecurityPanelResponse")
public class SynchronizeSecurityPanelResponse {

    @XmlElement(name = "SynchronizeSecurityPanelResult")
    protected AutomationSyncResults synchronizeSecurityPanelResult;

    /**
     * Gets the value of the synchronizeSecurityPanelResult property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationSyncResults }
     *     
     */
    public AutomationSyncResults getSynchronizeSecurityPanelResult() {
        return synchronizeSecurityPanelResult;
    }

    /**
     * Sets the value of the synchronizeSecurityPanelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationSyncResults }
     *     
     */
    public void setSynchronizeSecurityPanelResult(AutomationSyncResults value) {
        this.synchronizeSecurityPanelResult = value;
    }

}
