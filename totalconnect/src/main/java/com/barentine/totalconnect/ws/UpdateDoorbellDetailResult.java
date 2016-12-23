
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDoorbellDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDoorbellDetailResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="SetupStateID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDoorbellDetailResult", propOrder = {
    "setupStateID"
})
public class UpdateDoorbellDetailResult
    extends WebMethodResults
{

    @XmlElement(name = "SetupStateID")
    protected int setupStateID;

    /**
     * Gets the value of the setupStateID property.
     * 
     */
    public int getSetupStateID() {
        return setupStateID;
    }

    /**
     * Sets the value of the setupStateID property.
     * 
     */
    public void setSetupStateID(int value) {
        this.setupStateID = value;
    }

}
