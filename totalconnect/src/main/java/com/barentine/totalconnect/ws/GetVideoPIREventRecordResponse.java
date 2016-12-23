
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
 *         &lt;element name="GetVideoPIREventRecordResult" type="{https://services.alarmnet.com/TC2/}GetVideoPIREventRecordResults" minOccurs="0"/>
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
    "getVideoPIREventRecordResult"
})
@XmlRootElement(name = "GetVideoPIREventRecordResponse")
public class GetVideoPIREventRecordResponse {

    @XmlElement(name = "GetVideoPIREventRecordResult")
    protected GetVideoPIREventRecordResults getVideoPIREventRecordResult;

    /**
     * Gets the value of the getVideoPIREventRecordResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetVideoPIREventRecordResults }
     *     
     */
    public GetVideoPIREventRecordResults getGetVideoPIREventRecordResult() {
        return getVideoPIREventRecordResult;
    }

    /**
     * Sets the value of the getVideoPIREventRecordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVideoPIREventRecordResults }
     *     
     */
    public void setGetVideoPIREventRecordResult(GetVideoPIREventRecordResults value) {
        this.getVideoPIREventRecordResult = value;
    }

}
