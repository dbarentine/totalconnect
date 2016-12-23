
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSmartSceneConfigurationResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSmartSceneConfigurationResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="Configuration" type="{https://services.alarmnet.com/TC2/}SmartSceneConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSmartSceneConfigurationResults", propOrder = {
    "configuration"
})
public class GetSmartSceneConfigurationResults
    extends WebMethodResults
{

    @XmlElement(name = "Configuration")
    protected SmartSceneConfiguration configuration;

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link SmartSceneConfiguration }
     *     
     */
    public SmartSceneConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartSceneConfiguration }
     *     
     */
    public void setConfiguration(SmartSceneConfiguration value) {
        this.configuration = value;
    }

}
