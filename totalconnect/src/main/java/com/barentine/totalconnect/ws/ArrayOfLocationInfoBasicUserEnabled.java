
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLocationInfoBasic_UserEnabled complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLocationInfoBasic_UserEnabled">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationInfoBasic_UserEnabled" type="{https://services.alarmnet.com/TC2/}LocationInfoBasic_UserEnabled" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocationInfoBasic_UserEnabled", propOrder = {
    "locationInfoBasicUserEnabled"
})
public class ArrayOfLocationInfoBasicUserEnabled {

    @XmlElement(name = "LocationInfoBasic_UserEnabled", nillable = true)
    protected List<LocationInfoBasicUserEnabled> locationInfoBasicUserEnabled;

    /**
     * Gets the value of the locationInfoBasicUserEnabled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationInfoBasicUserEnabled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationInfoBasicUserEnabled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationInfoBasicUserEnabled }
     * 
     * 
     */
    public List<LocationInfoBasicUserEnabled> getLocationInfoBasicUserEnabled() {
        if (locationInfoBasicUserEnabled == null) {
            locationInfoBasicUserEnabled = new ArrayList<LocationInfoBasicUserEnabled>();
        }
        return this.locationInfoBasicUserEnabled;
    }

}
