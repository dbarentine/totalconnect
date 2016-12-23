
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContentSettingsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContentSettingsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentSettingsInfo" type="{https://services.alarmnet.com/TC2/}ContentSettingsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContentSettingsInfo", propOrder = {
    "contentSettingsInfo"
})
public class ArrayOfContentSettingsInfo {

    @XmlElement(name = "ContentSettingsInfo", nillable = true)
    protected List<ContentSettingsInfo> contentSettingsInfo;

    /**
     * Gets the value of the contentSettingsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentSettingsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentSettingsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentSettingsInfo }
     * 
     * 
     */
    public List<ContentSettingsInfo> getContentSettingsInfo() {
        if (contentSettingsInfo == null) {
            contentSettingsInfo = new ArrayList<ContentSettingsInfo>();
        }
        return this.contentSettingsInfo;
    }

}
