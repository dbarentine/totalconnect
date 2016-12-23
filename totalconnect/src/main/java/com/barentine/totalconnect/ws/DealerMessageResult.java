
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealerMessageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealerMessageResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="DealerMessageList" type="{https://services.alarmnet.com/TC2/}ArrayOfDealerMessageInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealerMessageResult", propOrder = {
    "dealerMessageList"
})
public class DealerMessageResult
    extends WebMethodResults
{

    @XmlElement(name = "DealerMessageList")
    protected ArrayOfDealerMessageInfo dealerMessageList;

    /**
     * Gets the value of the dealerMessageList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDealerMessageInfo }
     *     
     */
    public ArrayOfDealerMessageInfo getDealerMessageList() {
        return dealerMessageList;
    }

    /**
     * Sets the value of the dealerMessageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDealerMessageInfo }
     *     
     */
    public void setDealerMessageList(ArrayOfDealerMessageInfo value) {
        this.dealerMessageList = value;
    }

}
