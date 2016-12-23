
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDeviceAuthorizingCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDeviceAuthorizingCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceAuthorizingCode" type="{https://services.alarmnet.com/TC2/}DeviceAuthorizingCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeviceAuthorizingCode", propOrder = {
    "deviceAuthorizingCode"
})
public class ArrayOfDeviceAuthorizingCode {

    @XmlElement(name = "DeviceAuthorizingCode", nillable = true)
    protected List<DeviceAuthorizingCode> deviceAuthorizingCode;

    /**
     * Gets the value of the deviceAuthorizingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceAuthorizingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceAuthorizingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceAuthorizingCode }
     * 
     * 
     */
    public List<DeviceAuthorizingCode> getDeviceAuthorizingCode() {
        if (deviceAuthorizingCode == null) {
            deviceAuthorizingCode = new ArrayList<DeviceAuthorizingCode>();
        }
        return this.deviceAuthorizingCode;
    }

}
