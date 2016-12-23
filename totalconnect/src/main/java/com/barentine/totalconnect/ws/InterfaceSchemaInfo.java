
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterfaceSchemaInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceSchemaInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceSchemaID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SchemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebsiteURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HelpURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomHeaderMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomFooterMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiscellaneousAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailSenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SkinningEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceSchemaInfo", propOrder = {
    "interfaceSchemaID",
    "schemaName",
    "baseURL",
    "productName",
    "companyName",
    "companyPhoneNumber",
    "websiteURL",
    "logoURL",
    "helpURL",
    "customHeaderMessage",
    "customFooterMessage",
    "miscellaneousAttributes",
    "mailSenderName",
    "skinningEnabled"
})
@XmlSeeAlso({
    InterfaceSchemaInfoEx.class
})
public class InterfaceSchemaInfo {

    @XmlElement(name = "InterfaceSchemaID")
    protected int interfaceSchemaID;
    @XmlElement(name = "SchemaName")
    protected String schemaName;
    @XmlElement(name = "BaseURL")
    protected String baseURL;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "CompanyPhoneNumber")
    protected String companyPhoneNumber;
    @XmlElement(name = "WebsiteURL")
    protected String websiteURL;
    @XmlElement(name = "LogoURL")
    protected String logoURL;
    @XmlElement(name = "HelpURL")
    protected String helpURL;
    @XmlElement(name = "CustomHeaderMessage")
    protected String customHeaderMessage;
    @XmlElement(name = "CustomFooterMessage")
    protected String customFooterMessage;
    @XmlElement(name = "MiscellaneousAttributes")
    protected String miscellaneousAttributes;
    @XmlElement(name = "MailSenderName")
    protected String mailSenderName;
    @XmlElement(name = "SkinningEnabled")
    protected boolean skinningEnabled;

    /**
     * Gets the value of the interfaceSchemaID property.
     * 
     */
    public int getInterfaceSchemaID() {
        return interfaceSchemaID;
    }

    /**
     * Sets the value of the interfaceSchemaID property.
     * 
     */
    public void setInterfaceSchemaID(int value) {
        this.interfaceSchemaID = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    /**
     * Gets the value of the baseURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseURL() {
        return baseURL;
    }

    /**
     * Sets the value of the baseURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseURL(String value) {
        this.baseURL = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    /**
     * Sets the value of the companyPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPhoneNumber(String value) {
        this.companyPhoneNumber = value;
    }

    /**
     * Gets the value of the websiteURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsiteURL() {
        return websiteURL;
    }

    /**
     * Sets the value of the websiteURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsiteURL(String value) {
        this.websiteURL = value;
    }

    /**
     * Gets the value of the logoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoURL() {
        return logoURL;
    }

    /**
     * Sets the value of the logoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoURL(String value) {
        this.logoURL = value;
    }

    /**
     * Gets the value of the helpURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpURL() {
        return helpURL;
    }

    /**
     * Sets the value of the helpURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpURL(String value) {
        this.helpURL = value;
    }

    /**
     * Gets the value of the customHeaderMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomHeaderMessage() {
        return customHeaderMessage;
    }

    /**
     * Sets the value of the customHeaderMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomHeaderMessage(String value) {
        this.customHeaderMessage = value;
    }

    /**
     * Gets the value of the customFooterMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomFooterMessage() {
        return customFooterMessage;
    }

    /**
     * Sets the value of the customFooterMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomFooterMessage(String value) {
        this.customFooterMessage = value;
    }

    /**
     * Gets the value of the miscellaneousAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscellaneousAttributes() {
        return miscellaneousAttributes;
    }

    /**
     * Sets the value of the miscellaneousAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscellaneousAttributes(String value) {
        this.miscellaneousAttributes = value;
    }

    /**
     * Gets the value of the mailSenderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailSenderName() {
        return mailSenderName;
    }

    /**
     * Sets the value of the mailSenderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailSenderName(String value) {
        this.mailSenderName = value;
    }

    /**
     * Gets the value of the skinningEnabled property.
     * 
     */
    public boolean isSkinningEnabled() {
        return skinningEnabled;
    }

    /**
     * Sets the value of the skinningEnabled property.
     * 
     */
    public void setSkinningEnabled(boolean value) {
        this.skinningEnabled = value;
    }

}
