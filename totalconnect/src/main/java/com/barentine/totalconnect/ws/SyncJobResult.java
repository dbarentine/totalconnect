
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncJobResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncJobResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="JobState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ZoneSyncState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AutomationSyncState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserSyncState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncJobResult", propOrder = {
    "jobState",
    "zoneSyncState",
    "automationSyncState",
    "userSyncState"
})
public class SyncJobResult
    extends WebMethodResults
{

    @XmlElement(name = "JobState")
    protected int jobState;
    @XmlElement(name = "ZoneSyncState")
    protected int zoneSyncState;
    @XmlElement(name = "AutomationSyncState")
    protected int automationSyncState;
    @XmlElement(name = "UserSyncState")
    protected int userSyncState;

    /**
     * Gets the value of the jobState property.
     * 
     */
    public int getJobState() {
        return jobState;
    }

    /**
     * Sets the value of the jobState property.
     * 
     */
    public void setJobState(int value) {
        this.jobState = value;
    }

    /**
     * Gets the value of the zoneSyncState property.
     * 
     */
    public int getZoneSyncState() {
        return zoneSyncState;
    }

    /**
     * Sets the value of the zoneSyncState property.
     * 
     */
    public void setZoneSyncState(int value) {
        this.zoneSyncState = value;
    }

    /**
     * Gets the value of the automationSyncState property.
     * 
     */
    public int getAutomationSyncState() {
        return automationSyncState;
    }

    /**
     * Sets the value of the automationSyncState property.
     * 
     */
    public void setAutomationSyncState(int value) {
        this.automationSyncState = value;
    }

    /**
     * Gets the value of the userSyncState property.
     * 
     */
    public int getUserSyncState() {
        return userSyncState;
    }

    /**
     * Sets the value of the userSyncState property.
     * 
     */
    public void setUserSyncState(int value) {
        this.userSyncState = value;
    }

}
