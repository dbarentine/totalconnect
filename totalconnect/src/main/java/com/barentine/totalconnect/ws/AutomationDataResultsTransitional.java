
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationDataResults_Transitional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomationDataResults_Transitional">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="AutomationData" type="{https://services.alarmnet.com/TC2/}AutomationInfo_Transitional" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomationDataResults_Transitional", propOrder = {
    "automationData"
})
public class AutomationDataResultsTransitional
    extends WebMethodResults
{

    @XmlElement(name = "AutomationData")
    protected AutomationInfoTransitional automationData;

    /**
     * Gets the value of the automationData property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationInfoTransitional }
     *     
     */
    public AutomationInfoTransitional getAutomationData() {
        return automationData;
    }

    /**
     * Sets the value of the automationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationInfoTransitional }
     *     
     */
    public void setAutomationData(AutomationInfoTransitional value) {
        this.automationData = value;
    }

}
