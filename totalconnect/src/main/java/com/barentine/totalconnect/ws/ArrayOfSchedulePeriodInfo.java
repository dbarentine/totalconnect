
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSchedulePeriodInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSchedulePeriodInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchedulePeriodInfo" type="{https://services.alarmnet.com/TC2/}SchedulePeriodInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSchedulePeriodInfo", propOrder = {
    "schedulePeriodInfo"
})
public class ArrayOfSchedulePeriodInfo {

    @XmlElement(name = "SchedulePeriodInfo", nillable = true)
    protected List<SchedulePeriodInfo> schedulePeriodInfo;

    /**
     * Gets the value of the schedulePeriodInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedulePeriodInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedulePeriodInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchedulePeriodInfo }
     * 
     * 
     */
    public List<SchedulePeriodInfo> getSchedulePeriodInfo() {
        if (schedulePeriodInfo == null) {
            schedulePeriodInfo = new ArrayList<SchedulePeriodInfo>();
        }
        return this.schedulePeriodInfo;
    }

}
