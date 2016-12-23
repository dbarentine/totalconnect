
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
 *         &lt;element name="GetContentConfigurationResult" type="{https://services.alarmnet.com/TC2/}ContentConfigurationResult" minOccurs="0"/>
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
    "getContentConfigurationResult"
})
@XmlRootElement(name = "GetContentConfigurationResponse")
public class GetContentConfigurationResponse {

    @XmlElement(name = "GetContentConfigurationResult")
    protected ContentConfigurationResult getContentConfigurationResult;

    /**
     * Gets the value of the getContentConfigurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ContentConfigurationResult }
     *     
     */
    public ContentConfigurationResult getGetContentConfigurationResult() {
        return getContentConfigurationResult;
    }

    /**
     * Sets the value of the getContentConfigurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentConfigurationResult }
     *     
     */
    public void setGetContentConfigurationResult(ContentConfigurationResult value) {
        this.getContentConfigurationResult = value;
    }

}
