
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
 *         &lt;element name="ValidateEmailAddressInSessionResult" type="{https://services.alarmnet.com/TC2/}EmailValidationResult" minOccurs="0"/>
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
    "validateEmailAddressInSessionResult"
})
@XmlRootElement(name = "ValidateEmailAddressInSessionResponse")
public class ValidateEmailAddressInSessionResponse {

    @XmlElement(name = "ValidateEmailAddressInSessionResult")
    protected EmailValidationResult validateEmailAddressInSessionResult;

    /**
     * Gets the value of the validateEmailAddressInSessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmailValidationResult }
     *     
     */
    public EmailValidationResult getValidateEmailAddressInSessionResult() {
        return validateEmailAddressInSessionResult;
    }

    /**
     * Sets the value of the validateEmailAddressInSessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailValidationResult }
     *     
     */
    public void setValidateEmailAddressInSessionResult(EmailValidationResult value) {
        this.validateEmailAddressInSessionResult = value;
    }

}
