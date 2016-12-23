
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
 *         &lt;element name="GetPanelFullStatusExResult" type="{https://services.alarmnet.com/TC2/}PanelStatusResultsEx" minOccurs="0"/>
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
    "getPanelFullStatusExResult"
})
@XmlRootElement(name = "GetPanelFullStatusExResponse")
public class GetPanelFullStatusExResponse {

    @XmlElement(name = "GetPanelFullStatusExResult")
    protected PanelStatusResultsEx getPanelFullStatusExResult;

    /**
     * Gets the value of the getPanelFullStatusExResult property.
     * 
     * @return
     *     possible object is
     *     {@link PanelStatusResultsEx }
     *     
     */
    public PanelStatusResultsEx getGetPanelFullStatusExResult() {
        return getPanelFullStatusExResult;
    }

    /**
     * Sets the value of the getPanelFullStatusExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelStatusResultsEx }
     *     
     */
    public void setGetPanelFullStatusExResult(PanelStatusResultsEx value) {
        this.getPanelFullStatusExResult = value;
    }

}
