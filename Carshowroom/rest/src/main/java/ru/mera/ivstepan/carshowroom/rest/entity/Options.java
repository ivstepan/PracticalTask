package ru.mera.ivstepan.carshowroom.rest.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "options")
public class Options {

    public Options(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer autoPrice;

    @Column
    private Integer heatedWindshieldPrice;

    @Column
    private Integer heatedSeatsPrice;

    @Column
    private Integer electricScootersPrice;

    @Column
    private Integer airbagsPrice;

    @Column
    private Integer floorMatsPrice;

    @Column
    private Integer winterTiresPrice;

    @OneToOne
    @JoinColumn(name = "auto_id", referencedColumnName = "id")
    private Auto auto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAutoPrice() {
        return autoPrice;
    }

    public void setAutoPrice(Integer autoPrice) {
        this.autoPrice = autoPrice;
    }

    public Integer getHeatedWindshieldPrice() {
        return heatedWindshieldPrice;
    }

    public void setHeatedWindshieldPrice(Integer heatedWindshieldPrice) {
        this.heatedWindshieldPrice = heatedWindshieldPrice;
    }

    public Integer getHeatedSeatsPrice() {
        return heatedSeatsPrice;
    }

    public void setHeatedSeatsPrice(Integer heatedSeatsPrice) {
        this.heatedSeatsPrice = heatedSeatsPrice;
    }

    public Integer getElectricScootersPrice() {
        return electricScootersPrice;
    }

    public void setElectricScootersPrice(Integer electricScootersPrice) {
        this.electricScootersPrice = electricScootersPrice;
    }

    public Integer getAirbagsPrice() {
        return airbagsPrice;
    }

    public void setAirbagsPrice(Integer airbagsPrice) {
        this.airbagsPrice = airbagsPrice;
    }

    public Integer getFloorMatsPrice() {
        return floorMatsPrice;
    }

    public void setFloorMatsPrice(Integer floorMatsPrice) {
        this.floorMatsPrice = floorMatsPrice;
    }

    public Integer getWinterTiresPrice() {
        return winterTiresPrice;
    }

    public void setWinterTiresPrice(Integer winterTiresPrice) {
        this.winterTiresPrice = winterTiresPrice;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Options options = (Options) o;
        return Objects.equals(id, options.id) &&
                Objects.equals(autoPrice, options.autoPrice) &&
                Objects.equals(heatedWindshieldPrice, options.heatedWindshieldPrice) &&
                Objects.equals(heatedSeatsPrice, options.heatedSeatsPrice) &&
                Objects.equals(electricScootersPrice, options.electricScootersPrice) &&
                Objects.equals(airbagsPrice, options.airbagsPrice) &&
                Objects.equals(floorMatsPrice, options.floorMatsPrice) &&
                Objects.equals(winterTiresPrice, options.winterTiresPrice) &&
                Objects.equals(auto, options.auto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, autoPrice, heatedWindshieldPrice, heatedSeatsPrice, electricScootersPrice, airbagsPrice, floorMatsPrice, winterTiresPrice, auto);
    }

    @Override
    public String toString() {
        return "Options{" +
                "id=" + id +
                ", autoPrice=" + autoPrice +
                ", heatedWindshieldPrice=" + heatedWindshieldPrice +
                ", heatedSeatsPrice=" + heatedSeatsPrice +
                ", electricScootersPrice=" + electricScootersPrice +
                ", airbagsPrice=" + airbagsPrice +
                ", floorMatsPrice=" + floorMatsPrice +
                ", winterTiresPrice=" + winterTiresPrice +
                ", auto=" + auto +
                '}';
    }
}
