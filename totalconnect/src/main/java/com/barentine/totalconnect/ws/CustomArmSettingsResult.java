
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomArmSettingsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomArmSettingsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="CustomArmDetails" type="{https://services.alarmnet.com/TC2/}CustomArmInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomArmSettingsResult", propOrder = {
    "customArmDetails"
})
public class CustomArmSettingsResult
    extends WebMethodResults
{

    @XmlElement(name = "CustomArmDetails")
    protected CustomArmInfo customArmDetails;

    /**
     * Gets the value of the customArmDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomArmInfo }
     *     
     */
    public CustomArmInfo getCustomArmDetails() {
        return customArmDetails;
    }

    /**
     * Sets the value of the customArmDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomArmInfo }
     *     
     */
    public void setCustomArmDetails(CustomArmInfo value) {
        this.customArmDetails = value;
    }

}
