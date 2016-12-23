
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneStatusLock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneStatusLock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneLockInfo" type="{https://services.alarmnet.com/TC2/}LockInfo" minOccurs="0"/>
 *         &lt;element name="SceneLock" type="{https://services.alarmnet.com/TC2/}SceneLock" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneStatusLock", propOrder = {
    "sceneLockInfo",
    "sceneLock"
})
public class SceneStatusLock {

    @XmlElement(name = "SceneLockInfo")
    protected LockInfo sceneLockInfo;
    @XmlElement(name = "SceneLock")
    protected SceneLock sceneLock;

    /**
     * Gets the value of the sceneLockInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LockInfo }
     *     
     */
    public LockInfo getSceneLockInfo() {
        return sceneLockInfo;
    }

    /**
     * Sets the value of the sceneLockInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockInfo }
     *     
     */
    public void setSceneLockInfo(LockInfo value) {
        this.sceneLockInfo = value;
    }

    /**
     * Gets the value of the sceneLock property.
     * 
     * @return
     *     possible object is
     *     {@link SceneLock }
     *     
     */
    public SceneLock getSceneLock() {
        return sceneLock;
    }

    /**
     * Sets the value of the sceneLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link SceneLock }
     *     
     */
    public void setSceneLock(SceneLock value) {
        this.sceneLock = value;
    }

}
