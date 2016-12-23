
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartitionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartitionDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}PartitionInfo">
 *       &lt;sequence>
 *         &lt;element name="PartitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsStayArmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsFireEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsCommonEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartitionDetails", propOrder = {
    "partitionName",
    "isStayArmed",
    "isFireEnabled",
    "isCommonEnabled",
    "isLocked"
})
public class PartitionDetails
    extends PartitionInfo
{

    @XmlElement(name = "PartitionName")
    protected String partitionName;
    @XmlElement(name = "IsStayArmed")
    protected boolean isStayArmed;
    @XmlElement(name = "IsFireEnabled")
    protected boolean isFireEnabled;
    @XmlElement(name = "IsCommonEnabled")
    protected boolean isCommonEnabled;
    @XmlElement(name = "IsLocked")
    protected boolean isLocked;

    /**
     * Gets the value of the partitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionName() {
        return partitionName;
    }

    /**
     * Sets the value of the partitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionName(String value) {
        this.partitionName = value;
    }

    /**
     * Gets the value of the isStayArmed property.
     * 
     */
    public boolean isIsStayArmed() {
        return isStayArmed;
    }

    /**
     * Sets the value of the isStayArmed property.
     * 
     */
    public void setIsStayArmed(boolean value) {
        this.isStayArmed = value;
    }

    /**
     * Gets the value of the isFireEnabled property.
     * 
     */
    public boolean isIsFireEnabled() {
        return isFireEnabled;
    }

    /**
     * Sets the value of the isFireEnabled property.
     * 
     */
    public void setIsFireEnabled(boolean value) {
        this.isFireEnabled = value;
    }

    /**
     * Gets the value of the isCommonEnabled property.
     * 
     */
    public boolean isIsCommonEnabled() {
        return isCommonEnabled;
    }

    /**
     * Sets the value of the isCommonEnabled property.
     * 
     */
    public void setIsCommonEnabled(boolean value) {
        this.isCommonEnabled = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     */
    public boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     */
    public void setIsLocked(boolean value) {
        this.isLocked = value;
    }

}
