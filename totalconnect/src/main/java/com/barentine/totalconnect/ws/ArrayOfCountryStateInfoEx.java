
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCountryStateInfoEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCountryStateInfoEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryStateInfoEx" type="{https://services.alarmnet.com/TC2/}CountryStateInfoEx" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCountryStateInfoEx", propOrder = {
    "countryStateInfoEx"
})
public class ArrayOfCountryStateInfoEx {

    @XmlElement(name = "CountryStateInfoEx", nillable = true)
    protected List<CountryStateInfoEx> countryStateInfoEx;

    /**
     * Gets the value of the countryStateInfoEx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryStateInfoEx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryStateInfoEx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryStateInfoEx }
     * 
     * 
     */
    public List<CountryStateInfoEx> getCountryStateInfoEx() {
        if (countryStateInfoEx == null) {
            countryStateInfoEx = new ArrayList<CountryStateInfoEx>();
        }
        return this.countryStateInfoEx;
    }

}
