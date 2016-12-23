
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelConnectionStatusInfoResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelConnectionStatusInfoResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="PanelStatusInfo" type="{https://services.alarmnet.com/TC2/}ArrayOfPanelConnectionStatusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelConnectionStatusInfoResults", propOrder = {
    "panelStatusInfo"
})
public class PanelConnectionStatusInfoResults
    extends WebMethodResults
{

    @XmlElement(name = "PanelStatusInfo")
    protected ArrayOfPanelConnectionStatusInfo panelStatusInfo;

    /**
     * Gets the value of the panelStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPanelConnectionStatusInfo }
     *     
     */
    public ArrayOfPanelConnectionStatusInfo getPanelStatusInfo() {
        return panelStatusInfo;
    }

    /**
     * Sets the value of the panelStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPanelConnectionStatusInfo }
     *     
     */
    public void setPanelStatusInfo(ArrayOfPanelConnectionStatusInfo value) {
        this.panelStatusInfo = value;
    }

}
