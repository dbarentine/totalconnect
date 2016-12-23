
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
 *         &lt;element name="GetPanelMetaDataAndFullStatusResult" type="{https://services.alarmnet.com/TC2/}PanelMetadataAndStatusResults" minOccurs="0"/>
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
    "getPanelMetaDataAndFullStatusResult"
})
@XmlRootElement(name = "GetPanelMetaDataAndFullStatusResponse")
public class GetPanelMetaDataAndFullStatusResponse {

    @XmlElement(name = "GetPanelMetaDataAndFullStatusResult")
    protected PanelMetadataAndStatusResults getPanelMetaDataAndFullStatusResult;

    /**
     * Gets the value of the getPanelMetaDataAndFullStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link PanelMetadataAndStatusResults }
     *     
     */
    public PanelMetadataAndStatusResults getGetPanelMetaDataAndFullStatusResult() {
        return getPanelMetaDataAndFullStatusResult;
    }

    /**
     * Sets the value of the getPanelMetaDataAndFullStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelMetadataAndStatusResults }
     *     
     */
    public void setGetPanelMetaDataAndFullStatusResult(PanelMetadataAndStatusResults value) {
        this.getPanelMetaDataAndFullStatusResult = value;
    }

}
