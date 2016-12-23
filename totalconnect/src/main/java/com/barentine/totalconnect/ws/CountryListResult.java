
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryListResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="CountryList" type="{https://services.alarmnet.com/TC2/}ArrayOfCountryInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryListResult", propOrder = {
    "countryList"
})
public class CountryListResult
    extends WebMethodResults
{

    @XmlElement(name = "CountryList")
    protected ArrayOfCountryInfo countryList;

    /**
     * Gets the value of the countryList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountryInfo }
     *     
     */
    public ArrayOfCountryInfo getCountryList() {
        return countryList;
    }

    /**
     * Sets the value of the countryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountryInfo }
     *     
     */
    public void setCountryList(ArrayOfCountryInfo value) {
        this.countryList = value;
    }

}
