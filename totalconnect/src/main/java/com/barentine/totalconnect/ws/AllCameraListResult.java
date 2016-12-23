
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllCameraListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllCameraListResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountAllCameraList" type="{https://services.alarmnet.com/TC2/}AllCameraList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllCameraListResult", propOrder = {
    "sessionID",
    "accountAllCameraList"
})
public class AllCameraListResult
    extends WebMethodResults
{

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "AccountAllCameraList")
    protected AllCameraList accountAllCameraList;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the accountAllCameraList property.
     * 
     * @return
     *     possible object is
     *     {@link AllCameraList }
     *     
     */
    public AllCameraList getAccountAllCameraList() {
        return accountAllCameraList;
    }

    /**
     * Sets the value of the accountAllCameraList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllCameraList }
     *     
     */
    public void setAccountAllCameraList(AllCameraList value) {
        this.accountAllCameraList = value;
    }

}
