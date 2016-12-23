
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SwitchID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SwitchIconID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionID",
    "deviceID",
    "switchID",
    "switchIconID"
})
@XmlRootElement(name = "UpdateSwitchIcon")
public class UpdateSwitchIcon {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "SwitchID")
    protected long switchID;
    @XmlElement(name = "SwitchIconID")
    @XmlSchemaType(name = "unsignedByte")
    protected short switchIconID;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
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

    /**
     * Gets the value of the switchID property.
     * 
     */
    public long getSwitchID() {
        return switchID;
    }

    /**
     * Sets the value of the switchID property.
     * 
     */
    public void setSwitchID(long value) {
        this.switchID = value;
    }

    /**
     * Gets the value of the switchIconID property.
     * 
     */
    public short getSwitchIconID() {
        return switchIconID;
    }

    /**
     * Sets the value of the switchIconID property.
     * 
     */
    public void setSwitchIconID(short value) {
        this.switchIconID = value;
    }

}
