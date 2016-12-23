
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraSignalStrengthResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraSignalStrengthResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="SignalStrength" type="{https://services.alarmnet.com/TC2/}CameraSignalStrength" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraSignalStrengthResults", propOrder = {
    "signalStrength"
})
public class CameraSignalStrengthResults
    extends WebMethodResults
{

    @XmlElement(name = "SignalStrength")
    protected CameraSignalStrength signalStrength;

    /**
     * Gets the value of the signalStrength property.
     * 
     * @return
     *     possible object is
     *     {@link CameraSignalStrength }
     *     
     */
    public CameraSignalStrength getSignalStrength() {
        return signalStrength;
    }

    /**
     * Sets the value of the signalStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraSignalStrength }
     *     
     */
    public void setSignalStrength(CameraSignalStrength value) {
        this.signalStrength = value;
    }

}
