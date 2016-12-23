
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
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AppVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "userName",
    "appID",
    "appVersion",
    "clientName",
    "clientOS",
    "userMessage"
})
@XmlRootElement(name = "SubmitUserFeedback")
public class SubmitUserFeedback {

    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "AppID")
    protected long appID;
    @XmlElement(name = "AppVersion")
    protected String appVersion;
    @XmlElement(name = "ClientName")
    protected String clientName;
    @XmlElement(name = "ClientOS")
    protected String clientOS;
    @XmlElement(name = "UserMessage")
    protected String userMessage;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the appID property.
     * 
     */
    public long getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     */
    public void setAppID(long value) {
        this.appID = value;
    }

    /**
     * Gets the value of the appVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * Sets the value of the appVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppVersion(String value) {
        this.appVersion = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the clientOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientOS() {
        return clientOS;
    }

    /**
     * Sets the value of the clientOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientOS(String value) {
        this.clientOS = value;
    }

    /**
     * Gets the value of the userMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMessage() {
        return userMessage;
    }

    /**
     * Sets the value of the userMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMessage(String value) {
        this.userMessage = value;
    }

}
