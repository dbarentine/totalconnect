
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoPIREventCaptureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoPIREventCaptureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoPIREventCaptureType" type="{https://services.alarmnet.com/TC2/}VideoPIREventCaptureType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoPIREventCaptureType", propOrder = {
    "videoPIREventCaptureType"
})
public class ArrayOfVideoPIREventCaptureType {

    @XmlElement(name = "VideoPIREventCaptureType", nillable = true)
    protected List<VideoPIREventCaptureType> videoPIREventCaptureType;

    /**
     * Gets the value of the videoPIREventCaptureType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoPIREventCaptureType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoPIREventCaptureType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoPIREventCaptureType }
     * 
     * 
     */
    public List<VideoPIREventCaptureType> getVideoPIREventCaptureType() {
        if (videoPIREventCaptureType == null) {
            videoPIREventCaptureType = new ArrayList<VideoPIREventCaptureType>();
        }
        return this.videoPIREventCaptureType;
    }

}
