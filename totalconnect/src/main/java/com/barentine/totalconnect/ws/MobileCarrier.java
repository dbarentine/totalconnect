
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileCarrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileCarrier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierEmailSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileCarrier", propOrder = {
    "carrierID",
    "carrierName",
    "carrierEmailSuffix"
})
public class MobileCarrier {

    @XmlElement(name = "CarrierID")
    protected int carrierID;
    @XmlElement(name = "CarrierName")
    protected String carrierName;
    @XmlElement(name = "CarrierEmailSuffix")
    protected String carrierEmailSuffix;

    /**
     * Gets the value of the carrierID property.
     * 
     */
    public int getCarrierID() {
        return carrierID;
    }

    /**
     * Sets the value of the carrierID property.
     * 
     */
    public void setCarrierID(int value) {
        this.carrierID = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the carrierEmailSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierEmailSuffix() {
        return carrierEmailSuffix;
    }

    /**
     * Sets the value of the carrierEmailSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierEmailSuffix(String value) {
        this.carrierEmailSuffix = value;
    }

}
