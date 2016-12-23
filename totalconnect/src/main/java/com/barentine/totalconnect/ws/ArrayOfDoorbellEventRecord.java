
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDoorbellEventRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDoorbellEventRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DoorbellEventRecord" type="{https://services.alarmnet.com/TC2/}DoorbellEventRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDoorbellEventRecord", propOrder = {
    "doorbellEventRecord"
})
public class ArrayOfDoorbellEventRecord {

    @XmlElement(name = "DoorbellEventRecord", nillable = true)
    protected List<DoorbellEventRecord> doorbellEventRecord;

    /**
     * Gets the value of the doorbellEventRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doorbellEventRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoorbellEventRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoorbellEventRecord }
     * 
     * 
     */
    public List<DoorbellEventRecord> getDoorbellEventRecord() {
        if (doorbellEventRecord == null) {
            doorbellEventRecord = new ArrayList<DoorbellEventRecord>();
        }
        return this.doorbellEventRecord;
    }

}
