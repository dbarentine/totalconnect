
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAppStaticKeyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAppStaticKeyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppStaticKeyInfo" type="{https://services.alarmnet.com/TC2/}AppStaticKeyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAppStaticKeyInfo", propOrder = {
    "appStaticKeyInfo"
})
public class ArrayOfAppStaticKeyInfo {

    @XmlElement(name = "AppStaticKeyInfo", nillable = true)
    protected List<AppStaticKeyInfo> appStaticKeyInfo;

    /**
     * Gets the value of the appStaticKeyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appStaticKeyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppStaticKeyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppStaticKeyInfo }
     * 
     * 
     */
    public List<AppStaticKeyInfo> getAppStaticKeyInfo() {
        if (appStaticKeyInfo == null) {
            appStaticKeyInfo = new ArrayList<AppStaticKeyInfo>();
        }
        return this.appStaticKeyInfo;
    }

}
