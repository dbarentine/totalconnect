
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSceneLock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSceneLock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneLock" type="{https://services.alarmnet.com/TC2/}SceneLock" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSceneLock", propOrder = {
    "sceneLock"
})
public class ArrayOfSceneLock {

    @XmlElement(name = "SceneLock", nillable = true)
    protected List<SceneLock> sceneLock;

    /**
     * Gets the value of the sceneLock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sceneLock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSceneLock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SceneLock }
     * 
     * 
     */
    public List<SceneLock> getSceneLock() {
        if (sceneLock == null) {
            sceneLock = new ArrayList<SceneLock>();
        }
        return this.sceneLock;
    }

}
