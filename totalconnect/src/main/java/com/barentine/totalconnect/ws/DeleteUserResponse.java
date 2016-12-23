
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
 *         &lt;element name="DeleteUserResult" type="{https://services.alarmnet.com/TC2/}DeleteUserResults" minOccurs="0"/>
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
    "deleteUserResult"
})
@XmlRootElement(name = "DeleteUserResponse")
public class DeleteUserResponse {

    @XmlElement(name = "DeleteUserResult")
    protected DeleteUserResults deleteUserResult;

    /**
     * Gets the value of the deleteUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteUserResults }
     *     
     */
    public DeleteUserResults getDeleteUserResult() {
        return deleteUserResult;
    }

    /**
     * Sets the value of the deleteUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteUserResults }
     *     
     */
    public void setDeleteUserResult(DeleteUserResults value) {
        this.deleteUserResult = value;
    }

}
