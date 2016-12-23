
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SlideShowConfigInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlideShowConfigInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhotoList" type="{https://services.alarmnet.com/TC2/}ArrayOfContentPhotoInfo" minOccurs="0"/>
 *         &lt;element name="PhotoCountLeft" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlideShowConfigInfo", propOrder = {
    "photoList",
    "photoCountLeft"
})
public class SlideShowConfigInfo {

    @XmlElement(name = "PhotoList")
    protected ArrayOfContentPhotoInfo photoList;
    @XmlElement(name = "PhotoCountLeft")
    protected int photoCountLeft;

    /**
     * Gets the value of the photoList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContentPhotoInfo }
     *     
     */
    public ArrayOfContentPhotoInfo getPhotoList() {
        return photoList;
    }

    /**
     * Sets the value of the photoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContentPhotoInfo }
     *     
     */
    public void setPhotoList(ArrayOfContentPhotoInfo value) {
        this.photoList = value;
    }

    /**
     * Gets the value of the photoCountLeft property.
     * 
     */
    public int getPhotoCountLeft() {
        return photoCountLeft;
    }

    /**
     * Sets the value of the photoCountLeft property.
     * 
     */
    public void setPhotoCountLeft(int value) {
        this.photoCountLeft = value;
    }

}
