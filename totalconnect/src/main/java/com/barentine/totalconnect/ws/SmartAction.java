
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SmartAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartAction">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}SmartActionSubAction">
 *       &lt;sequence>
 *         &lt;element name="SmartActionID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SmartActionIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TriggerType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SyncStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SmartActionIconId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartAction", propOrder = {
    "smartActionID",
    "smartActionIndex",
    "name",
    "triggerType",
    "created",
    "state",
    "syncStatus",
    "smartActionIconId"
})
public class SmartAction
    extends SmartActionSubAction
{

    @XmlElement(name = "SmartActionID")
    protected long smartActionID;
    @XmlElement(name = "SmartActionIndex")
    protected int smartActionIndex;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TriggerType")
    protected int triggerType;
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "SyncStatus")
    protected int syncStatus;
    @XmlElement(name = "SmartActionIconId")
    protected int smartActionIconId;

    /**
     * Gets the value of the smartActionID property.
     * 
     */
    public long getSmartActionID() {
        return smartActionID;
    }

    /**
     * Sets the value of the smartActionID property.
     * 
     */
    public void setSmartActionID(long value) {
        this.smartActionID = value;
    }

    /**
     * Gets the value of the smartActionIndex property.
     * 
     */
    public int getSmartActionIndex() {
        return smartActionIndex;
    }

    /**
     * Sets the value of the smartActionIndex property.
     * 
     */
    public void setSmartActionIndex(int value) {
        this.smartActionIndex = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     */
    public int getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     */
    public void setTriggerType(int value) {
        this.triggerType = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
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
     * Gets the value of the syncStatus property.
     * 
     */
    public int getSyncStatus() {
        return syncStatus;
    }

    /**
     * Sets the value of the syncStatus property.
     * 
     */
    public void setSyncStatus(int value) {
        this.syncStatus = value;
    }

    /**
     * Gets the value of the smartActionIconId property.
     * 
     */
    public int getSmartActionIconId() {
        return smartActionIconId;
    }

    /**
     * Sets the value of the smartActionIconId property.
     * 
     */
    public void setSmartActionIconId(int value) {
        this.smartActionIconId = value;
    }

}
