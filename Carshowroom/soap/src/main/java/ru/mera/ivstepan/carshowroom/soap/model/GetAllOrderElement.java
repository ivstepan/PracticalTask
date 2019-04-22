package ru.mera.ivstepan.carshowroom.soap.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllOrderElement", propOrder = {
        "id",
        "date",
        "order"
})
@XmlRootElement(name = "GetAllOrderElement")
public class GetAllOrderElement {

    @XmlElement(name = "Id")
    private Integer id;

    @XmlElement(name = "Date")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date date;

    @XmlElement(name = "Order")
    private OrderElement order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "GetAllOrderElement{" +
                "id=" + id +
                ", date=" + date +
                ", order=" + order +
                '}';
    }
}
