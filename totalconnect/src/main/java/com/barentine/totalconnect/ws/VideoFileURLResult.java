
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoFileURLResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoFileURLResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="URLs" type="{https://services.alarmnet.com/TC2/}ArrayOfVideoURL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoFileURLResult", propOrder = {
    "urLs"
})
public class VideoFileURLResult
    extends WebMethodResults
{

    @XmlElement(name = "URLs")
    protected ArrayOfVideoURL urLs;

    /**
     * Gets the value of the urLs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVideoURL }
     *     
     */
    public ArrayOfVideoURL getURLs() {
        return urLs;
    }

    /**
     * Sets the value of the urLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVideoURL }
     *     
     */
    public void setURLs(ArrayOfVideoURL value) {
        this.urLs = value;
    }

}
