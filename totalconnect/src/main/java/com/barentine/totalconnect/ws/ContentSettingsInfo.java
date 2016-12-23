
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentSettingsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentSettingsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConfigurationValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentSettingsInfo", propOrder = {
    "contentType",
    "configurationValues"
})
public class ContentSettingsInfo {

    @XmlElement(name = "ContentType")
    protected int contentType;
    @XmlElement(name = "ConfigurationValues")
    protected String configurationValues;

    /**
     * Gets the value of the contentType property.
     * 
     */
    public int getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     */
    public void setContentType(int value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the configurationValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationValues() {
        return configurationValues;
    }

    /**
     * Sets the value of the configurationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationValues(String value) {
        this.configurationValues = value;
    }

}
