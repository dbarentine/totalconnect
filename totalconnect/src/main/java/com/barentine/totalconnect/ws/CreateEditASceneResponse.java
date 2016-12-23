
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
 *         &lt;element name="CreateEditASceneResult" type="{https://services.alarmnet.com/TC2/}CreateEditASceneResults" minOccurs="0"/>
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
    "createEditASceneResult"
})
@XmlRootElement(name = "CreateEditASceneResponse")
public class CreateEditASceneResponse {

    @XmlElement(name = "CreateEditASceneResult")
    protected CreateEditASceneResults createEditASceneResult;

    /**
     * Gets the value of the createEditASceneResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateEditASceneResults }
     *     
     */
    public CreateEditASceneResults getCreateEditASceneResult() {
        return createEditASceneResult;
    }

    /**
     * Sets the value of the createEditASceneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateEditASceneResults }
     *     
     */
    public void setCreateEditASceneResult(CreateEditASceneResults value) {
        this.createEditASceneResult = value;
    }

}
