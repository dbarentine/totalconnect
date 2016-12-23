
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppStaticKeyListInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppStaticKeyListInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="AppStaticKeyList" type="{https://services.alarmnet.com/TC2/}ArrayOfAppStaticKeyInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppStaticKeyListInfo", propOrder = {
    "appStaticKeyList"
})
public class AppStaticKeyListInfo
    extends WebMethodResults
{

    @XmlElement(name = "AppStaticKeyList")
    protected ArrayOfAppStaticKeyInfo appStaticKeyList;

    /**
     * Gets the value of the appStaticKeyList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppStaticKeyInfo }
     *     
     */
    public ArrayOfAppStaticKeyInfo getAppStaticKeyList() {
        return appStaticKeyList;
    }

    /**
     * Sets the value of the appStaticKeyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppStaticKeyInfo }
     *     
     */
    public void setAppStaticKeyList(ArrayOfAppStaticKeyInfo value) {
        this.appStaticKeyList = value;
    }

}
