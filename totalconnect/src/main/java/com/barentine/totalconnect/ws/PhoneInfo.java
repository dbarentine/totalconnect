
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPhoneValidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsSMSControlEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneInfo", propOrder = {
    "phoneNumber",
    "isPhoneValidated",
    "isSMSControlEnabled"
})
public class PhoneInfo {

    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "IsPhoneValidated")
    protected boolean isPhoneValidated;
    @XmlElement(name = "IsSMSControlEnabled")
    protected boolean isSMSControlEnabled;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the isPhoneValidated property.
     * 
     */
    public boolean isIsPhoneValidated() {
        return isPhoneValidated;
    }

    /**
     * Sets the value of the isPhoneValidated property.
     * 
     */
    public void setIsPhoneValidated(boolean value) {
        this.isPhoneValidated = value;
    }

    /**
     * Gets the value of the isSMSControlEnabled property.
     * 
     */
    public boolean isIsSMSControlEnabled() {
        return isSMSControlEnabled;
    }

    /**
     * Sets the value of the isSMSControlEnabled property.
     * 
     */
    public void setIsSMSControlEnabled(boolean value) {
        this.isSMSControlEnabled = value;
    }

}
