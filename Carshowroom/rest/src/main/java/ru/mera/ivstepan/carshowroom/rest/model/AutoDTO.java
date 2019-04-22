package ru.mera.ivstepan.carshowroom.rest.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AutoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T14:19:14.556+03:00[Europe/Moscow]")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoDTO {

    @JsonProperty("orderId")
    private Integer orderId;

    @JsonProperty("customerId")
    private Integer customerId;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("model")
    private String model;

    @JsonProperty("autoOptionsElement")
    private AutoOptionsDTO autoOptionsElement = null;

    public AutoDTO orderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Get orderId
     *
     * @return orderId
     */
    @ApiModelProperty(example = "1", value = "")

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public AutoDTO customerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Get customerId
     *
     * @return customerId
     */
    @ApiModelProperty(example = "1", required = true, value = "")
    @NotNull

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public AutoDTO brand(String brand) {
        this.brand = brand;
        return this;
    }

    /**
     * Get brand
     *
     * @return brand
     */
    @ApiModelProperty(example = "Audi", required = true, value = "")
    @NotNull

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public AutoDTO model(String model) {
        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @ApiModelProperty(example = "A6", required = true, value = "")
    @NotNull

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public AutoDTO autoOptionsElement(AutoOptionsDTO autoOptionsElement) {
        this.autoOptionsElement = autoOptionsElement;
        return this;
    }

    /**
     * Get autoOptionsElement
     *
     * @return autoOptionsElement
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public AutoOptionsDTO getAutoOptionsElement() {
        return autoOptionsElement;
    }

    public void setAutoOptionsElement(AutoOptionsDTO autoOptionsElement) {
        this.autoOptionsElement = autoOptionsElement;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoDTO autoDTO = (AutoDTO) o;
        return Objects.equals(this.orderId, autoDTO.orderId) &&
                Objects.equals(this.customerId, autoDTO.customerId) &&
                Objects.equals(this.brand, autoDTO.brand) &&
                Objects.equals(this.model, autoDTO.model) &&
                Objects.equals(this.autoOptionsElement, autoDTO.autoOptionsElement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, customerId, brand, model, autoOptionsElement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoDTO {\n");

        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    autoOptionsElement: ").append(toIndentedString(autoOptionsElement)).append("\n");
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

