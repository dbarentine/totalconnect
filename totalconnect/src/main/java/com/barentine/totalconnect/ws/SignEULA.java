
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
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EulaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LanguageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CountryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "sessionID",
    "eulaId",
    "languageId",
    "countryId"
})
@XmlRootElement(name = "signEULA")
public class SignEULA {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "EulaId")
    protected long eulaId;
    @XmlElement(name = "LanguageId")
    protected long languageId;
    @XmlElement(name = "CountryId")
    protected long countryId;

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
     * Gets the value of the eulaId property.
     * 
     */
    public long getEulaId() {
        return eulaId;
    }

    /**
     * Sets the value of the eulaId property.
     * 
     */
    public void setEulaId(long value) {
        this.eulaId = value;
    }

    /**
     * Gets the value of the languageId property.
     * 
     */
    public long getLanguageId() {
        return languageId;
    }

    /**
     * Sets the value of the languageId property.
     * 
     */
    public void setLanguageId(long value) {
        this.languageId = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(long value) {
        this.countryId = value;
    }

}
