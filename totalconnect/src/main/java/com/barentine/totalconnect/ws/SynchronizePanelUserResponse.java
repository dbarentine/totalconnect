
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
 *         &lt;element name="SynchronizePanelUserResult" type="{https://services.alarmnet.com/TC2/}SynchronizeUserResults" minOccurs="0"/>
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
    "synchronizePanelUserResult"
})
@XmlRootElement(name = "SynchronizePanelUserResponse")
public class SynchronizePanelUserResponse {

    @XmlElement(name = "SynchronizePanelUserResult")
    protected SynchronizeUserResults synchronizePanelUserResult;

    /**
     * Gets the value of the synchronizePanelUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizeUserResults }
     *     
     */
    public SynchronizeUserResults getSynchronizePanelUserResult() {
        return synchronizePanelUserResult;
    }

    /**
     * Sets the value of the synchronizePanelUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizeUserResults }
     *     
     */
    public void setSynchronizePanelUserResult(SynchronizeUserResults value) {
        this.synchronizePanelUserResult = value;
    }

}
