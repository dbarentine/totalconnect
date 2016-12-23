
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
 *         &lt;element name="UpdateSwitchIconResult" type="{https://services.alarmnet.com/TC2/}UpdateSwitchIconResults" minOccurs="0"/>
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
    "updateSwitchIconResult"
})
@XmlRootElement(name = "UpdateSwitchIconResponse")
public class UpdateSwitchIconResponse {

    @XmlElement(name = "UpdateSwitchIconResult")
    protected UpdateSwitchIconResults updateSwitchIconResult;

    /**
     * Gets the value of the updateSwitchIconResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSwitchIconResults }
     *     
     */
    public UpdateSwitchIconResults getUpdateSwitchIconResult() {
        return updateSwitchIconResult;
    }

    /**
     * Sets the value of the updateSwitchIconResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSwitchIconResults }
     *     
     */
    public void setUpdateSwitchIconResult(UpdateSwitchIconResults value) {
        this.updateSwitchIconResult = value;
    }

}
