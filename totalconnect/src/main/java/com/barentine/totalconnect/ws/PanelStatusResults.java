
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelStatusResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelStatusResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="PanelStatus" type="{https://services.alarmnet.com/TC2/}PanelStatusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelStatusResults", propOrder = {
    "panelStatus"
})
public class PanelStatusResults
    extends WebMethodResults
{

    @XmlElement(name = "PanelStatus")
    protected PanelStatusInfo panelStatus;

    /**
     * Gets the value of the panelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PanelStatusInfo }
     *     
     */
    public PanelStatusInfo getPanelStatus() {
        return panelStatus;
    }

    /**
     * Sets the value of the panelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelStatusInfo }
     *     
     */
    public void setPanelStatus(PanelStatusInfo value) {
        this.panelStatus = value;
    }

}
