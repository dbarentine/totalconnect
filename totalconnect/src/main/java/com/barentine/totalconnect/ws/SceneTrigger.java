
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneTrigger">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}NotificationInfoBase">
 *       &lt;attribute name="SceneID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneTrigger")
public class SceneTrigger
    extends NotificationInfoBase
{

    @XmlAttribute(name = "SceneID", required = true)
    protected long sceneID;

    /**
     * Gets the value of the sceneID property.
     * 
     */
    public long getSceneID() {
        return sceneID;
    }

    /**
     * Sets the value of the sceneID property.
     * 
     */
    public void setSceneID(long value) {
        this.sceneID = value;
    }

}
