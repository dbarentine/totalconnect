
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
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManageUserID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PanelUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "manageUserID",
    "deviceID",
    "panelUserCode",
    "additionalInput"
})
@XmlRootElement(name = "SaveMasterUserCode")
public class SaveMasterUserCode {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "ManageUserID")
    protected long manageUserID;
    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "PanelUserCode")
    protected String panelUserCode;
    @XmlElement(name = "AdditionalInput")
    protected String additionalInput;

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
     * Gets the value of the manageUserID property.
     * 
     */
    public long getManageUserID() {
        return manageUserID;
    }

    /**
     * Sets the value of the manageUserID property.
     * 
     */
    public void setManageUserID(long value) {
        this.manageUserID = value;
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
     * Gets the value of the panelUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanelUserCode() {
        return panelUserCode;
    }

    /**
     * Sets the value of the panelUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanelUserCode(String value) {
        this.panelUserCode = value;
    }

    /**
     * Gets the value of the additionalInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInput() {
        return additionalInput;
    }

    /**
     * Sets the value of the additionalInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInput(String value) {
        this.additionalInput = value;
    }

}
