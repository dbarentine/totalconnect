
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneDataResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneDataResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="SceneAutomationData" type="{https://services.alarmnet.com/TC2/}SceneAutomationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneDataResults", propOrder = {
    "sceneAutomationData"
})
public class SceneDataResults
    extends WebMethodResults
{

    @XmlElement(name = "SceneAutomationData")
    protected SceneAutomationInfo sceneAutomationData;

    /**
     * Gets the value of the sceneAutomationData property.
     * 
     * @return
     *     possible object is
     *     {@link SceneAutomationInfo }
     *     
     */
    public SceneAutomationInfo getSceneAutomationData() {
        return sceneAutomationData;
    }

    /**
     * Sets the value of the sceneAutomationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SceneAutomationInfo }
     *     
     */
    public void setSceneAutomationData(SceneAutomationInfo value) {
        this.sceneAutomationData = value;
    }

}
