/*
 * Carshowroom
 * Server part of the application carshowroom
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package ru.mera.carshowroom.rest.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;

/**
 * OrderDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-15T17:26:54.567+03:00[Europe/Moscow]")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;

    /**
     * Gets or Sets status
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        RECEIVED("RECEIVED"),

        PROCESS("PROCESS"),

        COMPLETED("COMPLETED");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;

    public static final String SERIALIZED_NAME_DATE = "date";
    @SerializedName(SERIALIZED_NAME_DATE)
    private String date;

    public static final String SERIALIZED_NAME_CUSTOMER = "customer";
    @SerializedName(SERIALIZED_NAME_CUSTOMER)
    private CustomerDTO customer = null;

    public static final String SERIALIZED_NAME_AUTO = "auto";
    @SerializedName(SERIALIZED_NAME_AUTO)
    private AutoDTO auto = null;

    public OrderDTO id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
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
     **/
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
     **/
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
     **/
    @ApiModelProperty(value = "")
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
     **/
    @ApiModelProperty(value = "")
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
