
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneInfoEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneInfoEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ZoneID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ZoneDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ZoneStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PartitionID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CanBeBypassed" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneInfoEx")
public class ZoneInfoEx {

    @XmlAttribute(name = "ZoneID", required = true)
    protected int zoneID;
    @XmlAttribute(name = "ZoneDescription")
    protected String zoneDescription;
    @XmlAttribute(name = "ZoneStatus", required = true)
    protected int zoneStatus;
    @XmlAttribute(name = "PartitionID", required = true)
    protected int partitionID;
    @XmlAttribute(name = "CanBeBypassed", required = true)
    protected int canBeBypassed;

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
     * Gets the value of the zoneDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneDescription() {
        return zoneDescription;
    }

    /**
     * Sets the value of the zoneDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneDescription(String value) {
        this.zoneDescription = value;
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
     * Gets the value of the partitionID property.
     * 
     */
    public int getPartitionID() {
        return partitionID;
    }

    /**
     * Sets the value of the partitionID property.
     * 
     */
    public void setPartitionID(int value) {
        this.partitionID = value;
    }

    /**
     * Gets the value of the canBeBypassed property.
     * 
     */
    public int getCanBeBypassed() {
        return canBeBypassed;
    }

    /**
     * Sets the value of the canBeBypassed property.
     * 
     */
    public void setCanBeBypassed(int value) {
        this.canBeBypassed = value;
    }

}
