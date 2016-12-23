
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimePeriodInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="Enabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TempHeat" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="TempCool" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodInfo")
public class TimePeriodInfo {

    @XmlAttribute(name = "Index", required = true)
    protected short index;
    @XmlAttribute(name = "Enabled", required = true)
    protected boolean enabled;
    @XmlAttribute(name = "TempHeat", required = true)
    protected short tempHeat;
    @XmlAttribute(name = "TempCool", required = true)
    protected short tempCool;
    @XmlAttribute(name = "Time")
    protected String time;

    /**
     * Gets the value of the index property.
     * 
     */
    public short getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(short value) {
        this.index = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the tempHeat property.
     * 
     */
    public short getTempHeat() {
        return tempHeat;
    }

    /**
     * Sets the value of the tempHeat property.
     * 
     */
    public void setTempHeat(short value) {
        this.tempHeat = value;
    }

    /**
     * Gets the value of the tempCool property.
     * 
     */
    public short getTempCool() {
        return tempCool;
    }

    /**
     * Sets the value of the tempCool property.
     * 
     */
    public void setTempCool(short value) {
        this.tempCool = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

}
