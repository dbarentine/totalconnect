
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
 *         &lt;element name="GetSlideShowPhotosResult" type="{https://services.alarmnet.com/TC2/}SlideShowPhotoResult" minOccurs="0"/>
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
    "getSlideShowPhotosResult"
})
@XmlRootElement(name = "GetSlideShowPhotosResponse")
public class GetSlideShowPhotosResponse {

    @XmlElement(name = "GetSlideShowPhotosResult")
    protected SlideShowPhotoResult getSlideShowPhotosResult;

    /**
     * Gets the value of the getSlideShowPhotosResult property.
     * 
     * @return
     *     possible object is
     *     {@link SlideShowPhotoResult }
     *     
     */
    public SlideShowPhotoResult getGetSlideShowPhotosResult() {
        return getSlideShowPhotosResult;
    }

    /**
     * Sets the value of the getSlideShowPhotosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlideShowPhotoResult }
     *     
     */
    public void setGetSlideShowPhotosResult(SlideShowPhotoResult value) {
        this.getSlideShowPhotosResult = value;
    }

}
