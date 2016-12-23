
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Language complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Language">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="LanguageId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="LanguageDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LanguagePriority" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Language")
public class Language {

    @XmlAttribute(name = "LanguageId", required = true)
    protected long languageId;
    @XmlAttribute(name = "LanguageDesc")
    protected String languageDesc;
    @XmlAttribute(name = "LanguagePriority", required = true)
    protected int languagePriority;

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
     * Gets the value of the languageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageDesc() {
        return languageDesc;
    }

    /**
     * Sets the value of the languageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageDesc(String value) {
        this.languageDesc = value;
    }

    /**
     * Gets the value of the languagePriority property.
     * 
     */
    public int getLanguagePriority() {
        return languagePriority;
    }

    /**
     * Sets the value of the languagePriority property.
     * 
     */
    public void setLanguagePriority(int value) {
        this.languagePriority = value;
    }

}
