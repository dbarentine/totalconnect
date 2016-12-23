
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserManagementOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserManagementOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsOptedForUserCodeManagement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsUserCodeDisplayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserManagementOptions", propOrder = {
    "isOptedForUserCodeManagement",
    "isUserCodeDisplayed"
})
public class UserManagementOptions {

    @XmlElement(name = "IsOptedForUserCodeManagement")
    protected boolean isOptedForUserCodeManagement;
    @XmlElement(name = "IsUserCodeDisplayed")
    protected boolean isUserCodeDisplayed;

    /**
     * Gets the value of the isOptedForUserCodeManagement property.
     * 
     */
    public boolean isIsOptedForUserCodeManagement() {
        return isOptedForUserCodeManagement;
    }

    /**
     * Sets the value of the isOptedForUserCodeManagement property.
     * 
     */
    public void setIsOptedForUserCodeManagement(boolean value) {
        this.isOptedForUserCodeManagement = value;
    }

    /**
     * Gets the value of the isUserCodeDisplayed property.
     * 
     */
    public boolean isIsUserCodeDisplayed() {
        return isUserCodeDisplayed;
    }

    /**
     * Sets the value of the isUserCodeDisplayed property.
     * 
     */
    public void setIsUserCodeDisplayed(boolean value) {
        this.isUserCodeDisplayed = value;
    }

}
