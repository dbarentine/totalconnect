
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EULATextResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EULATextResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="elText" type="{https://services.alarmnet.com/TC2/}EULAText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EULATextResults", propOrder = {
    "elText"
})
public class EULATextResults
    extends WebMethodResults
{

    protected EULAText elText;

    /**
     * Gets the value of the elText property.
     * 
     * @return
     *     possible object is
     *     {@link EULAText }
     *     
     */
    public EULAText getElText() {
        return elText;
    }

    /**
     * Sets the value of the elText property.
     * 
     * @param value
     *     allowed object is
     *     {@link EULAText }
     *     
     */
    public void setElText(EULAText value) {
        this.elText = value;
    }

}
