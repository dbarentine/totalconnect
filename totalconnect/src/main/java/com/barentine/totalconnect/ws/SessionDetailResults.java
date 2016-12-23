
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionDetailResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionDetailResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="ModuleFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserInfo" type="{https://services.alarmnet.com/TC2/}UserInfoBasic" minOccurs="0"/>
 *         &lt;element name="Locations" type="{https://services.alarmnet.com/TC2/}ArrayOfLocationInfoBasic" minOccurs="0"/>
 *         &lt;element name="InterfaceSchemaConfigInfo" type="{https://services.alarmnet.com/TC2/}InterfaceSchemaConfigInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionDetailResults", propOrder = {
    "moduleFlags",
    "sessionID",
    "userInfo",
    "locations",
    "interfaceSchemaConfigInfo"
})
public class SessionDetailResults
    extends WebMethodResults
{

    @XmlElement(name = "ModuleFlags")
    protected String moduleFlags;
    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "UserInfo")
    protected UserInfoBasic userInfo;
    @XmlElement(name = "Locations")
    protected ArrayOfLocationInfoBasic locations;
    @XmlElement(name = "InterfaceSchemaConfigInfo")
    protected InterfaceSchemaConfigInfo interfaceSchemaConfigInfo;

    /**
     * Gets the value of the moduleFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleFlags() {
        return moduleFlags;
    }

    /**
     * Sets the value of the moduleFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleFlags(String value) {
        this.moduleFlags = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoBasic }
     *     
     */
    public UserInfoBasic getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoBasic }
     *     
     */
    public void setUserInfo(UserInfoBasic value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationInfoBasic }
     *     
     */
    public ArrayOfLocationInfoBasic getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationInfoBasic }
     *     
     */
    public void setLocations(ArrayOfLocationInfoBasic value) {
        this.locations = value;
    }

    /**
     * Gets the value of the interfaceSchemaConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceSchemaConfigInfo }
     *     
     */
    public InterfaceSchemaConfigInfo getInterfaceSchemaConfigInfo() {
        return interfaceSchemaConfigInfo;
    }

    /**
     * Sets the value of the interfaceSchemaConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceSchemaConfigInfo }
     *     
     */
    public void setInterfaceSchemaConfigInfo(InterfaceSchemaConfigInfo value) {
        this.interfaceSchemaConfigInfo = value;
    }

}
