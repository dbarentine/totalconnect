
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDealerMessageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDealerMessageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DealerMessageInfo" type="{https://services.alarmnet.com/TC2/}DealerMessageInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDealerMessageInfo", propOrder = {
    "dealerMessageInfo"
})
public class ArrayOfDealerMessageInfo {

    @XmlElement(name = "DealerMessageInfo", nillable = true)
    protected List<DealerMessageInfo> dealerMessageInfo;

    /**
     * Gets the value of the dealerMessageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dealerMessageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealerMessageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DealerMessageInfo }
     * 
     * 
     */
    public List<DealerMessageInfo> getDealerMessageInfo() {
        if (dealerMessageInfo == null) {
            dealerMessageInfo = new ArrayList<DealerMessageInfo>();
        }
        return this.dealerMessageInfo;
    }

}
