
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDetailsEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDetailsEx">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}UserDetails">
 *       &lt;sequence>
 *         &lt;element name="DateFormatId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TimeFormatId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDetailsEx", propOrder = {
    "dateFormatId",
    "timeFormatId"
})
public class UserDetailsEx
    extends UserDetails
{

    @XmlElement(name = "DateFormatId")
    protected int dateFormatId;
    @XmlElement(name = "TimeFormatId")
    protected int timeFormatId;

    /**
     * Gets the value of the dateFormatId property.
     * 
     */
    public int getDateFormatId() {
        return dateFormatId;
    }

    /**
     * Sets the value of the dateFormatId property.
     * 
     */
    public void setDateFormatId(int value) {
        this.dateFormatId = value;
    }

    /**
     * Gets the value of the timeFormatId property.
     * 
     */
    public int getTimeFormatId() {
        return timeFormatId;
    }

    /**
     * Sets the value of the timeFormatId property.
     * 
     */
    public void setTimeFormatId(int value) {
        this.timeFormatId = value;
    }

}
