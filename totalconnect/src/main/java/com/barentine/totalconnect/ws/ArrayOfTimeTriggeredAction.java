
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTimeTriggeredAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTimeTriggeredAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeTriggeredAction" type="{https://services.alarmnet.com/TC2/}TimeTriggeredAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTimeTriggeredAction", propOrder = {
    "timeTriggeredAction"
})
public class ArrayOfTimeTriggeredAction {

    @XmlElement(name = "TimeTriggeredAction", nillable = true)
    protected List<TimeTriggeredAction> timeTriggeredAction;

    /**
     * Gets the value of the timeTriggeredAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeTriggeredAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeTriggeredAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeTriggeredAction }
     * 
     * 
     */
    public List<TimeTriggeredAction> getTimeTriggeredAction() {
        if (timeTriggeredAction == null) {
            timeTriggeredAction = new ArrayList<TimeTriggeredAction>();
        }
        return this.timeTriggeredAction;
    }

}
