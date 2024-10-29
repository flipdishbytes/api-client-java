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
 * Order Delivery Status Information
 */
@ApiModel(description = "Order Delivery Status Information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-29T12:25:04.879Z")
public class OrderDeliveryInformationBase {
  @SerializedName("ExternalReferenceId")
  private String externalReferenceId = null;

  @SerializedName("TrackUrl")
  private String trackUrl = null;

  /**
   * Delivery Status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NONE("None"),
    
    UNASSIGNED("Unassigned"),
    
    UNACCEPTED("Unaccepted"),
    
    ACCEPTED("Accepted"),
    
    CARRYING("Carrying"),
    
    ONTHEWAY("OnTheWay"),
    
    ARRIVEDATLOCATION("ArrivedAtLocation"),
    
    DELIVERED("Delivered"),
    
    CANNOTDELIVER("CannotDeliver");

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

  @SerializedName("DeliveryStatusNotes")
  private String deliveryStatusNotes = null;

  @SerializedName("ErrorMessage")
  private String errorMessage = null;

  @SerializedName("IntegrationCode")
  private String integrationCode = null;

  @SerializedName("IntegrationName")
  private String integrationName = null;

  public OrderDeliveryInformationBase externalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
    return this;
  }

   /**
   * External Reference Id
   * @return externalReferenceId
  **/
  @ApiModelProperty(value = "External Reference Id")
  public String getExternalReferenceId() {
    return externalReferenceId;
  }

  public void setExternalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
  }

  public OrderDeliveryInformationBase trackUrl(String trackUrl) {
    this.trackUrl = trackUrl;
    return this;
  }

   /**
   * Tracking Url
   * @return trackUrl
  **/
  @ApiModelProperty(value = "Tracking Url")
  public String getTrackUrl() {
    return trackUrl;
  }

  public void setTrackUrl(String trackUrl) {
    this.trackUrl = trackUrl;
  }

  public OrderDeliveryInformationBase status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Delivery Status
   * @return status
  **/
  @ApiModelProperty(value = "Delivery Status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OrderDeliveryInformationBase deliveryStatusNotes(String deliveryStatusNotes) {
    this.deliveryStatusNotes = deliveryStatusNotes;
    return this;
  }

   /**
   * Delivery Status Notes
   * @return deliveryStatusNotes
  **/
  @ApiModelProperty(value = "Delivery Status Notes")
  public String getDeliveryStatusNotes() {
    return deliveryStatusNotes;
  }

  public void setDeliveryStatusNotes(String deliveryStatusNotes) {
    this.deliveryStatusNotes = deliveryStatusNotes;
  }

  public OrderDeliveryInformationBase errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error Message
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Error Message")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public OrderDeliveryInformationBase integrationCode(String integrationCode) {
    this.integrationCode = integrationCode;
    return this;
  }

   /**
   * Integration Code
   * @return integrationCode
  **/
  @ApiModelProperty(value = "Integration Code")
  public String getIntegrationCode() {
    return integrationCode;
  }

  public void setIntegrationCode(String integrationCode) {
    this.integrationCode = integrationCode;
  }

  public OrderDeliveryInformationBase integrationName(String integrationName) {
    this.integrationName = integrationName;
    return this;
  }

   /**
   * Integration Name
   * @return integrationName
  **/
  @ApiModelProperty(value = "Integration Name")
  public String getIntegrationName() {
    return integrationName;
  }

  public void setIntegrationName(String integrationName) {
    this.integrationName = integrationName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDeliveryInformationBase orderDeliveryInformationBase = (OrderDeliveryInformationBase) o;
    return Objects.equals(this.externalReferenceId, orderDeliveryInformationBase.externalReferenceId) &&
        Objects.equals(this.trackUrl, orderDeliveryInformationBase.trackUrl) &&
        Objects.equals(this.status, orderDeliveryInformationBase.status) &&
        Objects.equals(this.deliveryStatusNotes, orderDeliveryInformationBase.deliveryStatusNotes) &&
        Objects.equals(this.errorMessage, orderDeliveryInformationBase.errorMessage) &&
        Objects.equals(this.integrationCode, orderDeliveryInformationBase.integrationCode) &&
        Objects.equals(this.integrationName, orderDeliveryInformationBase.integrationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalReferenceId, trackUrl, status, deliveryStatusNotes, errorMessage, integrationCode, integrationName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDeliveryInformationBase {\n");
    
    sb.append("    externalReferenceId: ").append(toIndentedString(externalReferenceId)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deliveryStatusNotes: ").append(toIndentedString(deliveryStatusNotes)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    integrationCode: ").append(toIndentedString(integrationCode)).append("\n");
    sb.append("    integrationName: ").append(toIndentedString(integrationName)).append("\n");
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

