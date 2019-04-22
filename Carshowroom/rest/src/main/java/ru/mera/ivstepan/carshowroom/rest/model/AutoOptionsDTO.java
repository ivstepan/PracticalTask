package ru.mera.ivstepan.carshowroom.rest.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * AutoOptionsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T14:19:14.556+03:00[Europe/Moscow]")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoOptionsDTO {
    @JsonProperty("heatedWindshieldPrice")
    private Boolean heatedWindshieldPrice = false;

    @JsonProperty("heatedSeatsPrice")
    private Boolean heatedSeatsPrice = false;

    @JsonProperty("electricScootersPrice")
    private Boolean electricScootersPrice = false;

    @JsonProperty("airbagsPrice")
    private Boolean airbagsPrice = false;

    @JsonProperty("floorMatsPrice")
    private Boolean floorMatsPrice = false;

    @JsonProperty("winterTiresPrice")
    private Boolean winterTiresPrice = false;

    public AutoOptionsDTO heatedWindshieldPrice(Boolean heatedWindshieldPrice) {
        this.heatedWindshieldPrice = heatedWindshieldPrice;
        return this;
    }

    /**
     * Get heatedWindshieldPrice
     *
     * @return heatedWindshieldPrice
     */
    @ApiModelProperty(value = "")

    public Boolean getHeatedWindshieldPrice() {
        return heatedWindshieldPrice;
    }

    public void setHeatedWindshieldPrice(Boolean heatedWindshieldPrice) {
        this.heatedWindshieldPrice = heatedWindshieldPrice;
    }

    public AutoOptionsDTO heatedSeatsPrice(Boolean heatedSeatsPrice) {
        this.heatedSeatsPrice = heatedSeatsPrice;
        return this;
    }

    /**
     * Get heatedSeatsPrice
     *
     * @return heatedSeatsPrice
     */
    @ApiModelProperty(value = "")

    public Boolean getHeatedSeatsPrice() {
        return heatedSeatsPrice;
    }

    public void setHeatedSeatsPrice(Boolean heatedSeatsPrice) {
        this.heatedSeatsPrice = heatedSeatsPrice;
    }

    public AutoOptionsDTO electricScootersPrice(Boolean electricScootersPrice) {
        this.electricScootersPrice = electricScootersPrice;
        return this;
    }

    /**
     * Get electricScootersPrice
     *
     * @return electricScootersPrice
     */
    @ApiModelProperty(value = "")

    public Boolean getElectricScootersPrice() {
        return electricScootersPrice;
    }

    public void setElectricScootersPrice(Boolean electricScootersPrice) {
        this.electricScootersPrice = electricScootersPrice;
    }

    public AutoOptionsDTO airbagsPrice(Boolean airbagsPrice) {
        this.airbagsPrice = airbagsPrice;
        return this;
    }

    /**
     * Get airbagsPrice
     *
     * @return airbagsPrice
     */
    @ApiModelProperty(value = "")

    public Boolean getAirbagsPrice() {
        return airbagsPrice;
    }

    public void setAirbagsPrice(Boolean airbagsPrice) {
        this.airbagsPrice = airbagsPrice;
    }

    public AutoOptionsDTO floorMatsPrice(Boolean floorMatsPrice) {
        this.floorMatsPrice = floorMatsPrice;
        return this;
    }

    /**
     * Get floorMatsPrice
     *
     * @return floorMatsPrice
     */
    @ApiModelProperty(value = "")

    public Boolean getFloorMatsPrice() {
        return floorMatsPrice;
    }

    public void setFloorMatsPrice(Boolean floorMatsPrice) {
        this.floorMatsPrice = floorMatsPrice;
    }

    public AutoOptionsDTO winterTiresPrice(Boolean winterTiresPrice) {
        this.winterTiresPrice = winterTiresPrice;
        return this;
    }

    /**
     * Get winterTiresPrice
     *
     * @return winterTiresPrice
     */
    @ApiModelProperty(value = "")

    public Boolean getWinterTiresPrice() {
        return winterTiresPrice;
    }

    public void setWinterTiresPrice(Boolean winterTiresPrice) {
        this.winterTiresPrice = winterTiresPrice;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoOptionsDTO autoOptionsDTO = (AutoOptionsDTO) o;
        return Objects.equals(this.heatedWindshieldPrice, autoOptionsDTO.heatedWindshieldPrice) &&
                Objects.equals(this.heatedSeatsPrice, autoOptionsDTO.heatedSeatsPrice) &&
                Objects.equals(this.electricScootersPrice, autoOptionsDTO.electricScootersPrice) &&
                Objects.equals(this.airbagsPrice, autoOptionsDTO.airbagsPrice) &&
                Objects.equals(this.floorMatsPrice, autoOptionsDTO.floorMatsPrice) &&
                Objects.equals(this.winterTiresPrice, autoOptionsDTO.winterTiresPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heatedWindshieldPrice, heatedSeatsPrice, electricScootersPrice, airbagsPrice, floorMatsPrice, winterTiresPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoOptionsDTO {\n");

        sb.append("    heatedWindshieldPrice: ").append(toIndentedString(heatedWindshieldPrice)).append("\n");
        sb.append("    heatedSeatsPrice: ").append(toIndentedString(heatedSeatsPrice)).append("\n");
        sb.append("    electricScootersPrice: ").append(toIndentedString(electricScootersPrice)).append("\n");
        sb.append("    airbagsPrice: ").append(toIndentedString(airbagsPrice)).append("\n");
        sb.append("    floorMatsPrice: ").append(toIndentedString(floorMatsPrice)).append("\n");
        sb.append("    winterTiresPrice: ").append(toIndentedString(winterTiresPrice)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

