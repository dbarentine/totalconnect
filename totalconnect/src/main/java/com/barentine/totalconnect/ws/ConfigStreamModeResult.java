
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigStreamModeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigStreamModeResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CameraIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CameraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeatureFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTSP_Parameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigStreamModeResult", propOrder = {
    "mac",
    "cameraIPAddress",
    "cameraName",
    "featureFlags",
    "rtspParameters"
})
public class ConfigStreamModeResult
    extends WebMethodResults
{

    @XmlElement(name = "MAC")
    protected String mac;
    @XmlElement(name = "CameraIPAddress")
    protected String cameraIPAddress;
    @XmlElement(name = "CameraName")
    protected String cameraName;
    @XmlElement(name = "FeatureFlags")
    protected String featureFlags;
    @XmlElement(name = "RTSP_Parameters")
    protected String rtspParameters;

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAC() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAC(String value) {
        this.mac = value;
    }

    /**
     * Gets the value of the cameraIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraIPAddress() {
        return cameraIPAddress;
    }

    /**
     * Sets the value of the cameraIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraIPAddress(String value) {
        this.cameraIPAddress = value;
    }

    /**
     * Gets the value of the cameraName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraName() {
        return cameraName;
    }

    /**
     * Sets the value of the cameraName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraName(String value) {
        this.cameraName = value;
    }

    /**
     * Gets the value of the featureFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureFlags() {
        return featureFlags;
    }

    /**
     * Sets the value of the featureFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureFlags(String value) {
        this.featureFlags = value;
    }

    /**
     * Gets the value of the rtspParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTSPParameters() {
        return rtspParameters;
    }

    /**
     * Sets the value of the rtspParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTSPParameters(String value) {
        this.rtspParameters = value;
    }

}
