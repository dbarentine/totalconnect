
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoURLEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoURLEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="imageHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="videoType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="isValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoURLEx", propOrder = {
    "url",
    "imageWidth",
    "imageHeight",
    "videoType",
    "isValid"
})
public class VideoURLEx {

    @XmlElement(name = "URL")
    protected String url;
    protected int imageWidth;
    protected int imageHeight;
    protected short videoType;
    protected boolean isValid;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the imageWidth property.
     * 
     */
    public int getImageWidth() {
        return imageWidth;
    }

    /**
     * Sets the value of the imageWidth property.
     * 
     */
    public void setImageWidth(int value) {
        this.imageWidth = value;
    }

    /**
     * Gets the value of the imageHeight property.
     * 
     */
    public int getImageHeight() {
        return imageHeight;
    }

    /**
     * Sets the value of the imageHeight property.
     * 
     */
    public void setImageHeight(int value) {
        this.imageHeight = value;
    }

    /**
     * Gets the value of the videoType property.
     * 
     */
    public short getVideoType() {
        return videoType;
    }

    /**
     * Sets the value of the videoType property.
     * 
     */
    public void setVideoType(short value) {
        this.videoType = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     */
    public boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     */
    public void setIsValid(boolean value) {
        this.isValid = value;
    }

}
