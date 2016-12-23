
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
 *         &lt;element name="GetPanelMetaDataAndFullStatusEx_V1Result" type="{https://services.alarmnet.com/TC2/}PanelMetadataAndStatusResultsEx_V1" minOccurs="0"/>
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
    "getPanelMetaDataAndFullStatusExV1Result"
})
@XmlRootElement(name = "GetPanelMetaDataAndFullStatusEx_V1Response")
public class GetPanelMetaDataAndFullStatusExV1Response {

    @XmlElement(name = "GetPanelMetaDataAndFullStatusEx_V1Result")
    protected PanelMetadataAndStatusResultsExV1 getPanelMetaDataAndFullStatusExV1Result;

    /**
     * Gets the value of the getPanelMetaDataAndFullStatusExV1Result property.
     * 
     * @return
     *     possible object is
     *     {@link PanelMetadataAndStatusResultsExV1 }
     *     
     */
    public PanelMetadataAndStatusResultsExV1 getGetPanelMetaDataAndFullStatusExV1Result() {
        return getPanelMetaDataAndFullStatusExV1Result;
    }

    /**
     * Sets the value of the getPanelMetaDataAndFullStatusExV1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelMetadataAndStatusResultsExV1 }
     *     
     */
    public void setGetPanelMetaDataAndFullStatusExV1Result(PanelMetadataAndStatusResultsExV1 value) {
        this.getPanelMetaDataAndFullStatusExV1Result = value;
    }

}
