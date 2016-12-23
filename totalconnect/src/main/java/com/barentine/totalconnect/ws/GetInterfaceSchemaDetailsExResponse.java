
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
 *         &lt;element name="GetInterfaceSchemaDetailsExResult" type="{https://services.alarmnet.com/TC2/}InterfaceSchemaResultsEx" minOccurs="0"/>
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
    "getInterfaceSchemaDetailsExResult"
})
@XmlRootElement(name = "GetInterfaceSchemaDetailsExResponse")
public class GetInterfaceSchemaDetailsExResponse {

    @XmlElement(name = "GetInterfaceSchemaDetailsExResult")
    protected InterfaceSchemaResultsEx getInterfaceSchemaDetailsExResult;

    /**
     * Gets the value of the getInterfaceSchemaDetailsExResult property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceSchemaResultsEx }
     *     
     */
    public InterfaceSchemaResultsEx getGetInterfaceSchemaDetailsExResult() {
        return getInterfaceSchemaDetailsExResult;
    }

    /**
     * Sets the value of the getInterfaceSchemaDetailsExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceSchemaResultsEx }
     *     
     */
    public void setGetInterfaceSchemaDetailsExResult(InterfaceSchemaResultsEx value) {
        this.getInterfaceSchemaDetailsExResult = value;
    }

}
