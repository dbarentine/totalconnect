
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetScenesListResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetScenesListResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="SmartScenes" type="{https://services.alarmnet.com/TC2/}ArrayOfSmartScene" minOccurs="0"/>
 *         &lt;element name="CurrentSmartSceneCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetScenesListResults", propOrder = {
    "smartScenes",
    "currentSmartSceneCount"
})
public class GetScenesListResults
    extends WebMethodResults
{

    @XmlElement(name = "SmartScenes")
    protected ArrayOfSmartScene smartScenes;
    @XmlElement(name = "CurrentSmartSceneCount")
    protected int currentSmartSceneCount;

    /**
     * Gets the value of the smartScenes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmartScene }
     *     
     */
    public ArrayOfSmartScene getSmartScenes() {
        return smartScenes;
    }

    /**
     * Sets the value of the smartScenes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmartScene }
     *     
     */
    public void setSmartScenes(ArrayOfSmartScene value) {
        this.smartScenes = value;
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
