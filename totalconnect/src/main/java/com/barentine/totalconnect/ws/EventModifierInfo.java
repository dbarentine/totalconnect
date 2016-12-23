
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventModifierInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventModifierInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EventModifierID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="EventModifierDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DeviceID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventModifierInfo")
public class EventModifierInfo {

    @XmlAttribute(name = "EventModifierID", required = true)
    protected long eventModifierID;
    @XmlAttribute(name = "EventModifierDescription")
    protected String eventModifierDescription;
    @XmlAttribute(name = "DeviceID", required = true)
    protected long deviceID;

    /**
     * Gets the value of the eventModifierID property.
     * 
     */
    public long getEventModifierID() {
        return eventModifierID;
    }

    /**
     * Sets the value of the eventModifierID property.
     * 
     */
    public void setEventModifierID(long value) {
        this.eventModifierID = value;
    }

    /**
     * Gets the value of the eventModifierDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventModifierDescription() {
        return eventModifierDescription;
    }

    /**
     * Sets the value of the eventModifierDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventModifierDescription(String value) {
        this.eventModifierDescription = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     */
    public long getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     */
    public void setDeviceID(long value) {
        this.deviceID = value;
    }

}
