
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityPanelPartitionsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityPanelPartitionsResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="PartitionsInfoList" type="{https://services.alarmnet.com/TC2/}ArrayOfPartitionDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityPanelPartitionsResults", propOrder = {
    "partitionsInfoList"
})
public class SecurityPanelPartitionsResults
    extends WebMethodResults
{

    @XmlElement(name = "PartitionsInfoList")
    protected ArrayOfPartitionDetails partitionsInfoList;

    /**
     * Gets the value of the partitionsInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPartitionDetails }
     *     
     */
    public ArrayOfPartitionDetails getPartitionsInfoList() {
        return partitionsInfoList;
    }

    /**
     * Sets the value of the partitionsInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPartitionDetails }
     *     
     */
    public void setPartitionsInfoList(ArrayOfPartitionDetails value) {
        this.partitionsInfoList = value;
    }

}
