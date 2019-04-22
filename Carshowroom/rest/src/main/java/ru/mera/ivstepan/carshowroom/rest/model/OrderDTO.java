package ru.mera.ivstepan.carshowroom.rest.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * OrderDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T14:19:14.556+03:00[Europe/Moscow]")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    @JsonProperty("id")
    private Integer id;

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        RECEIVED("RECEIVED"),

        PROCESS("PROCESS"),

        COMPLETED("COMPLETED");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    @JsonProperty("status")
    private StatusEnum status;

    @JsonProperty("date")
    private String date;

    @JsonProperty("customer")
    private CustomerDTO customer = null;

    @JsonProperty("auto")
    private AutoDTO auto = null;

    public OrderDTO id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @ApiModelProperty(example = "1", value = "")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderDTO status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @ApiModelProperty(example = "RECEIVED", value = "")

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OrderDTO date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     *
     * @return date
     */
    @ApiModelProperty(value = "")

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public OrderDTO customer(CustomerDTO customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Get customer
     *
     * @return customer
     */
    @ApiModelProperty(value = "")

    @Valid

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public OrderDTO auto(AutoDTO auto) {
        this.auto = auto;
        return this;
    }

    /**
     * Get auto
     *
     * @return auto
     */
    @ApiModelProperty(value = "")

    @Valid

    public AutoDTO getAuto() {
        return auto;
    }

    public void setAuto(AutoDTO auto) {
        this.auto = auto;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderDTO orderDTO = (OrderDTO) o;
        return Objects.equals(this.id, orderDTO.id) &&
                Objects.equals(this.status, orderDTO.status) &&
                Objects.equals(this.date, orderDTO.date) &&
                Objects.equals(this.customer, orderDTO.customer) &&
                Objects.equals(this.auto, orderDTO.auto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, date, customer, auto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
        sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
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

