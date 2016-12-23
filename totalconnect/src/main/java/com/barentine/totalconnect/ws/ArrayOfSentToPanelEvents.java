
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSentToPanelEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSentToPanelEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SentToPanelEvents" type="{https://services.alarmnet.com/TC2/}SentToPanelEvents" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSentToPanelEvents", propOrder = {
    "sentToPanelEvents"
})
public class ArrayOfSentToPanelEvents {

    @XmlElement(name = "SentToPanelEvents", nillable = true)
    protected List<SentToPanelEvents> sentToPanelEvents;

    /**
     * Gets the value of the sentToPanelEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sentToPanelEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSentToPanelEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SentToPanelEvents }
     * 
     * 
     */
    public List<SentToPanelEvents> getSentToPanelEvents() {
        if (sentToPanelEvents == null) {
            sentToPanelEvents = new ArrayList<SentToPanelEvents>();
        }
        return this.sentToPanelEvents;
    }

}
