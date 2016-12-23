
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSceneStatusLock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSceneStatusLock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneStatusLock" type="{https://services.alarmnet.com/TC2/}SceneStatusLock" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSceneStatusLock", propOrder = {
    "sceneStatusLock"
})
public class ArrayOfSceneStatusLock {

    @XmlElement(name = "SceneStatusLock", nillable = true)
    protected List<SceneStatusLock> sceneStatusLock;

    /**
     * Gets the value of the sceneStatusLock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sceneStatusLock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSceneStatusLock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SceneStatusLock }
     * 
     * 
     */
    public List<SceneStatusLock> getSceneStatusLock() {
        if (sceneStatusLock == null) {
            sceneStatusLock = new ArrayList<SceneStatusLock>();
        }
        return this.sceneStatusLock;
    }

}
