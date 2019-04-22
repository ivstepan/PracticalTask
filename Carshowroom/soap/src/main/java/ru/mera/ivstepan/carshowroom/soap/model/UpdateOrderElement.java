package ru.mera.ivstepan.carshowroom.soap.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrderElement", propOrder = {
        "orderId",
        "brand",
        "model",
        "autoOptionsElement"
})
@XmlRootElement(name = "UpdateOrderElement")
public class UpdateOrderElement {

    @XmlElement(name = "OrderId")
    private Integer orderId;

    @XmlElement(name = "Brand")
    private String brand;

    @XmlElement(name = "Model")
    private String model;

    @XmlElement(name = "AutoOptionsElement")
    private AutoOptionsElement autoOptionsElement;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
        return "UpdateOrderElement{" +
                "orderId=" + orderId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", autoOptionsElement=" + autoOptionsElement +
                '}';
    }
}
