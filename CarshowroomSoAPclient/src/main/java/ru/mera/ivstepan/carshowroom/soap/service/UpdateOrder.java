
package ru.mera.ivstepan.carshowroom.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateOrderElement" type="{http://service.soap.carshowroom.ivstepan.mera.ru/}UpdateOrderElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateOrder", propOrder = {
    "updateOrderElement"
})
public class UpdateOrder {

    @XmlElement(name = "UpdateOrderElement")
    protected UpdateOrderElement updateOrderElement;

    /**
     * Gets the value of the updateOrderElement property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderElement }
     *     
     */
    public UpdateOrderElement getUpdateOrderElement() {
        return updateOrderElement;
    }

    /**
     * Sets the value of the updateOrderElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderElement }
     *     
     */
    public void setUpdateOrderElement(UpdateOrderElement value) {
        this.updateOrderElement = value;
    }

}
