
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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="connectionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "appID",
    "locationID",
    "connectionID",
    "isEnable"
})
@XmlRootElement(name = "SubscribeUnsubscrbeCHILAccount")
public class SubscribeUnsubscrbeCHILAccount {

    protected String sessionID;
    protected long appID;
    protected long locationID;
    protected String connectionID;
    @XmlElement(name = "IsEnable")
    protected boolean isEnable;

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
     * Gets the value of the appID property.
     * 
     */
    public long getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     */
    public void setAppID(long value) {
        this.appID = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     */
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(long value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the connectionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionID() {
        return connectionID;
    }

    /**
     * Sets the value of the connectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionID(String value) {
        this.connectionID = value;
    }

    /**
     * Gets the value of the isEnable property.
     * 
     */
    public boolean isIsEnable() {
        return isEnable;
    }

    /**
     * Sets the value of the isEnable property.
     * 
     */
    public void setIsEnable(boolean value) {
        this.isEnable = value;
    }

}
