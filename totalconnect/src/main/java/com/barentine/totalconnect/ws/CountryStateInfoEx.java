
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryStateInfoEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryStateInfoEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StateID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryStateInfoEx", propOrder = {
    "stateID",
    "stateName",
    "countryID",
    "countryName"
})
public class CountryStateInfoEx {

    @XmlElement(name = "StateID")
    protected long stateID;
    @XmlElement(name = "StateName")
    protected String stateName;
    @XmlElement(name = "CountryID")
    protected long countryID;
    @XmlElement(name = "CountryName")
    protected String countryName;

    /**
     * Gets the value of the stateID property.
     * 
     */
    public long getStateID() {
        return stateID;
    }

    /**
     * Sets the value of the stateID property.
     * 
     */
    public void setStateID(long value) {
        this.stateID = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

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

}
