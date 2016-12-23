
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneWithBypassInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneWithBypassInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZoneID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ByPass" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ZoneStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneWithBypassInfo", propOrder = {
    "zoneID",
    "byPass",
    "zoneStatus"
})
public class ZoneWithBypassInfo {

    @XmlElement(name = "ZoneID")
    protected int zoneID;
    @XmlElement(name = "ByPass")
    protected boolean byPass;
    @XmlElement(name = "ZoneStatus")
    protected int zoneStatus;

    /**
     * Gets the value of the zoneID property.
     * 
     */
    public int getZoneID() {
        return zoneID;
    }

    /**
     * Sets the value of the zoneID property.
     * 
     */
    public void setZoneID(int value) {
        this.zoneID = value;
    }

    /**
     * Gets the value of the byPass property.
     * 
     */
    public boolean isByPass() {
        return byPass;
    }

    /**
     * Sets the value of the byPass property.
     * 
     */
    public void setByPass(boolean value) {
        this.byPass = value;
    }

    /**
     * Gets the value of the zoneStatus property.
     * 
     */
    public int getZoneStatus() {
        return zoneStatus;
    }

    /**
     * Sets the value of the zoneStatus property.
     * 
     */
    public void setZoneStatus(int value) {
        this.zoneStatus = value;
    }

}
