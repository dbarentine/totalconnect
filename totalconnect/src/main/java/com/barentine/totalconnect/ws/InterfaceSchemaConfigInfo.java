
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterfaceSchemaConfigInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceSchemaConfigInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppleDownloadURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AndroidDownloadURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatestSupportedAppVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceSchemaConfigInfo", propOrder = {
    "appleDownloadURL",
    "androidDownloadURL",
    "latestSupportedAppVersion"
})
public class InterfaceSchemaConfigInfo {

    @XmlElement(name = "AppleDownloadURL")
    protected String appleDownloadURL;
    @XmlElement(name = "AndroidDownloadURL")
    protected String androidDownloadURL;
    @XmlElement(name = "LatestSupportedAppVersion")
    protected String latestSupportedAppVersion;

    /**
     * Gets the value of the appleDownloadURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppleDownloadURL() {
        return appleDownloadURL;
    }

    /**
     * Sets the value of the appleDownloadURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppleDownloadURL(String value) {
        this.appleDownloadURL = value;
    }

    /**
     * Gets the value of the androidDownloadURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAndroidDownloadURL() {
        return androidDownloadURL;
    }

    /**
     * Sets the value of the androidDownloadURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAndroidDownloadURL(String value) {
        this.androidDownloadURL = value;
    }

    /**
     * Gets the value of the latestSupportedAppVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestSupportedAppVersion() {
        return latestSupportedAppVersion;
    }

    /**
     * Sets the value of the latestSupportedAppVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestSupportedAppVersion(String value) {
        this.latestSupportedAppVersion = value;
    }

}
