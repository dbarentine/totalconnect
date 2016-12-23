
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLockSubAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLockSubAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LockSubAction" type="{https://services.alarmnet.com/TC2/}LockSubAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLockSubAction", propOrder = {
    "lockSubAction"
})
public class ArrayOfLockSubAction {

    @XmlElement(name = "LockSubAction", nillable = true)
    protected List<LockSubAction> lockSubAction;

    /**
     * Gets the value of the lockSubAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lockSubAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLockSubAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LockSubAction }
     * 
     * 
     */
    public List<LockSubAction> getLockSubAction() {
        if (lockSubAction == null) {
            lockSubAction = new ArrayList<LockSubAction>();
        }
        return this.lockSubAction;
    }

}
