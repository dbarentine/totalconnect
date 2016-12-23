
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EULAText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EULAText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LanguageID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LanguageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivacyStatementText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EulaDateActiveFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EulaID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EULAText", propOrder = {
    "resultCode",
    "languageID",
    "languageText",
    "privacyStatementText",
    "eulaDateActiveFrom",
    "eulaID"
})
public class EULAText {

    @XmlElement(name = "ResultCode")
    protected int resultCode;
    @XmlElement(name = "LanguageID")
    protected long languageID;
    @XmlElement(name = "LanguageText")
    protected String languageText;
    @XmlElement(name = "PrivacyStatementText")
    protected String privacyStatementText;
    @XmlElement(name = "EulaDateActiveFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eulaDateActiveFrom;
    @XmlElement(name = "EulaID")
    protected long eulaID;

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the languageID property.
     * 
     */
    public long getLanguageID() {
        return languageID;
    }

    /**
     * Sets the value of the languageID property.
     * 
     */
    public void setLanguageID(long value) {
        this.languageID = value;
    }

    /**
     * Gets the value of the languageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageText() {
        return languageText;
    }

    /**
     * Sets the value of the languageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageText(String value) {
        this.languageText = value;
    }

    /**
     * Gets the value of the privacyStatementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyStatementText() {
        return privacyStatementText;
    }

    /**
     * Sets the value of the privacyStatementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyStatementText(String value) {
        this.privacyStatementText = value;
    }

    /**
     * Gets the value of the eulaDateActiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEulaDateActiveFrom() {
        return eulaDateActiveFrom;
    }

    /**
     * Sets the value of the eulaDateActiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEulaDateActiveFrom(XMLGregorianCalendar value) {
        this.eulaDateActiveFrom = value;
    }

    /**
     * Gets the value of the eulaID property.
     * 
     */
    public long getEulaID() {
        return eulaID;
    }

    /**
     * Sets the value of the eulaID property.
     * 
     */
    public void setEulaID(long value) {
        this.eulaID = value;
    }

}
