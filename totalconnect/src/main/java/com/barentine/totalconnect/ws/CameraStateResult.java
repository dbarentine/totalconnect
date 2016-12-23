
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraStateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraStateResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="CameraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeatureFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WlledState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Output_1_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraStateResult", propOrder = {
    "cameraName",
    "featureFlags",
    "currentPosition",
    "wlledState",
    "output1State"
})
public class CameraStateResult
    extends WebMethodResults
{

    @XmlElement(name = "CameraName")
    protected String cameraName;
    @XmlElement(name = "FeatureFlags")
    protected String featureFlags;
    @XmlElement(name = "CurrentPosition")
    protected String currentPosition;
    @XmlElement(name = "WlledState")
    protected int wlledState;
    @XmlElement(name = "Output_1_State")
    protected String output1State;

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
     * Gets the value of the currentPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPosition() {
        return currentPosition;
    }

    /**
     * Sets the value of the currentPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPosition(String value) {
        this.currentPosition = value;
    }

    /**
     * Gets the value of the wlledState property.
     * 
     */
    public int getWlledState() {
        return wlledState;
    }

    /**
     * Sets the value of the wlledState property.
     * 
     */
    public void setWlledState(int value) {
        this.wlledState = value;
    }

    /**
     * Gets the value of the output1State property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutput1State() {
        return output1State;
    }

    /**
     * Sets the value of the output1State property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutput1State(String value) {
        this.output1State = value;
    }

}
