
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventRecordId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Originator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasNotes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RecDateTimeGMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecDateLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecDateSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilterClass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeviceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventFilterTypeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventRecord", propOrder = {
    "eventRecordId",
    "eventType",
    "event",
    "originator",
    "notice",
    "notes",
    "hasNotes",
    "isLocked",
    "isHidden",
    "recDateTimeGMT",
    "recDateLocal",
    "recDateSuffix",
    "filterClass",
    "deviceId",
    "eventFilterTypeID"
})
@XmlSeeAlso({
    DoorbellEventRecord.class
})
public class EventRecord {

    @XmlElement(name = "EventRecordId")
    protected long eventRecordId;
    @XmlElement(name = "EventType")
    protected long eventType;
    @XmlElement(name = "Event")
    protected String event;
    @XmlElement(name = "Originator")
    protected String originator;
    @XmlElement(name = "Notice")
    protected String notice;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "HasNotes")
    protected boolean hasNotes;
    @XmlElement(name = "IsLocked")
    protected boolean isLocked;
    @XmlElement(name = "IsHidden")
    protected boolean isHidden;
    @XmlElement(name = "RecDateTimeGMT")
    protected String recDateTimeGMT;
    @XmlElement(name = "RecDateLocal")
    protected String recDateLocal;
    @XmlElement(name = "RecDateSuffix")
    protected String recDateSuffix;
    @XmlElement(name = "FilterClass")
    protected int filterClass;
    @XmlElement(name = "DeviceId")
    protected long deviceId;
    @XmlElement(name = "EventFilterTypeID")
    protected long eventFilterTypeID;

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
     * Gets the value of the eventType property.
     * 
     */
    public long getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     */
    public void setEventType(long value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Gets the value of the notice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotice() {
        return notice;
    }

    /**
     * Sets the value of the notice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotice(String value) {
        this.notice = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the hasNotes property.
     * 
     */
    public boolean isHasNotes() {
        return hasNotes;
    }

    /**
     * Sets the value of the hasNotes property.
     * 
     */
    public void setHasNotes(boolean value) {
        this.hasNotes = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     */
    public boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     */
    public void setIsLocked(boolean value) {
        this.isLocked = value;
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

    /**
     * Gets the value of the recDateTimeGMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecDateTimeGMT() {
        return recDateTimeGMT;
    }

    /**
     * Sets the value of the recDateTimeGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecDateTimeGMT(String value) {
        this.recDateTimeGMT = value;
    }

    /**
     * Gets the value of the recDateLocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecDateLocal() {
        return recDateLocal;
    }

    /**
     * Sets the value of the recDateLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecDateLocal(String value) {
        this.recDateLocal = value;
    }

    /**
     * Gets the value of the recDateSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecDateSuffix() {
        return recDateSuffix;
    }

    /**
     * Sets the value of the recDateSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecDateSuffix(String value) {
        this.recDateSuffix = value;
    }

    /**
     * Gets the value of the filterClass property.
     * 
     */
    public int getFilterClass() {
        return filterClass;
    }

    /**
     * Sets the value of the filterClass property.
     * 
     */
    public void setFilterClass(int value) {
        this.filterClass = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     */
    public long getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     */
    public void setDeviceId(long value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the eventFilterTypeID property.
     * 
     */
    public long getEventFilterTypeID() {
        return eventFilterTypeID;
    }

    /**
     * Sets the value of the eventFilterTypeID property.
     * 
     */
    public void setEventFilterTypeID(long value) {
        this.eventFilterTypeID = value;
    }

}
