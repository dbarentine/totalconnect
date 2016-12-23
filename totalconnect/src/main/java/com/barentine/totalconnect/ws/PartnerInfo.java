
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartnerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PartnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerAPIKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenValidity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MaxDeviceSupported" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SetupStateID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CallbackURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DevicePermission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PartnerInfo", propOrder = {
    "partnerID",
    "partnerName",
    "partnerDescription",
    "clientID",
    "clientSecret",
    "partnerAPIKey",
    "accessToken",
    "tokenValidity",
    "maxDeviceSupported",
    "setupStateID",
    "callbackURL",
    "devicePermission",
    "additionalInfo"
})
public class PartnerInfo {

    @XmlElement(name = "PartnerID")
    protected int partnerID;
    @XmlElement(name = "PartnerName")
    protected String partnerName;
    @XmlElement(name = "PartnerDescription")
    protected String partnerDescription;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "ClientSecret")
    protected String clientSecret;
    @XmlElement(name = "PartnerAPIKey")
    protected String partnerAPIKey;
    @XmlElement(name = "AccessToken")
    protected String accessToken;
    @XmlElement(name = "TokenValidity")
    protected boolean tokenValidity;
    @XmlElement(name = "MaxDeviceSupported")
    protected int maxDeviceSupported;
    @XmlElement(name = "SetupStateID")
    protected short setupStateID;
    @XmlElement(name = "CallbackURL")
    protected String callbackURL;
    @XmlElement(name = "DevicePermission")
    protected String devicePermission;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;

    /**
     * Gets the value of the partnerID property.
     * 
     */
    public int getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     */
    public void setPartnerID(int value) {
        this.partnerID = value;
    }

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerName(String value) {
        this.partnerName = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerDescription(String value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the clientSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Sets the value of the clientSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSecret(String value) {
        this.clientSecret = value;
    }

    /**
     * Gets the value of the partnerAPIKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerAPIKey() {
        return partnerAPIKey;
    }

    /**
     * Sets the value of the partnerAPIKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerAPIKey(String value) {
        this.partnerAPIKey = value;
    }

    /**
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * Gets the value of the tokenValidity property.
     * 
     */
    public boolean isTokenValidity() {
        return tokenValidity;
    }

    /**
     * Sets the value of the tokenValidity property.
     * 
     */
    public void setTokenValidity(boolean value) {
        this.tokenValidity = value;
    }

    /**
     * Gets the value of the maxDeviceSupported property.
     * 
     */
    public int getMaxDeviceSupported() {
        return maxDeviceSupported;
    }

    /**
     * Sets the value of the maxDeviceSupported property.
     * 
     */
    public void setMaxDeviceSupported(int value) {
        this.maxDeviceSupported = value;
    }

    /**
     * Gets the value of the setupStateID property.
     * 
     */
    public short getSetupStateID() {
        return setupStateID;
    }

    /**
     * Sets the value of the setupStateID property.
     * 
     */
    public void setSetupStateID(short value) {
        this.setupStateID = value;
    }

    /**
     * Gets the value of the callbackURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackURL() {
        return callbackURL;
    }

    /**
     * Sets the value of the callbackURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackURL(String value) {
        this.callbackURL = value;
    }

    /**
     * Gets the value of the devicePermission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePermission() {
        return devicePermission;
    }

    /**
     * Sets the value of the devicePermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicePermission(String value) {
        this.devicePermission = value;
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
