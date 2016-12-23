
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserListDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserListDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsValidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FeatureInfo" type="{https://services.alarmnet.com/TC2/}ArrayOfUserFeatureCacheInfo" minOccurs="0"/>
 *         &lt;element name="TimeStampUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ImageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PhotoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOfSyncCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserListDetail", propOrder = {
    "userId",
    "userName",
    "firstName",
    "lastName",
    "enabled",
    "isValidated",
    "featureInfo",
    "timeStampUpdate",
    "imageId",
    "photoURL",
    "userTypeID",
    "outOfSyncCount"
})
public class UserListDetail {

    @XmlElement(name = "UserId")
    protected long userId;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "IsValidated")
    protected boolean isValidated;
    @XmlElement(name = "FeatureInfo")
    protected ArrayOfUserFeatureCacheInfo featureInfo;
    @XmlElement(name = "TimeStampUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStampUpdate;
    @XmlElement(name = "ImageId")
    protected long imageId;
    @XmlElement(name = "PhotoURL")
    protected String photoURL;
    @XmlElement(name = "UserTypeID")
    protected int userTypeID;
    @XmlElement(name = "OutOfSyncCount")
    protected int outOfSyncCount;

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the isValidated property.
     * 
     */
    public boolean isIsValidated() {
        return isValidated;
    }

    /**
     * Sets the value of the isValidated property.
     * 
     */
    public void setIsValidated(boolean value) {
        this.isValidated = value;
    }

    /**
     * Gets the value of the featureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserFeatureCacheInfo }
     *     
     */
    public ArrayOfUserFeatureCacheInfo getFeatureInfo() {
        return featureInfo;
    }

    /**
     * Sets the value of the featureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserFeatureCacheInfo }
     *     
     */
    public void setFeatureInfo(ArrayOfUserFeatureCacheInfo value) {
        this.featureInfo = value;
    }

    /**
     * Gets the value of the timeStampUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStampUpdate() {
        return timeStampUpdate;
    }

    /**
     * Sets the value of the timeStampUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStampUpdate(XMLGregorianCalendar value) {
        this.timeStampUpdate = value;
    }

    /**
     * Gets the value of the imageId property.
     * 
     */
    public long getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     */
    public void setImageId(long value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the photoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the value of the photoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoURL(String value) {
        this.photoURL = value;
    }

    /**
     * Gets the value of the userTypeID property.
     * 
     */
    public int getUserTypeID() {
        return userTypeID;
    }

    /**
     * Sets the value of the userTypeID property.
     * 
     */
    public void setUserTypeID(int value) {
        this.userTypeID = value;
    }

    /**
     * Gets the value of the outOfSyncCount property.
     * 
     */
    public int getOutOfSyncCount() {
        return outOfSyncCount;
    }

    /**
     * Sets the value of the outOfSyncCount property.
     * 
     */
    public void setOutOfSyncCount(int value) {
        this.outOfSyncCount = value;
    }

}
