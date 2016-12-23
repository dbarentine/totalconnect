
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSIDeviceStatusResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSIDeviceStatusResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="RSIDeviceStatus" type="{https://services.alarmnet.com/TC2/}ArrayOfRSIDeviceStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSIDeviceStatusResults", propOrder = {
    "rsiDeviceStatus"
})
public class RSIDeviceStatusResults
    extends WebMethodResults
{

    @XmlElement(name = "RSIDeviceStatus")
    protected ArrayOfRSIDeviceStatus rsiDeviceStatus;

    /**
     * Gets the value of the rsiDeviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRSIDeviceStatus }
     *     
     */
    public ArrayOfRSIDeviceStatus getRSIDeviceStatus() {
        return rsiDeviceStatus;
    }

    /**
     * Sets the value of the rsiDeviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRSIDeviceStatus }
     *     
     */
    public void setRSIDeviceStatus(ArrayOfRSIDeviceStatus value) {
        this.rsiDeviceStatus = value;
    }

}
