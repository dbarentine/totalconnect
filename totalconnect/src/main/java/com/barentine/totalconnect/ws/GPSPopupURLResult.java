
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GPSPopupURLResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GPSPopupURLResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="GPSPopupURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPSPopupURLResult", propOrder = {
    "gpsPopupURL"
})
public class GPSPopupURLResult
    extends WebMethodResults
{

    @XmlElement(name = "GPSPopupURL")
    protected String gpsPopupURL;

    /**
     * Gets the value of the gpsPopupURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPSPopupURL() {
        return gpsPopupURL;
    }

    /**
     * Sets the value of the gpsPopupURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPSPopupURL(String value) {
        this.gpsPopupURL = value;
    }

}
