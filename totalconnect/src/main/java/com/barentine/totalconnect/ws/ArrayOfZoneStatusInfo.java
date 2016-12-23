
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfZoneStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfZoneStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZoneStatusInfo" type="{https://services.alarmnet.com/TC2/}ZoneStatusInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfZoneStatusInfo", propOrder = {
    "zoneStatusInfo"
})
public class ArrayOfZoneStatusInfo {

    @XmlElement(name = "ZoneStatusInfo", nillable = true)
    protected List<ZoneStatusInfo> zoneStatusInfo;

    /**
     * Gets the value of the zoneStatusInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneStatusInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneStatusInfo }
     * 
     * 
     */
    public List<ZoneStatusInfo> getZoneStatusInfo() {
        if (zoneStatusInfo == null) {
            zoneStatusInfo = new ArrayList<ZoneStatusInfo>();
        }
        return this.zoneStatusInfo;
    }

}
