
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WAPClientsListResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WAPClientsListResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="WAPClients" type="{https://services.alarmnet.com/TC2/}ArrayOfCameraSignalStrength" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WAPClientsListResults", propOrder = {
    "wapClients"
})
public class WAPClientsListResults
    extends WebMethodResults
{

    @XmlElement(name = "WAPClients")
    protected ArrayOfCameraSignalStrength wapClients;

    /**
     * Gets the value of the wapClients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCameraSignalStrength }
     *     
     */
    public ArrayOfCameraSignalStrength getWAPClients() {
        return wapClients;
    }

    /**
     * Sets the value of the wapClients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCameraSignalStrength }
     *     
     */
    public void setWAPClients(ArrayOfCameraSignalStrength value) {
        this.wapClients = value;
    }

}
