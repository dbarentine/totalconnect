
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="smartActionIDs" type="{https://services.alarmnet.com/TC2/}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="getState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "locationID",
    "smartActionIDs",
    "getState"
})
@XmlRootElement(name = "GetSmartActionList")
public class GetSmartActionList {

    protected String sessionID;
    protected long locationID;
    protected ArrayOfLong smartActionIDs;
    protected boolean getState;

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
     * Gets the value of the smartActionIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getSmartActionIDs() {
        return smartActionIDs;
    }

    /**
     * Sets the value of the smartActionIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setSmartActionIDs(ArrayOfLong value) {
        this.smartActionIDs = value;
    }

    /**
     * Gets the value of the getState property.
     * 
     */
    public boolean isGetState() {
        return getState;
    }

    /**
     * Sets the value of the getState property.
     * 
     */
    public void setGetState(boolean value) {
        this.getState = value;
    }

}
