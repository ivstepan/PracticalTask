
package ru.mera.ivstepan.carshowroom.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaveCustomerElement" type="{http://service.soap.carshowroom.ivstepan.mera.ru/}SaveCustomerElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCustomer", propOrder = {
    "saveCustomerElement"
})
public class CreateCustomer {

    @XmlElement(name = "SaveCustomerElement")
    protected SaveCustomerElement saveCustomerElement;

    /**
     * Gets the value of the saveCustomerElement property.
     * 
     * @return
     *     possible object is
     *     {@link SaveCustomerElement }
     *     
     */
    public SaveCustomerElement getSaveCustomerElement() {
        return saveCustomerElement;
    }

    /**
     * Sets the value of the saveCustomerElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveCustomerElement }
     *     
     */
    public void setSaveCustomerElement(SaveCustomerElement value) {
        this.saveCustomerElement = value;
    }

}
