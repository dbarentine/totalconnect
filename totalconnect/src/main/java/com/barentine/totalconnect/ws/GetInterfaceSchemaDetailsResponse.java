
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetInterfaceSchemaDetailsResult" type="{https://services.alarmnet.com/TC2/}InterfaceSchemaResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getInterfaceSchemaDetailsResult"
})
@XmlRootElement(name = "GetInterfaceSchemaDetailsResponse")
public class GetInterfaceSchemaDetailsResponse {

    @XmlElement(name = "GetInterfaceSchemaDetailsResult")
    protected InterfaceSchemaResults getInterfaceSchemaDetailsResult;

    /**
     * Gets the value of the getInterfaceSchemaDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceSchemaResults }
     *     
     */
    public InterfaceSchemaResults getGetInterfaceSchemaDetailsResult() {
        return getInterfaceSchemaDetailsResult;
    }

    /**
     * Sets the value of the getInterfaceSchemaDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceSchemaResults }
     *     
     */
    public void setGetInterfaceSchemaDetailsResult(InterfaceSchemaResults value) {
        this.getInterfaceSchemaDetailsResult = value;
    }

}
