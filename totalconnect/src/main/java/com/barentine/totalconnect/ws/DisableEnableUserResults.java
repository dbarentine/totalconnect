
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisableEnableUserResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisableEnableUserResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="EnableState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisableEnableUserResults", propOrder = {
    "enableState"
})
public class DisableEnableUserResults
    extends WebMethodResults
{

    @XmlElement(name = "EnableState")
    protected boolean enableState;

    /**
     * Gets the value of the enableState property.
     * 
     */
    public boolean isEnableState() {
        return enableState;
    }

    /**
     * Sets the value of the enableState property.
     * 
     */
    public void setEnableState(boolean value) {
        this.enableState = value;
    }

}
