
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSimpleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationSimpleResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="LocationInfoSimple" type="{https://services.alarmnet.com/TC2/}LocationInfoSimple" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationSimpleResult", propOrder = {
    "locationInfoSimple"
})
public class LocationSimpleResult
    extends WebMethodResults
{

    @XmlElement(name = "LocationInfoSimple")
    protected LocationInfoSimple locationInfoSimple;

    /**
     * Gets the value of the locationInfoSimple property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfoSimple }
     *     
     */
    public LocationInfoSimple getLocationInfoSimple() {
        return locationInfoSimple;
    }

    /**
     * Sets the value of the locationInfoSimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfoSimple }
     *     
     */
    public void setLocationInfoSimple(LocationInfoSimple value) {
        this.locationInfoSimple = value;
    }

}
