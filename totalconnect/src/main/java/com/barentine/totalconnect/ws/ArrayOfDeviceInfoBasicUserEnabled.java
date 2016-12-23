
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDeviceInfoBasic_UserEnabled complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDeviceInfoBasic_UserEnabled">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceInfoBasic_UserEnabled" type="{https://services.alarmnet.com/TC2/}DeviceInfoBasic_UserEnabled" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeviceInfoBasic_UserEnabled", propOrder = {
    "deviceInfoBasicUserEnabled"
})
public class ArrayOfDeviceInfoBasicUserEnabled {

    @XmlElement(name = "DeviceInfoBasic_UserEnabled", nillable = true)
    protected List<DeviceInfoBasicUserEnabled> deviceInfoBasicUserEnabled;

    /**
     * Gets the value of the deviceInfoBasicUserEnabled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceInfoBasicUserEnabled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceInfoBasicUserEnabled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceInfoBasicUserEnabled }
     * 
     * 
     */
    public List<DeviceInfoBasicUserEnabled> getDeviceInfoBasicUserEnabled() {
        if (deviceInfoBasicUserEnabled == null) {
            deviceInfoBasicUserEnabled = new ArrayList<DeviceInfoBasicUserEnabled>();
        }
        return this.deviceInfoBasicUserEnabled;
    }

}
