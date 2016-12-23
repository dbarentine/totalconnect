
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GPSDevicesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GPSDevicesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="GPSDevices" type="{https://services.alarmnet.com/TC2/}ArrayOfGPSInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPSDevicesResult", propOrder = {
    "gpsDevices"
})
public class GPSDevicesResult
    extends WebMethodResults
{

    @XmlElement(name = "GPSDevices")
    protected ArrayOfGPSInfo gpsDevices;

    /**
     * Gets the value of the gpsDevices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGPSInfo }
     *     
     */
    public ArrayOfGPSInfo getGPSDevices() {
        return gpsDevices;
    }

    /**
     * Sets the value of the gpsDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGPSInfo }
     *     
     */
    public void setGPSDevices(ArrayOfGPSInfo value) {
        this.gpsDevices = value;
    }

}
