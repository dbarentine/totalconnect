
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EULAResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EULAResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="EULAS" type="{https://services.alarmnet.com/TC2/}ArrayOfEULA" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EULAResults", propOrder = {
    "eulas"
})
public class EULAResults
    extends WebMethodResults
{

    @XmlElement(name = "EULAS")
    protected ArrayOfEULA eulas;

    /**
     * Gets the value of the eulas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEULA }
     *     
     */
    public ArrayOfEULA getEULAS() {
        return eulas;
    }

    /**
     * Sets the value of the eulas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEULA }
     *     
     */
    public void setEULAS(ArrayOfEULA value) {
        this.eulas = value;
    }

}
