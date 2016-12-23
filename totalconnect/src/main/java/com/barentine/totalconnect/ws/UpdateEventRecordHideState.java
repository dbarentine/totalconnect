
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
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilterClass" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="EventRecordId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "sessionId",
    "filterClass",
    "eventRecordId",
    "isHidden"
})
@XmlRootElement(name = "UpdateEventRecordHideState")
public class UpdateEventRecordHideState {

    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "FilterClass")
    protected short filterClass;
    @XmlElement(name = "EventRecordId")
    protected long eventRecordId;
    @XmlElement(name = "IsHidden")
    protected boolean isHidden;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the filterClass property.
     * 
     */
    public short getFilterClass() {
        return filterClass;
    }

    /**
     * Sets the value of the filterClass property.
     * 
     */
    public void setFilterClass(short value) {
        this.filterClass = value;
    }

    /**
     * Gets the value of the eventRecordId property.
     * 
     */
    public long getEventRecordId() {
        return eventRecordId;
    }

    /**
     * Sets the value of the eventRecordId property.
     * 
     */
    public void setEventRecordId(long value) {
        this.eventRecordId = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
    }

}
