
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneLock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneLock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LockID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SceneLockState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SceneAuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneLock", propOrder = {
    "lockID",
    "sceneLockState",
    "sceneAuthorizationCode"
})
public class SceneLock {

    @XmlElement(name = "LockID")
    protected long lockID;
    @XmlElement(name = "SceneLockState")
    protected boolean sceneLockState;
    @XmlElement(name = "SceneAuthorizationCode")
    protected String sceneAuthorizationCode;

    /**
     * Gets the value of the lockID property.
     * 
     */
    public long getLockID() {
        return lockID;
    }

    /**
     * Sets the value of the lockID property.
     * 
     */
    public void setLockID(long value) {
        this.lockID = value;
    }

    /**
     * Gets the value of the sceneLockState property.
     * 
     */
    public boolean isSceneLockState() {
        return sceneLockState;
    }

    /**
     * Sets the value of the sceneLockState property.
     * 
     */
    public void setSceneLockState(boolean value) {
        this.sceneLockState = value;
    }

    /**
     * Gets the value of the sceneAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceneAuthorizationCode() {
        return sceneAuthorizationCode;
    }

    /**
     * Sets the value of the sceneAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceneAuthorizationCode(String value) {
        this.sceneAuthorizationCode = value;
    }

}
