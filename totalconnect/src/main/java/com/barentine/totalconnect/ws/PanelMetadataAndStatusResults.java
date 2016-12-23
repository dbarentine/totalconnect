
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelMetadataAndStatusResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelMetadataAndStatusResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="PanelMetadataAndStatus" type="{https://services.alarmnet.com/TC2/}PanelMetadataAndStatusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelMetadataAndStatusResults", propOrder = {
    "panelMetadataAndStatus"
})
public class PanelMetadataAndStatusResults
    extends WebMethodResults
{

    @XmlElement(name = "PanelMetadataAndStatus")
    protected PanelMetadataAndStatusInfo panelMetadataAndStatus;

    /**
     * Gets the value of the panelMetadataAndStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PanelMetadataAndStatusInfo }
     *     
     */
    public PanelMetadataAndStatusInfo getPanelMetadataAndStatus() {
        return panelMetadataAndStatus;
    }

    /**
     * Sets the value of the panelMetadataAndStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelMetadataAndStatusInfo }
     *     
     */
    public void setPanelMetadataAndStatus(PanelMetadataAndStatusInfo value) {
        this.panelMetadataAndStatus = value;
    }

}
