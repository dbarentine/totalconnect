
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterfaceSchemaInfoEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceSchemaInfoEx">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}InterfaceSchemaInfo">
 *       &lt;sequence>
 *         &lt;element name="LoginURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppleDownloadURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AndroidDownloadURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlackBerryDownloadURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceSchemaInfoEx", propOrder = {
    "loginURL",
    "supportPhoneNumber",
    "companyEmailAddress",
    "appleDownloadURL",
    "androidDownloadURL",
    "blackBerryDownloadURL"
})
public class InterfaceSchemaInfoEx
    extends InterfaceSchemaInfo
{

    @XmlElement(name = "LoginURL")
    protected String loginURL;
    @XmlElement(name = "SupportPhoneNumber")
    protected String supportPhoneNumber;
    @XmlElement(name = "CompanyEmailAddress")
    protected String companyEmailAddress;
    @XmlElement(name = "AppleDownloadURL")
    protected String appleDownloadURL;
    @XmlElement(name = "AndroidDownloadURL")
    protected String androidDownloadURL;
    @XmlElement(name = "BlackBerryDownloadURL")
    protected String blackBerryDownloadURL;

    /**
     * Gets the value of the loginURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginURL() {
        return loginURL;
    }

    /**
     * Sets the value of the loginURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginURL(String value) {
        this.loginURL = value;
    }

    /**
     * Gets the value of the supportPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportPhoneNumber() {
        return supportPhoneNumber;
    }

    /**
     * Sets the value of the supportPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportPhoneNumber(String value) {
        this.supportPhoneNumber = value;
    }

    /**
     * Gets the value of the companyEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyEmailAddress() {
        return companyEmailAddress;
    }

    /**
     * Sets the value of the companyEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyEmailAddress(String value) {
        this.companyEmailAddress = value;
    }

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
     * Gets the value of the blackBerryDownloadURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackBerryDownloadURL() {
        return blackBerryDownloadURL;
    }

    /**
     * Sets the value of the blackBerryDownloadURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackBerryDownloadURL(String value) {
        this.blackBerryDownloadURL = value;
    }

}
