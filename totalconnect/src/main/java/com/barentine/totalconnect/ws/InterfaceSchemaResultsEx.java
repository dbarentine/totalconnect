
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterfaceSchemaResultsEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceSchemaResultsEx">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="InterfaceSchemaDetailsEx" type="{https://services.alarmnet.com/TC2/}InterfaceSchemaInfoEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceSchemaResultsEx", propOrder = {
    "interfaceSchemaDetailsEx"
})
public class InterfaceSchemaResultsEx
    extends WebMethodResults
{

    @XmlElement(name = "InterfaceSchemaDetailsEx")
    protected InterfaceSchemaInfoEx interfaceSchemaDetailsEx;

    /**
     * Gets the value of the interfaceSchemaDetailsEx property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceSchemaInfoEx }
     *     
     */
    public InterfaceSchemaInfoEx getInterfaceSchemaDetailsEx() {
        return interfaceSchemaDetailsEx;
    }

    /**
     * Sets the value of the interfaceSchemaDetailsEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceSchemaInfoEx }
     *     
     */
    public void setInterfaceSchemaDetailsEx(InterfaceSchemaInfoEx value) {
        this.interfaceSchemaDetailsEx = value;
    }

}
