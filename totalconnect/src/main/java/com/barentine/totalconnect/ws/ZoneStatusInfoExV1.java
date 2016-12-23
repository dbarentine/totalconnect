
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneStatusInfoEx_V1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneStatusInfoEx_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ZoneID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ZoneStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IsBypassableZone" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ZoneTypeId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneStatusInfoEx_V1")
public class ZoneStatusInfoExV1 {

    @XmlAttribute(name = "ZoneID", required = true)
    protected int zoneID;
    @XmlAttribute(name = "ZoneStatus", required = true)
    protected int zoneStatus;
    @XmlAttribute(name = "IsBypassableZone", required = true)
    protected int isBypassableZone;
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
     * Gets the value of the isBypassableZone property.
     * 
     */
    public int getIsBypassableZone() {
        return isBypassableZone;
    }

    /**
     * Sets the value of the isBypassableZone property.
     * 
     */
    public void setIsBypassableZone(int value) {
        this.isBypassableZone = value;
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
