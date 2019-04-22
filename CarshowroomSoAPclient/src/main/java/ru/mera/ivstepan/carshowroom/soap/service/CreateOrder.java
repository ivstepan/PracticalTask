
package ru.mera.ivstepan.carshowroom.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaveOrderElement" type="{http://service.soap.carshowroom.ivstepan.mera.ru/}SaveOrderElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOrder", propOrder = {
    "saveOrderElement"
})
public class CreateOrder {

    @XmlElement(name = "SaveOrderElement")
    protected SaveOrderElement saveOrderElement;

    /**
     * Gets the value of the saveOrderElement property.
     * 
     * @return
     *     possible object is
     *     {@link SaveOrderElement }
     *     
     */
    public SaveOrderElement getSaveOrderElement() {
        return saveOrderElement;
    }

    /**
     * Sets the value of the saveOrderElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveOrderElement }
     *     
     */
    public void setSaveOrderElement(SaveOrderElement value) {
        this.saveOrderElement = value;
    }

}
