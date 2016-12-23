
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraFirmwareInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraFirmwareInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirmwareVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirmwareVersionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirmwareVersionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirmwareReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraFirmwareInfo", propOrder = {
    "firmwareVersion",
    "firmwareVersionNumber",
    "firmwareVersionDescription",
    "firmwareVersionState",
    "firmwareReleaseDate"
})
public class CameraFirmwareInfo {

    @XmlElement(name = "FirmwareVersion")
    protected String firmwareVersion;
    @XmlElement(name = "FirmwareVersionNumber")
    protected int firmwareVersionNumber;
    @XmlElement(name = "FirmwareVersionDescription")
    protected String firmwareVersionDescription;
    @XmlElement(name = "FirmwareVersionState")
    protected String firmwareVersionState;
    @XmlElement(name = "FirmwareReleaseDate")
    protected String firmwareReleaseDate;

    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * Gets the value of the firmwareVersionNumber property.
     * 
     */
    public int getFirmwareVersionNumber() {
        return firmwareVersionNumber;
    }

    /**
     * Sets the value of the firmwareVersionNumber property.
     * 
     */
    public void setFirmwareVersionNumber(int value) {
        this.firmwareVersionNumber = value;
    }

    /**
     * Gets the value of the firmwareVersionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersionDescription() {
        return firmwareVersionDescription;
    }

    /**
     * Sets the value of the firmwareVersionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersionDescription(String value) {
        this.firmwareVersionDescription = value;
    }

    /**
     * Gets the value of the firmwareVersionState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersionState() {
        return firmwareVersionState;
    }

    /**
     * Sets the value of the firmwareVersionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersionState(String value) {
        this.firmwareVersionState = value;
    }

    /**
     * Gets the value of the firmwareReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareReleaseDate() {
        return firmwareReleaseDate;
    }

    /**
     * Sets the value of the firmwareReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareReleaseDate(String value) {
        this.firmwareReleaseDate = value;
    }

}
