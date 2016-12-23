
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfZoneStatusInfoEx_V1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfZoneStatusInfoEx_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZoneStatusInfoEx_V1" type="{https://services.alarmnet.com/TC2/}ZoneStatusInfoEx_V1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfZoneStatusInfoEx_V1", propOrder = {
    "zoneStatusInfoExV1"
})
public class ArrayOfZoneStatusInfoExV1 {

    @XmlElement(name = "ZoneStatusInfoEx_V1", nillable = true)
    protected List<ZoneStatusInfoExV1> zoneStatusInfoExV1;

    /**
     * Gets the value of the zoneStatusInfoExV1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneStatusInfoExV1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneStatusInfoExV1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneStatusInfoExV1 }
     * 
     * 
     */
    public List<ZoneStatusInfoExV1> getZoneStatusInfoExV1() {
        if (zoneStatusInfoExV1 == null) {
            zoneStatusInfoExV1 = new ArrayList<ZoneStatusInfoExV1>();
        }
        return this.zoneStatusInfoExV1;
    }

}
