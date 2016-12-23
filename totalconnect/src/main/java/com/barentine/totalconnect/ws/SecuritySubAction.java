
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritySubAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecuritySubAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubActionID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SecuritySystemID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ByPassZones" type="{https://services.alarmnet.com/TC2/}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritySubAction", propOrder = {
    "subActionID",
    "securitySystemID",
    "state",
    "byPassZones"
})
public class SecuritySubAction {

    @XmlElement(name = "SubActionID")
    protected long subActionID;
    @XmlElement(name = "SecuritySystemID")
    protected long securitySystemID;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "ByPassZones")
    protected ArrayOfInt byPassZones;

    /**
     * Gets the value of the subActionID property.
     * 
     */
    public long getSubActionID() {
        return subActionID;
    }

    /**
     * Sets the value of the subActionID property.
     * 
     */
    public void setSubActionID(long value) {
        this.subActionID = value;
    }

    /**
     * Gets the value of the securitySystemID property.
     * 
     */
    public long getSecuritySystemID() {
        return securitySystemID;
    }

    /**
     * Sets the value of the securitySystemID property.
     * 
     */
    public void setSecuritySystemID(long value) {
        this.securitySystemID = value;
    }

    /**
     * Gets the value of the state property.
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     */
    public void setState(int value) {
        this.state = value;
    }

    /**
     * Gets the value of the byPassZones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getByPassZones() {
        return byPassZones;
    }

    /**
     * Sets the value of the byPassZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setByPassZones(ArrayOfInt value) {
        this.byPassZones = value;
    }

}
