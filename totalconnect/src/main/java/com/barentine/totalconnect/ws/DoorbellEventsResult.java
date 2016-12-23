
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoorbellEventsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoorbellEventsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="DoorbellEvents" type="{https://services.alarmnet.com/TC2/}ArrayOfDoorbellEventRecord" minOccurs="0"/>
 *         &lt;element name="HasMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoorbellEventsResult", propOrder = {
    "doorbellEvents",
    "hasMore"
})
public class DoorbellEventsResult
    extends WebMethodResults
{

    @XmlElement(name = "DoorbellEvents")
    protected ArrayOfDoorbellEventRecord doorbellEvents;
    @XmlElement(name = "HasMore")
    protected boolean hasMore;

    /**
     * Gets the value of the doorbellEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDoorbellEventRecord }
     *     
     */
    public ArrayOfDoorbellEventRecord getDoorbellEvents() {
        return doorbellEvents;
    }

    /**
     * Sets the value of the doorbellEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDoorbellEventRecord }
     *     
     */
    public void setDoorbellEvents(ArrayOfDoorbellEventRecord value) {
        this.doorbellEvents = value;
    }

    /**
     * Gets the value of the hasMore property.
     * 
     */
    public boolean isHasMore() {
        return hasMore;
    }

    /**
     * Sets the value of the hasMore property.
     * 
     */
    public void setHasMore(boolean value) {
        this.hasMore = value;
    }

}
