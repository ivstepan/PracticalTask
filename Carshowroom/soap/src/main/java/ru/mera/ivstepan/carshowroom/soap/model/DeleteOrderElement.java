package ru.mera.ivstepan.carshowroom.soap.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteOrderElement", propOrder = {
        "orderId",
})
@XmlRootElement(name = "UpdateOrderElement")
public class DeleteOrderElement {

    @XmlElement(name = "OrderId")
    private Integer orderId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "DeleteOrderElement{" +
                "orderId=" + orderId +
                '}';
    }
}
