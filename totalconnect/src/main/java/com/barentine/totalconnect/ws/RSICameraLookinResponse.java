
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
 *         &lt;element name="RSICameraLookinResult" type="{https://services.alarmnet.com/TC2/}RSICamLookinResults" minOccurs="0"/>
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
    "rsiCameraLookinResult"
})
@XmlRootElement(name = "RSICameraLookinResponse")
public class RSICameraLookinResponse {

    @XmlElement(name = "RSICameraLookinResult")
    protected RSICamLookinResults rsiCameraLookinResult;

    /**
     * Gets the value of the rsiCameraLookinResult property.
     * 
     * @return
     *     possible object is
     *     {@link RSICamLookinResults }
     *     
     */
    public RSICamLookinResults getRSICameraLookinResult() {
        return rsiCameraLookinResult;
    }

    /**
     * Sets the value of the rsiCameraLookinResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSICamLookinResults }
     *     
     */
    public void setRSICameraLookinResult(RSICamLookinResults value) {
        this.rsiCameraLookinResult = value;
    }

}
