
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ZoneID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ZoneStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ZoneTypeId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneStatusInfo")
@XmlSeeAlso({
    ZoneStatusInfoEx.class
})
public class ZoneStatusInfo {

    @XmlAttribute(name = "ZoneID", required = true)
    protected int zoneID;
    @XmlAttribute(name = "ZoneStatus", required = true)
    protected int zoneStatus;
    @XmlAttribute(name = "ZoneTypeId", required = true)
    protected int zoneTypeId;

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

    /**
     * Gets the value of the zoneTypeId property.
     * 
     */
    public int getZoneTypeId() {
        return zoneTypeId;
    }

    /**
     * Sets the value of the zoneTypeId property.
     * 
     */
    public void setZoneTypeId(int value) {
        this.zoneTypeId = value;
    }

}
