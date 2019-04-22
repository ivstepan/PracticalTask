package ru.mera.ivstepan.carshowroom.soap.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderResponseElement", propOrder = {
        "orderId",
        "status",
        "date",
        "order"
})
@XmlRootElement(name = "GetOrderResponseElement")
public class GetOrderResponseElement {

    @XmlElement(name = "OrderId")
    private Integer orderId;

    @XmlElement(name = "Id")
    private String status;

    @XmlElement(name = "Date")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date date;

    @XmlElement(name = "Order")
    private OrderElement order;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderElement getOrder() {
        return order;
    }

    public void setOrder(OrderElement order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "GetOrderResponseElement{" +
                "orderId=" + orderId +
                ", status='" + status + '\'' +
                ", date=" + date +
                ", order=" + order +
                '}';
    }
}
