
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoTrigger" type="{https://services.alarmnet.com/TC2/}VideoTrigger" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoTrigger", propOrder = {
    "videoTrigger"
})
public class ArrayOfVideoTrigger {

    @XmlElement(name = "VideoTrigger", nillable = true)
    protected List<VideoTrigger> videoTrigger;

    /**
     * Gets the value of the videoTrigger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoTrigger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoTrigger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoTrigger }
     * 
     * 
     */
    public List<VideoTrigger> getVideoTrigger() {
        if (videoTrigger == null) {
            videoTrigger = new ArrayList<VideoTrigger>();
        }
        return this.videoTrigger;
    }

}
