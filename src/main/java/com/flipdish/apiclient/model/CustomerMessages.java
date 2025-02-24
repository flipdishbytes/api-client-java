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
 * Delivery and pickup menu messages for a customer
 */
@ApiModel(description = "Delivery and pickup menu messages for a customer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-24T13:37:20.540Z")
public class CustomerMessages {
  @SerializedName("DeliveryMenuMessage")
  private String deliveryMenuMessage = null;

  @SerializedName("PickupMenuMessage")
  private String pickupMenuMessage = null;

  public CustomerMessages deliveryMenuMessage(String deliveryMenuMessage) {
    this.deliveryMenuMessage = deliveryMenuMessage;
    return this;
  }

   /**
   * Delivery menu message
   * @return deliveryMenuMessage
  **/
  @ApiModelProperty(value = "Delivery menu message")
  public String getDeliveryMenuMessage() {
    return deliveryMenuMessage;
  }

  public void setDeliveryMenuMessage(String deliveryMenuMessage) {
    this.deliveryMenuMessage = deliveryMenuMessage;
  }

  public CustomerMessages pickupMenuMessage(String pickupMenuMessage) {
    this.pickupMenuMessage = pickupMenuMessage;
    return this;
  }

   /**
   * Pickup menu message
   * @return pickupMenuMessage
  **/
  @ApiModelProperty(value = "Pickup menu message")
  public String getPickupMenuMessage() {
    return pickupMenuMessage;
  }

  public void setPickupMenuMessage(String pickupMenuMessage) {
    this.pickupMenuMessage = pickupMenuMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerMessages customerMessages = (CustomerMessages) o;
    return Objects.equals(this.deliveryMenuMessage, customerMessages.deliveryMenuMessage) &&
        Objects.equals(this.pickupMenuMessage, customerMessages.pickupMenuMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryMenuMessage, pickupMenuMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerMessages {\n");
    
    sb.append("    deliveryMenuMessage: ").append(toIndentedString(deliveryMenuMessage)).append("\n");
    sb.append("    pickupMenuMessage: ").append(toIndentedString(pickupMenuMessage)).append("\n");
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

