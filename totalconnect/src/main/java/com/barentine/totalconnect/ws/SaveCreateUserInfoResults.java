
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveCreateUserInfoResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveCreateUserInfoResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ResultPhotoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveCreateUserInfoResults", propOrder = {
    "userId",
    "resultPhotoURL"
})
public class SaveCreateUserInfoResults
    extends WebMethodResults
{

    @XmlElement(name = "UserId")
    protected long userId;
    @XmlElement(name = "ResultPhotoURL")
    protected String resultPhotoURL;

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the resultPhotoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultPhotoURL() {
        return resultPhotoURL;
    }

    /**
     * Sets the value of the resultPhotoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultPhotoURL(String value) {
        this.resultPhotoURL = value;
    }

}
