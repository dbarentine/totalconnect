
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
 *         &lt;element name="GetUsersResult" type="{https://services.alarmnet.com/TC2/}UserConfigurationResults" minOccurs="0"/>
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
    "getUsersResult"
})
@XmlRootElement(name = "GetUsersResponse")
public class GetUsersResponse {

    @XmlElement(name = "GetUsersResult")
    protected UserConfigurationResults getUsersResult;

    /**
     * Gets the value of the getUsersResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserConfigurationResults }
     *     
     */
    public UserConfigurationResults getGetUsersResult() {
        return getUsersResult;
    }

    /**
     * Sets the value of the getUsersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserConfigurationResults }
     *     
     */
    public void setGetUsersResult(UserConfigurationResults value) {
        this.getUsersResult = value;
    }

}
