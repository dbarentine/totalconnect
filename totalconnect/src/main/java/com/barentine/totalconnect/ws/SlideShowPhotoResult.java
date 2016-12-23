
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SlideShowPhotoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlideShowPhotoResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="SlideShowConfig" type="{https://services.alarmnet.com/TC2/}SlideShowConfigInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlideShowPhotoResult", propOrder = {
    "slideShowConfig"
})
public class SlideShowPhotoResult
    extends WebMethodResults
{

    @XmlElement(name = "SlideShowConfig")
    protected SlideShowConfigInfo slideShowConfig;

    /**
     * Gets the value of the slideShowConfig property.
     * 
     * @return
     *     possible object is
     *     {@link SlideShowConfigInfo }
     *     
     */
    public SlideShowConfigInfo getSlideShowConfig() {
        return slideShowConfig;
    }

    /**
     * Sets the value of the slideShowConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlideShowConfigInfo }
     *     
     */
    public void setSlideShowConfig(SlideShowConfigInfo value) {
        this.slideShowConfig = value;
    }

}
