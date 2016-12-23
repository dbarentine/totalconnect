
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentConfigurationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentConfigurationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableContentTypeList" type="{https://services.alarmnet.com/TC2/}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="ContentSettingsList" type="{https://services.alarmnet.com/TC2/}ArrayOfContentSettingsInfo" minOccurs="0"/>
 *         &lt;element name="NewsRegionsList" type="{https://services.alarmnet.com/TC2/}ArrayOfNewsRegionsInfo" minOccurs="0"/>
 *         &lt;element name="HomeIconList" type="{https://services.alarmnet.com/TC2/}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="FirstRefreshTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SecondRefreshTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentConfigurationInfo", propOrder = {
    "availableContentTypeList",
    "contentSettingsList",
    "newsRegionsList",
    "homeIconList",
    "firstRefreshTime",
    "secondRefreshTime"
})
public class ContentConfigurationInfo {

    @XmlElement(name = "AvailableContentTypeList")
    protected ArrayOfInt availableContentTypeList;
    @XmlElement(name = "ContentSettingsList")
    protected ArrayOfContentSettingsInfo contentSettingsList;
    @XmlElement(name = "NewsRegionsList")
    protected ArrayOfNewsRegionsInfo newsRegionsList;
    @XmlElement(name = "HomeIconList")
    protected ArrayOfInt homeIconList;
    @XmlElement(name = "FirstRefreshTime")
    protected int firstRefreshTime;
    @XmlElement(name = "SecondRefreshTime")
    protected int secondRefreshTime;

    /**
     * Gets the value of the availableContentTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAvailableContentTypeList() {
        return availableContentTypeList;
    }

    /**
     * Sets the value of the availableContentTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAvailableContentTypeList(ArrayOfInt value) {
        this.availableContentTypeList = value;
    }

    /**
     * Gets the value of the contentSettingsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContentSettingsInfo }
     *     
     */
    public ArrayOfContentSettingsInfo getContentSettingsList() {
        return contentSettingsList;
    }

    /**
     * Sets the value of the contentSettingsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContentSettingsInfo }
     *     
     */
    public void setContentSettingsList(ArrayOfContentSettingsInfo value) {
        this.contentSettingsList = value;
    }

    /**
     * Gets the value of the newsRegionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNewsRegionsInfo }
     *     
     */
    public ArrayOfNewsRegionsInfo getNewsRegionsList() {
        return newsRegionsList;
    }

    /**
     * Sets the value of the newsRegionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNewsRegionsInfo }
     *     
     */
    public void setNewsRegionsList(ArrayOfNewsRegionsInfo value) {
        this.newsRegionsList = value;
    }

    /**
     * Gets the value of the homeIconList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getHomeIconList() {
        return homeIconList;
    }

    /**
     * Sets the value of the homeIconList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setHomeIconList(ArrayOfInt value) {
        this.homeIconList = value;
    }

    /**
     * Gets the value of the firstRefreshTime property.
     * 
     */
    public int getFirstRefreshTime() {
        return firstRefreshTime;
    }

    /**
     * Sets the value of the firstRefreshTime property.
     * 
     */
    public void setFirstRefreshTime(int value) {
        this.firstRefreshTime = value;
    }

    /**
     * Gets the value of the secondRefreshTime property.
     * 
     */
    public int getSecondRefreshTime() {
        return secondRefreshTime;
    }

    /**
     * Sets the value of the secondRefreshTime property.
     * 
     */
    public void setSecondRefreshTime(int value) {
        this.secondRefreshTime = value;
    }

}
