
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoTrigger">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}NotificationInfoBase">
 *       &lt;attribute name="ScheduleID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="SecurityPanelStateCondition" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CameraID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoTrigger")
public class VideoTrigger
    extends NotificationInfoBase
{

    @XmlAttribute(name = "ScheduleID", required = true)
    protected long scheduleID;
    @XmlAttribute(name = "SecurityPanelStateCondition", required = true)
    protected int securityPanelStateCondition;
    @XmlAttribute(name = "CameraID", required = true)
    protected long cameraID;

    /**
     * Gets the value of the scheduleID property.
     * 
     */
    public long getScheduleID() {
        return scheduleID;
    }

    /**
     * Sets the value of the scheduleID property.
     * 
     */
    public void setScheduleID(long value) {
        this.scheduleID = value;
    }

    /**
     * Gets the value of the securityPanelStateCondition property.
     * 
     */
    public int getSecurityPanelStateCondition() {
        return securityPanelStateCondition;
    }

    /**
     * Sets the value of the securityPanelStateCondition property.
     * 
     */
    public void setSecurityPanelStateCondition(int value) {
        this.securityPanelStateCondition = value;
    }

    /**
     * Gets the value of the cameraID property.
     * 
     */
    public long getCameraID() {
        return cameraID;
    }

    /**
     * Sets the value of the cameraID property.
     * 
     */
    public void setCameraID(long value) {
        this.cameraID = value;
    }

}
