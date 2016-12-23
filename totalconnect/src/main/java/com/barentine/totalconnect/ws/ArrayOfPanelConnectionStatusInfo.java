
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPanelConnectionStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPanelConnectionStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PanelConnectionStatusInfo" type="{https://services.alarmnet.com/TC2/}PanelConnectionStatusInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPanelConnectionStatusInfo", propOrder = {
    "panelConnectionStatusInfo"
})
public class ArrayOfPanelConnectionStatusInfo {

    @XmlElement(name = "PanelConnectionStatusInfo", nillable = true)
    protected List<PanelConnectionStatusInfo> panelConnectionStatusInfo;

    /**
     * Gets the value of the panelConnectionStatusInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panelConnectionStatusInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPanelConnectionStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PanelConnectionStatusInfo }
     * 
     * 
     */
    public List<PanelConnectionStatusInfo> getPanelConnectionStatusInfo() {
        if (panelConnectionStatusInfo == null) {
            panelConnectionStatusInfo = new ArrayList<PanelConnectionStatusInfo>();
        }
        return this.panelConnectionStatusInfo;
    }

}
