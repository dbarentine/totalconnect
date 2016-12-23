
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSecuritySubAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSecuritySubAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecuritySubAction" type="{https://services.alarmnet.com/TC2/}SecuritySubAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSecuritySubAction", propOrder = {
    "securitySubAction"
})
public class ArrayOfSecuritySubAction {

    @XmlElement(name = "SecuritySubAction", nillable = true)
    protected List<SecuritySubAction> securitySubAction;

    /**
     * Gets the value of the securitySubAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securitySubAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecuritySubAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritySubAction }
     * 
     * 
     */
    public List<SecuritySubAction> getSecuritySubAction() {
        if (securitySubAction == null) {
            securitySubAction = new ArrayList<SecuritySubAction>();
        }
        return this.securitySubAction;
    }

}
