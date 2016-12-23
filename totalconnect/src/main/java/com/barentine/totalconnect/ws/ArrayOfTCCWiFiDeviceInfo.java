
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTCCWiFiDeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTCCWiFiDeviceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TCCWiFiDeviceInfo" type="{https://services.alarmnet.com/TC2/}TCCWiFiDeviceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTCCWiFiDeviceInfo", propOrder = {
    "tccWiFiDeviceInfo"
})
public class ArrayOfTCCWiFiDeviceInfo {

    @XmlElement(name = "TCCWiFiDeviceInfo", nillable = true)
    protected List<TCCWiFiDeviceInfo> tccWiFiDeviceInfo;

    /**
     * Gets the value of the tccWiFiDeviceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tccWiFiDeviceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCCWiFiDeviceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCCWiFiDeviceInfo }
     * 
     * 
     */
    public List<TCCWiFiDeviceInfo> getTCCWiFiDeviceInfo() {
        if (tccWiFiDeviceInfo == null) {
            tccWiFiDeviceInfo = new ArrayList<TCCWiFiDeviceInfo>();
        }
        return this.tccWiFiDeviceInfo;
    }

}
