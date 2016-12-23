
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
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Locale" type="{https://services.alarmnet.com/TC2/}LocationInfoSimple" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="dataChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="imageChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionId",
    "locale",
    "image",
    "dataChanged",
    "imageChanged",
    "alias"
})
@XmlRootElement(name = "SaveLocationSimple")
public class SaveLocationSimple {

    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "Locale")
    protected LocationInfoSimple locale;
    @XmlElement(name = "Image")
    protected byte[] image;
    protected boolean dataChanged;
    protected boolean imageChanged;
    @XmlElement(name = "Alias")
    protected String alias;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfoSimple }
     *     
     */
    public LocationInfoSimple getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfoSimple }
     *     
     */
    public void setLocale(LocationInfoSimple value) {
        this.locale = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

    /**
     * Gets the value of the dataChanged property.
     * 
     */
    public boolean isDataChanged() {
        return dataChanged;
    }

    /**
     * Sets the value of the dataChanged property.
     * 
     */
    public void setDataChanged(boolean value) {
        this.dataChanged = value;
    }

    /**
     * Gets the value of the imageChanged property.
     * 
     */
    public boolean isImageChanged() {
        return imageChanged;
    }

    /**
     * Sets the value of the imageChanged property.
     * 
     */
    public void setImageChanged(boolean value) {
        this.imageChanged = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

}
