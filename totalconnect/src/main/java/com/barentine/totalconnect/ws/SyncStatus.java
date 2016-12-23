
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalSteps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentStep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResultData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncStatus", propOrder = {
    "deviceID",
    "deviceName",
    "totalSteps",
    "currentStep",
    "description",
    "statusText",
    "resultCode",
    "resultData"
})
public class SyncStatus {

    @XmlElement(name = "DeviceID")
    protected long deviceID;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "TotalSteps")
    protected int totalSteps;
    @XmlElement(name = "CurrentStep")
    protected int currentStep;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "StatusText")
    protected String statusText;
    @XmlElement(name = "ResultCode")
    protected int resultCode;
    @XmlElement(name = "ResultData")
    protected String resultData;

    /**
     * Gets the value of the deviceID property.
     * 
     */
    public long getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     */
    public void setDeviceID(long value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the totalSteps property.
     * 
     */
    public int getTotalSteps() {
        return totalSteps;
    }

    /**
     * Sets the value of the totalSteps property.
     * 
     */
    public void setTotalSteps(int value) {
        this.totalSteps = value;
    }

    /**
     * Gets the value of the currentStep property.
     * 
     */
    public int getCurrentStep() {
        return currentStep;
    }

    /**
     * Sets the value of the currentStep property.
     * 
     */
    public void setCurrentStep(int value) {
        this.currentStep = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the statusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * Sets the value of the statusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusText(String value) {
        this.statusText = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultData() {
        return resultData;
    }

    /**
     * Sets the value of the resultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultData(String value) {
        this.resultData = value;
    }

}
