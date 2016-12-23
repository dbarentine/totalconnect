
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserFeatureCacheInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserFeatureCacheInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FeatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeatureEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserFeatureCacheInfo", propOrder = {
    "featureId",
    "featureName",
    "featureEnabled"
})
public class UserFeatureCacheInfo {

    @XmlElement(name = "FeatureId")
    protected int featureId;
    @XmlElement(name = "FeatureName")
    protected String featureName;
    @XmlElement(name = "FeatureEnabled")
    protected boolean featureEnabled;

    /**
     * Gets the value of the featureId property.
     * 
     */
    public int getFeatureId() {
        return featureId;
    }

    /**
     * Sets the value of the featureId property.
     * 
     */
    public void setFeatureId(int value) {
        this.featureId = value;
    }

    /**
     * Gets the value of the featureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * Sets the value of the featureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureName(String value) {
        this.featureName = value;
    }

    /**
     * Gets the value of the featureEnabled property.
     * 
     */
    public boolean isFeatureEnabled() {
        return featureEnabled;
    }

    /**
     * Sets the value of the featureEnabled property.
     * 
     */
    public void setFeatureEnabled(boolean value) {
        this.featureEnabled = value;
    }

}
