package ru.mera.ivstepan.carshowroom.soap.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderRequestElement", propOrder = {
        "customerId",
        "status"
})
@XmlRootElement(name = "GetOrderRequestElement")
public class GetOrderRequestElement {

    @XmlElement(name = "CustomerId")
    private Integer customerId;

    @XmlElement(name = "Status")
    private String status;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GetOrderRequestElement{" +
                "customerId=" + customerId +
                ", status='" + status + '\'' +
                '}';
    }
}
