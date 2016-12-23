
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HelpDocs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HelpDocs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HelpID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HelpDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HelpURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HelpDocs", propOrder = {
    "helpID",
    "helpDescription",
    "helpURL"
})
public class HelpDocs {

    @XmlElement(name = "HelpID")
    protected int helpID;
    @XmlElement(name = "HelpDescription")
    protected String helpDescription;
    @XmlElement(name = "HelpURL")
    protected String helpURL;

    /**
     * Gets the value of the helpID property.
     * 
     */
    public int getHelpID() {
        return helpID;
    }

    /**
     * Sets the value of the helpID property.
     * 
     */
    public void setHelpID(int value) {
        this.helpID = value;
    }

    /**
     * Gets the value of the helpDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpDescription() {
        return helpDescription;
    }

    /**
     * Sets the value of the helpDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpDescription(String value) {
        this.helpDescription = value;
    }

    /**
     * Gets the value of the helpURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpURL() {
        return helpURL;
    }

    /**
     * Sets the value of the helpURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpURL(String value) {
        this.helpURL = value;
    }

}
