
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Degrees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PanSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TiltSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "mac",
    "sessionID",
    "direction",
    "degrees",
    "panSpeed",
    "tiltSpeed"
})
@XmlRootElement(name = "MoveCamera")
public class MoveCamera {

    @XmlElement(name = "MAC")
    protected String mac;
    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "Direction")
    protected int direction;
    @XmlElement(name = "Degrees")
    protected int degrees;
    @XmlElement(name = "PanSpeed")
    protected int panSpeed;
    @XmlElement(name = "TiltSpeed")
    protected int tiltSpeed;

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAC() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAC(String value) {
        this.mac = value;
    }

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
     * Gets the value of the direction property.
     * 
     */
    public int getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     */
    public void setDirection(int value) {
        this.direction = value;
    }

    /**
     * Gets the value of the degrees property.
     * 
     */
    public int getDegrees() {
        return degrees;
    }

    /**
     * Sets the value of the degrees property.
     * 
     */
    public void setDegrees(int value) {
        this.degrees = value;
    }

    /**
     * Gets the value of the panSpeed property.
     * 
     */
    public int getPanSpeed() {
        return panSpeed;
    }

    /**
     * Sets the value of the panSpeed property.
     * 
     */
    public void setPanSpeed(int value) {
        this.panSpeed = value;
    }

    /**
     * Gets the value of the tiltSpeed property.
     * 
     */
    public int getTiltSpeed() {
        return tiltSpeed;
    }

    /**
     * Sets the value of the tiltSpeed property.
     * 
     */
    public void setTiltSpeed(int value) {
        this.tiltSpeed = value;
    }

}
