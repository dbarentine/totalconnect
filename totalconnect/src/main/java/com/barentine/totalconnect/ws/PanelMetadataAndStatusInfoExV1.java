
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelMetadataAndStatusInfoEx_V1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelMetadataAndStatusInfoEx_V1">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}PanelBaseInfoEx">
 *       &lt;sequence>
 *         &lt;element name="Zones" type="{https://services.alarmnet.com/TC2/}ArrayOfZoneInfoEx" minOccurs="0"/>
 *         &lt;element name="PromptForImportSecuritySettings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelMetadataAndStatusInfoEx_V1", propOrder = {
    "zones",
    "promptForImportSecuritySettings"
})
public class PanelMetadataAndStatusInfoExV1
    extends PanelBaseInfoEx
{

    @XmlElement(name = "Zones")
    protected ArrayOfZoneInfoEx zones;
    @XmlElement(name = "PromptForImportSecuritySettings")
    protected boolean promptForImportSecuritySettings;

    /**
     * Gets the value of the zones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfZoneInfoEx }
     *     
     */
    public ArrayOfZoneInfoEx getZones() {
        return zones;
    }

    /**
     * Sets the value of the zones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfZoneInfoEx }
     *     
     */
    public void setZones(ArrayOfZoneInfoEx value) {
        this.zones = value;
    }

    /**
     * Gets the value of the promptForImportSecuritySettings property.
     * 
     */
    public boolean isPromptForImportSecuritySettings() {
        return promptForImportSecuritySettings;
    }

    /**
     * Sets the value of the promptForImportSecuritySettings property.
     * 
     */
    public void setPromptForImportSecuritySettings(boolean value) {
        this.promptForImportSecuritySettings = value;
    }

}
