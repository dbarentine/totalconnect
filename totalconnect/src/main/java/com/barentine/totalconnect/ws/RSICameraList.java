
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSICameraList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSICameraList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RSIModuleSeriallNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RSICamerasList" type="{https://services.alarmnet.com/TC2/}ArrayOfRSIDeviceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSICameraList", propOrder = {
    "rsiModuleSeriallNo",
    "rsiCamerasList"
})
public class RSICameraList {

    @XmlElement(name = "RSIModuleSeriallNo")
    protected String rsiModuleSeriallNo;
    @XmlElement(name = "RSICamerasList")
    protected ArrayOfRSIDeviceInfo rsiCamerasList;

    /**
     * Gets the value of the rsiModuleSeriallNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSIModuleSeriallNo() {
        return rsiModuleSeriallNo;
    }

    /**
     * Sets the value of the rsiModuleSeriallNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSIModuleSeriallNo(String value) {
        this.rsiModuleSeriallNo = value;
    }

    /**
     * Gets the value of the rsiCamerasList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRSIDeviceInfo }
     *     
     */
    public ArrayOfRSIDeviceInfo getRSICamerasList() {
        return rsiCamerasList;
    }

    /**
     * Sets the value of the rsiCamerasList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRSIDeviceInfo }
     *     
     */
    public void setRSICamerasList(ArrayOfRSIDeviceInfo value) {
        this.rsiCamerasList = value;
    }

}
