
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDeviceTypeAndID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDeviceTypeAndID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceTypeAndID" type="{https://services.alarmnet.com/TC2/}DeviceTypeAndID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeviceTypeAndID", propOrder = {
    "deviceTypeAndID"
})
public class ArrayOfDeviceTypeAndID {

    @XmlElement(name = "DeviceTypeAndID", nillable = true)
    protected List<DeviceTypeAndID> deviceTypeAndID;

    /**
     * Gets the value of the deviceTypeAndID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceTypeAndID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceTypeAndID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceTypeAndID }
     * 
     * 
     */
    public List<DeviceTypeAndID> getDeviceTypeAndID() {
        if (deviceTypeAndID == null) {
            deviceTypeAndID = new ArrayList<DeviceTypeAndID>();
        }
        return this.deviceTypeAndID;
    }

}
