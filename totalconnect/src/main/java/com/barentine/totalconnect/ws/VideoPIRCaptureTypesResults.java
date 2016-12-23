
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoPIRCaptureTypesResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPIRCaptureTypesResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="CaptureTypeList" type="{https://services.alarmnet.com/TC2/}ArrayOfVideoPIREventCaptureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPIRCaptureTypesResults", propOrder = {
    "captureTypeList"
})
public class VideoPIRCaptureTypesResults
    extends WebMethodResults
{

    @XmlElement(name = "CaptureTypeList")
    protected ArrayOfVideoPIREventCaptureType captureTypeList;

    /**
     * Gets the value of the captureTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoPIREventCaptureType }
     *     
     */
    public ArrayOfVideoPIREventCaptureType getCaptureTypeList() {
        return captureTypeList;
    }

    /**
     * Sets the value of the captureTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoPIREventCaptureType }
     *     
     */
    public void setCaptureTypeList(ArrayOfVideoPIREventCaptureType value) {
        this.captureTypeList = value;
    }

}
