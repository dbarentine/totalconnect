
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
 *         &lt;element name="GetHelpDocumentsResult" type="{https://services.alarmnet.com/TC2/}ListHelpDocsResults" minOccurs="0"/>
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
    "getHelpDocumentsResult"
})
@XmlRootElement(name = "GetHelpDocumentsResponse")
public class GetHelpDocumentsResponse {

    @XmlElement(name = "GetHelpDocumentsResult")
    protected ListHelpDocsResults getHelpDocumentsResult;

    /**
     * Gets the value of the getHelpDocumentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListHelpDocsResults }
     *     
     */
    public ListHelpDocsResults getGetHelpDocumentsResult() {
        return getHelpDocumentsResult;
    }

    /**
     * Sets the value of the getHelpDocumentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListHelpDocsResults }
     *     
     */
    public void setGetHelpDocumentsResult(ListHelpDocsResults value) {
        this.getHelpDocumentsResult = value;
    }

}
