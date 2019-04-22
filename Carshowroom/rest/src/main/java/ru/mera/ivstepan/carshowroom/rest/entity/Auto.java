package ru.mera.ivstepan.carshowroom.rest.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "auto")
public class Auto {

    public Auto(){}

    public Auto(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String brand;

    @Column
    private String model;

    @OneToMany(mappedBy = "auto", cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToOne(mappedBy = "auto")
    private Options options;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(id, auto.id) &&
                Objects.equals(brand, auto.brand) &&
                Objects.equals(model, auto.model) &&
                Objects.equals(orders, auto.orders) &&
                Objects.equals(options, auto.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, orders, options);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", orders=" + orders +
                ", options=" + options +
                '}';
    }
}
