
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
 *         &lt;element name="GetPanelMetaDataAndFullStatusByDeviceIDResult" type="{https://services.alarmnet.com/TC2/}PanelMetadataAndStatusResults" minOccurs="0"/>
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
    "getPanelMetaDataAndFullStatusByDeviceIDResult"
})
@XmlRootElement(name = "GetPanelMetaDataAndFullStatusByDeviceIDResponse")
public class GetPanelMetaDataAndFullStatusByDeviceIDResponse {

    @XmlElement(name = "GetPanelMetaDataAndFullStatusByDeviceIDResult")
    protected PanelMetadataAndStatusResults getPanelMetaDataAndFullStatusByDeviceIDResult;

    /**
     * Gets the value of the getPanelMetaDataAndFullStatusByDeviceIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link PanelMetadataAndStatusResults }
     *     
     */
    public PanelMetadataAndStatusResults getGetPanelMetaDataAndFullStatusByDeviceIDResult() {
        return getPanelMetaDataAndFullStatusByDeviceIDResult;
    }

    /**
     * Sets the value of the getPanelMetaDataAndFullStatusByDeviceIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelMetadataAndStatusResults }
     *     
     */
    public void setGetPanelMetaDataAndFullStatusByDeviceIDResult(PanelMetadataAndStatusResults value) {
        this.getPanelMetaDataAndFullStatusByDeviceIDResult = value;
    }

}
