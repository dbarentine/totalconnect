
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetSyncJobStatusResult" type="{https://services.alarmnet.com/TC2/}SyncJobResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSyncJobStatusResult"
})
@XmlRootElement(name = "GetSyncJobStatusResponse")
public class GetSyncJobStatusResponse {

    @XmlElement(name = "GetSyncJobStatusResult")
    protected SyncJobResult getSyncJobStatusResult;

    /**
     * Gets the value of the getSyncJobStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link SyncJobResult }
     *     
     */
    public SyncJobResult getGetSyncJobStatusResult() {
        return getSyncJobStatusResult;
    }

    /**
     * Sets the value of the getSyncJobStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncJobResult }
     *     
     */
    public void setGetSyncJobStatusResult(SyncJobResult value) {
        this.getSyncJobStatusResult = value;
    }

}
