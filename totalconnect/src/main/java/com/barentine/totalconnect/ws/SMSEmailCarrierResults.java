
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMSEmailCarrierResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMSEmailCarrierResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="MobileCarriers" type="{https://services.alarmnet.com/TC2/}ArrayOfMobileCarrier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMSEmailCarrierResults", propOrder = {
    "mobileCarriers"
})
public class SMSEmailCarrierResults
    extends WebMethodResults
{

    @XmlElement(name = "MobileCarriers")
    protected ArrayOfMobileCarrier mobileCarriers;

    /**
     * Gets the value of the mobileCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMobileCarrier }
     *     
     */
    public ArrayOfMobileCarrier getMobileCarriers() {
        return mobileCarriers;
    }

    /**
     * Sets the value of the mobileCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMobileCarrier }
     *     
     */
    public void setMobileCarriers(ArrayOfMobileCarrier value) {
        this.mobileCarriers = value;
    }

}
