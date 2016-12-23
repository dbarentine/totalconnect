
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWiFiDeviceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWiFiDeviceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WiFiDeviceResponse" type="{https://services.alarmnet.com/TC2/}WiFiDeviceResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWiFiDeviceResponse", propOrder = {
    "wiFiDeviceResponse"
})
public class ArrayOfWiFiDeviceResponse {

    @XmlElement(name = "WiFiDeviceResponse", nillable = true)
    protected List<WiFiDeviceResponse> wiFiDeviceResponse;

    /**
     * Gets the value of the wiFiDeviceResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wiFiDeviceResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWiFiDeviceResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WiFiDeviceResponse }
     * 
     * 
     */
    public List<WiFiDeviceResponse> getWiFiDeviceResponse() {
        if (wiFiDeviceResponse == null) {
            wiFiDeviceResponse = new ArrayList<WiFiDeviceResponse>();
        }
        return this.wiFiDeviceResponse;
    }

}
