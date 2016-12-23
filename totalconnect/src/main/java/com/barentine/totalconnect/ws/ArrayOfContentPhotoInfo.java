
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContentPhotoInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContentPhotoInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentPhotoInfo" type="{https://services.alarmnet.com/TC2/}ContentPhotoInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContentPhotoInfo", propOrder = {
    "contentPhotoInfo"
})
public class ArrayOfContentPhotoInfo {

    @XmlElement(name = "ContentPhotoInfo", nillable = true)
    protected List<ContentPhotoInfo> contentPhotoInfo;

    /**
     * Gets the value of the contentPhotoInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentPhotoInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentPhotoInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentPhotoInfo }
     * 
     * 
     */
    public List<ContentPhotoInfo> getContentPhotoInfo() {
        if (contentPhotoInfo == null) {
            contentPhotoInfo = new ArrayList<ContentPhotoInfo>();
        }
        return this.contentPhotoInfo;
    }

}
