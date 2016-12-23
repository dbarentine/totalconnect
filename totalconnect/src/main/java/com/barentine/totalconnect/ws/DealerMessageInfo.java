
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealerMessageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealerMessageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayTypeID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReadState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealerMessageInfo", propOrder = {
    "displayTypeID",
    "accountID",
    "locationID",
    "priority",
    "messageID",
    "messageType",
    "title",
    "messageData",
    "receivedTime",
    "readState"
})
public class DealerMessageInfo {

    @XmlElement(name = "DisplayTypeID")
    protected short displayTypeID;
    @XmlElement(name = "AccountID")
    protected long accountID;
    @XmlElement(name = "LocationID")
    protected long locationID;
    @XmlElement(name = "Priority")
    protected int priority;
    @XmlElement(name = "MessageID")
    protected int messageID;
    @XmlElement(name = "MessageType")
    protected int messageType;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "MessageData")
    protected String messageData;
    @XmlElement(name = "ReceivedTime")
    protected String receivedTime;
    @XmlElement(name = "ReadState")
    protected int readState;

    /**
     * Gets the value of the displayTypeID property.
     * 
     */
    public short getDisplayTypeID() {
        return displayTypeID;
    }

    /**
     * Sets the value of the displayTypeID property.
     * 
     */
    public void setDisplayTypeID(short value) {
        this.displayTypeID = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     */
    public long getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     */
    public void setAccountID(long value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     */
    public long getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(long value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     */
    public int getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     */
    public void setMessageID(int value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     */
    public int getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     */
    public void setMessageType(int value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the messageData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageData(String value) {
        this.messageData = value;
    }

    /**
     * Gets the value of the receivedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedTime() {
        return receivedTime;
    }

    /**
     * Sets the value of the receivedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedTime(String value) {
        this.receivedTime = value;
    }

    /**
     * Gets the value of the readState property.
     * 
     */
    public int getReadState() {
        return readState;
    }

    /**
     * Sets the value of the readState property.
     * 
     */
    public void setReadState(int value) {
        this.readState = value;
    }

}
