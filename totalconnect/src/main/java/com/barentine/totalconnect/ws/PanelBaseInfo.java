
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelBaseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelBaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Partitions" type="{https://services.alarmnet.com/TC2/}ArrayOfPartitionInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LastUpdatedTimestampTicks" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ConfigurationSequenceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IsInACLoss" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsInLowBattery" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelBaseInfo", propOrder = {
    "partitions"
})
@XmlSeeAlso({
    PanelStatusInfo.class,
    PanelBaseInfoEx.class,
    PanelMetadataAndStatusInfo.class
})
public abstract class PanelBaseInfo {

    @XmlElement(name = "Partitions")
    protected ArrayOfPartitionInfo partitions;
    @XmlAttribute(name = "LastUpdatedTimestampTicks", required = true)
    protected long lastUpdatedTimestampTicks;
    @XmlAttribute(name = "ConfigurationSequenceNumber", required = true)
    protected int configurationSequenceNumber;
    @XmlAttribute(name = "IsInACLoss", required = true)
    protected boolean isInACLoss;
    @XmlAttribute(name = "IsInLowBattery", required = true)
    protected boolean isInLowBattery;

    /**
     * Gets the value of the partitions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPartitionInfo }
     *     
     */
    public ArrayOfPartitionInfo getPartitions() {
        return partitions;
    }

    /**
     * Sets the value of the partitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPartitionInfo }
     *     
     */
    public void setPartitions(ArrayOfPartitionInfo value) {
        this.partitions = value;
    }

    /**
     * Gets the value of the lastUpdatedTimestampTicks property.
     * 
     */
    public long getLastUpdatedTimestampTicks() {
        return lastUpdatedTimestampTicks;
    }

    /**
     * Sets the value of the lastUpdatedTimestampTicks property.
     * 
     */
    public void setLastUpdatedTimestampTicks(long value) {
        this.lastUpdatedTimestampTicks = value;
    }

    /**
     * Gets the value of the configurationSequenceNumber property.
     * 
     */
    public int getConfigurationSequenceNumber() {
        return configurationSequenceNumber;
    }

    /**
     * Sets the value of the configurationSequenceNumber property.
     * 
     */
    public void setConfigurationSequenceNumber(int value) {
        this.configurationSequenceNumber = value;
    }

    /**
     * Gets the value of the isInACLoss property.
     * 
     */
    public boolean isIsInACLoss() {
        return isInACLoss;
    }

    /**
     * Sets the value of the isInACLoss property.
     * 
     */
    public void setIsInACLoss(boolean value) {
        this.isInACLoss = value;
    }

    /**
     * Gets the value of the isInLowBattery property.
     * 
     */
    public boolean isIsInLowBattery() {
        return isInLowBattery;
    }

    /**
     * Sets the value of the isInLowBattery property.
     * 
     */
    public void setIsInLowBattery(boolean value) {
        this.isInLowBattery = value;
    }

}
