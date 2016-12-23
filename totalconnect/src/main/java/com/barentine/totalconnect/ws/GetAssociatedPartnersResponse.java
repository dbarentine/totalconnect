
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
 *         &lt;element name="GetAssociatedPartnersResult" type="{https://services.alarmnet.com/TC2/}PartnerListResult" minOccurs="0"/>
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
    "getAssociatedPartnersResult"
})
@XmlRootElement(name = "GetAssociatedPartnersResponse")
public class GetAssociatedPartnersResponse {

    @XmlElement(name = "GetAssociatedPartnersResult")
    protected PartnerListResult getAssociatedPartnersResult;

    /**
     * Gets the value of the getAssociatedPartnersResult property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerListResult }
     *     
     */
    public PartnerListResult getGetAssociatedPartnersResult() {
        return getAssociatedPartnersResult;
    }

    /**
     * Sets the value of the getAssociatedPartnersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerListResult }
     *     
     */
    public void setGetAssociatedPartnersResult(PartnerListResult value) {
        this.getAssociatedPartnersResult = value;
    }

}
