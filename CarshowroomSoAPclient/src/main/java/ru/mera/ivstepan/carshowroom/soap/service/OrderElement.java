
package ru.mera.ivstepan.carshowroom.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerElement" type="{http://service.soap.carshowroom.ivstepan.mera.ru/}CustomerElement" minOccurs="0"/>
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoOptionsElement" type="{http://service.soap.carshowroom.ivstepan.mera.ru/}AutoOptionsElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderElement", propOrder = {
    "id",
    "customerElement",
    "brand",
    "model",
    "autoOptionsElement"
})
public class OrderElement {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "CustomerElement")
    protected CustomerElement customerElement;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "AutoOptionsElement")
    protected AutoOptionsElement autoOptionsElement;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the customerElement property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerElement }
     *     
     */
    public CustomerElement getCustomerElement() {
        return customerElement;
    }

    /**
     * Sets the value of the customerElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerElement }
     *     
     */
    public void setCustomerElement(CustomerElement value) {
        this.customerElement = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the autoOptionsElement property.
     * 
     * @return
     *     possible object is
     *     {@link AutoOptionsElement }
     *     
     */
    public AutoOptionsElement getAutoOptionsElement() {
        return autoOptionsElement;
    }

    /**
     * Sets the value of the autoOptionsElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoOptionsElement }
     *     
     */
    public void setAutoOptionsElement(AutoOptionsElement value) {
        this.autoOptionsElement = value;
    }

}
