/*
 * Flipdish Open API v1.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.flipdish.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Subscription change job can be longer running, this contains job information
 */
@ApiModel(description = "Subscription change job can be longer running, this contains job information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-17T10:52:00.997Z")
public class AppStoreSubscriptionChangeJobStatusResponse {
  @SerializedName("SubscriptionChangeJobId")
  private String subscriptionChangeJobId = null;

  /**
   * Job Status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NONE("None"),
    
    INPROGRESS("InProgress"),
    
    COMPLETED("Completed"),
    
    ERROR("Error");

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
      return null;
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

  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("ErrorMessage")
  private String errorMessage = null;

  public AppStoreSubscriptionChangeJobStatusResponse subscriptionChangeJobId(String subscriptionChangeJobId) {
    this.subscriptionChangeJobId = subscriptionChangeJobId;
    return this;
  }

   /**
   * Subscription change job id
   * @return subscriptionChangeJobId
  **/
  @ApiModelProperty(value = "Subscription change job id")
  public String getSubscriptionChangeJobId() {
    return subscriptionChangeJobId;
  }

  public void setSubscriptionChangeJobId(String subscriptionChangeJobId) {
    this.subscriptionChangeJobId = subscriptionChangeJobId;
  }

  public AppStoreSubscriptionChangeJobStatusResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Job Status
   * @return status
  **/
  @ApiModelProperty(value = "Job Status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AppStoreSubscriptionChangeJobStatusResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message (if any)
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Error message (if any)")
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
    AppStoreSubscriptionChangeJobStatusResponse appStoreSubscriptionChangeJobStatusResponse = (AppStoreSubscriptionChangeJobStatusResponse) o;
    return Objects.equals(this.subscriptionChangeJobId, appStoreSubscriptionChangeJobStatusResponse.subscriptionChangeJobId) &&
        Objects.equals(this.status, appStoreSubscriptionChangeJobStatusResponse.status) &&
        Objects.equals(this.errorMessage, appStoreSubscriptionChangeJobStatusResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionChangeJobId, status, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreSubscriptionChangeJobStatusResponse {\n");
    
    sb.append("    subscriptionChangeJobId: ").append(toIndentedString(subscriptionChangeJobId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

