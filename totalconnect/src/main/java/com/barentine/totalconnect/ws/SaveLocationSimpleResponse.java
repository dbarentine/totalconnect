
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
 *         &lt;element name="SaveLocationSimpleResult" type="{https://services.alarmnet.com/TC2/}LocationSimpleResult" minOccurs="0"/>
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
    "saveLocationSimpleResult"
})
@XmlRootElement(name = "SaveLocationSimpleResponse")
public class SaveLocationSimpleResponse {

    @XmlElement(name = "SaveLocationSimpleResult")
    protected LocationSimpleResult saveLocationSimpleResult;

    /**
     * Gets the value of the saveLocationSimpleResult property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSimpleResult }
     *     
     */
    public LocationSimpleResult getSaveLocationSimpleResult() {
        return saveLocationSimpleResult;
    }

    /**
     * Sets the value of the saveLocationSimpleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSimpleResult }
     *     
     */
    public void setSaveLocationSimpleResult(LocationSimpleResult value) {
        this.saveLocationSimpleResult = value;
    }

}
