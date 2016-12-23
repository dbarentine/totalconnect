
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SceneInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SceneInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSceneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SceneIconID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SceneID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SceneInfo", propOrder = {
    "sceneName",
    "isSceneEnabled",
    "sceneIconID",
    "sceneID",
    "inUse"
})
public class SceneInfo {

    @XmlElement(name = "SceneName")
    protected String sceneName;
    @XmlElement(name = "IsSceneEnabled")
    protected boolean isSceneEnabled;
    @XmlElement(name = "SceneIconID")
    protected int sceneIconID;
    @XmlElement(name = "SceneID")
    protected long sceneID;
    @XmlElement(name = "InUse")
    protected boolean inUse;

    /**
     * Gets the value of the sceneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceneName() {
        return sceneName;
    }

    /**
     * Sets the value of the sceneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceneName(String value) {
        this.sceneName = value;
    }

    /**
     * Gets the value of the isSceneEnabled property.
     * 
     */
    public boolean isIsSceneEnabled() {
        return isSceneEnabled;
    }

    /**
     * Sets the value of the isSceneEnabled property.
     * 
     */
    public void setIsSceneEnabled(boolean value) {
        this.isSceneEnabled = value;
    }

    /**
     * Gets the value of the sceneIconID property.
     * 
     */
    public int getSceneIconID() {
        return sceneIconID;
    }

    /**
     * Sets the value of the sceneIconID property.
     * 
     */
    public void setSceneIconID(int value) {
        this.sceneIconID = value;
    }

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

    /**
     * Gets the value of the inUse property.
     * 
     */
    public boolean isInUse() {
        return inUse;
    }

    /**
     * Sets the value of the inUse property.
     * 
     */
    public void setInUse(boolean value) {
        this.inUse = value;
    }

}
