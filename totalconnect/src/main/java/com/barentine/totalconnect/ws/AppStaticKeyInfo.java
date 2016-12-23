
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppStaticKeyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppStaticKeyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppStaticKeyID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AppStaticKeyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppStaticKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppStaticKeyInfo", propOrder = {
    "appStaticKeyID",
    "appStaticKeyName",
    "appStaticKey",
    "additionalInfo"
})
public class AppStaticKeyInfo {

    @XmlElement(name = "AppStaticKeyID")
    protected int appStaticKeyID;
    @XmlElement(name = "AppStaticKeyName")
    protected String appStaticKeyName;
    @XmlElement(name = "AppStaticKey")
    protected String appStaticKey;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;

    /**
     * Gets the value of the appStaticKeyID property.
     * 
     */
    public int getAppStaticKeyID() {
        return appStaticKeyID;
    }

    /**
     * Sets the value of the appStaticKeyID property.
     * 
     */
    public void setAppStaticKeyID(int value) {
        this.appStaticKeyID = value;
    }

    /**
     * Gets the value of the appStaticKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStaticKeyName() {
        return appStaticKeyName;
    }

    /**
     * Sets the value of the appStaticKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStaticKeyName(String value) {
        this.appStaticKeyName = value;
    }

    /**
     * Gets the value of the appStaticKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStaticKey() {
        return appStaticKey;
    }

    /**
     * Sets the value of the appStaticKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStaticKey(String value) {
        this.appStaticKey = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

}
