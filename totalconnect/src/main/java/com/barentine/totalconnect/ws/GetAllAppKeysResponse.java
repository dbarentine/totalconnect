
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
 *         &lt;element name="GetAllAppKeysResult" type="{https://services.alarmnet.com/TC2/}AppStaticKeyListInfo" minOccurs="0"/>
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
    "getAllAppKeysResult"
})
@XmlRootElement(name = "GetAllAppKeysResponse")
public class GetAllAppKeysResponse {

    @XmlElement(name = "GetAllAppKeysResult")
    protected AppStaticKeyListInfo getAllAppKeysResult;

    /**
     * Gets the value of the getAllAppKeysResult property.
     * 
     * @return
     *     possible object is
     *     {@link AppStaticKeyListInfo }
     *     
     */
    public AppStaticKeyListInfo getGetAllAppKeysResult() {
        return getAllAppKeysResult;
    }

    /**
     * Sets the value of the getAllAppKeysResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppStaticKeyListInfo }
     *     
     */
    public void setGetAllAppKeysResult(AppStaticKeyListInfo value) {
        this.getAllAppKeysResult = value;
    }

}
