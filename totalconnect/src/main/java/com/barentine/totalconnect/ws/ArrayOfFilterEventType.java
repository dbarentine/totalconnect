
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFilterEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFilterEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilterEventType" type="{https://services.alarmnet.com/TC2/}FilterEventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFilterEventType", propOrder = {
    "filterEventType"
})
public class ArrayOfFilterEventType {

    @XmlElement(name = "FilterEventType", nillable = true)
    protected List<FilterEventType> filterEventType;

    /**
     * Gets the value of the filterEventType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterEventType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterEventType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterEventType }
     * 
     * 
     */
    public List<FilterEventType> getFilterEventType() {
        if (filterEventType == null) {
            filterEventType = new ArrayList<FilterEventType>();
        }
        return this.filterEventType;
    }

}
