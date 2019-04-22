
package ru.mera.ivstepan.carshowroom.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetOrderElement" type="{http://service.soap.carshowroom.ivstepan.mera.ru/}GetOrderRequestElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerOrders", propOrder = {
    "getOrderElement"
})
public class GetCustomerOrders {

    @XmlElement(name = "GetOrderElement")
    protected GetOrderRequestElement getOrderElement;

    /**
     * Gets the value of the getOrderElement property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrderRequestElement }
     *     
     */
    public GetOrderRequestElement getGetOrderElement() {
        return getOrderElement;
    }

    /**
     * Sets the value of the getOrderElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrderRequestElement }
     *     
     */
    public void setGetOrderElement(GetOrderRequestElement value) {
        this.getOrderElement = value;
    }

}
