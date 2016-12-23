
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoPIREventCaptureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPIREventCaptureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaptureTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CaptureTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPIREventCaptureType", propOrder = {
    "captureTypeID",
    "captureTypeDescription"
})
public class VideoPIREventCaptureType {

    @XmlElement(name = "CaptureTypeID")
    protected int captureTypeID;
    @XmlElement(name = "CaptureTypeDescription")
    protected String captureTypeDescription;

    /**
     * Gets the value of the captureTypeID property.
     * 
     */
    public int getCaptureTypeID() {
        return captureTypeID;
    }

    /**
     * Sets the value of the captureTypeID property.
     * 
     */
    public void setCaptureTypeID(int value) {
        this.captureTypeID = value;
    }

    /**
     * Gets the value of the captureTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureTypeDescription() {
        return captureTypeDescription;
    }

    /**
     * Sets the value of the captureTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureTypeDescription(String value) {
        this.captureTypeDescription = value;
    }

}
