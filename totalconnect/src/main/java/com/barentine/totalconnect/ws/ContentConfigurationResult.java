
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentConfigurationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentConfigurationResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="ContentConfiguration" type="{https://services.alarmnet.com/TC2/}ContentConfigurationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentConfigurationResult", propOrder = {
    "contentConfiguration"
})
public class ContentConfigurationResult
    extends WebMethodResults
{

    @XmlElement(name = "ContentConfiguration")
    protected ContentConfigurationInfo contentConfiguration;

    /**
     * Gets the value of the contentConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link ContentConfigurationInfo }
     *     
     */
    public ContentConfigurationInfo getContentConfiguration() {
        return contentConfiguration;
    }

    /**
     * Sets the value of the contentConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentConfigurationInfo }
     *     
     */
    public void setContentConfiguration(ContentConfigurationInfo value) {
        this.contentConfiguration = value;
    }

}
