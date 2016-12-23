
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnythingChangedResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnythingChangedResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="MethodCodes" type="{https://services.alarmnet.com/TC2/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnythingChangedResults", propOrder = {
    "methodCodes"
})
public class AnythingChangedResults
    extends WebMethodResults
{

    @XmlElement(name = "MethodCodes")
    protected ArrayOfString methodCodes;

    /**
     * Gets the value of the methodCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getMethodCodes() {
        return methodCodes;
    }

    /**
     * Sets the value of the methodCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setMethodCodes(ArrayOfString value) {
        this.methodCodes = value;
    }

}
