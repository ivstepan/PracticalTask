package ru.mera.ivstepan.carshowroom.soap.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderElement", propOrder = {
        "id",
        "customerElement",
        "brand",
        "model",
        "autoOptionsElement"
})
@XmlRootElement(name = "OrderElement")
public class OrderElement {

    @XmlElement(name = "Id")
    private Integer id;

    @XmlElement(name = "CustomerElement")
    private CustomerElement customerElement;

    @XmlElement(name = "Brand")
    private String brand;

    @XmlElement(name = "Model")
    private String model;

    @XmlElement(name = "AutoOptionsElement")
    private AutoOptionsElement autoOptionsElement;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CustomerElement getCustomerElement() {
        return customerElement;
    }

    public void setCustomerElement(CustomerElement customerElement) {
        this.customerElement = customerElement;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public AutoOptionsElement getAutoOptionsElement() {
        return autoOptionsElement;
    }

    public void setAutoOptionsElement(AutoOptionsElement autoOptionsElement) {
        this.autoOptionsElement = autoOptionsElement;
    }

    @Override
    public String toString() {
        return "OrderElement{" +
                "id=" + id +
                ", customerElement=" + customerElement +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", autoOptionsElement=" + autoOptionsElement +
                '}';
    }
}
