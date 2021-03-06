
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRSIDeviceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRSIDeviceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RSIDeviceStatus" type="{https://services.alarmnet.com/TC2/}RSIDeviceStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRSIDeviceStatus", propOrder = {
    "rsiDeviceStatus"
})
public class ArrayOfRSIDeviceStatus {

    @XmlElement(name = "RSIDeviceStatus", nillable = true)
    protected List<RSIDeviceStatus> rsiDeviceStatus;

    /**
     * Gets the value of the rsiDeviceStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsiDeviceStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRSIDeviceStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RSIDeviceStatus }
     * 
     * 
     */
    public List<RSIDeviceStatus> getRSIDeviceStatus() {
        if (rsiDeviceStatus == null) {
            rsiDeviceStatus = new ArrayList<RSIDeviceStatus>();
        }
        return this.rsiDeviceStatus;
    }

}
