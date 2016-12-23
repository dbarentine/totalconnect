
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetZoneInfoResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetZoneInfoResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="ZoneInfoList" type="{https://services.alarmnet.com/TC2/}ArrayOfZoneInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetZoneInfoResults", propOrder = {
    "zoneInfoList"
})
public class GetZoneInfoResults
    extends WebMethodResults
{

    @XmlElement(name = "ZoneInfoList")
    protected ArrayOfZoneInfo zoneInfoList;

    /**
     * Gets the value of the zoneInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfZoneInfo }
     *     
     */
    public ArrayOfZoneInfo getZoneInfoList() {
        return zoneInfoList;
    }

    /**
     * Sets the value of the zoneInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfZoneInfo }
     *     
     */
    public void setZoneInfoList(ArrayOfZoneInfo value) {
        this.zoneInfoList = value;
    }

}
