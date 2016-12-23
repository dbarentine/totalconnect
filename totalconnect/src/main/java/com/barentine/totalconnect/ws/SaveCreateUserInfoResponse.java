
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
 *         &lt;element name="SaveCreateUserInfoResult" type="{https://services.alarmnet.com/TC2/}SaveCreateUserInfoResults" minOccurs="0"/>
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
    "saveCreateUserInfoResult"
})
@XmlRootElement(name = "SaveCreateUserInfoResponse")
public class SaveCreateUserInfoResponse {

    @XmlElement(name = "SaveCreateUserInfoResult")
    protected SaveCreateUserInfoResults saveCreateUserInfoResult;

    /**
     * Gets the value of the saveCreateUserInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link SaveCreateUserInfoResults }
     *     
     */
    public SaveCreateUserInfoResults getSaveCreateUserInfoResult() {
        return saveCreateUserInfoResult;
    }

    /**
     * Sets the value of the saveCreateUserInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveCreateUserInfoResults }
     *     
     */
    public void setSaveCreateUserInfoResult(SaveCreateUserInfoResults value) {
        this.saveCreateUserInfoResult = value;
    }

}
