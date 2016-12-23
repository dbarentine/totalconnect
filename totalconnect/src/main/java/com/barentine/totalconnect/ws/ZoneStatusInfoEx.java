
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneStatusInfoEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneStatusInfoEx">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}ZoneStatusInfo">
 *       &lt;attribute name="CanBeBypassed" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ZoneFlags" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneStatusInfoEx")
public class ZoneStatusInfoEx
    extends ZoneStatusInfo
{

    @XmlAttribute(name = "CanBeBypassed", required = true)
    protected int canBeBypassed;
    @XmlAttribute(name = "ZoneFlags")
    protected String zoneFlags;

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

    /**
     * Gets the value of the zoneFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneFlags() {
        return zoneFlags;
    }

    /**
     * Sets the value of the zoneFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneFlags(String value) {
        this.zoneFlags = value;
    }

}
