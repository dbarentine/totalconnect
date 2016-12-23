
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSceneThermostat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSceneThermostat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneThermostat" type="{https://services.alarmnet.com/TC2/}SceneThermostat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSceneThermostat", propOrder = {
    "sceneThermostat"
})
public class ArrayOfSceneThermostat {

    @XmlElement(name = "SceneThermostat", nillable = true)
    protected List<SceneThermostat> sceneThermostat;

    /**
     * Gets the value of the sceneThermostat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sceneThermostat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSceneThermostat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SceneThermostat }
     * 
     * 
     */
    public List<SceneThermostat> getSceneThermostat() {
        if (sceneThermostat == null) {
            sceneThermostat = new ArrayList<SceneThermostat>();
        }
        return this.sceneThermostat;
    }

}
