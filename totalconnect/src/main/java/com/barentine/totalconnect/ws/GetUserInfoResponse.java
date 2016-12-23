
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
 *         &lt;element name="GetUserInfoResult" type="{https://services.alarmnet.com/TC2/}UserInfoResults" minOccurs="0"/>
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
    "getUserInfoResult"
})
@XmlRootElement(name = "GetUserInfoResponse")
public class GetUserInfoResponse {

    @XmlElement(name = "GetUserInfoResult")
    protected UserInfoResults getUserInfoResult;

    /**
     * Gets the value of the getUserInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoResults }
     *     
     */
    public UserInfoResults getGetUserInfoResult() {
        return getUserInfoResult;
    }

    /**
     * Sets the value of the getUserInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoResults }
     *     
     */
    public void setGetUserInfoResult(UserInfoResults value) {
        this.getUserInfoResult = value;
    }

}
