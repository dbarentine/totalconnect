
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
 *         &lt;element name="OutputNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NewState" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "outputNumber",
    "newState"
})
@XmlRootElement(name = "Output_Control")
public class OutputControl {

    @XmlElement(name = "MAC")
    protected String mac;
    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "OutputNumber")
    protected int outputNumber;
    @XmlElement(name = "NewState")
    protected int newState;

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
     * Gets the value of the outputNumber property.
     * 
     */
    public int getOutputNumber() {
        return outputNumber;
    }

    /**
     * Sets the value of the outputNumber property.
     * 
     */
    public void setOutputNumber(int value) {
        this.outputNumber = value;
    }

    /**
     * Gets the value of the newState property.
     * 
     */
    public int getNewState() {
        return newState;
    }

    /**
     * Sets the value of the newState property.
     * 
     */
    public void setNewState(int value) {
        this.newState = value;
    }

}
