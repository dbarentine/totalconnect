
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneListInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneListInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="SceneData" type="{https://services.alarmnet.com/TC2/}ArrayOfSceneInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneListInfo", propOrder = {
    "sceneData"
})
public class SceneListInfo
    extends WebMethodResults
{

    @XmlElement(name = "SceneData")
    protected ArrayOfSceneInfo sceneData;

    /**
     * Gets the value of the sceneData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSceneInfo }
     *     
     */
    public ArrayOfSceneInfo getSceneData() {
        return sceneData;
    }

    /**
     * Sets the value of the sceneData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSceneInfo }
     *     
     */
    public void setSceneData(ArrayOfSceneInfo value) {
        this.sceneData = value;
    }

}
