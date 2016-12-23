
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
 *         &lt;element name="GetPanelFullStatusByDeviceIDResult" type="{https://services.alarmnet.com/TC2/}PanelStatusResults" minOccurs="0"/>
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
    "getPanelFullStatusByDeviceIDResult"
})
@XmlRootElement(name = "GetPanelFullStatusByDeviceIDResponse")
public class GetPanelFullStatusByDeviceIDResponse {

    @XmlElement(name = "GetPanelFullStatusByDeviceIDResult")
    protected PanelStatusResults getPanelFullStatusByDeviceIDResult;

    /**
     * Gets the value of the getPanelFullStatusByDeviceIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link PanelStatusResults }
     *     
     */
    public PanelStatusResults getGetPanelFullStatusByDeviceIDResult() {
        return getPanelFullStatusByDeviceIDResult;
    }

    /**
     * Sets the value of the getPanelFullStatusByDeviceIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelStatusResults }
     *     
     */
    public void setGetPanelFullStatusByDeviceIDResult(PanelStatusResults value) {
        this.getPanelFullStatusByDeviceIDResult = value;
    }

}
