
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartActionConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartActionConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumSmartActions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaximumNameLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaximumDevicesPerSmartAction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentSmartActionCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnicodeNameSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartActionConfiguration", propOrder = {
    "maximumSmartActions",
    "maximumNameLength",
    "maximumDevicesPerSmartAction",
    "currentSmartActionCount",
    "unicodeNameSupport"
})
public class SmartActionConfiguration {

    @XmlElement(name = "MaximumSmartActions")
    protected int maximumSmartActions;
    @XmlElement(name = "MaximumNameLength")
    protected int maximumNameLength;
    @XmlElement(name = "MaximumDevicesPerSmartAction")
    protected int maximumDevicesPerSmartAction;
    @XmlElement(name = "CurrentSmartActionCount")
    protected int currentSmartActionCount;
    @XmlElement(name = "UnicodeNameSupport")
    protected boolean unicodeNameSupport;

    /**
     * Gets the value of the maximumSmartActions property.
     * 
     */
    public int getMaximumSmartActions() {
        return maximumSmartActions;
    }

    /**
     * Sets the value of the maximumSmartActions property.
     * 
     */
    public void setMaximumSmartActions(int value) {
        this.maximumSmartActions = value;
    }

    /**
     * Gets the value of the maximumNameLength property.
     * 
     */
    public int getMaximumNameLength() {
        return maximumNameLength;
    }

    /**
     * Sets the value of the maximumNameLength property.
     * 
     */
    public void setMaximumNameLength(int value) {
        this.maximumNameLength = value;
    }

    /**
     * Gets the value of the maximumDevicesPerSmartAction property.
     * 
     */
    public int getMaximumDevicesPerSmartAction() {
        return maximumDevicesPerSmartAction;
    }

    /**
     * Sets the value of the maximumDevicesPerSmartAction property.
     * 
     */
    public void setMaximumDevicesPerSmartAction(int value) {
        this.maximumDevicesPerSmartAction = value;
    }

    /**
     * Gets the value of the currentSmartActionCount property.
     * 
     */
    public int getCurrentSmartActionCount() {
        return currentSmartActionCount;
    }

    /**
     * Sets the value of the currentSmartActionCount property.
     * 
     */
    public void setCurrentSmartActionCount(int value) {
        this.currentSmartActionCount = value;
    }

    /**
     * Gets the value of the unicodeNameSupport property.
     * 
     */
    public boolean isUnicodeNameSupport() {
        return unicodeNameSupport;
    }

    /**
     * Sets the value of the unicodeNameSupport property.
     * 
     */
    public void setUnicodeNameSupport(boolean value) {
        this.unicodeNameSupport = value;
    }

}
