
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSmartActionConfigurationResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSmartActionConfigurationResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="Configuration" type="{https://services.alarmnet.com/TC2/}SmartActionConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSmartActionConfigurationResults", propOrder = {
    "configuration"
})
public class GetSmartActionConfigurationResults
    extends WebMethodResults
{

    @XmlElement(name = "Configuration")
    protected SmartActionConfiguration configuration;

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link SmartActionConfiguration }
     *     
     */
    public SmartActionConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartActionConfiguration }
     *     
     */
    public void setConfiguration(SmartActionConfiguration value) {
        this.configuration = value;
    }

}
