
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartitionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartitionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartitionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ArmingState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartitionInfo", propOrder = {
    "partitionID",
    "armingState"
})
@XmlSeeAlso({
    PartitionDetails.class
})
public class PartitionInfo {

    @XmlElement(name = "PartitionID")
    protected int partitionID;
    @XmlElement(name = "ArmingState")
    protected int armingState;

    /**
     * Gets the value of the partitionID property.
     * 
     */
    public int getPartitionID() {
        return partitionID;
    }

    /**
     * Sets the value of the partitionID property.
     * 
     */
    public void setPartitionID(int value) {
        this.partitionID = value;
    }

    /**
     * Gets the value of the armingState property.
     * 
     */
    public int getArmingState() {
        return armingState;
    }

    /**
     * Sets the value of the armingState property.
     * 
     */
    public void setArmingState(int value) {
        this.armingState = value;
    }

}
