
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraConfigurationResults2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraConfigurationResults2">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}CameraConfigurationResults">
 *       &lt;sequence>
 *         &lt;element name="LIMITS_Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraConfigurationResults2", propOrder = {
    "limitsData"
})
public class CameraConfigurationResults2
    extends CameraConfigurationResults
{

    @XmlElement(name = "LIMITS_Data")
    protected String limitsData;

    /**
     * Gets the value of the limitsData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIMITSData() {
        return limitsData;
    }

    /**
     * Sets the value of the limitsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIMITSData(String value) {
        this.limitsData = value;
    }

}
