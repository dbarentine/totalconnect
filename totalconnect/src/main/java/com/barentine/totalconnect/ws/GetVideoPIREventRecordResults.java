
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVideoPIREventRecordResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVideoPIREventRecordResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="VideoPIREventRecord" type="{https://services.alarmnet.com/TC2/}VideoPIREvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVideoPIREventRecordResults", propOrder = {
    "videoPIREventRecord"
})
public class GetVideoPIREventRecordResults
    extends WebMethodResults
{

    @XmlElement(name = "VideoPIREventRecord")
    protected VideoPIREvent videoPIREventRecord;

    /**
     * Gets the value of the videoPIREventRecord property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPIREvent }
     *     
     */
    public VideoPIREvent getVideoPIREventRecord() {
        return videoPIREventRecord;
    }

    /**
     * Sets the value of the videoPIREventRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPIREvent }
     *     
     */
    public void setVideoPIREventRecord(VideoPIREvent value) {
        this.videoPIREventRecord = value;
    }

}
