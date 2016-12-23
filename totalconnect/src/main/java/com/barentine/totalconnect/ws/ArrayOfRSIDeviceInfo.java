
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRSIDeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRSIDeviceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RSIDeviceInfo" type="{https://services.alarmnet.com/TC2/}RSIDeviceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRSIDeviceInfo", propOrder = {
    "rsiDeviceInfo"
})
public class ArrayOfRSIDeviceInfo {

    @XmlElement(name = "RSIDeviceInfo", nillable = true)
    protected List<RSIDeviceInfo> rsiDeviceInfo;

    /**
     * Gets the value of the rsiDeviceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsiDeviceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRSIDeviceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RSIDeviceInfo }
     * 
     * 
     */
    public List<RSIDeviceInfo> getRSIDeviceInfo() {
        if (rsiDeviceInfo == null) {
            rsiDeviceInfo = new ArrayList<RSIDeviceInfo>();
        }
        return this.rsiDeviceInfo;
    }

}
