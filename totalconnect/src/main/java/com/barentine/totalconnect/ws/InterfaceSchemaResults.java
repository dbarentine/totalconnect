
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterfaceSchemaResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceSchemaResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="InterfaceSchemaDetails" type="{https://services.alarmnet.com/TC2/}InterfaceSchemaInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceSchemaResults", propOrder = {
    "interfaceSchemaDetails"
})
public class InterfaceSchemaResults
    extends WebMethodResults
{

    @XmlElement(name = "InterfaceSchemaDetails")
    protected InterfaceSchemaInfo interfaceSchemaDetails;

    /**
     * Gets the value of the interfaceSchemaDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceSchemaInfo }
     *     
     */
    public InterfaceSchemaInfo getInterfaceSchemaDetails() {
        return interfaceSchemaDetails;
    }

    /**
     * Sets the value of the interfaceSchemaDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceSchemaInfo }
     *     
     */
    public void setInterfaceSchemaDetails(InterfaceSchemaInfo value) {
        this.interfaceSchemaDetails = value;
    }

}
