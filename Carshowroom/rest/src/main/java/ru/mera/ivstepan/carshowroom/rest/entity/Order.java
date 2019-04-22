package ru.mera.ivstepan.carshowroom.rest.entity;

import org.springframework.format.annotation.DateTimeFormat;
import ru.mera.ivstepan.carshowroom.rest.utils.OrderStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {

    public Order(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column
    private Date date;

    @ManyToOne
    @JoinColumn(name = "auto_id", referencedColumnName = "id")
    private Auto auto;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetail;

    public Order(Auto auto, Customer customer) {
        this.auto = auto;
        this.customer = customer;
        this.date = new Date();
        this.status = OrderStatus.Status.RECEIVED.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(status, order.status) &&
                Objects.equals(date, order.date) &&
                Objects.equals(auto, order.auto) &&
                Objects.equals(customer, order.customer) &&
                Objects.equals(orderDetail, order.orderDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, date, auto, customer, orderDetail);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", date=" + date +
                ", auto=" + auto +
                ", customer=" + customer +
                '}';
    }
}
