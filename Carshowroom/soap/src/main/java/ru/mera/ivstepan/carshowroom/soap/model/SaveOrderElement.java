package ru.mera.ivstepan.carshowroom.soap.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOrderElement", propOrder = {
        "customerId",
        "brand",
        "model",
        "autoOptionsElement"
})
@XmlRootElement(name = "SaveOrderElement")
public class SaveOrderElement {

    @XmlElement(name = "CustomerId")
    private Integer customerId;

    @XmlElement(name = "Brand")
    private String brand;

    @XmlElement(name = "Model")
    private String model;

    @XmlElement(name = "AutoOptionsElement")
    private AutoOptionsElement autoOptionsElement;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
        return "SaveOrderElement{" +
                "customerId=" + customerId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", autoOptionsElement=" + autoOptionsElement +
                '}';
    }
}

