
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventMetaDataResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventMetaDataResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="EventClassCollection" type="{https://services.alarmnet.com/TC2/}ArrayOfEventClassInfo" minOccurs="0"/>
 *         &lt;element name="IsSecurityUpdateRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventMetaDataResults", propOrder = {
    "eventClassCollection",
    "isSecurityUpdateRequired"
})
public class EventMetaDataResults
    extends WebMethodResults
{

    @XmlElement(name = "EventClassCollection")
    protected ArrayOfEventClassInfo eventClassCollection;
    @XmlElement(name = "IsSecurityUpdateRequired")
    protected boolean isSecurityUpdateRequired;

    /**
     * Gets the value of the eventClassCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventClassInfo }
     *     
     */
    public ArrayOfEventClassInfo getEventClassCollection() {
        return eventClassCollection;
    }

    /**
     * Sets the value of the eventClassCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventClassInfo }
     *     
     */
    public void setEventClassCollection(ArrayOfEventClassInfo value) {
        this.eventClassCollection = value;
    }

    /**
     * Gets the value of the isSecurityUpdateRequired property.
     * 
     */
    public boolean isIsSecurityUpdateRequired() {
        return isSecurityUpdateRequired;
    }

    /**
     * Sets the value of the isSecurityUpdateRequired property.
     * 
     */
    public void setIsSecurityUpdateRequired(boolean value) {
        this.isSecurityUpdateRequired = value;
    }

}
