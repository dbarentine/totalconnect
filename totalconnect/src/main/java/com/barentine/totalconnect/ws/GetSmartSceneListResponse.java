
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
 *         &lt;element name="GetSmartSceneListResult" type="{https://services.alarmnet.com/TC2/}GetScenesListResults" minOccurs="0"/>
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
    "getSmartSceneListResult"
})
@XmlRootElement(name = "GetSmartSceneListResponse")
public class GetSmartSceneListResponse {

    @XmlElement(name = "GetSmartSceneListResult")
    protected GetScenesListResults getSmartSceneListResult;

    /**
     * Gets the value of the getSmartSceneListResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetScenesListResults }
     *     
     */
    public GetScenesListResults getGetSmartSceneListResult() {
        return getSmartSceneListResult;
    }

    /**
     * Sets the value of the getSmartSceneListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetScenesListResults }
     *     
     */
    public void setGetSmartSceneListResult(GetScenesListResults value) {
        this.getSmartSceneListResult = value;
    }

}
