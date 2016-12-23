
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
 *         &lt;element name="GetVideoFileURLsExResult" type="{https://services.alarmnet.com/TC2/}VideoFileURLExResult" minOccurs="0"/>
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
    "getVideoFileURLsExResult"
})
@XmlRootElement(name = "GetVideoFileURLsExResponse")
public class GetVideoFileURLsExResponse {

    @XmlElement(name = "GetVideoFileURLsExResult")
    protected VideoFileURLExResult getVideoFileURLsExResult;

    /**
     * Gets the value of the getVideoFileURLsExResult property.
     * 
     * @return
     *     possible object is
     *     {@link VideoFileURLExResult }
     *     
     */
    public VideoFileURLExResult getGetVideoFileURLsExResult() {
        return getVideoFileURLsExResult;
    }

    /**
     * Sets the value of the getVideoFileURLsExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoFileURLExResult }
     *     
     */
    public void setGetVideoFileURLsExResult(VideoFileURLExResult value) {
        this.getVideoFileURLsExResult = value;
    }

}
