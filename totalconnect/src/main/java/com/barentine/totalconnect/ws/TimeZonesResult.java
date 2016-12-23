
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZonesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeZonesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="TimeZoneRegions" type="{https://services.alarmnet.com/TC2/}ArrayOfTimeZoneData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZonesResult", propOrder = {
    "timeZoneRegions"
})
public class TimeZonesResult
    extends WebMethodResults
{

    @XmlElement(name = "TimeZoneRegions")
    protected ArrayOfTimeZoneData timeZoneRegions;

    /**
     * Gets the value of the timeZoneRegions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeZoneData }
     *     
     */
    public ArrayOfTimeZoneData getTimeZoneRegions() {
        return timeZoneRegions;
    }

    /**
     * Sets the value of the timeZoneRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeZoneData }
     *     
     */
    public void setTimeZoneRegions(ArrayOfTimeZoneData value) {
        this.timeZoneRegions = value;
    }

}
