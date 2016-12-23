
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWiFiLockInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWiFiLockInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WiFiLockInfo" type="{https://services.alarmnet.com/TC2/}WiFiLockInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWiFiLockInfo", propOrder = {
    "wiFiLockInfo"
})
public class ArrayOfWiFiLockInfo {

    @XmlElement(name = "WiFiLockInfo", nillable = true)
    protected List<WiFiLockInfo> wiFiLockInfo;

    /**
     * Gets the value of the wiFiLockInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wiFiLockInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWiFiLockInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WiFiLockInfo }
     * 
     * 
     */
    public List<WiFiLockInfo> getWiFiLockInfo() {
        if (wiFiLockInfo == null) {
            wiFiLockInfo = new ArrayList<WiFiLockInfo>();
        }
        return this.wiFiLockInfo;
    }

}
