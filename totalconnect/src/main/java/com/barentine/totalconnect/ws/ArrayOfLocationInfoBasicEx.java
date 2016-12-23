
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLocationInfoBasicEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLocationInfoBasicEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationInfoBasicEx" type="{https://services.alarmnet.com/TC2/}LocationInfoBasicEx" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocationInfoBasicEx", propOrder = {
    "locationInfoBasicEx"
})
public class ArrayOfLocationInfoBasicEx {

    @XmlElement(name = "LocationInfoBasicEx", nillable = true)
    protected List<LocationInfoBasicEx> locationInfoBasicEx;

    /**
     * Gets the value of the locationInfoBasicEx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationInfoBasicEx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationInfoBasicEx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationInfoBasicEx }
     * 
     * 
     */
    public List<LocationInfoBasicEx> getLocationInfoBasicEx() {
        if (locationInfoBasicEx == null) {
            locationInfoBasicEx = new ArrayList<LocationInfoBasicEx>();
        }
        return this.locationInfoBasicEx;
    }

}
