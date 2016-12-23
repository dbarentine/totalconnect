
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationConditionalState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationConditionalState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionalStateID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConditionalStateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationConditionalState", propOrder = {
    "conditionalStateID",
    "conditionalStateName"
})
public class NotificationConditionalState {

    @XmlElement(name = "ConditionalStateID")
    protected int conditionalStateID;
    @XmlElement(name = "ConditionalStateName")
    protected String conditionalStateName;

    /**
     * Gets the value of the conditionalStateID property.
     * 
     */
    public int getConditionalStateID() {
        return conditionalStateID;
    }

    /**
     * Sets the value of the conditionalStateID property.
     * 
     */
    public void setConditionalStateID(int value) {
        this.conditionalStateID = value;
    }

    /**
     * Gets the value of the conditionalStateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalStateName() {
        return conditionalStateName;
    }

    /**
     * Sets the value of the conditionalStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalStateName(String value) {
        this.conditionalStateName = value;
    }

}
