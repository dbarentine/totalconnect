
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDetailsExResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDetailsExResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="UserDetailsEx" type="{https://services.alarmnet.com/TC2/}UserDetailsEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDetailsExResults", propOrder = {
    "userDetailsEx"
})
public class UserDetailsExResults
    extends WebMethodResults
{

    @XmlElement(name = "UserDetailsEx")
    protected UserDetailsEx userDetailsEx;

    /**
     * Gets the value of the userDetailsEx property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetailsEx }
     *     
     */
    public UserDetailsEx getUserDetailsEx() {
        return userDetailsEx;
    }

    /**
     * Sets the value of the userDetailsEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetailsEx }
     *     
     */
    public void setUserDetailsEx(UserDetailsEx value) {
        this.userDetailsEx = value;
    }

}
