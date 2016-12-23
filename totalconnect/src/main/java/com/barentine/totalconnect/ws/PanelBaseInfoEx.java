
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelBaseInfoEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelBaseInfoEx">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}PanelBaseInfo">
 *       &lt;attribute name="SyncSecDeviceFlag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelBaseInfoEx")
@XmlSeeAlso({
    PanelStatusInfoExV1 .class,
    PanelMetadataAndStatusInfoExV1 .class,
    PanelMetadataAndStatusInfoEx.class,
    PanelStatusInfoEx.class
})
public abstract class PanelBaseInfoEx
    extends PanelBaseInfo
{

    @XmlAttribute(name = "SyncSecDeviceFlag", required = true)
    protected boolean syncSecDeviceFlag;

    /**
     * Gets the value of the syncSecDeviceFlag property.
     * 
     */
    public boolean isSyncSecDeviceFlag() {
        return syncSecDeviceFlag;
    }

    /**
     * Sets the value of the syncSecDeviceFlag property.
     * 
     */
    public void setSyncSecDeviceFlag(boolean value) {
        this.syncSecDeviceFlag = value;
    }

}
