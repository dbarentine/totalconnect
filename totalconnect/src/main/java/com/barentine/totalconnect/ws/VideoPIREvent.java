
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VideoPIREvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPIREvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventImageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImageDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ImageDateTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CaptureTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImageRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPIREvent", propOrder = {
    "eventID",
    "imageURL",
    "eventImageCount",
    "imageDateTime",
    "imageDateTimeUTC",
    "captureTypeID",
    "imageRequestID"
})
public class VideoPIREvent {

    @XmlElement(name = "EventID")
    protected long eventID;
    @XmlElement(name = "ImageURL")
    protected String imageURL;
    @XmlElement(name = "EventImageCount")
    protected int eventImageCount;
    @XmlElement(name = "ImageDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar imageDateTime;
    @XmlElement(name = "ImageDateTimeUTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar imageDateTimeUTC;
    @XmlElement(name = "CaptureTypeID")
    protected int captureTypeID;
    @XmlElement(name = "ImageRequestID")
    protected String imageRequestID;

    /**
     * Gets the value of the eventID property.
     * 
     */
    public long getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     */
    public void setEventID(long value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    /**
     * Gets the value of the eventImageCount property.
     * 
     */
    public int getEventImageCount() {
        return eventImageCount;
    }

    /**
     * Sets the value of the eventImageCount property.
     * 
     */
    public void setEventImageCount(int value) {
        this.eventImageCount = value;
    }

    /**
     * Gets the value of the imageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImageDateTime() {
        return imageDateTime;
    }

    /**
     * Sets the value of the imageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImageDateTime(XMLGregorianCalendar value) {
        this.imageDateTime = value;
    }

    /**
     * Gets the value of the imageDateTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImageDateTimeUTC() {
        return imageDateTimeUTC;
    }

    /**
     * Sets the value of the imageDateTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImageDateTimeUTC(XMLGregorianCalendar value) {
        this.imageDateTimeUTC = value;
    }

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
     * Gets the value of the imageRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageRequestID() {
        return imageRequestID;
    }

    /**
     * Sets the value of the imageRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageRequestID(String value) {
        this.imageRequestID = value;
    }

}
