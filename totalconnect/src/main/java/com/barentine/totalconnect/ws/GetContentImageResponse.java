
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
 *         &lt;element name="GetContentImageResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "getContentImageResult"
})
@XmlRootElement(name = "GetContentImageResponse")
public class GetContentImageResponse {

    @XmlElement(name = "GetContentImageResult")
    protected byte[] getContentImageResult;

    /**
     * Gets the value of the getContentImageResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetContentImageResult() {
        return getContentImageResult;
    }

    /**
     * Sets the value of the getContentImageResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetContentImageResult(byte[] value) {
        this.getContentImageResult = value;
    }

}
