
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPartnerVideoURLResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPartnerVideoURLResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="activityUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPartnerVideoURLResult", propOrder = {
    "activityUrl"
})
public class GetPartnerVideoURLResult
    extends WebMethodResults
{

    protected String activityUrl;

    /**
     * Gets the value of the activityUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityUrl() {
        return activityUrl;
    }

    /**
     * Sets the value of the activityUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityUrl(String value) {
        this.activityUrl = value;
    }

}
