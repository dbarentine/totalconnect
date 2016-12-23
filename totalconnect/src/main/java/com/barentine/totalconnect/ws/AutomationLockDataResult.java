
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationLockDataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomationLockDataResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="lockInfo" type="{https://services.alarmnet.com/TC2/}ArrayOfLockInfo_Transitional" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomationLockDataResult", propOrder = {
    "lockInfo"
})
public class AutomationLockDataResult
    extends WebMethodResults
{

    protected ArrayOfLockInfoTransitional lockInfo;

    /**
     * Gets the value of the lockInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLockInfoTransitional }
     *     
     */
    public ArrayOfLockInfoTransitional getLockInfo() {
        return lockInfo;
    }

    /**
     * Sets the value of the lockInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLockInfoTransitional }
     *     
     */
    public void setLockInfo(ArrayOfLockInfoTransitional value) {
        this.lockInfo = value;
    }

}
