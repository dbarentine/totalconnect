
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
 *         &lt;element name="GetDoorBellClientIDResult" type="{https://services.alarmnet.com/TC2/}WebMethodResults" minOccurs="0"/>
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
    "getDoorBellClientIDResult"
})
@XmlRootElement(name = "GetDoorBellClientIDResponse")
public class GetDoorBellClientIDResponse {

    @XmlElement(name = "GetDoorBellClientIDResult")
    protected WebMethodResults getDoorBellClientIDResult;

    /**
     * Gets the value of the getDoorBellClientIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebMethodResults }
     *     
     */
    public WebMethodResults getGetDoorBellClientIDResult() {
        return getDoorBellClientIDResult;
    }

    /**
     * Sets the value of the getDoorBellClientIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebMethodResults }
     *     
     */
    public void setGetDoorBellClientIDResult(WebMethodResults value) {
        this.getDoorBellClientIDResult = value;
    }

}
