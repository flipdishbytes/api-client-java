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
 * Order Payment Information
 */
@ApiModel(description = "Order Payment Information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-05T08:50:25.656+01:00")
public class OrderPaymentInformation {
  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("PaymentRefundable")
  private Boolean paymentRefundable = null;

  public OrderPaymentInformation orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * ID of the Order
   * @return orderId
  **/
  @ApiModelProperty(value = "ID of the Order")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public OrderPaymentInformation paymentRefundable(Boolean paymentRefundable) {
    this.paymentRefundable = paymentRefundable;
    return this;
  }

   /**
   * Signifies if the payment is refundable
   * @return paymentRefundable
  **/
  @ApiModelProperty(value = "Signifies if the payment is refundable")
  public Boolean isPaymentRefundable() {
    return paymentRefundable;
  }

  public void setPaymentRefundable(Boolean paymentRefundable) {
    this.paymentRefundable = paymentRefundable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPaymentInformation orderPaymentInformation = (OrderPaymentInformation) o;
    return Objects.equals(this.orderId, orderPaymentInformation.orderId) &&
        Objects.equals(this.paymentRefundable, orderPaymentInformation.paymentRefundable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, paymentRefundable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPaymentInformation {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentRefundable: ").append(toIndentedString(paymentRefundable)).append("\n");
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

