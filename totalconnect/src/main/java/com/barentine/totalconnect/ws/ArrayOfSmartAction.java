
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSmartAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSmartAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmartAction" type="{https://services.alarmnet.com/TC2/}SmartAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSmartAction", propOrder = {
    "smartAction"
})
public class ArrayOfSmartAction {

    @XmlElement(name = "SmartAction", nillable = true)
    protected List<SmartAction> smartAction;

    /**
     * Gets the value of the smartAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smartAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmartAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmartAction }
     * 
     * 
     */
    public List<SmartAction> getSmartAction() {
        if (smartAction == null) {
            smartAction = new ArrayList<SmartAction>();
        }
        return this.smartAction;
    }

}
