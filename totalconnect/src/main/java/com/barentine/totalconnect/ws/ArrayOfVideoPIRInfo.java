
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoPIRInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoPIRInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoPIRInfo" type="{https://services.alarmnet.com/TC2/}VideoPIRInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoPIRInfo", propOrder = {
    "videoPIRInfo"
})
public class ArrayOfVideoPIRInfo {

    @XmlElement(name = "VideoPIRInfo", nillable = true)
    protected List<VideoPIRInfo> videoPIRInfo;

    /**
     * Gets the value of the videoPIRInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoPIRInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoPIRInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoPIRInfo }
     * 
     * 
     */
    public List<VideoPIRInfo> getVideoPIRInfo() {
        if (videoPIRInfo == null) {
            videoPIRInfo = new ArrayList<VideoPIRInfo>();
        }
        return this.videoPIRInfo;
    }

}
