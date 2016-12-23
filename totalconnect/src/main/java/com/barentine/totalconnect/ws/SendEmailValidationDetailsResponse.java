
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
 *         &lt;element name="SendEmailValidationDetailsResult" type="{https://services.alarmnet.com/TC2/}EmailValidationResult" minOccurs="0"/>
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
    "sendEmailValidationDetailsResult"
})
@XmlRootElement(name = "SendEmailValidationDetailsResponse")
public class SendEmailValidationDetailsResponse {

    @XmlElement(name = "SendEmailValidationDetailsResult")
    protected EmailValidationResult sendEmailValidationDetailsResult;

    /**
     * Gets the value of the sendEmailValidationDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmailValidationResult }
     *     
     */
    public EmailValidationResult getSendEmailValidationDetailsResult() {
        return sendEmailValidationDetailsResult;
    }

    /**
     * Sets the value of the sendEmailValidationDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailValidationResult }
     *     
     */
    public void setSendEmailValidationDetailsResult(EmailValidationResult value) {
        this.sendEmailValidationDetailsResult = value;
    }

}
