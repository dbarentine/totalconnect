
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
 *         &lt;element name="DeleteASceneResult" type="{https://services.alarmnet.com/TC2/}SceneDeletionResults" minOccurs="0"/>
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
    "deleteASceneResult"
})
@XmlRootElement(name = "DeleteASceneResponse")
public class DeleteASceneResponse {

    @XmlElement(name = "DeleteASceneResult")
    protected SceneDeletionResults deleteASceneResult;

    /**
     * Gets the value of the deleteASceneResult property.
     * 
     * @return
     *     possible object is
     *     {@link SceneDeletionResults }
     *     
     */
    public SceneDeletionResults getDeleteASceneResult() {
        return deleteASceneResult;
    }

    /**
     * Sets the value of the deleteASceneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SceneDeletionResults }
     *     
     */
    public void setDeleteASceneResult(SceneDeletionResults value) {
        this.deleteASceneResult = value;
    }

}
