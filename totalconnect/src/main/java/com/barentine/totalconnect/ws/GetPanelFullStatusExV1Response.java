
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
 *         &lt;element name="GetPanelFullStatusEx_V1Result" type="{https://services.alarmnet.com/TC2/}PanelStatusResultsEx_V1" minOccurs="0"/>
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
    "getPanelFullStatusExV1Result"
})
@XmlRootElement(name = "GetPanelFullStatusEx_V1Response")
public class GetPanelFullStatusExV1Response {

    @XmlElement(name = "GetPanelFullStatusEx_V1Result")
    protected PanelStatusResultsExV1 getPanelFullStatusExV1Result;

    /**
     * Gets the value of the getPanelFullStatusExV1Result property.
     * 
     * @return
     *     possible object is
     *     {@link PanelStatusResultsExV1 }
     *     
     */
    public PanelStatusResultsExV1 getGetPanelFullStatusExV1Result() {
        return getPanelFullStatusExV1Result;
    }

    /**
     * Sets the value of the getPanelFullStatusExV1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelStatusResultsExV1 }
     *     
     */
    public void setGetPanelFullStatusExV1Result(PanelStatusResultsExV1 value) {
        this.getPanelFullStatusExV1Result = value;
    }

}
