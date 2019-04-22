package ru.mera.ivstepan.carshowroom.rest.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * ResponseNOK
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T10:37:36.714+03:00[Europe/Moscow]")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseNOK {
    @JsonProperty("Message_ID")
    private String messageID;

    @JsonProperty("Error_Message")
    private String errorMessage;

    public ResponseNOK messageID(String messageID) {
        this.messageID = messageID;
        return this;
    }

    /**
     * Get messageID
     *
     * @return messageID
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public ResponseNOK errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get errorMessage
     *
     * @return errorMessage
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseNOK responseNOK = (ResponseNOK) o;
        return Objects.equals(this.messageID, responseNOK.messageID) &&
                Objects.equals(this.errorMessage, responseNOK.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageID, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseNOK {\n");

        sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

