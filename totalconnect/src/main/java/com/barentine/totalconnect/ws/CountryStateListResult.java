
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryStateListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryStateListResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="CountryStateList" type="{https://services.alarmnet.com/TC2/}ArrayOfCountryStateInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryStateListResult", propOrder = {
    "countryStateList"
})
public class CountryStateListResult
    extends WebMethodResults
{

    @XmlElement(name = "CountryStateList")
    protected ArrayOfCountryStateInfo countryStateList;

    /**
     * Gets the value of the countryStateList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountryStateInfo }
     *     
     */
    public ArrayOfCountryStateInfo getCountryStateList() {
        return countryStateList;
    }

    /**
     * Sets the value of the countryStateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountryStateInfo }
     *     
     */
    public void setCountryStateList(ArrayOfCountryStateInfo value) {
        this.countryStateList = value;
    }

}
