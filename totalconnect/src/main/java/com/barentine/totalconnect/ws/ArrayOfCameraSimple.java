
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCameraSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCameraSimple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CameraSimple" type="{https://services.alarmnet.com/TC2/}CameraSimple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCameraSimple", propOrder = {
    "cameraSimple"
})
public class ArrayOfCameraSimple {

    @XmlElement(name = "CameraSimple", nillable = true)
    protected List<CameraSimple> cameraSimple;

    /**
     * Gets the value of the cameraSimple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cameraSimple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCameraSimple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CameraSimple }
     * 
     * 
     */
    public List<CameraSimple> getCameraSimple() {
        if (cameraSimple == null) {
            cameraSimple = new ArrayList<CameraSimple>();
        }
        return this.cameraSimple;
    }

}
