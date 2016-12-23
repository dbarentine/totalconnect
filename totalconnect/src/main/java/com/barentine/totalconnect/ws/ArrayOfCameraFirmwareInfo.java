
package com.barentine.totalconnect.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCameraFirmwareInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCameraFirmwareInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CameraFirmwareInfo" type="{https://services.alarmnet.com/TC2/}CameraFirmwareInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCameraFirmwareInfo", propOrder = {
    "cameraFirmwareInfo"
})
public class ArrayOfCameraFirmwareInfo {

    @XmlElement(name = "CameraFirmwareInfo", nillable = true)
    protected List<CameraFirmwareInfo> cameraFirmwareInfo;

    /**
     * Gets the value of the cameraFirmwareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cameraFirmwareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCameraFirmwareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CameraFirmwareInfo }
     * 
     * 
     */
    public List<CameraFirmwareInfo> getCameraFirmwareInfo() {
        if (cameraFirmwareInfo == null) {
            cameraFirmwareInfo = new ArrayList<CameraFirmwareInfo>();
        }
        return this.cameraFirmwareInfo;
    }

}
