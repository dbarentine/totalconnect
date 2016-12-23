
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSIDeviceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSIDeviceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DevcieIndex" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="BatteryStatus" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SupervisionStatus" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CoverTamper" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSIDeviceStatus", propOrder = {
    "devcieIndex",
    "batteryStatus",
    "supervisionStatus",
    "coverTamper"
})
public class RSIDeviceStatus {

    @XmlElement(name = "DevcieIndex")
    protected short devcieIndex;
    @XmlElement(name = "BatteryStatus")
    protected short batteryStatus;
    @XmlElement(name = "SupervisionStatus")
    protected short supervisionStatus;
    @XmlElement(name = "CoverTamper")
    protected short coverTamper;

    /**
     * Gets the value of the devcieIndex property.
     * 
     */
    public short getDevcieIndex() {
        return devcieIndex;
    }

    /**
     * Sets the value of the devcieIndex property.
     * 
     */
    public void setDevcieIndex(short value) {
        this.devcieIndex = value;
    }

    /**
     * Gets the value of the batteryStatus property.
     * 
     */
    public short getBatteryStatus() {
        return batteryStatus;
    }

    /**
     * Sets the value of the batteryStatus property.
     * 
     */
    public void setBatteryStatus(short value) {
        this.batteryStatus = value;
    }

    /**
     * Gets the value of the supervisionStatus property.
     * 
     */
    public short getSupervisionStatus() {
        return supervisionStatus;
    }

    /**
     * Sets the value of the supervisionStatus property.
     * 
     */
    public void setSupervisionStatus(short value) {
        this.supervisionStatus = value;
    }

    /**
     * Gets the value of the coverTamper property.
     * 
     */
    public short getCoverTamper() {
        return coverTamper;
    }

    /**
     * Sets the value of the coverTamper property.
     * 
     */
    public void setCoverTamper(short value) {
        this.coverTamper = value;
    }

}
