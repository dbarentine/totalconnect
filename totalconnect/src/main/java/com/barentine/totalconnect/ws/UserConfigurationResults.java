
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserConfigurationResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserConfigurationResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="Users" type="{https://services.alarmnet.com/TC2/}ArrayOfUsers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserConfigurationResults", propOrder = {
    "users"
})
public class UserConfigurationResults
    extends WebMethodResults
{

    @XmlElement(name = "Users")
    protected ArrayOfUsers users;

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUsers }
     *     
     */
    public ArrayOfUsers getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUsers }
     *     
     */
    public void setUsers(ArrayOfUsers value) {
        this.users = value;
    }

}
