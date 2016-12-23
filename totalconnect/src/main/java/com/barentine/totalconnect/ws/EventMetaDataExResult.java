
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventMetaDataExResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventMetaDataExResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="EventClassCollection" type="{https://services.alarmnet.com/TC2/}ArrayOfEventClass" minOccurs="0"/>
 *         &lt;element name="LocationLimitations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationCameraList" type="{https://services.alarmnet.com/TC2/}ArrayOfCameraSimple" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventMetaDataExResult", propOrder = {
    "eventClassCollection",
    "locationLimitations",
    "locationCameraList"
})
public class EventMetaDataExResult
    extends WebMethodResults
{

    @XmlElement(name = "EventClassCollection")
    protected ArrayOfEventClass eventClassCollection;
    @XmlElement(name = "LocationLimitations")
    protected String locationLimitations;
    @XmlElement(name = "LocationCameraList")
    protected ArrayOfCameraSimple locationCameraList;

    /**
     * Gets the value of the eventClassCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventClass }
     *     
     */
    public ArrayOfEventClass getEventClassCollection() {
        return eventClassCollection;
    }

    /**
     * Sets the value of the eventClassCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventClass }
     *     
     */
    public void setEventClassCollection(ArrayOfEventClass value) {
        this.eventClassCollection = value;
    }

    /**
     * Gets the value of the locationLimitations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationLimitations() {
        return locationLimitations;
    }

    /**
     * Sets the value of the locationLimitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationLimitations(String value) {
        this.locationLimitations = value;
    }

    /**
     * Gets the value of the locationCameraList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCameraSimple }
     *     
     */
    public ArrayOfCameraSimple getLocationCameraList() {
        return locationCameraList;
    }

    /**
     * Sets the value of the locationCameraList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCameraSimple }
     *     
     */
    public void setLocationCameraList(ArrayOfCameraSimple value) {
        this.locationCameraList = value;
    }

}
