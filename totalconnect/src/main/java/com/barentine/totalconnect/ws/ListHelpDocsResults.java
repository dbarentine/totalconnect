
package com.barentine.totalconnect.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListHelpDocsResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListHelpDocsResults">
 *   &lt;complexContent>
 *     &lt;extension base="{https://services.alarmnet.com/TC2/}WebMethodResults">
 *       &lt;sequence>
 *         &lt;element name="HelpDocs" type="{https://services.alarmnet.com/TC2/}ArrayOfHelpDocs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListHelpDocsResults", propOrder = {
    "helpDocs"
})
public class ListHelpDocsResults
    extends WebMethodResults
{

    @XmlElement(name = "HelpDocs")
    protected ArrayOfHelpDocs helpDocs;

    /**
     * Gets the value of the helpDocs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHelpDocs }
     *     
     */
    public ArrayOfHelpDocs getHelpDocs() {
        return helpDocs;
    }

    /**
     * Sets the value of the helpDocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHelpDocs }
     *     
     */
    public void setHelpDocs(ArrayOfHelpDocs value) {
        this.helpDocs = value;
    }

}
