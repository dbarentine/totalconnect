
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartnerListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerListResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="PartnerList" type="{https://services.alarmnet.com/TC2/}ArrayOfPartnerInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerListResult", propOrder = {
    "partnerList"
})
public class PartnerListResult
    extends WebMethodResults
{

    @XmlElement(name = "PartnerList")
    protected ArrayOfPartnerInfo partnerList;

    /**
     * Gets the value of the partnerList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPartnerInfo }
     *     
     */
    public ArrayOfPartnerInfo getPartnerList() {
        return partnerList;
    }

    /**
     * Sets the value of the partnerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPartnerInfo }
     *     
     */
    public void setPartnerList(ArrayOfPartnerInfo value) {
        this.partnerList = value;
    }

}
