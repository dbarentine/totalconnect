
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
 *         &lt;element name="SaveLocationResult" type="{https://services.alarmnet.com/TC2/}LocationResult" minOccurs="0"/>
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
    "saveLocationResult"
})
@XmlRootElement(name = "SaveLocationResponse")
public class SaveLocationResponse {

    @XmlElement(name = "SaveLocationResult")
    protected LocationResult saveLocationResult;

    /**
     * Gets the value of the saveLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link LocationResult }
     *     
     */
    public LocationResult getSaveLocationResult() {
        return saveLocationResult;
    }

    /**
     * Sets the value of the saveLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationResult }
     *     
     */
    public void setSaveLocationResult(LocationResult value) {
        this.saveLocationResult = value;
    }

}
