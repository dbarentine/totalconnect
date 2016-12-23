
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
 *         &lt;element name="GetSceneListResult" type="{https://services.alarmnet.com/TC2/}SceneListInfo" minOccurs="0"/>
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
    "getSceneListResult"
})
@XmlRootElement(name = "GetSceneListResponse")
public class GetSceneListResponse {

    @XmlElement(name = "GetSceneListResult")
    protected SceneListInfo getSceneListResult;

    /**
     * Gets the value of the getSceneListResult property.
     * 
     * @return
     *     possible object is
     *     {@link SceneListInfo }
     *     
     */
    public SceneListInfo getGetSceneListResult() {
        return getSceneListResult;
    }

    /**
     * Sets the value of the getSceneListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SceneListInfo }
     *     
     */
    public void setGetSceneListResult(SceneListInfo value) {
        this.getSceneListResult = value;
    }

}
