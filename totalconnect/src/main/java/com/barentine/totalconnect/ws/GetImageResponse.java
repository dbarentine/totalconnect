
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
 *         &lt;element name="GetImageResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "getImageResult"
})
@XmlRootElement(name = "GetImageResponse")
public class GetImageResponse {

    @XmlElement(name = "GetImageResult")
    protected byte[] getImageResult;

    /**
     * Gets the value of the getImageResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetImageResult() {
        return getImageResult;
    }

    /**
     * Sets the value of the getImageResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetImageResult(byte[] value) {
        this.getImageResult = value;
    }

}
