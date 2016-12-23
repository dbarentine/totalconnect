
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
 *         &lt;element name="DisarmSecuritySystemPartitionsResult" type="{https://services.alarmnet.com/TC2/}DisarmSecuritySystemResults" minOccurs="0"/>
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
    "disarmSecuritySystemPartitionsResult"
})
@XmlRootElement(name = "DisarmSecuritySystemPartitionsResponse")
public class DisarmSecuritySystemPartitionsResponse {

    @XmlElement(name = "DisarmSecuritySystemPartitionsResult")
    protected DisarmSecuritySystemResults disarmSecuritySystemPartitionsResult;

    /**
     * Gets the value of the disarmSecuritySystemPartitionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link DisarmSecuritySystemResults }
     *     
     */
    public DisarmSecuritySystemResults getDisarmSecuritySystemPartitionsResult() {
        return disarmSecuritySystemPartitionsResult;
    }

    /**
     * Sets the value of the disarmSecuritySystemPartitionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisarmSecuritySystemResults }
     *     
     */
    public void setDisarmSecuritySystemPartitionsResult(DisarmSecuritySystemResults value) {
        this.disarmSecuritySystemPartitionsResult = value;
    }

}
