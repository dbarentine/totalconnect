
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartScene complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartScene">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}SmartSceneSubAction">
 *       &lt;sequence>
 *         &lt;element name="SmartSceneID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SmartSceneIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TriggerType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsSmartSceneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SmartSceneIconID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartScene", propOrder = {
    "smartSceneID",
    "smartSceneIndex",
    "locationID",
    "name",
    "triggerType",
    "isSmartSceneEnabled",
    "smartSceneIconID"
})
public class SmartScene
    extends SmartSceneSubAction
{

    @XmlElement(name = "SmartSceneID")
    protected long smartSceneID;
    @XmlElement(name = "SmartSceneIndex")
    protected int smartSceneIndex;
    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TriggerType")
    protected int triggerType;
    @XmlElement(name = "IsSmartSceneEnabled")
    protected boolean isSmartSceneEnabled;
    @XmlElement(name = "SmartSceneIconID")
    protected short smartSceneIconID;

    /**
     * Gets the value of the smartSceneID property.
     * 
     */
    public long getSmartSceneID() {
        return smartSceneID;
    }

    /**
     * Sets the value of the smartSceneID property.
     * 
     */
    public void setSmartSceneID(long value) {
        this.smartSceneID = value;
    }

    /**
     * Gets the value of the smartSceneIndex property.
     * 
     */
    public int getSmartSceneIndex() {
        return smartSceneIndex;
    }

    /**
     * Sets the value of the smartSceneIndex property.
     * 
     */
    public void setSmartSceneIndex(int value) {
        this.smartSceneIndex = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     */
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(long value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     */
    public int getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     */
    public void setTriggerType(int value) {
        this.triggerType = value;
    }

    /**
     * Gets the value of the isSmartSceneEnabled property.
     * 
     */
    public boolean isIsSmartSceneEnabled() {
        return isSmartSceneEnabled;
    }

    /**
     * Sets the value of the isSmartSceneEnabled property.
     * 
     */
    public void setIsSmartSceneEnabled(boolean value) {
        this.isSmartSceneEnabled = value;
    }

    /**
     * Gets the value of the smartSceneIconID property.
     * 
     */
    public short getSmartSceneIconID() {
        return smartSceneIconID;
    }

    /**
     * Sets the value of the smartSceneIconID property.
     * 
     */
    public void setSmartSceneIconID(short value) {
        this.smartSceneIconID = value;
    }

}
