package ru.mera.ivstepan.carshowroom.rest.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * CustomerDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T14:19:14.556+03:00[Europe/Moscow]")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDTO {
    @JsonProperty("customerId")
    private Integer customerId;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("birthday")
    private String birthday;

    public CustomerDTO customerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Get customerId
     *
     * @return customerId
     */
    @ApiModelProperty(example = "1", value = "")

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public CustomerDTO firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get firstName
     *
     * @return firstName
     */
    @ApiModelProperty(example = "Flint", required = true, value = "")
    @NotNull

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public CustomerDTO lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     *
     * @return lastName
     */
    @ApiModelProperty(example = "Capitan", required = true, value = "")
    @NotNull

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CustomerDTO email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     */
    @ApiModelProperty(example = "tortuga@island.com", required = true, value = "")
    @NotNull

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerDTO birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    /**
     * Get birthday
     *
     * @return birthday
     */
    @ApiModelProperty(example = "1985-05-23", required = true, value = "")
    @NotNull

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerDTO customerDTO = (CustomerDTO) o;
        return Objects.equals(this.customerId, customerDTO.customerId) &&
                Objects.equals(this.firstName, customerDTO.firstName) &&
                Objects.equals(this.lastName, customerDTO.lastName) &&
                Objects.equals(this.email, customerDTO.email) &&
                Objects.equals(this.birthday, customerDTO.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastName, email, birthday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerDTO {\n");

        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
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

