
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUserFeatureCacheInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserFeatureCacheInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserFeatureCacheInfo" type="{https://services.alarmnet.com/TC2/}UserFeatureCacheInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserFeatureCacheInfo", propOrder = {
    "userFeatureCacheInfo"
})
public class ArrayOfUserFeatureCacheInfo {

    @XmlElement(name = "UserFeatureCacheInfo", nillable = true)
    protected List<UserFeatureCacheInfo> userFeatureCacheInfo;

    /**
     * Gets the value of the userFeatureCacheInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userFeatureCacheInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserFeatureCacheInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserFeatureCacheInfo }
     * 
     * 
     */
    public List<UserFeatureCacheInfo> getUserFeatureCacheInfo() {
        if (userFeatureCacheInfo == null) {
            userFeatureCacheInfo = new ArrayList<UserFeatureCacheInfo>();
        }
        return this.userFeatureCacheInfo;
    }

}
