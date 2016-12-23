
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
 *         &lt;element name="GetEventNotesResult" type="{https://services.alarmnet.com/TC2/}NotesResult" minOccurs="0"/>
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
    "getEventNotesResult"
})
@XmlRootElement(name = "GetEventNotesResponse")
public class GetEventNotesResponse {

    @XmlElement(name = "GetEventNotesResult")
    protected NotesResult getEventNotesResult;

    /**
     * Gets the value of the getEventNotesResult property.
     * 
     * @return
     *     possible object is
     *     {@link NotesResult }
     *     
     */
    public NotesResult getGetEventNotesResult() {
        return getEventNotesResult;
    }

    /**
     * Sets the value of the getEventNotesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotesResult }
     *     
     */
    public void setGetEventNotesResult(NotesResult value) {
        this.getEventNotesResult = value;
    }

}
