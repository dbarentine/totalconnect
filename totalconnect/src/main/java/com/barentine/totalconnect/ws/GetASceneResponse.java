
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
 *         &lt;element name="GetASceneResult" type="{https://services.alarmnet.com/TC2/}SceneDataResults" minOccurs="0"/>
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
    "getASceneResult"
})
@XmlRootElement(name = "GetASceneResponse")
public class GetASceneResponse {

    @XmlElement(name = "GetASceneResult")
    protected SceneDataResults getASceneResult;

    /**
     * Gets the value of the getASceneResult property.
     * 
     * @return
     *     possible object is
     *     {@link SceneDataResults }
     *     
     */
    public SceneDataResults getGetASceneResult() {
        return getASceneResult;
    }

    /**
     * Sets the value of the getASceneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SceneDataResults }
     *     
     */
    public void setGetASceneResult(SceneDataResults value) {
        this.getASceneResult = value;
    }

}
