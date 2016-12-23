
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelMetadataAndStatusResultsEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelMetadataAndStatusResultsEx">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="PanelMetadataAndStatus" type="{https://services.alarmnet.com/TC2/}PanelMetadataAndStatusInfoEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelMetadataAndStatusResultsEx", propOrder = {
    "panelMetadataAndStatus"
})
public class PanelMetadataAndStatusResultsEx
    extends WebMethodResults
{

    @XmlElement(name = "PanelMetadataAndStatus")
    protected PanelMetadataAndStatusInfoEx panelMetadataAndStatus;

    /**
     * Gets the value of the panelMetadataAndStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PanelMetadataAndStatusInfoEx }
     *     
     */
    public PanelMetadataAndStatusInfoEx getPanelMetadataAndStatus() {
        return panelMetadataAndStatus;
    }

    /**
     * Sets the value of the panelMetadataAndStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelMetadataAndStatusInfoEx }
     *     
     */
    public void setPanelMetadataAndStatus(PanelMetadataAndStatusInfoEx value) {
        this.panelMetadataAndStatus = value;
    }

}
