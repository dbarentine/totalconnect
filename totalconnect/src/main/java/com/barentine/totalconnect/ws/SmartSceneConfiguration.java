
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartSceneConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartSceneConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumSmartScenes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaximumDevicesPerScene" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentSmartSceneCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartSceneConfiguration", propOrder = {
    "maximumSmartScenes",
    "maximumDevicesPerScene",
    "currentSmartSceneCount"
})
public class SmartSceneConfiguration {

    @XmlElement(name = "MaximumSmartScenes")
    protected int maximumSmartScenes;
    @XmlElement(name = "MaximumDevicesPerScene")
    protected int maximumDevicesPerScene;
    @XmlElement(name = "CurrentSmartSceneCount")
    protected int currentSmartSceneCount;

    /**
     * Gets the value of the maximumSmartScenes property.
     * 
     */
    public int getMaximumSmartScenes() {
        return maximumSmartScenes;
    }

    /**
     * Sets the value of the maximumSmartScenes property.
     * 
     */
    public void setMaximumSmartScenes(int value) {
        this.maximumSmartScenes = value;
    }

    /**
     * Gets the value of the maximumDevicesPerScene property.
     * 
     */
    public int getMaximumDevicesPerScene() {
        return maximumDevicesPerScene;
    }

    /**
     * Sets the value of the maximumDevicesPerScene property.
     * 
     */
    public void setMaximumDevicesPerScene(int value) {
        this.maximumDevicesPerScene = value;
    }

    /**
     * Gets the value of the currentSmartSceneCount property.
     * 
     */
    public int getCurrentSmartSceneCount() {
        return currentSmartSceneCount;
    }

    /**
     * Sets the value of the currentSmartSceneCount property.
     * 
     */
    public void setCurrentSmartSceneCount(int value) {
        this.currentSmartSceneCount = value;
    }

}
