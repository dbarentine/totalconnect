
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSceneSwitch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSceneSwitch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneSwitch" type="{https://services.alarmnet.com/TC2/}SceneSwitch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSceneSwitch", propOrder = {
    "sceneSwitch"
})
public class ArrayOfSceneSwitch {

    @XmlElement(name = "SceneSwitch", nillable = true)
    protected List<SceneSwitch> sceneSwitch;

    /**
     * Gets the value of the sceneSwitch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sceneSwitch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSceneSwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SceneSwitch }
     * 
     * 
     */
    public List<SceneSwitch> getSceneSwitch() {
        if (sceneSwitch == null) {
            sceneSwitch = new ArrayList<SceneSwitch>();
        }
        return this.sceneSwitch;
    }

}
