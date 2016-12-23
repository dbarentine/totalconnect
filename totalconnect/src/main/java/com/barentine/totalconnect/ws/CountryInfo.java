
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCallingCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryInfo", propOrder = {
    "countryID",
    "countryName",
    "countryCallingCode"
})
public class CountryInfo {

    @XmlElement(name = "CountryID")
    protected long countryID;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "CountryCallingCode")
    protected int countryCallingCode;

    /**
     * Gets the value of the countryID property.
     * 
     */
    public long getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     */
    public void setCountryID(long value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countryCallingCode property.
     * 
     */
    public int getCountryCallingCode() {
        return countryCallingCode;
    }

    /**
     * Sets the value of the countryCallingCode property.
     * 
     */
    public void setCountryCallingCode(int value) {
        this.countryCallingCode = value;
    }

}
