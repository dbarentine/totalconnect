
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WiFiLockInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WiFiLockInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LockID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockConfiguration" type="{https://services.alarmnet.com/TC2/}WiFiLockConfigInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiLockInfo", propOrder = {
    "lockID",
    "lockName",
    "lockStatus",
    "lockConfiguration"
})
public class WiFiLockInfo {

    @XmlElement(name = "LockID")
    protected String lockID;
    @XmlElement(name = "LockName")
    protected String lockName;
    @XmlElement(name = "LockStatus")
    protected String lockStatus;
    @XmlElement(name = "LockConfiguration")
    protected WiFiLockConfigInfo lockConfiguration;

    /**
     * Gets the value of the lockID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockID() {
        return lockID;
    }

    /**
     * Sets the value of the lockID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockID(String value) {
        this.lockID = value;
    }

    /**
     * Gets the value of the lockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockName() {
        return lockName;
    }

    /**
     * Sets the value of the lockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockName(String value) {
        this.lockName = value;
    }

    /**
     * Gets the value of the lockStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockStatus() {
        return lockStatus;
    }

    /**
     * Sets the value of the lockStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockStatus(String value) {
        this.lockStatus = value;
    }

    /**
     * Gets the value of the lockConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link WiFiLockConfigInfo }
     *     
     */
    public WiFiLockConfigInfo getLockConfiguration() {
        return lockConfiguration;
    }

    /**
     * Sets the value of the lockConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link WiFiLockConfigInfo }
     *     
     */
    public void setLockConfiguration(WiFiLockConfigInfo value) {
        this.lockConfiguration = value;
    }

}
