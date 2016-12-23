
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
 *         &lt;element name="AnythingChangedResult" type="{https://services.alarmnet.com/TC2/}AnythingChangedResults" minOccurs="0"/>
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
    "anythingChangedResult"
})
@XmlRootElement(name = "AnythingChangedResponse")
public class AnythingChangedResponse {

    @XmlElement(name = "AnythingChangedResult")
    protected AnythingChangedResults anythingChangedResult;

    /**
     * Gets the value of the anythingChangedResult property.
     * 
     * @return
     *     possible object is
     *     {@link AnythingChangedResults }
     *     
     */
    public AnythingChangedResults getAnythingChangedResult() {
        return anythingChangedResult;
    }

    /**
     * Sets the value of the anythingChangedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnythingChangedResults }
     *     
     */
    public void setAnythingChangedResult(AnythingChangedResults value) {
        this.anythingChangedResult = value;
    }

}
