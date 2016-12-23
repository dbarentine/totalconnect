
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationDataResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomationDataResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="AutomationData" type="{https://services.alarmnet.com/TC2/}AutomationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomationDataResults", propOrder = {
    "automationData"
})
public class AutomationDataResults
    extends WebMethodResults
{

    @XmlElement(name = "AutomationData")
    protected AutomationInfo automationData;

    /**
     * Gets the value of the automationData property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationInfo }
     *     
     */
    public AutomationInfo getAutomationData() {
        return automationData;
    }

    /**
     * Sets the value of the automationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationInfo }
     *     
     */
    public void setAutomationData(AutomationInfo value) {
        this.automationData = value;
    }

}
