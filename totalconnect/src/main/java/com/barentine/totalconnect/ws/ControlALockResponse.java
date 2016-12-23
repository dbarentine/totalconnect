
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
 *         &lt;element name="ControlALockResult" type="{https://services.alarmnet.com/TC2/}LockControlDataResults" minOccurs="0"/>
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
    "controlALockResult"
})
@XmlRootElement(name = "ControlALockResponse")
public class ControlALockResponse {

    @XmlElement(name = "ControlALockResult")
    protected LockControlDataResults controlALockResult;

    /**
     * Gets the value of the controlALockResult property.
     * 
     * @return
     *     possible object is
     *     {@link LockControlDataResults }
     *     
     */
    public LockControlDataResults getControlALockResult() {
        return controlALockResult;
    }

    /**
     * Sets the value of the controlALockResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockControlDataResults }
     *     
     */
    public void setControlALockResult(LockControlDataResults value) {
        this.controlALockResult = value;
    }

}
