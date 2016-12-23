
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfZoneInfoEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfZoneInfoEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZoneInfoEx" type="{https://services.alarmnet.com/TC2/}ZoneInfoEx" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfZoneInfoEx", propOrder = {
    "zoneInfoEx"
})
public class ArrayOfZoneInfoEx {

    @XmlElement(name = "ZoneInfoEx", nillable = true)
    protected List<ZoneInfoEx> zoneInfoEx;

    /**
     * Gets the value of the zoneInfoEx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneInfoEx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneInfoEx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneInfoEx }
     * 
     * 
     */
    public List<ZoneInfoEx> getZoneInfoEx() {
        if (zoneInfoEx == null) {
            zoneInfoEx = new ArrayList<ZoneInfoEx>();
        }
        return this.zoneInfoEx;
    }

}
