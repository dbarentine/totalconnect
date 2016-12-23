
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GPSInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GPSInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}DeviceInfo">
 *       &lt;sequence>
 *         &lt;element name="PhotoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhotoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="GPSDeviceClassId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GPSServiceLevelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IconId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPSInfo", propOrder = {
    "photoURL",
    "photoId",
    "gpsDeviceClassId",
    "gpsServiceLevelId",
    "iconId"
})
public class GPSInfo
    extends DeviceInfo
{

    @XmlElement(name = "PhotoURL")
    protected String photoURL;
    @XmlElement(name = "PhotoId")
    protected long photoId;
    @XmlElement(name = "GPSDeviceClassId")
    protected int gpsDeviceClassId;
    @XmlElement(name = "GPSServiceLevelId")
    protected int gpsServiceLevelId;
    @XmlElement(name = "IconId")
    protected int iconId;

    /**
     * Gets the value of the photoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the value of the photoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoURL(String value) {
        this.photoURL = value;
    }

    /**
     * Gets the value of the photoId property.
     * 
     */
    public long getPhotoId() {
        return photoId;
    }

    /**
     * Sets the value of the photoId property.
     * 
     */
    public void setPhotoId(long value) {
        this.photoId = value;
    }

    /**
     * Gets the value of the gpsDeviceClassId property.
     * 
     */
    public int getGPSDeviceClassId() {
        return gpsDeviceClassId;
    }

    /**
     * Sets the value of the gpsDeviceClassId property.
     * 
     */
    public void setGPSDeviceClassId(int value) {
        this.gpsDeviceClassId = value;
    }

    /**
     * Gets the value of the gpsServiceLevelId property.
     * 
     */
    public int getGPSServiceLevelId() {
        return gpsServiceLevelId;
    }

    /**
     * Sets the value of the gpsServiceLevelId property.
     * 
     */
    public void setGPSServiceLevelId(int value) {
        this.gpsServiceLevelId = value;
    }

    /**
     * Gets the value of the iconId property.
     * 
     */
    public int getIconId() {
        return iconId;
    }

    /**
     * Sets the value of the iconId property.
     * 
     */
    public void setIconId(int value) {
        this.iconId = value;
    }

}
