package ru.mera.ivstepan.carshowroom.rest.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_detail")
public class OrderDetail {

    public OrderDetail(){}

    public OrderDetail(String optionsDescription, Integer optionsPrice, Order order) {
        this.optionsDescription = optionsDescription;
        this.optionsPrice = optionsPrice;
        this.order = order;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String optionsDescription;

    @Column
    private Integer optionsPrice;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOptionsDescription() {
        return optionsDescription;
    }

    public void setOptionsDescription(String optionsDescription) {
        this.optionsDescription = optionsDescription;
    }

    public Integer getOptionsPrice() {
        return optionsPrice;
    }

    public void setOptionsPrice(Integer optionsPrice) {
        this.optionsPrice = optionsPrice;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetail that = (OrderDetail) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(optionsDescription, that.optionsDescription) &&
                Objects.equals(optionsPrice, that.optionsPrice) &&
                Objects.equals(order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, optionsDescription, optionsPrice, order);
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", optionsDescription='" + optionsDescription + '\'' +
                ", optionsPrice=" + optionsPrice +
                ", order=" + order +
                '}';
    }
}
