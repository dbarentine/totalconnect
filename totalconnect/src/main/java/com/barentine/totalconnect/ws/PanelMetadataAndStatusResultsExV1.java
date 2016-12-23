
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelMetadataAndStatusResultsEx_V1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelMetadataAndStatusResultsEx_V1">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="PanelMetadataAndStatus" type="{https://services.alarmnet.com/TC2/}PanelMetadataAndStatusInfoEx_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelMetadataAndStatusResultsEx_V1", propOrder = {
    "panelMetadataAndStatus"
})
public class PanelMetadataAndStatusResultsExV1
    extends WebMethodResults
{

    @XmlElement(name = "PanelMetadataAndStatus")
    protected PanelMetadataAndStatusInfoExV1 panelMetadataAndStatus;

    /**
     * Gets the value of the panelMetadataAndStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PanelMetadataAndStatusInfoExV1 }
     *     
     */
    public PanelMetadataAndStatusInfoExV1 getPanelMetadataAndStatus() {
        return panelMetadataAndStatus;
    }

    /**
     * Sets the value of the panelMetadataAndStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelMetadataAndStatusInfoExV1 }
     *     
     */
    public void setPanelMetadataAndStatus(PanelMetadataAndStatusInfoExV1 value) {
        this.panelMetadataAndStatus = value;
    }

}
