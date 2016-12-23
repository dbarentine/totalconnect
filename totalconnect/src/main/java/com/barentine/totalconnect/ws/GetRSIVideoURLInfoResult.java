
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRSIVideoURLInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRSIVideoURLInfoResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="RSIVideoURLInfo" type="{https://services.alarmnet.com/TC2/}RSIVideoURLInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRSIVideoURLInfoResult", propOrder = {
    "rsiVideoURLInfo"
})
public class GetRSIVideoURLInfoResult
    extends WebMethodResults
{

    @XmlElement(name = "RSIVideoURLInfo")
    protected RSIVideoURLInfo rsiVideoURLInfo;

    /**
     * Gets the value of the rsiVideoURLInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RSIVideoURLInfo }
     *     
     */
    public RSIVideoURLInfo getRSIVideoURLInfo() {
        return rsiVideoURLInfo;
    }

    /**
     * Sets the value of the rsiVideoURLInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSIVideoURLInfo }
     *     
     */
    public void setRSIVideoURLInfo(RSIVideoURLInfo value) {
        this.rsiVideoURLInfo = value;
    }

}
