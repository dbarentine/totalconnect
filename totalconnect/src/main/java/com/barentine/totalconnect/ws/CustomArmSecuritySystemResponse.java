
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
 *         &lt;element name="CustomArmSecuritySystemResult" type="{https://services.alarmnet.com/TC2/}CustomArmSecuritySystemResults" minOccurs="0"/>
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
    "customArmSecuritySystemResult"
})
@XmlRootElement(name = "CustomArmSecuritySystemResponse")
public class CustomArmSecuritySystemResponse {

    @XmlElement(name = "CustomArmSecuritySystemResult")
    protected CustomArmSecuritySystemResults customArmSecuritySystemResult;

    /**
     * Gets the value of the customArmSecuritySystemResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomArmSecuritySystemResults }
     *     
     */
    public CustomArmSecuritySystemResults getCustomArmSecuritySystemResult() {
        return customArmSecuritySystemResult;
    }

    /**
     * Sets the value of the customArmSecuritySystemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomArmSecuritySystemResults }
     *     
     */
    public void setCustomArmSecuritySystemResult(CustomArmSecuritySystemResults value) {
        this.customArmSecuritySystemResult = value;
    }

}
