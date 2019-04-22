
package ru.mera.ivstepan.carshowroom.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoOptionsElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoOptionsElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeatedWindshieldPrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HeatedSeatsPrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ElectricScootersPrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AirbagsPrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FloorMatsPrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WinterTiresPrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoOptionsElement", propOrder = {
    "heatedWindshieldPrice",
    "heatedSeatsPrice",
    "electricScootersPrice",
    "airbagsPrice",
    "floorMatsPrice",
    "winterTiresPrice"
})
public class AutoOptionsElement {

    @XmlElement(name = "HeatedWindshieldPrice", defaultValue = "false")
    protected boolean heatedWindshieldPrice;
    @XmlElement(name = "HeatedSeatsPrice", defaultValue = "false")
    protected boolean heatedSeatsPrice;
    @XmlElement(name = "ElectricScootersPrice", defaultValue = "false")
    protected boolean electricScootersPrice;
    @XmlElement(name = "AirbagsPrice", defaultValue = "false")
    protected boolean airbagsPrice;
    @XmlElement(name = "FloorMatsPrice", defaultValue = "false")
    protected boolean floorMatsPrice;
    @XmlElement(name = "WinterTiresPrice", defaultValue = "false")
    protected boolean winterTiresPrice;

    /**
     * Gets the value of the heatedWindshieldPrice property.
     * 
     */
    public boolean isHeatedWindshieldPrice() {
        return heatedWindshieldPrice;
    }

    /**
     * Sets the value of the heatedWindshieldPrice property.
     * 
     */
    public void setHeatedWindshieldPrice(boolean value) {
        this.heatedWindshieldPrice = value;
    }

    /**
     * Gets the value of the heatedSeatsPrice property.
     * 
     */
    public boolean isHeatedSeatsPrice() {
        return heatedSeatsPrice;
    }

    /**
     * Sets the value of the heatedSeatsPrice property.
     * 
     */
    public void setHeatedSeatsPrice(boolean value) {
        this.heatedSeatsPrice = value;
    }

    /**
     * Gets the value of the electricScootersPrice property.
     * 
     */
    public boolean isElectricScootersPrice() {
        return electricScootersPrice;
    }

    /**
     * Sets the value of the electricScootersPrice property.
     * 
     */
    public void setElectricScootersPrice(boolean value) {
        this.electricScootersPrice = value;
    }

    /**
     * Gets the value of the airbagsPrice property.
     * 
     */
    public boolean isAirbagsPrice() {
        return airbagsPrice;
    }

    /**
     * Sets the value of the airbagsPrice property.
     * 
     */
    public void setAirbagsPrice(boolean value) {
        this.airbagsPrice = value;
    }

    /**
     * Gets the value of the floorMatsPrice property.
     * 
     */
    public boolean isFloorMatsPrice() {
        return floorMatsPrice;
    }

    /**
     * Sets the value of the floorMatsPrice property.
     * 
     */
    public void setFloorMatsPrice(boolean value) {
        this.floorMatsPrice = value;
    }

    /**
     * Gets the value of the winterTiresPrice property.
     * 
     */
    public boolean isWinterTiresPrice() {
        return winterTiresPrice;
    }

    /**
     * Sets the value of the winterTiresPrice property.
     * 
     */
    public void setWinterTiresPrice(boolean value) {
        this.winterTiresPrice = value;
    }

}
