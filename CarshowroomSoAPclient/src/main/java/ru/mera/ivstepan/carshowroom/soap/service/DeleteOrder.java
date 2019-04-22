
package ru.mera.ivstepan.carshowroom.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteOrderElement" type="{http://service.soap.carshowroom.ivstepan.mera.ru/}DeleteOrderElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteOrder", propOrder = {
    "deleteOrderElement"
})
public class DeleteOrder {

    @XmlElement(name = "DeleteOrderElement")
    protected DeleteOrderElement deleteOrderElement;

    /**
     * Gets the value of the deleteOrderElement property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteOrderElement }
     *     
     */
    public DeleteOrderElement getDeleteOrderElement() {
        return deleteOrderElement;
    }

    /**
     * Sets the value of the deleteOrderElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteOrderElement }
     *     
     */
    public void setDeleteOrderElement(DeleteOrderElement value) {
        this.deleteOrderElement = value;
    }

}
