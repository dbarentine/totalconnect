
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
 *         &lt;element name="GetEnteredGPSGeofencesResult" type="{https://services.alarmnet.com/TC2/}GeofenceListResult" minOccurs="0"/>
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
    "getEnteredGPSGeofencesResult"
})
@XmlRootElement(name = "GetEnteredGPSGeofencesResponse")
public class GetEnteredGPSGeofencesResponse {

    @XmlElement(name = "GetEnteredGPSGeofencesResult")
    protected GeofenceListResult getEnteredGPSGeofencesResult;

    /**
     * Gets the value of the getEnteredGPSGeofencesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GeofenceListResult }
     *     
     */
    public GeofenceListResult getGetEnteredGPSGeofencesResult() {
        return getEnteredGPSGeofencesResult;
    }

    /**
     * Sets the value of the getEnteredGPSGeofencesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeofenceListResult }
     *     
     */
    public void setGetEnteredGPSGeofencesResult(GeofenceListResult value) {
        this.getEnteredGPSGeofencesResult = value;
    }

}
