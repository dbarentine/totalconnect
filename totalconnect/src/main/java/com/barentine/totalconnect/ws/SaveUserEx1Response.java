
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
 *         &lt;element name="SaveUserEx1Result" type="{https://services.alarmnet.com/TC2/}SaveUserResults" minOccurs="0"/>
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
    "saveUserEx1Result"
})
@XmlRootElement(name = "SaveUserEx1Response")
public class SaveUserEx1Response {

    @XmlElement(name = "SaveUserEx1Result")
    protected SaveUserResults saveUserEx1Result;

    /**
     * Gets the value of the saveUserEx1Result property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUserResults }
     *     
     */
    public SaveUserResults getSaveUserEx1Result() {
        return saveUserEx1Result;
    }

    /**
     * Sets the value of the saveUserEx1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUserResults }
     *     
     */
    public void setSaveUserEx1Result(SaveUserResults value) {
        this.saveUserEx1Result = value;
    }

}
