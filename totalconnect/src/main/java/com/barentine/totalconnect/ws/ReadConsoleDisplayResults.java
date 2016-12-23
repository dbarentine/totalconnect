
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadConsoleDisplayResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadConsoleDisplayResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="ConsoleDisplay" type="{https://services.alarmnet.com/TC2/}ConsoleDisplayInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadConsoleDisplayResults", propOrder = {
    "consoleDisplay"
})
public class ReadConsoleDisplayResults
    extends WebMethodResults
{

    @XmlElement(name = "ConsoleDisplay")
    protected ConsoleDisplayInfo consoleDisplay;

    /**
     * Gets the value of the consoleDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link ConsoleDisplayInfo }
     *     
     */
    public ConsoleDisplayInfo getConsoleDisplay() {
        return consoleDisplay;
    }

    /**
     * Sets the value of the consoleDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsoleDisplayInfo }
     *     
     */
    public void setConsoleDisplay(ConsoleDisplayInfo value) {
        this.consoleDisplay = value;
    }

}
