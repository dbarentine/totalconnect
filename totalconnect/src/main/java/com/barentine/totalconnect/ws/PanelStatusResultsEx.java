
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelStatusResultsEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelStatusResultsEx">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="PanelStatus" type="{https://services.alarmnet.com/TC2/}PanelStatusInfoEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelStatusResultsEx", propOrder = {
    "panelStatus"
})
public class PanelStatusResultsEx
    extends WebMethodResults
{

    @XmlElement(name = "PanelStatus")
    protected PanelStatusInfoEx panelStatus;

    /**
     * Gets the value of the panelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PanelStatusInfoEx }
     *     
     */
    public PanelStatusInfoEx getPanelStatus() {
        return panelStatus;
    }

    /**
     * Sets the value of the panelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelStatusInfoEx }
     *     
     */
    public void setPanelStatus(PanelStatusInfoEx value) {
        this.panelStatus = value;
    }

}
