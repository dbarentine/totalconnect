
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
 *         &lt;element name="GetAllLocationCameraListResult" type="{https://services.alarmnet.com/TC2/}AllCameraListResult" minOccurs="0"/>
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
    "getAllLocationCameraListResult"
})
@XmlRootElement(name = "GetAllLocationCameraListResponse")
public class GetAllLocationCameraListResponse {

    @XmlElement(name = "GetAllLocationCameraListResult")
    protected AllCameraListResult getAllLocationCameraListResult;

    /**
     * Gets the value of the getAllLocationCameraListResult property.
     * 
     * @return
     *     possible object is
     *     {@link AllCameraListResult }
     *     
     */
    public AllCameraListResult getGetAllLocationCameraListResult() {
        return getAllLocationCameraListResult;
    }

    /**
     * Sets the value of the getAllLocationCameraListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllCameraListResult }
     *     
     */
    public void setGetAllLocationCameraListResult(AllCameraListResult value) {
        this.getAllLocationCameraListResult = value;
    }

}
