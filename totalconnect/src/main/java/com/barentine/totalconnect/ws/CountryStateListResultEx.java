
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryStateListResultEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryStateListResultEx">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="CountryStateList" type="{https://services.alarmnet.com/TC2/}ArrayOfCountryStateInfoEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryStateListResultEx", propOrder = {
    "countryStateList"
})
public class CountryStateListResultEx
    extends WebMethodResults
{

    @XmlElement(name = "CountryStateList")
    protected ArrayOfCountryStateInfoEx countryStateList;

    /**
     * Gets the value of the countryStateList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountryStateInfoEx }
     *     
     */
    public ArrayOfCountryStateInfoEx getCountryStateList() {
        return countryStateList;
    }

    /**
     * Sets the value of the countryStateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountryStateInfoEx }
     *     
     */
    public void setCountryStateList(ArrayOfCountryStateInfoEx value) {
        this.countryStateList = value;
    }

}
