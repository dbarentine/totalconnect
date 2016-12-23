
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTimePeriodInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTimePeriodInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimePeriodInfo" type="{https://services.alarmnet.com/TC2/}TimePeriodInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTimePeriodInfo", propOrder = {
    "timePeriodInfo"
})
public class ArrayOfTimePeriodInfo {

    @XmlElement(name = "TimePeriodInfo", nillable = true)
    protected List<TimePeriodInfo> timePeriodInfo;

    /**
     * Gets the value of the timePeriodInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timePeriodInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimePeriodInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodInfo }
     * 
     * 
     */
    public List<TimePeriodInfo> getTimePeriodInfo() {
        if (timePeriodInfo == null) {
            timePeriodInfo = new ArrayList<TimePeriodInfo>();
        }
        return this.timePeriodInfo;
    }

}
