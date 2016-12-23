
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSmartScene complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSmartScene">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmartScene" type="{https://services.alarmnet.com/TC2/}SmartScene" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSmartScene", propOrder = {
    "smartScene"
})
public class ArrayOfSmartScene {

    @XmlElement(name = "SmartScene", nillable = true)
    protected List<SmartScene> smartScene;

    /**
     * Gets the value of the smartScene property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smartScene property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmartScene().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmartScene }
     * 
     * 
     */
    public List<SmartScene> getSmartScene() {
        if (smartScene == null) {
            smartScene = new ArrayList<SmartScene>();
        }
        return this.smartScene;
    }

}
