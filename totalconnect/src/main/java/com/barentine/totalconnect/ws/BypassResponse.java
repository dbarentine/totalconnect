
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
 *         &lt;element name="BypassResult" type="{https://services.alarmnet.com/TC2/}ZoneBypassResults" minOccurs="0"/>
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
    "bypassResult"
})
@XmlRootElement(name = "BypassResponse")
public class BypassResponse {

    @XmlElement(name = "BypassResult")
    protected ZoneBypassResults bypassResult;

    /**
     * Gets the value of the bypassResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneBypassResults }
     *     
     */
    public ZoneBypassResults getBypassResult() {
        return bypassResult;
    }

    /**
     * Sets the value of the bypassResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneBypassResults }
     *     
     */
    public void setBypassResult(ZoneBypassResults value) {
        this.bypassResult = value;
    }

}
