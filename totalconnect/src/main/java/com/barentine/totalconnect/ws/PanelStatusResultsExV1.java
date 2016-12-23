
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelStatusResultsEx_V1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelStatusResultsEx_V1">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="PanelStatus" type="{https://services.alarmnet.com/TC2/}PanelStatusInfoEx_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelStatusResultsEx_V1", propOrder = {
    "panelStatus"
})
public class PanelStatusResultsExV1
    extends WebMethodResults
{

    @XmlElement(name = "PanelStatus")
    protected PanelStatusInfoExV1 panelStatus;

    /**
     * Gets the value of the panelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PanelStatusInfoExV1 }
     *     
     */
    public PanelStatusInfoExV1 getPanelStatus() {
        return panelStatus;
    }

    /**
     * Sets the value of the panelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelStatusInfoExV1 }
     *     
     */
    public void setPanelStatus(PanelStatusInfoExV1 value) {
        this.panelStatus = value;
    }

}
