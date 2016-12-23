
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraFirmwareListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraFirmwareListResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="FirmwareList" type="{https://services.alarmnet.com/TC2/}CameraFirmwareList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraFirmwareListResult", propOrder = {
    "firmwareList"
})
public class CameraFirmwareListResult
    extends WebMethodResults
{

    @XmlElement(name = "FirmwareList")
    protected CameraFirmwareList firmwareList;

    /**
     * Gets the value of the firmwareList property.
     * 
     * @return
     *     possible object is
     *     {@link CameraFirmwareList }
     *     
     */
    public CameraFirmwareList getFirmwareList() {
        return firmwareList;
    }

    /**
     * Sets the value of the firmwareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraFirmwareList }
     *     
     */
    public void setFirmwareList(CameraFirmwareList value) {
        this.firmwareList = value;
    }

}
