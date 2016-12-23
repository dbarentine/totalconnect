
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserListResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserListResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="UserManagementOptions" type="{https://services.alarmnet.com/TC2/}UserManagementOptions" minOccurs="0"/>
 *         &lt;element name="Users" type="{https://services.alarmnet.com/TC2/}ArrayOfUserListDetail" minOccurs="0"/>
 *         &lt;element name="UrgentSyncCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserListResults", propOrder = {
    "userManagementOptions",
    "users",
    "urgentSyncCount"
})
public class UserListResults
    extends WebMethodResults
{

    @XmlElement(name = "UserManagementOptions")
    protected UserManagementOptions userManagementOptions;
    @XmlElement(name = "Users")
    protected ArrayOfUserListDetail users;
    @XmlElement(name = "UrgentSyncCount")
    protected int urgentSyncCount;

    /**
     * Gets the value of the userManagementOptions property.
     * 
     * @return
     *     possible object is
     *     {@link UserManagementOptions }
     *     
     */
    public UserManagementOptions getUserManagementOptions() {
        return userManagementOptions;
    }

    /**
     * Sets the value of the userManagementOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserManagementOptions }
     *     
     */
    public void setUserManagementOptions(UserManagementOptions value) {
        this.userManagementOptions = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserListDetail }
     *     
     */
    public ArrayOfUserListDetail getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserListDetail }
     *     
     */
    public void setUsers(ArrayOfUserListDetail value) {
        this.users = value;
    }

    /**
     * Gets the value of the urgentSyncCount property.
     * 
     */
    public int getUrgentSyncCount() {
        return urgentSyncCount;
    }

    /**
     * Sets the value of the urgentSyncCount property.
     * 
     */
    public void setUrgentSyncCount(int value) {
        this.urgentSyncCount = value;
    }

}
