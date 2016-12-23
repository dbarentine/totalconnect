
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
 *         &lt;element name="GetIndividualZoneDetailsResult" type="{https://services.alarmnet.com/TC2/}GetZoneInfoResults" minOccurs="0"/>
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
    "getIndividualZoneDetailsResult"
})
@XmlRootElement(name = "GetIndividualZoneDetailsResponse")
public class GetIndividualZoneDetailsResponse {

    @XmlElement(name = "GetIndividualZoneDetailsResult")
    protected GetZoneInfoResults getIndividualZoneDetailsResult;

    /**
     * Gets the value of the getIndividualZoneDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetZoneInfoResults }
     *     
     */
    public GetZoneInfoResults getGetIndividualZoneDetailsResult() {
        return getIndividualZoneDetailsResult;
    }

    /**
     * Sets the value of the getIndividualZoneDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetZoneInfoResults }
     *     
     */
    public void setGetIndividualZoneDetailsResult(GetZoneInfoResults value) {
        this.getIndividualZoneDetailsResult = value;
    }

}
