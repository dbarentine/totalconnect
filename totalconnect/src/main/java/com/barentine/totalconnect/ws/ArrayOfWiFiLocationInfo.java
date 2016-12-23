
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWiFiLocationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWiFiLocationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WiFiLocationInfo" type="{https://services.alarmnet.com/TC2/}WiFiLocationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWiFiLocationInfo", propOrder = {
    "wiFiLocationInfo"
})
public class ArrayOfWiFiLocationInfo {

    @XmlElement(name = "WiFiLocationInfo", nillable = true)
    protected List<WiFiLocationInfo> wiFiLocationInfo;

    /**
     * Gets the value of the wiFiLocationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wiFiLocationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWiFiLocationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WiFiLocationInfo }
     * 
     * 
     */
    public List<WiFiLocationInfo> getWiFiLocationInfo() {
        if (wiFiLocationInfo == null) {
            wiFiLocationInfo = new ArrayList<WiFiLocationInfo>();
        }
        return this.wiFiLocationInfo;
    }

}
