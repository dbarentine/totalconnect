
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
 *         &lt;element name="IsUserNameValidResult" type="{https://services.alarmnet.com/TC2/}IsUserNameValidResults" minOccurs="0"/>
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
    "isUserNameValidResult"
})
@XmlRootElement(name = "IsUserNameValidResponse")
public class IsUserNameValidResponse {

    @XmlElement(name = "IsUserNameValidResult")
    protected IsUserNameValidResults isUserNameValidResult;

    /**
     * Gets the value of the isUserNameValidResult property.
     * 
     * @return
     *     possible object is
     *     {@link IsUserNameValidResults }
     *     
     */
    public IsUserNameValidResults getIsUserNameValidResult() {
        return isUserNameValidResult;
    }

    /**
     * Sets the value of the isUserNameValidResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsUserNameValidResults }
     *     
     */
    public void setIsUserNameValidResult(IsUserNameValidResults value) {
        this.isUserNameValidResult = value;
    }

}
