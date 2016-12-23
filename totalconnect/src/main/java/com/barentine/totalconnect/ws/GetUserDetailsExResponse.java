
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
 *         &lt;element name="GetUserDetailsExResult" type="{https://services.alarmnet.com/TC2/}UserDetailsExResults" minOccurs="0"/>
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
    "getUserDetailsExResult"
})
@XmlRootElement(name = "GetUserDetailsExResponse")
public class GetUserDetailsExResponse {

    @XmlElement(name = "GetUserDetailsExResult")
    protected UserDetailsExResults getUserDetailsExResult;

    /**
     * Gets the value of the getUserDetailsExResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetailsExResults }
     *     
     */
    public UserDetailsExResults getGetUserDetailsExResult() {
        return getUserDetailsExResult;
    }

    /**
     * Sets the value of the getUserDetailsExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetailsExResults }
     *     
     */
    public void setGetUserDetailsExResult(UserDetailsExResults value) {
        this.getUserDetailsExResult = value;
    }

}
