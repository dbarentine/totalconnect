
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EventGroupID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="EventGroupName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventGroup")
public class EventGroup {

    @XmlAttribute(name = "EventGroupID", required = true)
    protected long eventGroupID;
    @XmlAttribute(name = "EventGroupName")
    protected String eventGroupName;

    /**
     * Gets the value of the eventGroupID property.
     * 
     */
    public long getEventGroupID() {
        return eventGroupID;
    }

    /**
     * Sets the value of the eventGroupID property.
     * 
     */
    public void setEventGroupID(long value) {
        this.eventGroupID = value;
    }

    /**
     * Gets the value of the eventGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventGroupName() {
        return eventGroupName;
    }

    /**
     * Sets the value of the eventGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventGroupName(String value) {
        this.eventGroupName = value;
    }

}
