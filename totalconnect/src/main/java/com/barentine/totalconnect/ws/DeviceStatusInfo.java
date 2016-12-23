
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lockInfo" type="{https://services.alarmnet.com/TC2/}LockStausInfo" minOccurs="0"/>
 *         &lt;element name="securityInfo" type="{https://services.alarmnet.com/TC2/}SecurityStatusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceStatusInfo", propOrder = {
    "lockInfo",
    "securityInfo"
})
public class DeviceStatusInfo {

    protected LockStausInfo lockInfo;
    protected SecurityStatusInfo securityInfo;

    /**
     * Gets the value of the lockInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LockStausInfo }
     *     
     */
    public LockStausInfo getLockInfo() {
        return lockInfo;
    }

    /**
     * Sets the value of the lockInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockStausInfo }
     *     
     */
    public void setLockInfo(LockStausInfo value) {
        this.lockInfo = value;
    }

    /**
     * Gets the value of the securityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityStatusInfo }
     *     
     */
    public SecurityStatusInfo getSecurityInfo() {
        return securityInfo;
    }

    /**
     * Sets the value of the securityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityStatusInfo }
     *     
     */
    public void setSecurityInfo(SecurityStatusInfo value) {
        this.securityInfo = value;
    }

}
