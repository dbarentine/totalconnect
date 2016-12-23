
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
 *         &lt;element name="ExecuteASceneResult" type="{https://services.alarmnet.com/TC2/}ExecuteASceneResults" minOccurs="0"/>
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
    "executeASceneResult"
})
@XmlRootElement(name = "ExecuteASceneResponse")
public class ExecuteASceneResponse {

    @XmlElement(name = "ExecuteASceneResult")
    protected ExecuteASceneResults executeASceneResult;

    /**
     * Gets the value of the executeASceneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteASceneResults }
     *     
     */
    public ExecuteASceneResults getExecuteASceneResult() {
        return executeASceneResult;
    }

    /**
     * Sets the value of the executeASceneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteASceneResults }
     *     
     */
    public void setExecuteASceneResult(ExecuteASceneResults value) {
        this.executeASceneResult = value;
    }

}
