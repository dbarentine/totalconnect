
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CameraPositionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CameraPositionResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="CurrentPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraPositionResult", propOrder = {
    "currentPosition",
    "homePosition"
})
public class CameraPositionResult
    extends WebMethodResults
{

    @XmlElement(name = "CurrentPosition")
    protected String currentPosition;
    @XmlElement(name = "HomePosition")
    protected String homePosition;

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
     * Gets the value of the homePosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePosition() {
        return homePosition;
    }

    /**
     * Sets the value of the homePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePosition(String value) {
        this.homePosition = value;
    }

}
