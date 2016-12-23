
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSceneThermostatSubAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSceneThermostatSubAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneThermostatSubAction" type="{https://services.alarmnet.com/TC2/}SceneThermostatSubAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSceneThermostatSubAction", propOrder = {
    "sceneThermostatSubAction"
})
public class ArrayOfSceneThermostatSubAction {

    @XmlElement(name = "SceneThermostatSubAction", nillable = true)
    protected List<SceneThermostatSubAction> sceneThermostatSubAction;

    /**
     * Gets the value of the sceneThermostatSubAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sceneThermostatSubAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSceneThermostatSubAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SceneThermostatSubAction }
     * 
     * 
     */
    public List<SceneThermostatSubAction> getSceneThermostatSubAction() {
        if (sceneThermostatSubAction == null) {
            sceneThermostatSubAction = new ArrayList<SceneThermostatSubAction>();
        }
        return this.sceneThermostatSubAction;
    }

}
