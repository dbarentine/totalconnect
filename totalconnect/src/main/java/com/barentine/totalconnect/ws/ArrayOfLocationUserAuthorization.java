
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLocationUserAuthorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLocationUserAuthorization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationUserAuthorization" type="{https://services.alarmnet.com/TC2/}LocationUserAuthorization" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocationUserAuthorization", propOrder = {
    "locationUserAuthorization"
})
public class ArrayOfLocationUserAuthorization {

    @XmlElement(name = "LocationUserAuthorization", nillable = true)
    protected List<LocationUserAuthorization> locationUserAuthorization;

    /**
     * Gets the value of the locationUserAuthorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationUserAuthorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationUserAuthorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationUserAuthorization }
     * 
     * 
     */
    public List<LocationUserAuthorization> getLocationUserAuthorization() {
        if (locationUserAuthorization == null) {
            locationUserAuthorization = new ArrayList<LocationUserAuthorization>();
        }
        return this.locationUserAuthorization;
    }

}
