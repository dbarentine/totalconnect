
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSmartActionListResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSmartActionListResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="SmartActions" type="{https://services.alarmnet.com/TC2/}ArrayOfSmartAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSmartActionListResults", propOrder = {
    "smartActions"
})
public class GetSmartActionListResults
    extends WebMethodResults
{

    @XmlElement(name = "SmartActions")
    protected ArrayOfSmartAction smartActions;

    /**
     * Gets the value of the smartActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmartAction }
     *     
     */
    public ArrayOfSmartAction getSmartActions() {
        return smartActions;
    }

    /**
     * Sets the value of the smartActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmartAction }
     *     
     */
    public void setSmartActions(ArrayOfSmartAction value) {
        this.smartActions = value;
    }

}
