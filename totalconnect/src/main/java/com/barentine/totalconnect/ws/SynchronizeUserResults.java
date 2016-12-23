
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronizeUserResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchronizeUserResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="SynchronizationStatus" type="{https://services.alarmnet.com/TC2/}ArrayOfSyncStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizeUserResults", propOrder = {
    "synchronizationStatus"
})
public class SynchronizeUserResults
    extends WebMethodResults
{

    @XmlElement(name = "SynchronizationStatus")
    protected ArrayOfSyncStatus synchronizationStatus;

    /**
     * Gets the value of the synchronizationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSyncStatus }
     *     
     */
    public ArrayOfSyncStatus getSynchronizationStatus() {
        return synchronizationStatus;
    }

    /**
     * Sets the value of the synchronizationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSyncStatus }
     *     
     */
    public void setSynchronizationStatus(ArrayOfSyncStatus value) {
        this.synchronizationStatus = value;
    }

}
