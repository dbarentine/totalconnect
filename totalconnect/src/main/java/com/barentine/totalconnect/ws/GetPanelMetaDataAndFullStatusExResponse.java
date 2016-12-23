
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
 *         &lt;element name="GetPanelMetaDataAndFullStatusExResult" type="{https://services.alarmnet.com/TC2/}PanelMetadataAndStatusResultsEx" minOccurs="0"/>
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
    "getPanelMetaDataAndFullStatusExResult"
})
@XmlRootElement(name = "GetPanelMetaDataAndFullStatusExResponse")
public class GetPanelMetaDataAndFullStatusExResponse {

    @XmlElement(name = "GetPanelMetaDataAndFullStatusExResult")
    protected PanelMetadataAndStatusResultsEx getPanelMetaDataAndFullStatusExResult;

    /**
     * Gets the value of the getPanelMetaDataAndFullStatusExResult property.
     * 
     * @return
     *     possible object is
     *     {@link PanelMetadataAndStatusResultsEx }
     *     
     */
    public PanelMetadataAndStatusResultsEx getGetPanelMetaDataAndFullStatusExResult() {
        return getPanelMetaDataAndFullStatusExResult;
    }

    /**
     * Sets the value of the getPanelMetaDataAndFullStatusExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelMetadataAndStatusResultsEx }
     *     
     */
    public void setGetPanelMetaDataAndFullStatusExResult(PanelMetadataAndStatusResultsEx value) {
        this.getPanelMetaDataAndFullStatusExResult = value;
    }

}
