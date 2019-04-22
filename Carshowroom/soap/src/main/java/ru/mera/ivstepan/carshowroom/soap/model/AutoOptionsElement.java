package ru.mera.ivstepan.carshowroom.soap.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoOptionsElement", propOrder = {
        "heatedWindshieldPrice",
        "heatedSeatsPrice",
        "electricScootersPrice",
        "airbagsPrice",
        "floorMatsPrice",
        "winterTiresPrice"
})
@XmlRootElement(name = "AutoOptionsElement")
public class AutoOptionsElement {

    @XmlElement(name = "HeatedWindshieldPrice", defaultValue = "false")
    private boolean heatedWindshieldPrice;

    @XmlElement(name = "HeatedSeatsPrice", defaultValue = "false")
    private boolean heatedSeatsPrice;

    @XmlElement(name = "ElectricScootersPrice", defaultValue = "false")
    private boolean electricScootersPrice;

    @XmlElement(name = "AirbagsPrice", defaultValue = "false")
    private boolean airbagsPrice;

    @XmlElement(name = "FloorMatsPrice", defaultValue = "false")
    private boolean floorMatsPrice;

    @XmlElement(name = "WinterTiresPrice", defaultValue = "false")
    private boolean winterTiresPrice;

    public boolean isHeatedWindshieldPrice() {
        return heatedWindshieldPrice;
    }

    public void setHeatedWindshieldPrice(boolean heatedWindshieldPrice) {
        this.heatedWindshieldPrice = heatedWindshieldPrice;
    }

    public boolean isHeatedSeatsPrice() {
        return heatedSeatsPrice;
    }

    public void setHeatedSeatsPrice(boolean heatedSeatsPrice) {
        this.heatedSeatsPrice = heatedSeatsPrice;
    }

    public boolean isElectricScootersPrice() {
        return electricScootersPrice;
    }

    public void setElectricScootersPrice(boolean electricScootersPrice) {
        this.electricScootersPrice = electricScootersPrice;
    }

    public boolean isAirbagsPrice() {
        return airbagsPrice;
    }

    public void setAirbagsPrice(boolean airbagsPrice) {
        this.airbagsPrice = airbagsPrice;
    }

    public boolean isFloorMatsPrice() {
        return floorMatsPrice;
    }

    public void setFloorMatsPrice(boolean floorMatsPrice) {
        this.floorMatsPrice = floorMatsPrice;
    }

    public boolean isWinterTiresPrice() {
        return winterTiresPrice;
    }

    public void setWinterTiresPrice(boolean winterTiresPrice) {
        this.winterTiresPrice = winterTiresPrice;
    }

    @Override
    public String toString() {
        return "AutoOptionsElement{" +
                "heatedWindshieldPrice=" + heatedWindshieldPrice +
                ", heatedSeatsPrice=" + heatedSeatsPrice +
                ", electricScootersPrice=" + electricScootersPrice +
                ", airbagsPrice=" + airbagsPrice +
                ", floorMatsPrice=" + floorMatsPrice +
                ", winterTiresPrice=" + winterTiresPrice +
                '}';
    }
}