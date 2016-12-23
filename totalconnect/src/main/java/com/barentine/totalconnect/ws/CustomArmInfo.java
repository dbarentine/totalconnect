
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomArmInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomArmInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArmMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ArmDelay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ZonesList" type="{https://services.alarmnet.com/TC2/}ArrayOfZoneWithBypassInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomArmInfo", propOrder = {
    "armMode",
    "armDelay",
    "zonesList"
})
public class CustomArmInfo {

    @XmlElement(name = "ArmMode")
    protected int armMode;
    @XmlElement(name = "ArmDelay")
    protected int armDelay;
    @XmlElement(name = "ZonesList")
    protected ArrayOfZoneWithBypassInfo zonesList;

    /**
     * Gets the value of the armMode property.
     * 
     */
    public int getArmMode() {
        return armMode;
    }

    /**
     * Sets the value of the armMode property.
     * 
     */
    public void setArmMode(int value) {
        this.armMode = value;
    }

    /**
     * Gets the value of the armDelay property.
     * 
     */
    public int getArmDelay() {
        return armDelay;
    }

    /**
     * Sets the value of the armDelay property.
     * 
     */
    public void setArmDelay(int value) {
        this.armDelay = value;
    }

    /**
     * Gets the value of the zonesList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfZoneWithBypassInfo }
     *     
     */
    public ArrayOfZoneWithBypassInfo getZonesList() {
        return zonesList;
    }

    /**
     * Sets the value of the zonesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfZoneWithBypassInfo }
     *     
     */
    public void setZonesList(ArrayOfZoneWithBypassInfo value) {
        this.zonesList = value;
    }

}
