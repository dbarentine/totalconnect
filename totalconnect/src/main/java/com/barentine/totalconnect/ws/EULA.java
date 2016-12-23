
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EULA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EULA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LanguageList" type="{https://services.alarmnet.com/TC2/}ArrayOfLanguage" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EulaId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="CountryId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateActiveFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EULA", propOrder = {
    "languageList"
})
public class EULA {

    @XmlElement(name = "LanguageList")
    protected ArrayOfLanguage languageList;
    @XmlAttribute(name = "EulaId", required = true)
    protected long eulaId;
    @XmlAttribute(name = "CountryId", required = true)
    protected long countryId;
    @XmlAttribute(name = "CountryName")
    protected String countryName;
    @XmlAttribute(name = "DateActiveFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateActiveFrom;

    /**
     * Gets the value of the languageList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguage }
     *     
     */
    public ArrayOfLanguage getLanguageList() {
        return languageList;
    }

    /**
     * Sets the value of the languageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguage }
     *     
     */
    public void setLanguageList(ArrayOfLanguage value) {
        this.languageList = value;
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

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the dateActiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateActiveFrom() {
        return dateActiveFrom;
    }

    /**
     * Sets the value of the dateActiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateActiveFrom(XMLGregorianCalendar value) {
        this.dateActiveFrom = value;
    }

}
