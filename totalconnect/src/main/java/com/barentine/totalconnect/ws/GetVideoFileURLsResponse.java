
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
 *         &lt;element name="GetVideoFileURLsResult" type="{https://services.alarmnet.com/TC2/}VideoFileURLResult" minOccurs="0"/>
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
    "getVideoFileURLsResult"
})
@XmlRootElement(name = "GetVideoFileURLsResponse")
public class GetVideoFileURLsResponse {

    @XmlElement(name = "GetVideoFileURLsResult")
    protected VideoFileURLResult getVideoFileURLsResult;

    /**
     * Gets the value of the getVideoFileURLsResult property.
     * 
     * @return
     *     possible object is
     *     {@link VideoFileURLResult }
     *     
     */
    public VideoFileURLResult getGetVideoFileURLsResult() {
        return getVideoFileURLsResult;
    }

    /**
     * Sets the value of the getVideoFileURLsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoFileURLResult }
     *     
     */
    public void setGetVideoFileURLsResult(VideoFileURLResult value) {
        this.getVideoFileURLsResult = value;
    }

}
