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
import com.flipdish.apiclient.model.DeliveryLocation;
import com.flipdish.apiclient.model.OrderDm;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateOrderRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T12:34:31.769Z")
public class CreateOrderRequest {
  @SerializedName("LegacyOrderDm")
  private OrderDm legacyOrderDm = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("CustomerName")
  private String customerName = null;

  @SerializedName("DeliveryLocation")
  private DeliveryLocation deliveryLocation = null;

  public CreateOrderRequest legacyOrderDm(OrderDm legacyOrderDm) {
    this.legacyOrderDm = legacyOrderDm;
    return this;
  }

   /**
   * Get legacyOrderDm
   * @return legacyOrderDm
  **/
  @ApiModelProperty(value = "")
  public OrderDm getLegacyOrderDm() {
    return legacyOrderDm;
  }

  public void setLegacyOrderDm(OrderDm legacyOrderDm) {
    this.legacyOrderDm = legacyOrderDm;
  }

  public CreateOrderRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CreateOrderRequest customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public CreateOrderRequest deliveryLocation(DeliveryLocation deliveryLocation) {
    this.deliveryLocation = deliveryLocation;
    return this;
  }

   /**
   * Get deliveryLocation
   * @return deliveryLocation
  **/
  @ApiModelProperty(value = "")
  public DeliveryLocation getDeliveryLocation() {
    return deliveryLocation;
  }

  public void setDeliveryLocation(DeliveryLocation deliveryLocation) {
    this.deliveryLocation = deliveryLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequest createOrderRequest = (CreateOrderRequest) o;
    return Objects.equals(this.legacyOrderDm, createOrderRequest.legacyOrderDm) &&
        Objects.equals(this.phoneNumber, createOrderRequest.phoneNumber) &&
        Objects.equals(this.customerName, createOrderRequest.customerName) &&
        Objects.equals(this.deliveryLocation, createOrderRequest.deliveryLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legacyOrderDm, phoneNumber, customerName, deliveryLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequest {\n");
    
    sb.append("    legacyOrderDm: ").append(toIndentedString(legacyOrderDm)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    deliveryLocation: ").append(toIndentedString(deliveryLocation)).append("\n");
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

