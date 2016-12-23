
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LocationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}LocationInfoSimple">
 *       &lt;sequence>
 *         &lt;element name="ContentServiceLevelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DoorBellServiceLevelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DealerPushMessageRemainingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdvertisingServiceLevelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LatestMessageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ISNewSkyBellAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ISDaylightSavingTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VideoServiceLevelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationInfo", propOrder = {
    "contentServiceLevelID",
    "doorBellServiceLevelID",
    "dealerPushMessageRemainingCount",
    "advertisingServiceLevelID",
    "latestMessageDate",
    "isNewSkyBellAccount",
    "isDaylightSavingTime",
    "videoServiceLevelID"
})
public class LocationInfo
    extends LocationInfoSimple
{

    @XmlElement(name = "ContentServiceLevelID")
    protected int contentServiceLevelID;
    @XmlElement(name = "DoorBellServiceLevelID")
    protected int doorBellServiceLevelID;
    @XmlElement(name = "DealerPushMessageRemainingCount")
    protected int dealerPushMessageRemainingCount;
    @XmlElement(name = "AdvertisingServiceLevelID")
    protected int advertisingServiceLevelID;
    @XmlElement(name = "LatestMessageDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestMessageDate;
    @XmlElement(name = "ISNewSkyBellAccount")
    protected boolean isNewSkyBellAccount;
    @XmlElement(name = "ISDaylightSavingTime")
    protected boolean isDaylightSavingTime;
    @XmlElement(name = "VideoServiceLevelID")
    protected int videoServiceLevelID;

    /**
     * Gets the value of the contentServiceLevelID property.
     * 
     */
    public int getContentServiceLevelID() {
        return contentServiceLevelID;
    }

    /**
     * Sets the value of the contentServiceLevelID property.
     * 
     */
    public void setContentServiceLevelID(int value) {
        this.contentServiceLevelID = value;
    }

    /**
     * Gets the value of the doorBellServiceLevelID property.
     * 
     */
    public int getDoorBellServiceLevelID() {
        return doorBellServiceLevelID;
    }

    /**
     * Sets the value of the doorBellServiceLevelID property.
     * 
     */
    public void setDoorBellServiceLevelID(int value) {
        this.doorBellServiceLevelID = value;
    }

    /**
     * Gets the value of the dealerPushMessageRemainingCount property.
     * 
     */
    public int getDealerPushMessageRemainingCount() {
        return dealerPushMessageRemainingCount;
    }

    /**
     * Sets the value of the dealerPushMessageRemainingCount property.
     * 
     */
    public void setDealerPushMessageRemainingCount(int value) {
        this.dealerPushMessageRemainingCount = value;
    }

    /**
     * Gets the value of the advertisingServiceLevelID property.
     * 
     */
    public int getAdvertisingServiceLevelID() {
        return advertisingServiceLevelID;
    }

    /**
     * Sets the value of the advertisingServiceLevelID property.
     * 
     */
    public void setAdvertisingServiceLevelID(int value) {
        this.advertisingServiceLevelID = value;
    }

    /**
     * Gets the value of the latestMessageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestMessageDate() {
        return latestMessageDate;
    }

    /**
     * Sets the value of the latestMessageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestMessageDate(XMLGregorianCalendar value) {
        this.latestMessageDate = value;
    }

    /**
     * Gets the value of the isNewSkyBellAccount property.
     * 
     */
    public boolean isISNewSkyBellAccount() {
        return isNewSkyBellAccount;
    }

    /**
     * Sets the value of the isNewSkyBellAccount property.
     * 
     */
    public void setISNewSkyBellAccount(boolean value) {
        this.isNewSkyBellAccount = value;
    }

    /**
     * Gets the value of the isDaylightSavingTime property.
     * 
     */
    public boolean isISDaylightSavingTime() {
        return isDaylightSavingTime;
    }

    /**
     * Sets the value of the isDaylightSavingTime property.
     * 
     */
    public void setISDaylightSavingTime(boolean value) {
        this.isDaylightSavingTime = value;
    }

    /**
     * Gets the value of the videoServiceLevelID property.
     * 
     */
    public int getVideoServiceLevelID() {
        return videoServiceLevelID;
    }

    /**
     * Sets the value of the videoServiceLevelID property.
     * 
     */
    public void setVideoServiceLevelID(int value) {
        this.videoServiceLevelID = value;
    }

}
