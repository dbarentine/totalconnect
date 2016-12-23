
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLockInfo_Transitional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLockInfo_Transitional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LockInfo_Transitional" type="{https://services.alarmnet.com/TC2/}LockInfo_Transitional" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLockInfo_Transitional", propOrder = {
    "lockInfoTransitional"
})
public class ArrayOfLockInfoTransitional {

    @XmlElement(name = "LockInfo_Transitional", nillable = true)
    protected List<LockInfoTransitional> lockInfoTransitional;

    /**
     * Gets the value of the lockInfoTransitional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lockInfoTransitional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLockInfoTransitional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LockInfoTransitional }
     * 
     * 
     */
    public List<LockInfoTransitional> getLockInfoTransitional() {
        if (lockInfoTransitional == null) {
            lockInfoTransitional = new ArrayList<LockInfoTransitional>();
        }
        return this.lockInfoTransitional;
    }

}
