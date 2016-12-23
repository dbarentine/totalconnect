
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoFileURLExResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoFileURLExResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="URLsEx" type="{https://services.alarmnet.com/TC2/}ArrayOfVideoURLEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoFileURLExResult", propOrder = {
    "urLsEx"
})
public class VideoFileURLExResult
    extends WebMethodResults
{

    @XmlElement(name = "URLsEx")
    protected ArrayOfVideoURLEx urLsEx;

    /**
     * Gets the value of the urLsEx property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoURLEx }
     *     
     */
    public ArrayOfVideoURLEx getURLsEx() {
        return urLsEx;
    }

    /**
     * Sets the value of the urLsEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoURLEx }
     *     
     */
    public void setURLsEx(ArrayOfVideoURLEx value) {
        this.urLsEx = value;
    }

}
